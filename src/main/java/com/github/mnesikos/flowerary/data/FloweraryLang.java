package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.LanguageProvider;

public class FloweraryLang extends LanguageProvider {
    public FloweraryLang(PackOutput output) {
        super(output, Flowerary.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        add("itemGroup.flowerary.flowerary_group", "Flowerary");

        add("item.empty_pollen_jar.desc", "§bUse: Collect pollen from a vanilla flower");
        add("item.full_pollen_jar.desc", "§bUse: Transfer pollen to a vanilla flower");

        add(FloweraryItems.EMPTY_POLLEN_JAR.get(), "Empty Pollen Jar");
        add(FloweraryItems.DANDELION_POLLEN_JAR.get(), "Dandelion Pollen Jar");
        add(FloweraryItems.POPPY_POLLEN_JAR.get(), "Poppy Pollen Jar");
        add(FloweraryItems.BLUE_ORCHID_POLLEN_JAR.get(), "Blue Orchid Pollen Jar");
        add(FloweraryItems.ALLIUM_POLLEN_JAR.get(), "Allium Pollen Jar");
        add(FloweraryItems.AZURE_BLUET_POLLEN_JAR.get(), "Azure Bluet Pollen Jar");
        add(FloweraryItems.RED_TULIP_POLLEN_JAR.get(), "Red Tulip Pollen Jar");
        add(FloweraryItems.ORANGE_TULIP_POLLEN_JAR.get(), "Orange Tulip Pollen Jar");
        add(FloweraryItems.WHITE_TULIP_POLLEN_JAR.get(), "White Tulip Pollen Jar");
        add(FloweraryItems.PINK_TULIP_POLLEN_JAR.get(), "Pink Tulip Pollen Jar");
        add(FloweraryItems.OXEYE_DAISY_POLLEN_JAR.get(), "Oxeye Daisy Pollen Jar");
        add(FloweraryItems.CORNFLOWER_POLLEN_JAR.get(), "Cornflower Pollen Jar");
        add(FloweraryItems.LILY_OF_THE_VALLEY_POLLEN_JAR.get(), "Lily of the Valley Pollen Jar");
        add(FloweraryItems.TORCHFLOWER_POLLEN_JAR.get(), "Torchflower Pollen Jar");
        add(FloweraryItems.WITHER_ROSE_POLLEN_JAR.get(), "Wither Rose Pollen Jar");
        add(FloweraryItems.PINK_PETALS_POLLEN_JAR.get(), "Pink Petals Pollen Jar");
        add(FloweraryItems.SUNFLOWER_POLLEN_JAR.get(), "Sunflower Pollen Jar");
        add(FloweraryItems.LILAC_POLLEN_JAR.get(), "Lilac Pollen Jar");
        add(FloweraryItems.ROSE_BUSH_POLLEN_JAR.get(), "Rose Bush Pollen Jar");
        add(FloweraryItems.PEONY_POLLEN_JAR.get(), "Peony Pollen Jar");
        add(FloweraryItems.PITCHER_PLANT_POLLEN_JAR.get(), "Pitcher Plant Pollen Jar");

        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            String colorLang = floweraryColor.getLangName();
            add(FloweraryBlocks.ALLIUM.get(color).get(), colorLang + " Allium");
            add(FloweraryBlocks.ALYSSUM.get(color).get(), colorLang + " Alyssum");
            add(FloweraryBlocks.AZURE_BLUET.get(color).get(), colorLang + " Azure Bluet");
            add(FloweraryBlocks.BLAZING_STAR.get(color).get(), colorLang + " Blazing Star");
            add(FloweraryBlocks.BOUGAINVILLEA.get(color).get(), colorLang + " Bougainvillea");
            add(FloweraryBlocks.BROMELIAD.get(color).get(), colorLang + " Bromeliad");
            add(FloweraryBlocks.CHICORY.get(color).get(), colorLang + " Chicory");
            add(FloweraryBlocks.CLEMATIS.get(color).get(), colorLang + " Clematis");
            add(FloweraryBlocks.CLOVER.get(color).get(), colorLang + " Clover");
            add(FloweraryBlocks.CORNFLOWER.get(color).get(), colorLang + " Cornflower");
            add(FloweraryBlocks.DAFFODIL.get(color).get(), colorLang + " Daffodil");
            add(FloweraryBlocks.DAISY.get(color).get(), colorLang + " Daisy");
            add(FloweraryBlocks.DANDELION.get(color).get(), colorLang + " Dandelion");
            add(FloweraryBlocks.DIANTHUS.get(color).get(), colorLang + " Dianthus");
            add(FloweraryBlocks.FAIRY_ROSE.get(color).get(), colorLang + " Fairy Rose");
            add(FloweraryBlocks.FOXGLOVE.get(color).get(), colorLang + " Foxglove");
            add(FloweraryBlocks.HIBISCUS.get(color).get(), colorLang + " Hibiscus");
            add(FloweraryBlocks.HYACINTH.get(color).get(), colorLang + " Hyacinth");
            add(FloweraryBlocks.IMPALA_LILY.get(color).get(), colorLang + " Impala Lily");
            add(FloweraryBlocks.JASMINE.get(color).get(), colorLang + " Jasmine");
            add(FloweraryBlocks.LANTANAS.get(color).get(), colorLang + " Lantanas");
            add(FloweraryBlocks.LAVENDER.get(color).get(), colorLang + " Lavender");
            add(FloweraryBlocks.LILAC.get(color).get(), colorLang + " Lilac");
            add(FloweraryBlocks.LILY.get(color).get(), colorLang + " Lily");
            add(FloweraryBlocks.ORCHID.get(color).get(), colorLang + " Orchid");
            add(FloweraryBlocks.PEONY.get(color).get(), colorLang + " Peony");
            add(FloweraryBlocks.PETALS.get(color).get(), colorLang + " Petals");
            add(FloweraryBlocks.PITCHER_PLANT.get(color).get(), colorLang + " Pitcher Plant");
            add(FloweraryBlocks.POPPY.get(color).get(), colorLang + " Poppy");
            add(FloweraryBlocks.POPPIES.get(color).get(), colorLang + " Poppies");
            add(FloweraryBlocks.ROSE.get(color).get(), colorLang + " Rose");
            add(FloweraryBlocks.ROSE_BUSH.get(color).get(), colorLang + " Rose Bush");
            add(FloweraryBlocks.ROSE_BUSHLET.get(color).get(), colorLang + " Rose Bushlet");
            add(FloweraryBlocks.SUNFLOWER.get(color).get(), colorLang + " Sunflower");
            add(FloweraryBlocks.TORCHFLOWER.get(color).get(), colorLang + " Torchflower");
            add(FloweraryBlocks.TULIP.get(color).get(), colorLang + " Tulip");
            add(FloweraryBlocks.WILDFLOWER.get(color).get(), colorLang + " Wildflower");
            add(FloweraryBlocks.WITHER_ROSE.get(color).get(), colorLang + " Wither Rose");

            add(FloweraryBlocks.POTTED_ALLIUMS.get(color).get(), "Potted " + colorLang + " Allium");
            add(FloweraryBlocks.POTTED_AZURE_BLUETS.get(color).get(), "Potted " + colorLang + " Azure Bluet");
            add(FloweraryBlocks.POTTED_CORNFLOWERS.get(color).get(), "Potted " + colorLang + " Cornflower");
            add(FloweraryBlocks.POTTED_DAFFODILS.get(color).get(), "Potted " + colorLang + " Daffodil");
            add(FloweraryBlocks.POTTED_DAISYS.get(color).get(), "Potted " + colorLang + " Daisy");
            add(FloweraryBlocks.POTTED_DANDELIONS.get(color).get(), "Potted " + colorLang + " Dandelion");
            add(FloweraryBlocks.POTTED_FAIRY_ROSES.get(color).get(), "Potted " + colorLang + " Fairy Rose");
            add(FloweraryBlocks.POTTED_HYACINTHS.get(color).get(), "Potted " + colorLang + " Hyacinth");
            add(FloweraryBlocks.POTTED_LILYS.get(color).get(), "Potted " + colorLang + " Lily");
            add(FloweraryBlocks.POTTED_ORCHIDS.get(color).get(), "Potted " + colorLang + " Orchid");
            add(FloweraryBlocks.POTTED_POPPYS.get(color).get(), "Potted " + colorLang + " Poppy");
            add(FloweraryBlocks.POTTED_ROSES.get(color).get(), "Potted " + colorLang + " Rose");
            add(FloweraryBlocks.POTTED_TORCHFLOWERS.get(color).get(), "Potted " + colorLang + " Torchflower");
            add(FloweraryBlocks.POTTED_TULIPS.get(color).get(), "Potted " + colorLang + " Tulip");
            add(FloweraryBlocks.POTTED_WITHER_ROSES.get(color).get(), "Potted " + colorLang + " Wither Rose");

            add(FloweraryItems.ALLIUM_SEEDS.get(color).get(), colorLang + " Allium Seeds");
            add(FloweraryItems.ALYSSUM_SEEDS.get(color).get(), colorLang + " Alyssum Seeds");
            add(FloweraryItems.AZURE_BLUET_SEEDS.get(color).get(), colorLang + " Azure Bluet Seeds");
            add(FloweraryItems.BLAZING_STAR_SEEDS.get(color).get(), colorLang + " Blazing Star Seeds");
            add(FloweraryItems.BOUGAINVILLEA_SEEDS.get(color).get(), colorLang + " Bougainvillea Seeds");
            add(FloweraryItems.BROMELIAD_SEEDS.get(color).get(), colorLang + " Bromeliad Seeds");
            add(FloweraryItems.CHICORY_SEEDS.get(color).get(), colorLang + " Chicory Seeds");
            add(FloweraryItems.CLEMATIS_SEEDS.get(color).get(), colorLang + " Clematis Seeds");
            add(FloweraryItems.CLOVER_SEEDS.get(color).get(), colorLang + " Clover Seeds");
            add(FloweraryItems.CORNFLOWER_SEEDS.get(color).get(), colorLang + " Cornflower Seeds");
            add(FloweraryItems.DAFFODIL_SEEDS.get(color).get(), colorLang + " Daffodil Seeds");
            add(FloweraryItems.DAISY_SEEDS.get(color).get(), colorLang + " Daisy Seeds");
            add(FloweraryItems.DANDELION_SEEDS.get(color).get(), colorLang + " Dandelion Seeds");
            add(FloweraryItems.DIANTHUS_SEEDS.get(color).get(), colorLang + " Dianthus Seeds");
            add(FloweraryItems.FAIRY_ROSE_SEEDS.get(color).get(), colorLang + " Fairy Rose Seeds");
            add(FloweraryItems.FOXGLOVE_SEEDS.get(color).get(), colorLang + " Foxglove Seeds");
            add(FloweraryItems.HIBISCUS_SEEDS.get(color).get(), colorLang + " Hibiscus Seeds");
            add(FloweraryItems.HYACINTH_SEEDS.get(color).get(), colorLang + " Hyacinth Seeds");
            add(FloweraryItems.IMPALA_LILY_SEEDS.get(color).get(), colorLang + " Impala Lily Seeds");
            add(FloweraryItems.JASMINE_SEEDS.get(color).get(), colorLang + " Jasmine Seeds");
            add(FloweraryItems.LANTANAS_SEEDS.get(color).get(), colorLang + " Lantanas Seeds");
            add(FloweraryItems.LAVENDER_SEEDS.get(color).get(), colorLang + " Lavender Seeds");
            add(FloweraryItems.LILAC_SEEDS.get(color).get(), colorLang + " Lilac Seeds");
            add(FloweraryItems.LILY_SEEDS.get(color).get(), colorLang + " Lily Seeds");
            add(FloweraryItems.ORCHID_SEEDS.get(color).get(), colorLang + " Orchid Seeds");
            add(FloweraryItems.PEONY_SEEDS.get(color).get(), colorLang + " Peony Seeds");
            add(FloweraryItems.PETALS_SEEDS.get(color).get(), colorLang + " Petals Seeds");
            add(FloweraryItems.PITCHER_PLANT_SEEDS.get(color).get(), colorLang + " Pitcher Plant Seeds");
            add(FloweraryItems.POPPY_SEEDS.get(color).get(), colorLang + " Poppy Seeds");
            add(FloweraryItems.POPPIES_SEEDS.get(color).get(), colorLang + " Poppies Seeds");
            add(FloweraryItems.ROSE_SEEDS.get(color).get(), colorLang + " Rose Seeds");
            add(FloweraryItems.ROSE_BUSH_SEEDS.get(color).get(), colorLang + " Rose Bush Seeds");
            add(FloweraryItems.ROSE_BUSHLET_SEEDS.get(color).get(), colorLang + " Rose Bushlet Seeds");
            add(FloweraryItems.SUNFLOWER_SEEDS.get(color).get(), colorLang + " Sunflower Seeds");
            add(FloweraryItems.TORCHFLOWER_SEEDS.get(color).get(), colorLang + " Torchflower Seeds");
            add(FloweraryItems.TULIP_SEEDS.get(color).get(), colorLang + " Tulip Seeds");
            add(FloweraryItems.WILDFLOWER_SEEDS.get(color).get(), colorLang + " Wildflower Seeds");
            add(FloweraryItems.WITHER_ROSE_SEEDS.get(color).get(), colorLang + " Wither Rose Seeds");
        }
    }
}
