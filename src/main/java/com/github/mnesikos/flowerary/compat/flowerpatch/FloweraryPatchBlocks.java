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
import java.util.function.Supplier;

public class FloweraryPatchBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, Flowerary.MOD_ID);

    public static final Map<String, RegistryObject<Block>> ALLIUM_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> ALYSSUM_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> AZURE_BLUET_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> BLAZING_STAR_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> BOUGAINVILLEA_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> BROMELIAD_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> CHICORY_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> CLEMATIS_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> CLOVER_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CORNFLOWER_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DAFFODIL_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DAISY_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DANDELION_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DIANTHUS_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FAIRY_ROSE_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> FOXGLOVE_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> HIBISCUS_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HYACINTH_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> IMPALA_LILY_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> JASMINE_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> LANTANAS_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> LAVENDER_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> LILAC_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LILY_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ORCHID_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> PEONY_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> PETALS_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> PITCHER_PLANT_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPY_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> POPPIES_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ROSE_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> ROSE_BUSH_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> ROSE_BUSHLET_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> SUNFLOWER_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> TORCHFLOWER_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> TULIP_PATCH = new HashMap<>();
//    public static final Map<String, RegistryObject<Block>> WILDFLOWER_PATCH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WITHER_ROSE_PATCH = new HashMap<>();

    static {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
                ALLIUM_PATCH.put(color, registerWithItem(color + "_allium_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.ALLIUM.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                ALYSSUM_PATCH.put(color, registerWithItem(color + "_alyssum_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.ALYSSUM.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                AZURE_BLUET_PATCH.put(color, registerWithItem(color + "_azure_bluet_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.AZURE_BLUET.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                BLAZING_STAR_PATCH.put(color, registerWithItem(color + "_blazing_star_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.BLAZING_STAR.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                BOUGAINVILLEA_PATCH.put(color, registerWithItem(color + "_bougainvillea_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.BOUGAINVILLEA.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                BROMELIAD_PATCH.put(color, registerWithItem(color + "_bromeliad_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.BROMELIAD.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                CHICORY_PATCH.put(color, registerWithItem(color + "_chicory_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.CHICORY.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                CLEMATIS_PATCH.put(color, registerWithItem(color + "_clematis_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.CLEMATIS.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                CLOVER_PATCH.put(color, registerWithItem(color + "_clover_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.CLOVER.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                CORNFLOWER_PATCH.put(color, registerWithItem(color + "_cornflower_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.CORNFLOWER.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                DAFFODIL_PATCH.put(color, registerWithItem(color + "_daffodil_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.DAFFODIL.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                DAISY_PATCH.put(color, registerWithItem(color + "_daisy_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.DAISY.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                DANDELION_PATCH.put(color, registerWithItem(color + "_dandelion_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.DANDELION.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                DIANTHUS_PATCH.put(color, registerWithItem(color + "_dianthus_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.DIANTHUS.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                FAIRY_ROSE_PATCH.put(color, registerWithItem(color + "_fairy_rose_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.FAIRY_ROSE.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                FOXGLOVE_PATCH.put(color, registerWithItem(color + "_foxglove_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.FOXGLOVE.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                HIBISCUS_PATCH.put(color, registerWithItem(color + "_hibiscus_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.HIBISCUS.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                HYACINTH_PATCH.put(color, registerWithItem(color + "_hyacinth_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.HYACINTH.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                IMPALA_LILY_PATCH.put(color, registerWithItem(color + "_impala_lily_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.IMPALA_LILY.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                JASMINE_PATCH.put(color, registerWithItem(color + "_jasmine_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.JASMINE.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                LANTANAS_PATCH.put(color, registerWithItem(color + "_lantanas_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.LANTANAS.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                LAVENDER_PATCH.put(color, registerWithItem(color + "_lavender_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.LAVENDER.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                LILAC_PATCH.put(color, registerWithItem(color + "_lilac_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.LILAC.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                LILY_PATCH.put(color, registerWithItem(color + "_lily_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.LILY.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                ORCHID_PATCH.put(color, registerWithItem(color + "_orchid_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.ORCHID.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                PEONY_PATCH.put(color, registerWithItem(color + "_peony_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.PEONY.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                PETALS_PATCH.put(color, registerWithItem(color + "_petals_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.PETALS.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                PITCHER_PLANT_PATCH.put(color, registerWithItem(color + "_pitcher_plant_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.PITCHER_PLANT.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                POPPY_PATCH.put(color, registerWithItem(color + "_poppy_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.POPPY.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                POPPIES_PATCH.put(color, registerWithItem(color + "_poppies_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.POPPIES.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                ROSE_PATCH.put(color, registerWithItem(color + "_rose_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.ROSE.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                ROSE_BUSH_PATCH.put(color, registerWithItem(color + "_rose_bush_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.ROSE_BUSH.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                ROSE_BUSHLET_PATCH.put(color, registerWithItem(color + "_rose_bushlet_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.ROSE_BUSHLET.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                SUNFLOWER_PATCH.put(color, registerWithItem(color + "_sunflower_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.SUNFLOWER.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                TORCHFLOWER_PATCH.put(color, registerWithItem(color + "_torchflower_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.TORCHFLOWER.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                TULIP_PATCH.put(color, registerWithItem(color + "_tulip_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.TULIP.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
//                WILDFLOWER_PATCH.put(color, registerWithItem(color + "_wildflower_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.WILDFLOWER.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
                WITHER_ROSE_PATCH.put(color, registerWithItem(color + "_wither_rose_patch", () -> new FlowerPatchBlock(MobEffects.SATURATION, 7, () -> FloweraryBlocks.WITHER_ROSE.get(color).get(), BlockBehaviour.Properties.copy(Blocks.POPPY).offsetType(BlockBehaviour.OffsetType.XZ))));
        }
    }

    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
//        FloweraryPatchItems.REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties()));
        return registryObject;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutout = RenderType.cutout();
        REGISTRAR.getEntries().stream().map(RegistryObject::get).forEach(block -> ItemBlockRenderTypes.setRenderLayer(block, cutout));
    }
}
