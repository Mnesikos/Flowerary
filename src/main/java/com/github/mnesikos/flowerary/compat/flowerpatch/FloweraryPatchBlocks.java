package com.github.mnesikos.flowerary.compat.flowerpatch;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.mrbysco.flowerpatch.block.FlowerPatchBlock;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

public class FloweraryPatchBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, Flowerary.MOD_ID);

    public static final Map<String, RegistryObject<Block>> ALLIUM_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> AZURE_BLUET_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CORNFLOWER_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DAFFODIL_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DAISY_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DANDELION_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DIANTHUS_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FAIRY_ROSE_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HYACINTH_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LILY_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ORCHID_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPY_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ROSE_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> TORCHFLOWER_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> TULIP_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WITHER_ROSE_PATCH = new HashMap<>();

    static {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            ALLIUM_PATCH.put(color, REGISTRAR.register(color + "_allium_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.ALLIUM.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            AZURE_BLUET_PATCH.put(color, REGISTRAR.register(color + "_azure_bluet_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.AZURE_BLUET.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            CORNFLOWER_PATCH.put(color, REGISTRAR.register(color + "_cornflower_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.CORNFLOWER.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            DAFFODIL_PATCH.put(color, REGISTRAR.register(color + "_daffodil_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.DAFFODIL.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            DAISY_PATCH.put(color, REGISTRAR.register(color + "_daisy_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.DAISY.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            DANDELION_PATCH.put(color, REGISTRAR.register(color + "_dandelion_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.DANDELION.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            DIANTHUS_PATCH.put(color, REGISTRAR.register(color + "_dianthus_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.DIANTHUS.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            FAIRY_ROSE_PATCH.put(color, REGISTRAR.register(color + "_fairy_rose_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.FAIRY_ROSE.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            HYACINTH_PATCH.put(color, REGISTRAR.register(color + "_hyacinth_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.HYACINTH.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            LILY_PATCH.put(color, REGISTRAR.register(color + "_lily_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.LILY.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            ORCHID_PATCH.put(color, REGISTRAR.register(color + "_orchid_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.ORCHID.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            POPPY_PATCH.put(color, REGISTRAR.register(color + "_poppy_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.POPPY.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            ROSE_PATCH.put(color, REGISTRAR.register(color + "_rose_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.ROSE.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            TORCHFLOWER_PATCH.put(color, REGISTRAR.register(color + "_torchflower_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.TORCHFLOWER.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            TULIP_PATCH.put(color, REGISTRAR.register(color + "_tulip_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.TULIP.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
            WITHER_ROSE_PATCH.put(color, REGISTRAR.register(color + "_wither_rose_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.WITHER_ROSE.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
        }
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutout = RenderType.cutout();
        REGISTRAR.getEntries().stream().map(RegistryObject::get).forEach(block -> ItemBlockRenderTypes.setRenderLayer(block, cutout));
    }
}
