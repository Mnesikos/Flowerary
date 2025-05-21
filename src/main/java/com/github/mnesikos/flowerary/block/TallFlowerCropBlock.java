package com.github.mnesikos.flowerary.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.util.Mth;
import net.minecraft.util.RandomSource;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.entity.BlockEntity;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.block.state.properties.EnumProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import javax.annotation.Nullable;
import java.util.function.Supplier;

public class TallFlowerCropBlock extends FlowerCropBlock {
    public static final EnumProperty<DoubleBlockHalf> SEGMENT = BlockStateProperties.DOUBLE_BLOCK_HALF;
    protected final int upperSegmentAge;
    private final VoxelShape[] bottomShape;
    private final VoxelShape[] topShape;

    public TallFlowerCropBlock(Supplier<? extends Item> seedItem, Properties properties, int upperSegmentAge, VoxelShape[] bottomShape, VoxelShape[] topShape) {
        super(seedItem, properties);
        this.registerDefaultState(this.stateDefinition.any().setValue(this.getAgeProperty(), 0).setValue(SEGMENT, DoubleBlockHalf.LOWER));
        this.upperSegmentAge = upperSegmentAge;
        this.bottomShape = bottomShape;
        this.topShape = topShape;
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext pContext) {
        if (state.getValue(SEGMENT) == DoubleBlockHalf.LOWER) return bottomShape[state.getValue(AGE)];
        else return topShape[state.getValue(AGE)];
    }

    @Override
    public boolean canBeReplaced(BlockState pState, BlockPlaceContext pUseContext) {
        return false;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, LevelAccessor level, BlockPos pos, BlockPos facingPos) {
        DoubleBlockHalf stateSegment = state.getValue(SEGMENT);
        if (facing.getAxis() != Direction.Axis.Y || (stateSegment == DoubleBlockHalf.LOWER != (facing == Direction.UP) || !isDouble(state)) || (facingState.is(this) && facingState.getValue(SEGMENT) != stateSegment))
            return stateSegment == DoubleBlockHalf.LOWER && facing == Direction.DOWN && !state.canSurvive(level, pos) ? Blocks.AIR.defaultBlockState() : super.updateShape(state, facing, facingState, level, pos, facingPos);
        else return Blocks.AIR.defaultBlockState();
    }

