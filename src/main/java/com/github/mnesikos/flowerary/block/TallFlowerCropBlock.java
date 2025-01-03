package com.github.mnesikos.flowerary.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.state.EnumProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.state.properties.BlockStateProperties;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.Direction;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.BlockRayTraceResult;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.IWorld;
import net.minecraft.world.IWorldReader;
import net.minecraft.world.World;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.common.ForgeHooks;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;

import javax.annotation.Nullable;
import java.util.Random;
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
    public VoxelShape getShape(BlockState state, IBlockReader level, BlockPos pos, ISelectionContext pContext) {
        if (state.getValue(SEGMENT) == DoubleBlockHalf.LOWER) return bottomShape[state.getValue(AGE)];
        else return topShape[state.getValue(AGE)];
    }

    @Override
    public boolean canBeReplaced(BlockState pState, BlockItemUseContext pUseContext) {
        return false;
    }

    @Override
    public BlockState updateShape(BlockState state, Direction facing, BlockState facingState, IWorld level, BlockPos pos, BlockPos facingPos) {
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
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockPos pos = context.getClickedPos();
        return pos.getY() < 255 ? super.getStateForPlacement(context) : null;
    }

    @Override
    public boolean canSurvive(BlockState state, IWorldReader level, BlockPos pos) {
        if (state.getValue(SEGMENT) == DoubleBlockHalf.LOWER) return super.canSurvive(state, level, pos);
        else {
            if (!isDouble(state)) return false;
            BlockState lowerState = level.getBlockState(pos.below());
            if (state.getBlock() != this) return super.canSurvive(state, level, pos);
            return lowerState.is(this) && lowerState.getValue(SEGMENT) == DoubleBlockHalf.LOWER && getAge(state) == getAge(lowerState);
        }
    }

    @Override
    public void randomTick(BlockState state, ServerWorld level, BlockPos pos, Random random) {
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
    public void playerWillDestroy(World level, BlockPos pos, BlockState state, PlayerEntity player) {
        if (!level.isClientSide) {
            if (player.isCreative()) preventCreativeDropFromBottomPart(level, pos, state, player);
            else dropResources(state, level, pos, null, player, player.getMainHandItem());
        }

        super.playerWillDestroy(level, pos, state, player);
    }

    @Override
    public void playerDestroy(World level, PlayerEntity player, BlockPos pos, BlockState state, @Nullable TileEntity tileEntity, ItemStack stack) {
        super.playerDestroy(level, player, pos, Blocks.AIR.defaultBlockState(), tileEntity, stack);
    }

    protected static void preventCreativeDropFromBottomPart(World level, BlockPos pos, BlockState state, PlayerEntity player) {
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
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(getAgeProperty(), SEGMENT);
    }

    @Override
    public long getSeed(BlockState state, BlockPos pos) {
        return MathHelper.getSeed(pos.getX(), pos.below(state.getValue(SEGMENT) == DoubleBlockHalf.LOWER ? 0 : 1).getY(), pos.getZ());
    }

    public boolean canGrowUp(IBlockReader level, BlockPos pos) {
        BlockState aboveState = level.getBlockState(pos.above());
        return aboveState.getBlock() instanceof TallFlowerCropBlock || aboveState.getMaterial().isReplaceable();
    }

    @Override
    public boolean isValidBonemealTarget(IBlockReader level, BlockPos pos, BlockState state, boolean isClient) {
        return !isMaxAge(state) && (canGrowUp(level, pos) || getAge(state) < upperSegmentAge - 1);
    }

    @Override
    public void growCrops(World level, BlockPos pos, BlockState state) {
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
    public boolean isMaxAge(BlockState state) {
//        if (state.getValue(SEGMENT) == DoubleBlockHalf.UPPER) return false;
        return super.isMaxAge(state);
    }

    @Override
    public ActionResultType use(BlockState state, World level, BlockPos pos, PlayerEntity player, Hand hand, BlockRayTraceResult rayTraceResult) {
        ActionResultType old = super.use(state, level, pos, player, hand, rayTraceResult);
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
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block()},
                    new VoxelShape[]{
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            VoxelShapes.block()});
        }
    }

    public static class FoxgloveCropBlock extends TallFlowerCropBlock {
        public FoxgloveCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 3,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 3.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block()},
                    new VoxelShape[]{
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 2.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 12.0D, 16.0D),
                            VoxelShapes.block()});
        }
    }

    public static class ImpalaLilyCropBlock extends TallFlowerCropBlock {
        public ImpalaLilyCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 5,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block()},
                    new VoxelShape[]{
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            VoxelShapes.block()});
        }
    }

    public static class LavenderCropBlock extends TallFlowerCropBlock {
        public LavenderCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 5,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block()},
                    new VoxelShape[]{
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
                            VoxelShapes.block()});
        }
    }

    public static class LilacCropBlock extends TallFlowerCropBlock {
        public LilacCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 2,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block()},
                    new VoxelShape[]{
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 13.0D, 16.0D),
                            VoxelShapes.block()});
        }
    }

    public static class PeonyCropBlock extends TallFlowerCropBlock {
        public PeonyCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 2,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block()},
                    new VoxelShape[]{
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 9.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 10.0D, 16.0D),
                            VoxelShapes.block()});
        }
    }

    public static class RoseBushCropBlock extends TallFlowerCropBlock {
        public RoseBushCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 2,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 7.0D, 16.0D),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block()},
                    new VoxelShape[]{
                            VoxelShapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 1.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 14.0D, 16.0D),
                            VoxelShapes.block()});
        }
    }

    public static class SunflowerCropBlock extends TallFlowerCropBlock {
        public SunflowerCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
            super(seedItem, properties, 3,
                    new VoxelShape[]{
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 5.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 11.0D, 16.0D),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block()},
                    new VoxelShape[]{
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            VoxelShapes.empty(),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                            Block.box(0.0D, 0.0D, 0.0D, 16.0D, 4.0D, 16.0D),
                            VoxelShapes.block(),
                            VoxelShapes.block(),
                            VoxelShapes.block()});
        }
    }
}
