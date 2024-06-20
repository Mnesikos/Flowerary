package com.github.mnesikos.flowerary.items;

import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
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
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getItemInHand();

        if (player != null && !world.isClientSide) {
            Item crop = null;
            if (state.getBlock().equals(ROSE_BUSH)) crop = FloweraryItems.POLLEN_JAR_ROSE.get();
            else if (state.getBlock().equals(WITHER_ROSE)) crop = FloweraryItems.POLLEN_JAR_WITHER_ROSE.get();
            else if (state.getBlock().equals(POPPY)) crop = FloweraryItems.POLLEN_JAR_ROSE.get();
            else if (state.getBlock().equals(BLUE_ORCHID)) crop = FloweraryItems.POLLEN_JAR_ORCHID.get();
            else if (state.getBlock().equals(ALLIUM)) crop = FloweraryItems.POLLEN_JAR_ALLIUM.get();
            else if (state.getBlock().equals(DANDELION)) crop = FloweraryItems.POLLEN_JAR_DANDELION.get();
            else if (state.getBlock().equals(POPPY)) crop = FloweraryItems.POLLEN_JAR_POPPY.get();
            else if (state.getBlock().equals(AZURE_BLUET)) crop = FloweraryItems.POLLEN_JAR_AZURE_BLUET.get();
            else if (state.getBlock().equals(RED_TULIP)) crop = FloweraryItems.POLLEN_JAR_RED_TULIP.get();
            else if (state.getBlock().equals(ORANGE_TULIP)) crop = FloweraryItems.POLLEN_JAR_ORANGE_TULIP.get();
            else if (state.getBlock().equals(WHITE_TULIP)) crop = FloweraryItems.POLLEN_JAR_WHITE_TULIP.get();
            else if (state.getBlock().equals(PINK_TULIP)) crop = FloweraryItems.POLLEN_JAR_PINK_TULIP.get();
            else if (state.getBlock().equals(OXEYE_DAISY)) crop = FloweraryItems.POLLEN_JAR_DAISY.get();
            else if (state.getBlock().equals(CORNFLOWER)) crop = FloweraryItems.POLLEN_JAR_CORNFLOWER.get();
            else if (state.getBlock().equals(LILY_OF_THE_VALLEY)) crop = FloweraryItems.POLLEN_JAR_LILY_OF_THE_VALLEY.get();
            else if (state.getBlock().equals(WITHER_ROSE)) crop = FloweraryItems.POLLEN_JAR_WITHER_ROSE.get();
            else if (state.getBlock().equals(SUNFLOWER)) crop = FloweraryItems.POLLEN_JAR_SUNFLOWER.get();
            else if (state.getBlock().equals(LILAC)) crop = FloweraryItems.POLLEN_JAR_LILAC.get();
            else if (state.getBlock().equals(PEONY)) crop = FloweraryItems.POLLEN_JAR_PEONY.get();

            if (crop != null) {
//                world.addParticle(ParticleTypes.EXPLOSION, pos.getX(), pos.getY(), pos.getZ(), 0.0D, 0.0D, 0.0D);
                world.playSound(player, pos, SoundEvents.AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                player.spawnAtLocation(crop);

                if (player instanceof ServerPlayerEntity)
                    CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                player.awardStat(Stats.ITEM_USED.get(this));
                if (!player.abilities.instabuild) stack.shrink(1);
                return ActionResultType.SUCCESS;

            } else return ActionResultType.PASS;

        } else return ActionResultType.sidedSuccess(world.isClientSide);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(new TranslationTextComponent("item.empty_pollen_jar.desc"));
    }

}