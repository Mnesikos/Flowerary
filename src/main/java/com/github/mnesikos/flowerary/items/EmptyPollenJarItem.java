package com.github.mnesikos.flowerary.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.stats.Stats;
import net.minecraft.util.ActionResultType;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

import static net.minecraft.block.Blocks.*;

public class EmptyPollenJarItem extends Item {
    public EmptyPollenJarItem(Properties p_i48487_1_) {
        super(p_i48487_1_);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
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
            PlayerEntity player = context.getPlayer();
            world.playSound(player, pos, SoundEvents.BOTTLE_FILL, SoundCategory.BLOCKS, 1.0F, 1.0F);

            ItemStack jar = context.getItemInHand();
            ItemStack pollen = crop.getDefaultInstance();
            player.awardStat(Stats.ITEM_USED.get(this));
            if (!player.abilities.instabuild) jar.shrink(1);
            if (!player.inventory.add(pollen)) player.drop(pollen, false);

            double d0 = 1.03125D;
            for (int i = 0; i < 10; i++) {
                double d3 = random.nextGaussian() * 0.02D;
                double d4 = random.nextGaussian() * 0.02D;
                double d5 = random.nextGaussian() * 0.02D;
                world.addParticle(ParticleTypes.COMPOSTER, (double) pos.getX() + (double) 0.13125F + (double) 0.7375F * (double) random.nextFloat(), (double) pos.getY() + d0 + (double) random.nextFloat() * (1.0D - d0), (double) pos.getZ() + (double) 0.13125F + (double) 0.7375F * (double) random.nextFloat(), d3, d4, d5);
            }

            return ActionResultType.sidedSuccess(world.isClientSide);
        }

        return ActionResultType.PASS;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(new TranslationTextComponent("item.empty_pollen_jar.desc"));
    }

}