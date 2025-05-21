package com.github.mnesikos.flowerary.block;

import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.CropBlock;

import java.util.function.Supplier;

public class FlowerCropBlock extends CropBlock {
    private final Supplier<? extends Item> seedItem;

    public FlowerCropBlock(Supplier<? extends Item> seedItem, Properties properties) {
        super(properties);
        this.seedItem = seedItem;
    }

    @Override
    protected ItemLike getBaseSeedId() {
        return seedItem.get();
    }
}