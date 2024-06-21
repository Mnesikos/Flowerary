package com.github.mnesikos.flowerary.items;

import com.github.mnesikos.flowerary.blocks.FloweraryBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.particles.ParticleTypes;
import net.minecraft.stats.Stats;
import net.minecraft.util.*;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;

import javax.annotation.Nullable;
import java.util.List;

import static net.minecraft.block.Blocks.*;

public class PollenJarItem extends Item {
    private final String color;

    public PollenJarItem(String color, Properties properties) {
        super(properties);
        this.color = color;
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        Block crop = null;

        if (block.equals(ROSE_BUSH)) crop = FloweraryBlocks.ROSE_BUSHLET_PLANTS.get(color).get();
        else if (block.equals(DANDELION)) crop = FloweraryBlocks.DANDELION_PLANTS.get(color).get();
        else if (block.equals(POPPY)) crop = FloweraryBlocks.POPPIES_PLANTS.get(color).get();
        else if (block.equals(BLUE_ORCHID)) crop = FloweraryBlocks.CLEMATIS_PLANTS.get(color).get();
        else if (block.equals(ALLIUM)) crop = FloweraryBlocks.ALLIUM_PLANTS.get(color).get();
        else if (block.equals(AZURE_BLUET)) crop = FloweraryBlocks.CLOVER_PLANTS.get(color).get();
        else if (block.equals(RED_TULIP)) crop = FloweraryBlocks.HYACINTH_PLANTS.get(color).get();
        else if (block.equals(ORANGE_TULIP)) crop = FloweraryBlocks.HYACINTH_PLANTS.get(color).get();
        else if (block.equals(WHITE_TULIP)) crop = FloweraryBlocks.HYACINTH_PLANTS.get(color).get();
        else if (block.equals(PINK_TULIP)) crop = FloweraryBlocks.HYACINTH_PLANTS.get(color).get();
        else if (block.equals(OXEYE_DAISY)) crop = FloweraryBlocks.DAISY_PLANTS.get(color).get();
        else if (block.equals(CORNFLOWER)) crop = FloweraryBlocks.DIANTHUS_PLANTS.get(color).get();
        else if (block.equals(LILY_OF_THE_VALLEY)) crop = FloweraryBlocks.BOUGAINVILLEA_PLANTS.get(color).get();
        else if (block.equals(WITHER_ROSE)) crop = FloweraryBlocks.FAIRY_ROSE_PLANTS.get(color).get();
        else if (block.equals(SUNFLOWER)) crop = FloweraryBlocks.SUNFLOWER_PLANTS.get(color).get();
        else if (block.equals(LILAC)) crop = FloweraryBlocks.JASMINE_PLANTS.get(color).get();
        else if (block.equals(PEONY)) crop = FloweraryBlocks.FOXGLOVE_PLANTS.get(color).get();

        if (crop != null && context.getPlayer() != null) {
            PlayerEntity player = context.getPlayer();
            world.playSound(player, pos, SoundEvents.COMPOSTER_READY, SoundCategory.BLOCKS, 1.0F, 1.0F);

            ItemStack jar = context.getItemInHand();
            ItemStack seeds = crop.asItem().getDefaultInstance();
            player.awardStat(Stats.ITEM_USED.get(this));
            if (!player.abilities.instabuild) jar.shrink(1);
            if (!player.inventory.add(seeds)) player.drop(seeds, false);

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
        tooltip.add(new TranslationTextComponent("item.full_pollen_jar.desc"));
    }
}
