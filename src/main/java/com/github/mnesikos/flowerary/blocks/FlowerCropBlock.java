package com.github.mnesikos.flowerary.blocks;

import net.minecraft.block.CropsBlock;
import net.minecraft.item.Item;
import net.minecraft.util.IItemProvider;

import java.util.function.Supplier;

public class FlowerCropBlock extends CropsBlock {
    private final Supplier<? extends Item> seedItem;

    public FlowerCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
        super(properties);
        this.seedItem = seedItem;
    }

    @Override
    protected IItemProvider getBaseSeedId() {
        return seedItem.get();
    }
}