package com.github.mnesikos.flowerary.items;

import com.github.mnesikos.flowerary.blocks.FloweraryBlocks;
import net.minecraft.advancements.CriteriaTriggers;
import net.minecraft.block.BlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.item.ItemEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUseContext;
import net.minecraft.particles.ParticleTypes;
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

    public ActionResultType onItemUse(ItemUseContext context) {
        World world = context.getLevel();
        BlockPos blockpos = context.getClickedPos();
        BlockState blockstate = world.getBlockState(blockpos);
        PlayerEntity player = context.getPlayer();
        ItemStack itemstack = context.getItemInHand();

        //if it is a viable flower
        if (blockstate.getBlock().equals(ROSE_BUSH) || blockstate.getBlock().equals(WITHER_ROSE) || blockstate.getBlock().equals(DANDELION) || blockstate.getBlock().equals(POPPY) || blockstate.getBlock().equals(BLUE_ORCHID) || blockstate.getBlock().equals(ALLIUM) || blockstate.getBlock()
                .equals(AZURE_BLUET) || blockstate.getBlock()
                .equals(RED_TULIP) || blockstate.getBlock()
                .equals(ORANGE_TULIP) || blockstate.getBlock()
                .equals(WHITE_TULIP) || blockstate.getBlock()
                .equals(PINK_TULIP) || blockstate.getBlock()
                .equals(OXEYE_DAISY) || blockstate.getBlock()
                .equals(CORNFLOWER) || blockstate.getBlock()
                .equals(LILY_OF_THE_VALLEY) || blockstate.getBlock()
                .equals(SUNFLOWER) || blockstate.getBlock()
                .equals(LILAC) || blockstate.getBlock()
                .equals(PEONY)) {
            world.playSound(player, blockpos, SoundEvents.AXE_STRIP, SoundCategory.BLOCKS, 1.0F, 1.0F);
            if (!world.isClientSide) {
                //This replaces the jar item with full jar
                if (player == null || !player.abilities.instabuild) {
                    itemstack.shrink(1);
                }
                if (player == null || !player.abilities.instabuild) {
                    if (itemstack.isEmpty()) {
                        player.inventory.add(new ItemStack(FloweraryItems.EMPTY_POLLEN_JAR.get()));
                    }
                }

                if (blockstate.getBlock().equals(ROSE_BUSH)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_ROSE.get());
                } else if (blockstate.getBlock().equals(DANDELION)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_DANDELION.get());
                } else if (blockstate.getBlock().equals(POPPY)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_POPPY.get());
                } else if (blockstate.getBlock().equals(BLUE_ORCHID)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_ORCHID.get());
                } else if (blockstate.getBlock().equals(ALLIUM)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_ALLIUM.get());
                } else if (blockstate.getBlock().equals(AZURE_BLUET)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_AZURE_BLUET.get());
                } else if (blockstate.getBlock().equals(RED_TULIP)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_TULIP.get());
                } else if (blockstate.getBlock().equals(ORANGE_TULIP)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_TULIP.get());
                } else if (blockstate.getBlock().equals(WHITE_TULIP)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_TULIP.get());
                } else if (blockstate.getBlock().equals(PINK_TULIP)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_TULIP.get());
                } else if (blockstate.getBlock().equals(OXEYE_DAISY)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_DAISY.get());
                } else if (blockstate.getBlock().equals(CORNFLOWER)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_CORNFLOWER.get());
                } else if (blockstate.getBlock().equals(LILY_OF_THE_VALLEY)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_LILY.get());
                } else if (blockstate.getBlock().equals(WITHER_ROSE)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_WITHER_ROSE.get());
                } else if (blockstate.getBlock().equals(SUNFLOWER)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_SUNFLOWER.get());
                } else if (blockstate.getBlock().equals(LILAC)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_LILAC.get());
                } else if (blockstate.getBlock().equals(PEONY)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_PEONY.get());
                } else if (blockstate.getBlock().equals(ALLIUM)) {
                    ItemEntity ent = player.spawnAtLocation(FloweraryBlocks.CROP_BLACK_ALLIUM.get());
                }

                // ADD PARTICLE EFFECT (DOESNT WORK
                world.addParticle(ParticleTypes.EXPLOSION, blockpos.getX(), blockpos.getY(), blockpos.getZ(), 0.0D, 0.0D, 0.0D);

                if (player instanceof ServerPlayerEntity) {
                    CriteriaTriggers.CONSUME_ITEM.trigger((ServerPlayerEntity) player, itemstack);
                }

                //it ends here
                if (player != null) {
                    context.getItemInHand().hurtAndBreak(1, player, (p_220040_1_) -> p_220040_1_.broadcastBreakEvent(context.getHand()));
                }
                return ActionResultType.SUCCESS;
            } else {
                return ActionResultType.PASS;
            }
        }
        return ActionResultType.SUCCESS;
    }

    @Override
    public void appendHoverText(ItemStack stack, @Nullable World world, List<ITextComponent> tooltip, ITooltipFlag flag) {
        tooltip.add(new TranslationTextComponent("item.full_pollen_jar.desc"));
    }
}