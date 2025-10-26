package com.github.mnesikos.flowerary.item;

import it.unimi.dsi.fastutil.objects.Object2ObjectMap;
import it.unimi.dsi.fastutil.objects.Object2ObjectOpenHashMap;
import net.minecraft.Util;
import net.minecraft.core.BlockPos;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.network.chat.Component;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.sounds.SoundSource;
import net.minecraft.stats.Stats;
import net.minecraft.util.Tuple;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

import static com.github.mnesikos.flowerary.block.FloweraryBlocks.*;

public class PollenJarItem extends Item {
    public static final Object2ObjectMap<Block, Tuple<Map<String, RegistryObject<Block>>, Map<String, RegistryObject<Block>>>> PLANTS_BY_BLOCK = Util.make(new Object2ObjectOpenHashMap<>(), (map) -> {
        map.put(Blocks.DANDELION, new Tuple<>(DANDELION_PLANTS, WILDFLOWER_PLANTS));
        map.put(Blocks.POPPY, new Tuple<>(POPPIES_PLANTS, POPPY_PLANTS));
        map.put(Blocks.BLUE_ORCHID, new Tuple<>(ORCHID_PLANTS, LANTANAS_PLANTS));
        map.put(Blocks.ALLIUM, new Tuple<>(ALLIUM_PLANTS, DAFFODIL_PLANTS));
        map.put(Blocks.AZURE_BLUET, new Tuple<>(AZURE_BLUET_PLANTS, DIANTHUS_PLANTS));
        map.put(Blocks.RED_TULIP, new Tuple<>(TULIP_PLANTS, HYACINTH_PLANTS));
        map.put(Blocks.ORANGE_TULIP, new Tuple<>(TULIP_PLANTS, BOUGAINVILLEA_PLANTS));
        map.put(Blocks.WHITE_TULIP, new Tuple<>(TULIP_PLANTS, CLEMATIS_PLANTS));
        map.put(Blocks.PINK_TULIP, new Tuple<>(TULIP_PLANTS, JASMINE_PLANTS));
        map.put(Blocks.OXEYE_DAISY, new Tuple<>(DAISY_PLANTS, CLOVER_PLANTS));
        map.put(Blocks.CORNFLOWER, new Tuple<>(CORNFLOWER_PLANTS, CHICORY_PLANTS));
        map.put(Blocks.LILY_OF_THE_VALLEY, new Tuple<>(LILY_PLANTS, HIBISCUS_PLANTS));
        map.put(Blocks.TORCHFLOWER, new Tuple<>(TORCHFLOWER_PLANTS, BROMELIAD_PLANTS));
        map.put(Blocks.WITHER_ROSE, new Tuple<>(WITHER_ROSE_PLANTS, FAIRY_ROSE_PLANTS));
        map.put(Blocks.PINK_PETALS, new Tuple<>(PETALS_PLANTS, ALYSSUM_PLANTS));
        map.put(Blocks.SUNFLOWER, new Tuple<>(SUNFLOWER_PLANTS, BLAZING_STAR_PLANTS));
        map.put(Blocks.LILAC, new Tuple<>(LILAC_PLANTS, LAVENDER_PLANTS));
        map.put(Blocks.ROSE_BUSH, new Tuple<>(ROSE_BUSH_PLANTS, ROSE_BUSHLET_PLANTS));
        map.put(Blocks.PEONY, new Tuple<>(PEONY_PLANTS, FOXGLOVE_PLANTS));
        map.put(Blocks.PITCHER_PLANT, new Tuple<>(PITCHER_PLANT_PLANTS, IMPALA_LILY_PLANTS));
    });
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
        Block block = world.getBlockState(pos).getBlock();

        boolean hybrid = world.getRandom().nextFloat() <= 0.2F;
        Tuple<Map<String, RegistryObject<Block>>, Map<String, RegistryObject<Block>>> emptyTuple = new Tuple<>(Collections.emptyMap(), Collections.emptyMap());

        Map<String, RegistryObject<Block>> plants = hybrid ? PLANTS_BY_BLOCK.getOrDefault(block, emptyTuple).getB() : PLANTS_BY_BLOCK.getOrDefault(block, emptyTuple).getA();
        if (block.equals(Blocks.ROSE_BUSH) && hybrid && world.getRandom().nextBoolean()) plants = ROSE_PLANTS;

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
