package com.github.mnesikos.flowerary.item;

import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;

public class SeedsJarBlockItem extends ItemNameBlockItem {
    public SeedsJarBlockItem(Block block, Properties properties) {
        super(block, properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        InteractionResult interactionResult = super.useOn(context);
        if (interactionResult.consumesAction()) {
            Player player = context.getPlayer();
            if (!player.getAbilities().instabuild) {
                ItemStack emptyJar = new ItemStack(FloweraryItems.EMPTY_POLLEN_JAR.get());
                if (!player.getInventory().add(emptyJar)) player.drop(emptyJar, false);
            }
        }
        return interactionResult;
    }
}
