package com.github.mnesikos.flowerary.compat.serene_shrubbery;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.DirectionProperty;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import net.minecraftforge.common.PlantType;
import org.jetbrains.annotations.Nullable;

public class BlanketFlowerBlock extends FlowerBlock {
    public static final DirectionProperty FACING = BlockStateProperties.HORIZONTAL_FACING;
    public static final IntegerProperty AMOUNT = BlockStateProperties.FLOWER_AMOUNT;

    public BlanketFlowerBlock() {
        super(() -> MobEffects.WATER_BREATHING, 100, Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().lightLevel((s) -> 1).noCollission().offsetType(OffsetType.XZ).pushReaction(PushReaction.DESTROY));
        registerDefaultState(stateDefinition.any().setValue(FACING, Direction.NORTH).setValue(AMOUNT, 1));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Vec3 offset = state.getOffset(level, pos);
        return switch (state.getValue(AMOUNT)) {
            case 2 -> box(0.0F, 0.0F, 0.0F, 16.0F, 8.0F, 16.0F).move(offset.x, offset.y, offset.z);
            case 3 -> box(0.0F, 0.0F, 0.0F, 16.0F, 10.0F, 16.0F).move(offset.x, offset.y, offset.z);
            case 4 -> box(0.0F, 0.0F, 0.0F, 16.0F, 13.0F, 16.0F).move(offset.x, offset.y, offset.z);
            default -> box(0.0F, 0.0F, 0.0F, 16.0F, 5.0F, 16.0F).move(offset.x, offset.y, offset.z);
        };
    }

    @Override
    public PlantType getPlantType(BlockGetter level, BlockPos pos) {
        return PlantType.DESERT;
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rotation) {
        return state.setValue(FACING, rotation.rotate(state.getValue(FACING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirror) {
        return state.rotate(mirror.getRotation(state.getValue(FACING)));
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        return !context.isSecondaryUseActive() && context.getItemInHand().is(this.asItem()) && state.getValue(AMOUNT) < 4 || super.canBeReplaced(state, context);
    }

    @Override
    public @Nullable BlockState getStateForPlacement(BlockPlaceContext context) {
        BlockState blockstate = context.getLevel().getBlockState(context.getClickedPos());
        return blockstate.is(this) ? blockstate.setValue(AMOUNT, Math.min(4, blockstate.getValue(AMOUNT) + 1)) : this.defaultBlockState().setValue(FACING, context.getHorizontalDirection().getOpposite());
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
        builder.add(FACING, AMOUNT);
    }
}
