package com.github.mnesikos.flowerary.item;

import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import net.minecraft.world.level.block.ComposterBlock;

public class FlowerComposting {
    public static void registerCompostables() {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ALLIUM.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ALYSSUM.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.AZURE_BLUET.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.BLAZING_STAR.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.BOUGAINVILLEA.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.BROMELIAD.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CHICORY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CLEMATIS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CLOVER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CORNFLOWER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DAFFODIL.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DAISY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DANDELION.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DIANTHUS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.FAIRY_ROSE.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.FOXGLOVE.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.HIBISCUS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.HYACINTH.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.IMPALA_LILY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.JASMINE.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.LANTANAS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.LAVENDER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.LILAC.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.LILY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ORCHID.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.PEONY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.PETALS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.PITCHER_PLANT.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.POPPY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.POPPIES.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ROSE.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ROSE_BUSH.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ROSE_BUSHLET.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.SUNFLOWER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.TORCHFLOWER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.TULIP.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.WILDFLOWER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.WITHER_ROSE.get(color).get(), 0.65F);
        }
    }
}