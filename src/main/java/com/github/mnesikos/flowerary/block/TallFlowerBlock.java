package com.github.mnesikos.flowerary.block;

import net.minecraft.block.BlockState;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.item.BlockItemUseContext;

public class TallFlowerBlock extends DoublePlantBlock {
    public TallFlowerBlock(Properties properties) {
        super(properties);
    }

    @Override
    public boolean canBeReplaced(BlockState state, BlockItemUseContext context) {
        return false;
    }
}
