package com.github.mnesikos.flowerary.item;

import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
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
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.github.mnesikos.flowerary.block.FloweraryBlocks.*;

public class PollenJarItem extends Item {
    private final FloweraryColor primaryColor;
    private final FloweraryColor secondaryColor;

    public PollenJarItem(FloweraryColor primaryColor, FloweraryColor secondaryColor, Properties properties) {
        super(properties);
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = world.getBlockState(pos);
        Block block = state.getBlock();
        Map<String, RegistryObject<Block>> plants = Collections.emptyMap();
        boolean hybrid = world.getRandom().nextFloat() <= 0.2F;

        if (block.equals(Blocks.DANDELION)) plants = hybrid ? WILDFLOWER_PLANTS : DANDELION_PLANTS;
        else if (block.equals(Blocks.POPPY)) plants = hybrid ? POPPIES_PLANTS : POPPY_PLANTS;
        else if (block.equals(Blocks.BLUE_ORCHID)) plants = hybrid ? LANTANAS_PLANTS : ORCHID_PLANTS;
        else if (block.equals(Blocks.ALLIUM)) plants = hybrid ? DAFFODIL_PLANTS : ALLIUM_PLANTS;
        else if (block.equals(Blocks.AZURE_BLUET)) plants = hybrid ? DIANTHUS_PLANTS : AZURE_BLUET_PLANTS;
        else if (block.equals(Blocks.RED_TULIP)) plants = hybrid ? HYACINTH_PLANTS : TULIP_PLANTS;
        else if (block.equals(Blocks.ORANGE_TULIP)) plants = hybrid ? BOUGAINVILLEA_PLANTS : TULIP_PLANTS;
        else if (block.equals(Blocks.WHITE_TULIP)) plants = hybrid ? CLEMATIS_PLANTS : TULIP_PLANTS;
        else if (block.equals(Blocks.PINK_TULIP)) plants = hybrid ? JASMINE_PLANTS : TULIP_PLANTS;
        else if (block.equals(Blocks.OXEYE_DAISY)) plants = hybrid ? CLOVER_PLANTS : DAISY_PLANTS;
        else if (block.equals(Blocks.CORNFLOWER)) plants = hybrid ? CHICORY_PLANTS : CORNFLOWER_PLANTS;
        else if (block.equals(Blocks.LILY_OF_THE_VALLEY)) plants = hybrid ? HIBISCUS_PLANTS : LILY_PLANTS;
        else if (block.equals(Blocks.TORCHFLOWER)) plants = hybrid ? BROMELIAD_PLANTS : TORCHFLOWER_PLANTS;
        else if (block.equals(Blocks.WITHER_ROSE)) plants = hybrid ? FAIRY_ROSE_PLANTS : WITHER_ROSE_PLANTS;
        else if (block.equals(Blocks.PINK_PETALS)) plants = hybrid ? ALYSSUM_PLANTS : PETALS_PLANTS;
        else if (block.equals(Blocks.SUNFLOWER)) plants = hybrid ? BLAZING_STAR_PLANTS : SUNFLOWER_PLANTS;
        else if (block.equals(Blocks.LILAC)) plants = hybrid ? LAVENDER_PLANTS : LILAC_PLANTS;
        else if (block.equals(Blocks.ROSE_BUSH))
            plants = hybrid ? (world.getRandom().nextBoolean() ? ROSE_PLANTS : ROSE_BUSHLET_PLANTS) : ROSE_BUSH_PLANTS;
        else if (block.equals(Blocks.PEONY)) plants = hybrid ? FOXGLOVE_PLANTS : PEONY_PLANTS;
        else if (block.equals(Blocks.PITCHER_PLANT)) plants = hybrid ? IMPALA_LILY_PLANTS : PITCHER_PLANT_PLANTS;

        if (!plants.isEmpty() && context.getPlayer() != null) {
            Player player = context.getPlayer();
            String color = primaryColor.getSerializedName();
            if (world.getRandom().nextFloat() <= 0.1F) color = secondaryColor.getSerializedName();
            if (world.getRandom().nextFloat() <= 0.02F) color = FloweraryColor.MULTICOLOR.getSerializedName();
            Block crop = plants.get(color).get();
            world.playSound(player, pos, SoundEvents.COMPOSTER_READY, SoundSource.BLOCKS, 1.0F, 1.0F);

            if (!world.isClientSide) {
                ItemStack jar = context.getItemInHand();
                ItemStack seeds = crop.asItem().getDefaultInstance();
                player.awardStat(Stats.ITEM_USED.get(this));
                if (!player.getAbilities().instabuild) jar.shrink(1);
                if (!player.getInventory().add(seeds)) player.drop(seeds, false);
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
        tooltip.add(Component.translatable("item.full_pollen_jar.desc"));
    }
}
