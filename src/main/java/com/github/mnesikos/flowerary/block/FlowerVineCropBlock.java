package com.github.mnesikos.flowerary.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

import java.util.function.Supplier;

public class FlowerVineCropBlock extends CropBlock {
    protected static final VoxelShape SHAPE = Block.box(15.0D, 0.0D, 5.0D, 0.0D, 16.0D, 10.0D);
    private final Supplier<? extends Item> seedItem;

    public FlowerVineCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
        super(properties);
        this.seedItem = seedItem;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return seedItem.get();
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter worldIn, BlockPos pos, CollisionContext context) {
        return SHAPE;
    }
}