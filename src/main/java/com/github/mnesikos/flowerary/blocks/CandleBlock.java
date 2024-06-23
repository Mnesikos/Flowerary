package com.github.mnesikos.flowerary.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.state.IntegerProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

import java.util.Random;

public class CandleBlock extends HorizontalBlock {
    public static final IntegerProperty CANDLES = IntegerProperty.create("candles", 1, 4);

    //xMin, yMin, zMin, xMax, yMax, zMax); //all decimals
    protected static final VoxelShape SHAPE_EAST = Block.box(7.0D, 0.0D, 7.0D, 10.0D, 7.0D, 10.0D);
    protected static final VoxelShape SHAPE_WEST = Block.box(6.0D, 0.0D, 6.0D, 9.0D, 7.0D, 9.0D);
    protected static final VoxelShape SHAPE_NORTH = Block.box(7.0D, 0.0D, 6.0D, 10.0D, 7.0D, 9.0D);
    protected static final VoxelShape SHAPE_SOUTH = Block.box(6.0D, 0.0D, 7.0D, 9.0D, 7.0D, 10.0D);
    protected static final VoxelShape SHAPE_MULTI = Block.box(2.0D, 0.0D, 2.0D, 14.0D, 7.0D, 14.0D);

    public CandleBlock(Properties properties) {
        super(properties);
        this.registerDefaultState(this.getStateDefinition().any().setValue(FACING, Direction.SOUTH).setValue(CANDLES, 1));
    }

    @Override
    public int getLightValue(BlockState state, IBlockReader world, BlockPos pos) {
        return super.getLightValue(state, world, pos) + 2 * state.getValue(CANDLES);
    }

