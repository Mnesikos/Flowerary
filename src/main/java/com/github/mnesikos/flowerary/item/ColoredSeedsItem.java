package com.github.mnesikos.flowerary.item;

import net.minecraft.block.Block;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;

public class ColoredSeedsItem extends BlockNamedItem {
    public ColoredSeedsItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public void fillItemCategory(ItemGroup pGroup, NonNullList<ItemStack> pItems) {}
}
