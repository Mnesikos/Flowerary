package com.github.mnesikos.flowerary.item;

import net.minecraft.core.NonNullList;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.block.Block;

public class ColoredSeedsItem extends ItemNameBlockItem {
    public ColoredSeedsItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void fillItemCategory(CreativeModeTab pGroup, NonNullList<ItemStack> pItems) {
    }
}
