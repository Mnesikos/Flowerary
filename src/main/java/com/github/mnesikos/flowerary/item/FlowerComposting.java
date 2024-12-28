package com.github.mnesikos.flowerary.item;

import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import net.minecraft.block.ComposterBlock;

public class FlowerComposting {
    public static void registerCompostables() {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.ROSE_BUSHLET_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.POPPIES_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.DANDELION_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.CLEMATIS_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.ALLIUM_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.ALYSSUM_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.CLOVER_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.HYACINTH_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.DAISY_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.DIANTHUS_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.BOUGAINVILLEA_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.FAIRY_ROSE_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.SUNFLOWER_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.JASMINE_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.FOXGLOVE_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.BLAZING_STAR_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.BROMELIAD_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.CHICORY_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.HIBISCUS_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.IMPALA_LILY_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.LANTANAS_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.WILDFLOWER_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.AZURE_BLUET_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.CORNFLOWER_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.LAVENDER_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.LILAC_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.LILY_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.ORCHID_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.PEONY_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.POPPY_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.ROSE_BUSH_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.TULIP_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.WITHER_ROSE_SEEDS.get(color).get(), 0.3F);

            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ROSE_BUSHLET.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.POPPIES.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DANDELION.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CLEMATIS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ALLIUM.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ALYSSUM.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CLOVER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.HYACINTH.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DAISY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DIANTHUS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.BOUGAINVILLEA.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.FAIRY_ROSE.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.SUNFLOWER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.JASMINE.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.FOXGLOVE.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.BLAZING_STAR.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.BROMELIAD.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CHICORY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.HIBISCUS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.IMPALA_LILY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.LANTANAS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.WILDFLOWER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.AZURE_BLUET.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CORNFLOWER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.LAVENDER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.LILAC.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.LILY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ORCHID.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.PEONY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.POPPY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ROSE_BUSH.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.TULIP.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.WITHER_ROSE.get(color).get(), 0.65F);
        }
    }
}