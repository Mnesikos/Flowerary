package com.github.mnesikos.flowerary.items;

import com.github.mnesikos.flowerary.blocks.FloweraryBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.Block;
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

public class PollenJarBlackItem extends Item {
    public PollenJarBlackItem(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResultType useOn(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = world.getBlockState(pos);
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getItemInHand();

        if (player != null && !world.isClientSide) {
            Block crop = null;
            if (state.getBlock().equals(ROSE_BUSH)) crop = FloweraryBlocks.BLACK_ROSE_BUSHLET_PLANT.get();
            else if (state.getBlock().equals(DANDELION)) crop = FloweraryBlocks.BLACK_DANDELION_PLANT.get();
            else if (state.getBlock().equals(POPPY)) crop = FloweraryBlocks.BLACK_POPPY_PLANT.get();
            else if (state.getBlock().equals(BLUE_ORCHID)) crop = FloweraryBlocks.BLACK_CLEMATIS_PLANT.get();
            else if (state.getBlock().equals(ALLIUM)) crop = FloweraryBlocks.BLACK_ALLIUM_PLANT.get();
            else if (state.getBlock().equals(AZURE_BLUET)) crop = FloweraryBlocks.BLACK_CLOVER_PLANT.get();
            else if (state.getBlock().equals(RED_TULIP)) crop = FloweraryBlocks.BLACK_HYACINTH_PLANT.get();
            else if (state.getBlock().equals(ORANGE_TULIP)) crop = FloweraryBlocks.BLACK_HYACINTH_PLANT.get();
            else if (state.getBlock().equals(WHITE_TULIP)) crop = FloweraryBlocks.BLACK_HYACINTH_PLANT.get();
            else if (state.getBlock().equals(PINK_TULIP)) crop = FloweraryBlocks.BLACK_HYACINTH_PLANT.get();
            else if (state.getBlock().equals(OXEYE_DAISY)) crop = FloweraryBlocks.BLACK_DAISY_PLANT.get();
            else if (state.getBlock().equals(CORNFLOWER)) crop = FloweraryBlocks.BLACK_DIANTHUS_PLANT.get();
            else if (state.getBlock().equals(LILY_OF_THE_VALLEY)) crop = FloweraryBlocks.BLACK_BOUGAINVILLEA_PLANT.get();
            else if (state.getBlock().equals(WITHER_ROSE)) crop = FloweraryBlocks.BLACK_FAIRY_ROSE_PLANT.get();
            else if (state.getBlock().equals(SUNFLOWER)) crop = FloweraryBlocks.BLACK_SUNFLOWER_PLANT.get();
            else if (state.getBlock().equals(LILAC)) crop = FloweraryBlocks.BLACK_JASMINE_PLANT.get();
            else if (state.getBlock().equals(PEONY)) crop = FloweraryBlocks.BLACK_FOXGLOVE_PLANT.get();
            else if (state.getBlock().equals(ALLIUM)) crop = FloweraryBlocks.BLACK_ALLIUM_PLANT.get();

            if (crop != null) {
//                world.addParticle(ParticleTypes.EXPLOSION, pos.getX(), pos.getY(), pos.getZ(), 0.0D, 0.0D, 0.0D);
                world.playSound(player, pos, SoundEvents.AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
                player.spawnAtLocation(crop);

                if (player instanceof ServerPlayerEntity)
                    CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayerEntity) player, stack);
                player.awardStat(Stats.ITEM_USED.get(this));
                if (!player.abilities.instabuild) {
                    stack.shrink(1);
                    if (stack.isEmpty())
                        player.inventory.add(new ItemStack((FloweraryItems.EMPTY_POLLEN_JAR.get())));
                }
                return ActionResultType.SUCCESS;

            } else return ActionResultType.PASS;

        } else return ActionResultType.sidedSuccess(world.isClientSide);
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(new TranslationTextComponent("item.full_pollen_jar.desc"));
    }
}