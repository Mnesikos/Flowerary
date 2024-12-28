package com.github.mnesikos.flowerary.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.CropsBlock;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.world.IBlockReader;

import java.util.function.Supplier;

public class FlowerVineCropBlock extends CropsBlock {
    protected static final VoxelShape SHAPE = Block.box(15.0D, 0.0D, 5.0D, 0.0D, 16.0D, 10.0D);
    private final Supplier<? extends Item> seedItem;

    public FlowerVineCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
        super(properties);
        this.seedItem = seedItem;
    }

    @Override
    protected IItemProvider getBaseSeedId() {
        return seedItem.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}