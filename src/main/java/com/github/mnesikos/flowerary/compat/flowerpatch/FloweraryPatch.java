package com.github.mnesikos.flowerary.compat.flowerpatch;

import com.mrbysco.flowerpatch.Constants;
import com.mrbysco.flowerpatch.block.FlowerPatchBlock;
import com.mrbysco.flowerpatch.block.PatchBlock;
import com.mrbysco.flowerpatch.platform.Services;
import net.minecraft.core.BlockPos;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraftforge.event.entity.player.BonemealEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent;
import net.minecraftforge.eventbus.api.Event;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.registries.RegistryObject;

import java.util.Optional;

public class FloweraryPatch {
    public static void setupClient(final FMLClientSetupEvent event) {
        FloweraryPatchBlocks.setRenderLayers();
    }

    public static void onBlockInteraction(PlayerInteractEvent.RightClickBlock event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        Player player = event.getEntity();

        BlockState state = level.getBlockState(pos);
        ItemStack stack = player.getItemInHand(event.getHand());
        if (state.getBlock().asItem().equals(stack.getItem()) ||
                (state.getBlock() instanceof PatchBlock patchBlock && patchBlock.getPatchDelegate().get().asItem().equals(stack.getItem()))) {
            Optional<Block> optionalPatch = FloweraryPatchBlocks.REGISTRAR.getEntries().stream().filter(object -> object.get() instanceof PatchBlock patchBlock &&
                    patchBlock.getPatchDelegate().get().asItem().equals(stack.getItem())).map(RegistryObject::get).findFirst();

            if (optionalPatch.isPresent()) {
                Block block = optionalPatch.get();
                PatchBlock patchBlock = (PatchBlock) block;
                BlockState newState = block.defaultBlockState();
                IntegerProperty property = patchBlock.getProperty();
                if (state.hasProperty(property)) {
                    if (state.getValue(property) == patchBlock.getMaxAmount()) {
                        event.setUseBlock(Event.Result.DENY);
                    }
                    newState = state.setValue(property, Math.min(patchBlock.getMaxAmount(), state.getValue(property) + 1));
                }
                level.setBlockAndUpdate(pos, newState);
                level.playSound(null, pos, newState.getSoundType().getPlaceSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
                if (!player.getAbilities().instabuild) stack.shrink(1);

                event.setCanceled(true);
            }
        }
    }

    public static void onBonemeal(BonemealEvent event) {
        Level level = event.getLevel();
        BlockPos pos = event.getPos();
        BlockState state = event.getBlock();
        ItemStack stack = event.getStack();
        Player player = event.getEntity();

        if (Services.PLATFORM.flowerToPatchBonemealing() &&
                state.is(Constants.BONEMEAL_ABLE_FLOWERS) && stack.is(Constants.BONEMEAL)) {
            Optional<FlowerPatchBlock> flowerPatchOptional = FloweraryPatchBlocks.REGISTRAR.getEntries().stream()
                    .filter(object -> object.get() instanceof FlowerPatchBlock flowerPatchBlock &&
                            state.is(flowerPatchBlock.getPatchDelegate().get())).map(object -> (FlowerPatchBlock) object.get()).findFirst();

            if (flowerPatchOptional.isPresent()) {
                FlowerPatchBlock patchBlock = flowerPatchOptional.get();
                BlockState newState = patchBlock.defaultBlockState();
                level.setBlockAndUpdate(pos, newState);
                level.playSound(null, pos, newState.getSoundType().getPlaceSound(), SoundSource.BLOCKS, 1.0F, 1.0F);
                if (!player.getAbilities().instabuild) stack.shrink(1);
                event.setCanceled(true);
            }
        }
    }
}
