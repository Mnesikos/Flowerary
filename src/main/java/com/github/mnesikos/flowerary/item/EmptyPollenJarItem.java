package com.github.mnesikos.flowerary.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.network.chat.TranslatableComponent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

import javax.annotation.Nullable;
import java.util.List;

import static net.minecraft.world.level.block.Blocks.*;

public class EmptyPollenJarItem extends Item {
    public EmptyPollenJarItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        Item crop = null;

        if (block.equals(DANDELION)) crop = FloweraryItems.DANDELION_POLLEN_JAR.get();
        else if (block.equals(POPPY)) crop = FloweraryItems.POPPY_POLLEN_JAR.get();
        else if (block.equals(BLUE_ORCHID)) crop = FloweraryItems.BLUE_ORCHID_POLLEN_JAR.get();
        else if (block.equals(ALLIUM)) crop = FloweraryItems.ALLIUM_POLLEN_JAR.get();
        else if (block.equals(AZURE_BLUET)) crop = FloweraryItems.AZURE_BLUET_POLLEN_JAR.get();
        else if (block.equals(RED_TULIP)) crop = FloweraryItems.RED_TULIP_POLLEN_JAR.get();
        else if (block.equals(ORANGE_TULIP)) crop = FloweraryItems.ORANGE_TULIP_POLLEN_JAR.get();
        else if (block.equals(WHITE_TULIP)) crop = FloweraryItems.WHITE_TULIP_POLLEN_JAR.get();
        else if (block.equals(PINK_TULIP)) crop = FloweraryItems.PINK_TULIP_POLLEN_JAR.get();
        else if (block.equals(OXEYE_DAISY)) crop = FloweraryItems.OXEYE_DAISY_POLLEN_JAR.get();
        else if (block.equals(CORNFLOWER)) crop = FloweraryItems.CORNFLOWER_POLLEN_JAR.get();
        else if (block.equals(LILY_OF_THE_VALLEY)) crop = FloweraryItems.LILY_OF_THE_VALLEY_POLLEN_JAR.get();
        else if (block.equals(WITHER_ROSE)) crop = FloweraryItems.WITHER_ROSE_POLLEN_JAR.get();
        else if (block.equals(SUNFLOWER)) crop = FloweraryItems.SUNFLOWER_POLLEN_JAR.get();
        else if (block.equals(LILAC)) crop = FloweraryItems.LILAC_POLLEN_JAR.get();
        else if (block.equals(ROSE_BUSH)) crop = FloweraryItems.ROSE_BUSH_POLLEN_JAR.get();
        else if (block.equals(PEONY)) crop = FloweraryItems.PEONY_POLLEN_JAR.get();

        if (crop != null && context.getPlayer() != null) {
            Player player = context.getPlayer();
            world.playSound(player, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);

            if (!world.isClientSide) {
                ItemStack jar = context.getItemInHand();
                ItemStack pollen = crop.getDefaultInstance();
                player.awardStat(Stats.ITEM_USED.get(this));
                if (!player.getAbilities().instabuild) jar.shrink(1);
                if (!player.getInventory().add(pollen)) player.drop(pollen, false);
            }

            double d0 = 1.03125D;
            for (int i = 0; i < 10; i++) {
                double d3 = player.getRandom().nextGaussian() * 0.02D;
                double d4 = player.getRandom().nextGaussian() * 0.02D;
                double d5 = player.getRandom().nextGaussian() * 0.02D;
                world.addParticle(ParticleTypes.COMPOSTER, (double) pos.getX() + (double) 0.13125F + (double) 0.7375F * (double) player.getRandom().nextFloat(), (double) pos.getY() + d0 + (double) player.getRandom().nextFloat() * (1.0D - d0), (double) pos.getZ() + (double) 0.13125F + (double) 0.7375F * (double) player.getRandom().nextFloat(), d3, d4, d5);
            }

            return InteractionResult.sidedSuccess(world.isClientSide);
        }

        return InteractionResult.PASS;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable Level world, List<Component> tooltip, TooltipFlag flag) {
        tooltip.add(new TranslatableComponent("item.empty_pollen_jar.desc"));
    }

}