    public boolean isDouble(BlockState state) {
        return getAge(state) >= upperSegmentAge;
    }

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockPos pos = context.getClickedPos();
        return pos.getY() < 255 ? super.getStateForPlacement(context) : null;
    }

    @Override
    public boolean canSurvive(BlockState state, LevelReader level, BlockPos pos) {
        if (state.getValue(SEGMENT) == DoubleBlockHalf.LOWER) return super.canSurvive(state, level, pos);
        else {
            if (!isDouble(state)) return false;
            BlockState lowerState = level.getBlockState(pos.below());
            if (state.getBlock() != this) return super.canSurvive(state, level, pos);
            return lowerState.is(this) && lowerState.getValue(SEGMENT) == DoubleBlockHalf.LOWER && getAge(state) == getAge(lowerState);
        }
    }

    @Override
    public void randomTick(BlockState state, ServerLevel level, BlockPos pos, RandomSource random) {
        if (!level.isAreaLoaded(pos, 1)) return;
        if (state.getValue(SEGMENT) == DoubleBlockHalf.UPPER) return;
        int age = getAge(state);
        if (isValidBonemealTarget(level, pos, state, level.isClientSide) && state.getValue(SEGMENT) == DoubleBlockHalf.LOWER && level.getRawBrightness(pos.above(), 0) >= 9 && ForgeHooks.onCropsGrowPre(level, pos, state, random.nextInt(5) == 0)) {
            int growthAge = age + 1;
            if (growthAge >= upperSegmentAge)
                level.setBlockAndUpdate(pos.above(), defaultBlockState().setValue(getAgeProperty(), growthAge).setValue(SEGMENT, DoubleBlockHalf.UPPER));
            level.setBlock(pos, state.setValue(getAgeProperty(), growthAge), 2);
            ForgeHooks.onCropsGrowPost(level, pos, state);
        }
    }

    @Override
    public void playerWillDestroy(Level level, BlockPos pos, BlockState state, Player player) {
        if (!level.isClientSide) {
            if (player.isCreative()) preventCreativeDropFromBottomPart(level, pos, state, player);
            else dropResources(state, level, pos, null, player, player.getMainHandItem());
        }

        super.playerWillDestroy(level, pos, state, player);
    }

    @Override
    public void playerDestroy(Level level, Player player, BlockPos pos, BlockState state, @Nullable BlockEntity tileEntity, ItemStack stack) {
        super.playerDestroy(level, player, pos, Blocks.AIR.defaultBlockState(), tileEntity, stack);
    }

    protected static void preventCreativeDropFromBottomPart(Level level, BlockPos pos, BlockState state, Player player) {
        DoubleBlockHalf doubleBlockHalf = state.getValue(SEGMENT);
        if (doubleBlockHalf == DoubleBlockHalf.UPPER) {
            BlockPos lowerPos = pos.below();
            BlockState lowerState = level.getBlockState(lowerPos);
            if (lowerState.getBlock() == state.getBlock() && lowerState.getValue(SEGMENT) == DoubleBlockHalf.LOWER) {
                level.setBlock(lowerPos, Blocks.AIR.defaultBlockState(), 35);
                level.levelEvent(player, 2001, lowerPos, Block.getId(lowerState));
            }
        }
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(getAgeProperty(), SEGMENT);
    }

    @Override
    public long getSeed(BlockState state, BlockPos pos) {
        return Mth.getSeed(pos.getX(), pos.below(state.getValue(SEGMENT) == DoubleBlockHalf.LOWER ? 0 : 1).getY(), pos.getZ());
    }

    public boolean canGrowUp(BlockGetter level, BlockPos pos) {
        BlockState aboveState = level.getBlockState(pos.above());
        return aboveState.getBlock() instanceof TallFlowerCropBlock || aboveState.canBeReplaced();
    }

    @Override
    public boolean isValidBonemealTarget(LevelReader level, BlockPos pos, BlockState state, boolean isClient) {
        return !isMaxAge(state) && (canGrowUp(level, pos) || getAge(state) < upperSegmentAge - 1);
    }

    @Override
    public void growCrops(Level level, BlockPos pos, BlockState state) {
        if (state.getValue(SEGMENT) == DoubleBlockHalf.UPPER) pos = pos.below();
        int growthAge = getAge(state) + getBonemealAgeIncrease(level);
        growthAge = Math.min(growthAge, getMaxAge());

        if (growthAge >= upperSegmentAge) {
            if (!canGrowUp(level, pos)) return;
            level.setBlock(pos.above(), getStateForAge(growthAge).setValue(SEGMENT, DoubleBlockHalf.UPPER), 2);
        }
        level.setBlock(pos, getStateForAge(growthAge), 2);
    }

    @Override
    public InteractionResult use(BlockState state, Level level, BlockPos pos, Player player, InteractionHand hand, BlockHitResult rayTraceResult) {
        InteractionResult old = super.use(state, level, pos, player, hand, rayTraceResult);
        if (!old.consumesAction() && isDouble(state) && state.getValue(SEGMENT) == DoubleBlockHalf.UPPER) {
            PlayerInteractEvent.RightClickBlock event = ForgeHooks.onRightClickBlock(player, hand, pos.below(), rayTraceResult);
            if (event.isCancelable()) return event.getCancellationResult();
        }
        return old;
    }

    public static class BlazingStarCropBlock extends TallFlowerCropBlock {
        public BlazingStarCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 3,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()},
                    new VoxelShape[]{
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            Shapes.block()});
        }
    }

    public static class FoxgloveCropBlock extends TallFlowerCropBlock {
        public FoxgloveCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 3,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()},
                    new VoxelShape[]{
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            Shapes.block()});
        }
    }

    public static class ImpalaLilyCropBlock extends TallFlowerCropBlock {
        public ImpalaLilyCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 5,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()},
                    new VoxelShape[]{
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Shapes.block()});
        }
    }

    public static class LavenderCropBlock extends TallFlowerCropBlock {
        public LavenderCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 5,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()},
                    new VoxelShape[]{
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
                            Shapes.block()});
        }
    }

    public static class LilacCropBlock extends TallFlowerCropBlock {
        public LilacCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 2,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()},
                    new VoxelShape[]{
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            Shapes.block()});
        }
    }

    public static class PeonyCropBlock extends TallFlowerCropBlock {
        public PeonyCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 2,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()},
                    new VoxelShape[]{
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Shapes.block()});
        }
    }

    public static class PitcherPlantCropBlock extends TallFlowerCropBlock {
        public PitcherPlantCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 2,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()},
                    new VoxelShape[]{
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Shapes.block()});
        }
    }

    public static class RoseBushCropBlock extends TallFlowerCropBlock {
        public RoseBushCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 2,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()},
                    new VoxelShape[]{
                            Shapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            Shapes.block()});
        }
    }

    public static class SunflowerCropBlock extends TallFlowerCropBlock {
        public SunflowerCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 3,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()},
                    new VoxelShape[]{
                            Shapes.empty(),
                            Shapes.empty(),
                            Shapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                            Shapes.block(),
                            Shapes.block(),
                            Shapes.block()});
        }
    }
}
