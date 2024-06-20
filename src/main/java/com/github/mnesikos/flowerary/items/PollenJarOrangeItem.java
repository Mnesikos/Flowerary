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

public class PollenJarOrangeItem extends Item {
    public PollenJarOrangeItem(Properties properties) {
        super(properties);
    }

    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos pos = context.getClickedPos();
        BlockState state = world.getBlockState(pos);
        PlayerEntity player = context.getPlayer();
        ItemStack stack = context.getItemInHand();

        if (player != null && !world.isClientSide) {
            Block crop = null;
            if (state.getBlock().equals(ROSE_BUSH)) crop = FloweraryBlocks.CROP_ORANGE_ROSE.get();
            else if (state.getBlock().equals(DANDELION)) crop = FloweraryBlocks.CROP_ORANGE_DANDELION.get();
            else if (state.getBlock().equals(POPPY)) crop = FloweraryBlocks.CROP_ORANGE_POPPY.get();
            else if (state.getBlock().equals(BLUE_ORCHID)) crop = FloweraryBlocks.CROP_ORANGE_ORCHID.get();
            else if (state.getBlock().equals(ALLIUM)) crop = FloweraryBlocks.CROP_ORANGE_ALLIUM.get();
            else if (state.getBlock().equals(AZURE_BLUET)) crop = FloweraryBlocks.CROP_ORANGE_AZURE_BLUET.get();
            else if (state.getBlock().equals(RED_TULIP)) crop = FloweraryBlocks.CROP_ORANGE_TULIP.get();
            else if (state.getBlock().equals(ORANGE_TULIP)) crop = FloweraryBlocks.CROP_ORANGE_TULIP.get();
            else if (state.getBlock().equals(WHITE_TULIP)) crop = FloweraryBlocks.CROP_ORANGE_TULIP.get();
            else if (state.getBlock().equals(PINK_TULIP)) crop = FloweraryBlocks.CROP_ORANGE_TULIP.get();
            else if (state.getBlock().equals(OXEYE_DAISY)) crop = FloweraryBlocks.CROP_ORANGE_DAISY.get();
            else if (state.getBlock().equals(CORNFLOWER)) crop = FloweraryBlocks.CROP_ORANGE_CORNFLOWER.get();
            else if (state.getBlock().equals(LILY_OF_THE_VALLEY)) crop = FloweraryBlocks.CROP_ORANGE_LILY.get();
            else if (state.getBlock().equals(WITHER_ROSE)) crop = FloweraryBlocks.CROP_ORANGE_WITHER_ROSE.get();
            else if (state.getBlock().equals(SUNFLOWER)) crop = FloweraryBlocks.CROP_ORANGE_SUNFLOWER.get();
            else if (state.getBlock().equals(LILAC)) crop = FloweraryBlocks.CROP_ORANGE_LILAC.get();
            else if (state.getBlock().equals(PEONY)) crop = FloweraryBlocks.CROP_ORANGE_PEONY.get();
            else if (state.getBlock().equals(ALLIUM)) crop = FloweraryBlocks.CROP_ORANGE_ALLIUM.get();

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