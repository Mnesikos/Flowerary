package com.github.mnesikos.flowerary.items;

import com.github.mnesikos.flowerary.blocks.FloweraryBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;

public class FlowerItemGroup extends ItemGroup {
    public FlowerItemGroup() {
        super("FlowerBreeding");
    }

    @Override
    public ItemStack makeIcon() {
        return new ItemStack(FloweraryBlocks.FLOWER_PINK_POPPY.get());
    }
}