    @OnlyIn(Dist.CLIENT)
    public void animateTick(BlockState state, World world, BlockPos pos, Random random) {
        double posX = (double) pos.getX();
        double posY = (double) pos.getY();
        double posZ = (double) pos.getZ();
        //world.addParticle(ParticleTypes.SMOKE, posX, posY, posZ, 0.0D, 0.0D, 0.0D);
        Direction blockDirection = state.getValue(FACING);

        Direction facing = state.getValue(FACING);
        int candleCount = state.getValue(CANDLES);

        if (candleCount == 1) {
            Double candleOnePosX = 0.54D;
            Double candleOnePosZ = 0.48D;
            switch (blockDirection) {
                case NORTH:
                    candleOnePosX = candleOnePosX;
                    candleOnePosZ = candleOnePosZ;
                    break;
                case SOUTH:
                    candleOnePosX = candleOnePosZ;
                    candleOnePosZ = candleOnePosX;
                    break;
                case EAST:
                    candleOnePosX = candleOnePosX;
                    candleOnePosZ = 1 - candleOnePosZ;
                    break;
                case WEST:
                    candleOnePosX = 1 - candleOnePosX;
                    candleOnePosZ = candleOnePosZ;
                    break;
            }
            world.addParticle(ParticleTypes.FLAME, posX + candleOnePosX, posY + 0.64D, posZ + candleOnePosZ, 0.0D, 0.0D, 0.0D);
        } else if (candleCount == 2) {
            Double candleOnePosX = 0.25D;
            Double candleOnePosZ = 0.58D;
            Double candleTwoPosX = 0.7D;
            Double candleTwoPosZ = 0.34D;
            Double transformedcandleOnePosX = 0.0D;
            Double transformedcandleOnePosZ = 0.0D;
            Double transformedcandleTwoPosX = 0.0D;
            Double transformedcandleTwoPosZ = 0.0D;
            switch (blockDirection) {
                case NORTH:
                    transformedcandleOnePosX = candleOnePosX;
                    transformedcandleOnePosZ = candleOnePosZ;
                    transformedcandleTwoPosX = candleTwoPosX;
                    transformedcandleTwoPosZ = candleTwoPosZ;
                    break;
                case SOUTH:
                    transformedcandleOnePosX = 1 - candleOnePosX;
                    transformedcandleOnePosZ = 1 - candleOnePosZ;
                    transformedcandleTwoPosX = 1 - candleTwoPosX;
                    transformedcandleTwoPosZ = 1 - candleTwoPosZ;
                    break;
                case WEST:
                    transformedcandleOnePosX = candleOnePosZ;
                    transformedcandleOnePosZ = 1 - candleOnePosX;
                    transformedcandleTwoPosX = candleTwoPosZ;
                    transformedcandleTwoPosZ = 1 - candleTwoPosX;
                    break;
                case EAST:
                    transformedcandleOnePosX = 1 - candleOnePosZ;
                    transformedcandleOnePosZ = candleOnePosX;
                    transformedcandleTwoPosX = 1 - candleTwoPosZ;
                    transformedcandleTwoPosZ = candleTwoPosX;
                    break;
            }
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleOnePosX, posY + 0.58D, posZ + transformedcandleOnePosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleTwoPosX, posY + 0.63D, posZ + transformedcandleTwoPosZ, 0.0D, 0.0D, 0.0D);
        } else if (candleCount == 3) {
            Double candleOnePosX = 0.19D;
            Double candleOnePosZ = 0.58D;
            Double candleTwoPosX = 0.56D;
            Double candleTwoPosZ = 0.67D;
            Double candleThreePosX = 0.72D;
            Double candleThreePosZ = 0.36D;
            Double transformedcandleOnePosX = 0.0D;
            Double transformedcandleOnePosZ = 0.0D;
            Double transformedcandleTwoPosX = 0.0D;
            Double transformedcandleTwoPosZ = 0.0D;
            Double transformedcandleThreePosX = 0.0D;
            Double transformedcandleThreePosZ = 0.0D;

            switch (blockDirection) {
                case NORTH:
                    transformedcandleOnePosX = candleOnePosX;
                    transformedcandleOnePosZ = candleOnePosZ;
                    transformedcandleTwoPosX = candleTwoPosX;
                    transformedcandleTwoPosZ = candleTwoPosZ;
                    transformedcandleThreePosX = candleThreePosX;
                    transformedcandleThreePosZ = candleThreePosZ;
                    break;
                case SOUTH:
                    transformedcandleOnePosX = 1 - candleOnePosX;
                    transformedcandleOnePosZ = 1 - candleOnePosZ;
                    transformedcandleTwoPosX = 1 - candleTwoPosX;
                    transformedcandleTwoPosZ = 1 - candleTwoPosZ;
                    transformedcandleThreePosX = 1 - candleThreePosX;
                    transformedcandleThreePosZ = 1 - candleThreePosZ;
                    break;
                case WEST:
                    transformedcandleOnePosX = candleOnePosZ;
                    transformedcandleOnePosZ = 1 - candleOnePosX;
                    transformedcandleTwoPosX = candleTwoPosZ;
                    transformedcandleTwoPosZ = 1 - candleTwoPosX;
                    transformedcandleThreePosX = candleThreePosZ;
                    transformedcandleThreePosZ = 1 - candleThreePosX;
                    break;
                case EAST:
                    transformedcandleOnePosX = 1 - candleOnePosZ;
                    transformedcandleOnePosZ = candleOnePosX;
                    transformedcandleTwoPosX = 1 - candleTwoPosZ;
                    transformedcandleTwoPosZ = candleTwoPosX;
                    transformedcandleThreePosX = 1 - candleThreePosZ;
                    transformedcandleThreePosZ = candleThreePosX;
                    break;
            }
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleOnePosX, posY + 0.55D, posZ + transformedcandleOnePosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleTwoPosX, posY + 0.48D, posZ + transformedcandleTwoPosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleThreePosX, posY + 0.63D, posZ + transformedcandleThreePosZ, 0.0D, 0.0D, 0.0D);
        } else {

            Double candleOnePosX = 0.19D;
            Double candleOnePosZ = 0.70D;
            Double candleTwoPosX = 0.61D;
            Double candleTwoPosZ = 0.80D;
            Double candleThreePosX = 0.34D;
            Double candleThreePosZ = 0.21D;
            Double candleFourPosX = 0.70D;
            Double candleFourPosZ = 0.41D;
            Double transformedcandleOnePosX = 0.0D;
            Double transformedcandleOnePosZ = 0.0D;
            Double transformedcandleTwoPosX = 0.0D;
            Double transformedcandleTwoPosZ = 0.0D;
            Double transformedcandleThreePosX = 0.0D;
            Double transformedcandleThreePosZ = 0.0D;
            Double transformedcandleFourPosX = 0.0D;
            Double transformedcandleFourPosZ = 0.0D;

            switch (blockDirection) {
                case NORTH:
                    transformedcandleOnePosX = candleOnePosX;
                    transformedcandleOnePosZ = candleOnePosZ;
                    transformedcandleTwoPosX = candleTwoPosX;
                    transformedcandleTwoPosZ = candleTwoPosZ;
                    transformedcandleThreePosX = candleThreePosX;
                    transformedcandleThreePosZ = candleThreePosZ;
                    transformedcandleFourPosX = candleFourPosX;
                    transformedcandleFourPosZ = candleFourPosZ;
                    break;
                case SOUTH:
                    transformedcandleOnePosX = 1 - candleOnePosX;
                    transformedcandleOnePosZ = 1 - candleOnePosZ;
                    transformedcandleTwoPosX = 1 - candleTwoPosX;
                    transformedcandleTwoPosZ = 1 - candleTwoPosZ;
                    transformedcandleThreePosX = 1 - candleThreePosX;
                    transformedcandleThreePosZ = 1 - candleThreePosZ;
                    transformedcandleFourPosX = 1 - candleFourPosX;
                    transformedcandleFourPosZ = 1 - candleFourPosZ;
                    break;
                case WEST:
                    transformedcandleOnePosX = candleOnePosZ;
                    transformedcandleOnePosZ = 1 - candleOnePosX;
                    transformedcandleTwoPosX = candleTwoPosZ;
                    transformedcandleTwoPosZ = 1 - candleTwoPosX;
                    transformedcandleThreePosX = candleThreePosZ;
                    transformedcandleThreePosZ = 1 - candleThreePosX;
                    transformedcandleFourPosX = candleFourPosZ;
                    transformedcandleFourPosZ = 1 - candleFourPosX;

                    break;
                case EAST:
                    transformedcandleOnePosX = 1 - candleOnePosZ;
                    transformedcandleOnePosZ = candleOnePosX;
                    transformedcandleTwoPosX = 1 - candleTwoPosZ;
                    transformedcandleTwoPosZ = candleTwoPosX;
                    transformedcandleThreePosX = 1 - candleThreePosZ;
                    transformedcandleThreePosZ = candleThreePosX;
                    transformedcandleFourPosX = 1 - candleFourPosZ;
                    transformedcandleFourPosZ = candleFourPosX;

                    break;
            }
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleOnePosX, posY + 0.55D, posZ + transformedcandleOnePosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleTwoPosX, posY + 0.5D, posZ + transformedcandleTwoPosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleThreePosX, posY + 0.64D, posZ + transformedcandleThreePosZ, 0.0D, 0.0D, 0.0D);
            world.addParticle(ParticleTypes.FLAME, posX + transformedcandleFourPosX, posY + 0.58D, posZ + transformedcandleFourPosZ, 0.0D, 0.0D, 0.0D);
        }

    }

    @Override
    protected void createBlockStateDefinition(StateContainer.Builder<Block, BlockState> stateBuilder) {
        stateBuilder.add(FACING, CANDLES);
    }

    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        BlockState block = context.getLevel().getBlockState(context.getClickedPos());
        if (block.getBlock() == this) {
            return (BlockState) this.defaultBlockState().setValue(CANDLES, Math.min(4, (int) block.getValue(CANDLES) + 1)).setValue(FACING, context.getHorizontalDirection().getOpposite().getOpposite());
        } else {
            return (BlockState) this.defaultBlockState().setValue(CANDLES, 1).setValue(FACING, context.getHorizontalDirection().getOpposite().getOpposite());
        }
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockItemUseContext context) {
        return context.getItemInHand().getItem() == this.asItem() && state.getValue(CANDLES) < 4 || super.canBeReplaced(state, context);
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader blockReader, BlockPos pos, ISelectionContext selectionContext) {
        Direction direction = state.getValue(FACING);
        int candleCount = state.getValue(CANDLES);

        if (direction == Direction.NORTH && candleCount == 1) {
            return SHAPE_NORTH;
        } else if (direction == Direction.SOUTH && candleCount == 1) {
            return SHAPE_SOUTH;
        } else if (direction == Direction.EAST && candleCount == 1) {
            return SHAPE_EAST;
        } else if (direction == Direction.WEST && candleCount == 1) {
            return SHAPE_WEST;
        } else {
            return SHAPE_MULTI;
        }
    }
}