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
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.RegistryObject;

import javax.annotation.Nullable;
import java.util.List;

import static net.minecraft.world.level.block.Blocks.*;

public class EmptyPollenJarItem extends Item {
    public static final Object2ObjectMap<Block, RegistryObject<Item>> POLLENS_BY_BLOCK = Util.make(new Object2ObjectOpenHashMap<>(), (map) -> {
        map.put(DANDELION, FloweraryItems.DANDELION_POLLEN_JAR);
        map.put(POPPY, FloweraryItems.POPPY_POLLEN_JAR);
        map.put(BLUE_ORCHID, FloweraryItems.BLUE_ORCHID_POLLEN_JAR);
        map.put(ALLIUM, FloweraryItems.ALLIUM_POLLEN_JAR);
        map.put(AZURE_BLUET, FloweraryItems.AZURE_BLUET_POLLEN_JAR);
        map.put(RED_TULIP, FloweraryItems.RED_TULIP_POLLEN_JAR);
        map.put(ORANGE_TULIP, FloweraryItems.ORANGE_TULIP_POLLEN_JAR);
        map.put(WHITE_TULIP, FloweraryItems.WHITE_TULIP_POLLEN_JAR);
        map.put(PINK_TULIP, FloweraryItems.PINK_TULIP_POLLEN_JAR);
        map.put(OXEYE_DAISY, FloweraryItems.OXEYE_DAISY_POLLEN_JAR);
        map.put(CORNFLOWER, FloweraryItems.CORNFLOWER_POLLEN_JAR);
        map.put(LILY_OF_THE_VALLEY, FloweraryItems.LILY_OF_THE_VALLEY_POLLEN_JAR);
        map.put(TORCHFLOWER, FloweraryItems.TORCHFLOWER_POLLEN_JAR);
        map.put(WITHER_ROSE, FloweraryItems.WITHER_ROSE_POLLEN_JAR);
        map.put(PINK_PETALS, FloweraryItems.PINK_PETALS_POLLEN_JAR);
        map.put(SUNFLOWER, FloweraryItems.SUNFLOWER_POLLEN_JAR);
        map.put(LILAC, FloweraryItems.LILAC_POLLEN_JAR);
        map.put(ROSE_BUSH, FloweraryItems.ROSE_BUSH_POLLEN_JAR);
        map.put(PEONY, FloweraryItems.PEONY_POLLEN_JAR);
        map.put(PITCHER_PLANT, FloweraryItems.PITCHER_PLANT_POLLEN_JAR);
    });

    public EmptyPollenJarItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext context) {
        Level world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        RegistryObject<Item> pollenRegistryObject = POLLENS_BY_BLOCK.getOrDefault(world.getBlockState(pos).getBlock(), null);
        ItemStack pollen = pollenRegistryObject != null ? pollenRegistryObject.get().getDefaultInstance() : ItemStack.EMPTY;

        if (!pollen.isEmpty() && context.getPlayer() != null) {
            Player player = context.getPlayer();
            world.playSound(player, pos, SoundEvents.BOTTLE_FILL, SoundSource.BLOCKS, 1.0F, 1.0F);

            if (!world.isClientSide) {
                ItemStack jar = context.getItemInHand();
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
        tooltip.add(Component.translatable("item.empty_pollen_jar.desc"));
    }

}