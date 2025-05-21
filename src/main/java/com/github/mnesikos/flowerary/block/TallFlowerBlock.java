package com.github.mnesikos.flowerary.block;

import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.BlockState;

public class TallFlowerBlock extends DoublePlantBlock {
    public TallFlowerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockPlaceContext context) {
        return false;
    }
}
