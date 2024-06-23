package com.github.mnesikos.flowerary.items;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
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
import net.minecraftforge.fml.RegistryObject;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.github.mnesikos.flowerary.blocks.FloweraryBlocks.*;

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
        Map<String, RegistryObject<Block>> plants = Collections.emptyMap();
        boolean hybrid = random.nextFloat() < 0.2F;

        if (block.equals(Blocks.DANDELION)) plants = hybrid ? WILDFLOWER_PLANTS : DANDELION_PLANTS;
        else if (block.equals(Blocks.POPPY)) plants = hybrid ? POPPIES_PLANTS : POPPY_PLANTS;
        else if (block.equals(Blocks.BLUE_ORCHID)) plants = hybrid ? BROMELIAD_PLANTS : ORCHID_PLANTS;
        else if (block.equals(Blocks.ALLIUM)) plants = hybrid ? LANTANAS_PLANTS : ALLIUM_PLANTS;
        else if (block.equals(Blocks.AZURE_BLUET))
            plants = hybrid ? (random.nextBoolean() ? CLOVER_PLANTS : ALYSSUM_PLANTS) : AZURE_BLUET_PLANTS;
        else if (block.equals(Blocks.RED_TULIP)) plants = hybrid ? HYACINTH_PLANTS : TULIP_PLANTS;
        else if (block.equals(Blocks.ORANGE_TULIP)) plants = hybrid ? BOUGAINVILLEA_PLANTS : TULIP_PLANTS;
        else if (block.equals(Blocks.WHITE_TULIP)) plants = hybrid ? CLEMATIS_PLANTS : TULIP_PLANTS;
        else if (block.equals(Blocks.PINK_TULIP)) plants = hybrid ? JASMINE_PLANTS : TULIP_PLANTS;
        else if (block.equals(Blocks.OXEYE_DAISY)) plants = hybrid ? DIANTHUS_PLANTS : DAISY_PLANTS;
        else if (block.equals(Blocks.CORNFLOWER)) plants = hybrid ? CHICORY_PLANTS : CORNFLOWER_PLANTS;
        else if (block.equals(Blocks.LILY_OF_THE_VALLEY)) plants = hybrid ? HIBISCUS_PLANTS : LILY_PLANTS;
        else if (block.equals(Blocks.WITHER_ROSE)) plants = hybrid ? FAIRY_ROSE_PLANTS : WITHER_ROSE_PLANTS;
        else if (block.equals(Blocks.SUNFLOWER)) plants = hybrid ? IMPALA_LILY_PLANTS : SUNFLOWER_PLANTS;
        else if (block.equals(Blocks.LILAC))
            plants = hybrid ? (random.nextBoolean() ? FOXGLOVE_PLANTS : LAVENDER_PLANTS) : LILAC_PLANTS;
        else if (block.equals(Blocks.ROSE_BUSH)) plants = hybrid ? ROSE_BUSHLET_PLANTS : ROSE_BUSH_PLANTS;
        else if (block.equals(Blocks.PEONY)) plants = hybrid ? BLAZING_STAR_PLANTS : PEONY_PLANTS;

        if (!plants.isEmpty() && context.getPlayer() != null) {
            Block crop = plants.get(color).get();
            PlayerEntity player = context.getPlayer();
            world.playSound(player, pos, SoundEvents.COMPOSTER_READY, SoundCategory.BLOCKS, 1.0F, 1.0F);

            if (!world.isClientSide) {
                ItemStack jar = context.getItemInHand();
                ItemStack seeds = crop.asItem().getDefaultInstance();
                player.awardStat(Stats.ITEM_USED.get(this));
                if (!player.abilities.instabuild) jar.shrink(1);
                if (!player.inventory.add(seeds)) player.drop(seeds, false);
            }

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
