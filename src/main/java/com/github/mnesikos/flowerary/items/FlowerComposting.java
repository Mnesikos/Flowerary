package com.github.mnesikos.flowerary.items;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.blocks.FloweraryBlocks;
import net.minecraft.block.ComposterBlock;

public class FlowerComposting {
    public static void registerCompostables() {
        for (String color : Flowerary.COLORS_LIST) {
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.ROSE_BUSHLET_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.POPPY_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.DANDELION_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.CLEMATIS_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.ALLIUM_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.CLOVER_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.HYACINTH_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.DAISY_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.DIANTHUS_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.BOUGAINVILLEA_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.FAIRY_ROSE_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.SUNFLOWER_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.JASMINE_SEEDS.get(color).get(), 0.3F);
            ComposterBlock.COMPOSTABLES.put(FloweraryItems.FOXGLOVE_SEEDS.get(color).get(), 0.3F);

            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ROSE_BUSHLET.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.POPPY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DANDELION.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CLEMATIS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.ALLIUM.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.CLOVER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.HYACINTH.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DAISY.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.DIANTHUS.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.BOUGAINVILLEA.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.FAIRY_ROSE.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.SUNFLOWER.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.JASMINE.get(color).get(), 0.65F);
            ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.FOXGLOVE.get(color).get(), 0.65F);
        }

        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_BLACK_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_BLUE_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_CYAN_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_RED_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_MAGENTA_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_ORANGE_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_PINK_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_WHITE_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_YELLOW_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_LILAC_JASMINE.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_BLACK_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_BLUE_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_CYAN_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_RED_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_MAGENTA_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_ORANGE_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_PINK_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_WHITE_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_YELLOW_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_LILAC_BOUGAINVILLEA.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_BLACK_CLEMATIS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_BLUE_CLEMATIS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_CYAN_CLEMATIS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_RED_CLEMATIS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_MAGENTA_CLEMATIS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_ORANGE_CLEMATIS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_PINK_CLEMATIS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_WHITE_CLEMATIS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_YELLOW_CLEMATIS.get(), 0.65F);
        ComposterBlock.COMPOSTABLES.put(FloweraryBlocks.STUNTED_LILAC_CLEMATIS.get(), 0.65F);
    }
}