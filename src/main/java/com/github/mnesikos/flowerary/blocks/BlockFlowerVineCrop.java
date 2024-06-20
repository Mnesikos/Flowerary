package com.github.mnesikos.flowerary.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.CropsBlock;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

public class BlockFlowerVineCrop extends CropsBlock {
    protected static final VoxelShape SHAPE = Block.box(15.0D, 0.0D, 5.0D, 0.0D, 16.0D, 10.0D);

    public BlockFlowerVineCrop(Properties properties) {
        super(properties);
    }

    protected IItemProvider getSeedsItem() {
        return Blocks.AIR;
    }

    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }

    protected boolean isValidGround(BlockState state, IBlockReader worldIn, BlockPos pos) {
        return state.getBlock() == Blocks.FARMLAND;
    }
}