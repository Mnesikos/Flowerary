package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;

public class FloweraryItemModels extends ItemModelProvider {
    public FloweraryItemModels(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, Flowerary.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        itemGenerated("empty_pollen_jar");
        itemGenerated("dandelion_pollen_jar", "yellow_pollen_jar");
        itemGenerated("poppy_pollen_jar", "red_pollen_jar");
        itemGenerated("blue_orchid_pollen_jar", "light_blue_pollen_jar");
        itemGenerated("allium_pollen_jar", "magenta_pollen_jar");
        itemGenerated("azure_bluet_pollen_jar", "white_pollen_jar");
        itemGenerated("red_tulip_pollen_jar", "red_pollen_jar");
        itemGenerated("orange_tulip_pollen_jar", "orange_pollen_jar");
        itemGenerated("white_tulip_pollen_jar", "white_pollen_jar");
        itemGenerated("pink_tulip_pollen_jar", "pink_pollen_jar");
        itemGenerated("oxeye_daisy_pollen_jar", "white_pollen_jar");
        itemGenerated("cornflower_pollen_jar", "blue_pollen_jar");
        itemGenerated("lily_of_the_valley_pollen_jar", "white_pollen_jar");
        itemGenerated("torchflower_pollen_jar", "orange_pollen_jar");
        itemGenerated("wither_rose_pollen_jar", "black_pollen_jar");
        itemGenerated("pink_petals_pollen_jar", "pink_pollen_jar");
        itemGenerated("sunflower_pollen_jar", "yellow_pollen_jar");
        itemGenerated("lilac_pollen_jar", "magenta_pollen_jar");
        itemGenerated("rose_bush_pollen_jar", "red_pollen_jar");
        itemGenerated("peony_pollen_jar", "pink_pollen_jar");
        itemGenerated("pitcher_plant_pollen_jar", "cyan_pollen_jar");

        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            blockGenerated(color + "_allium");
            withExistingParent(color + "_alyssum", modLoc("block/" + color + "_alyssum"));
            blockGenerated(color + "_azure_bluet");
            blockGenerated(color + "_blazing_star", color + "_blazing_star_top");
            blockGenerated(color + "_bougainvillea");
            blockGenerated(color + "_bromeliad");
            blockGenerated(color + "_chicory");
            blockGenerated(color + "_clematis");
            withExistingParent(color + "_clover", modLoc("block/" + color + "_clover"));
            blockGenerated(color + "_cornflower");
            blockGenerated(color + "_daffodil");
            blockGenerated(color + "_daisy");
            blockGenerated(color + "_dandelion");
            blockGenerated(color + "_dianthus");
            blockGenerated(color + "_fairy_rose");
            blockGenerated(color + "_foxglove", color + "_foxglove_top");
            blockGenerated(color + "_hibiscus");
            blockGenerated(color + "_hyacinth");
            blockGenerated(color + "_impala_lily", color + "_impala_lily_top");
            blockGenerated(color + "_jasmine");
            blockGenerated(color + "_lantanas");
            blockGenerated(color + "_lavender", color + "_lavender_top");
            blockGenerated(color + "_lilac", color + "_lilac_top");
            blockGenerated(color + "_lily");
            blockGenerated(color + "_orchid");
            blockGenerated(color + "_peony", color + "_peony_top");
            blockGenerated(color + "_petals");
            blockGenerated(color + "_pitcher_plant", color + "_pitcher_plant_top");
            blockGenerated(color + "_poppy");
            blockGenerated(color + "_poppies");
            blockGenerated(color + "_rose");
            blockGenerated(color + "_rose_bush", color + "_rose_bush_top");
            blockGenerated(color + "_rose_bushlet");
            blockGenerated(color + "_sunflower");
            blockGenerated(color + "_torchflower");
            blockGenerated(color + "_tulip");
            blockGenerated(color + "_wildflower");
            blockGenerated(color + "_wither_rose");

            seedsLayered(color, "allium_seeds");
            seedsLayered(color, "alyssum_seeds");
            seedsLayered(color, "azure_bluet_seeds");
            seedsLayered(color, "blazing_star_seeds");
            seedsLayered(color, "bougainvillea_seeds");
            seedsLayered(color, "bromeliad_seeds");
            seedsLayered(color, "chicory_seeds");
            seedsLayered(color, "clematis_seeds");
            seedsLayered(color, "clover_seeds");
            seedsLayered(color, "cornflower_seeds");
            seedsLayered(color, "daffodil_seeds");
            seedsLayered(color, "daisy_seeds");
            seedsLayered(color, "dandelion_seeds");
            seedsLayered(color, "dianthus_seeds");
            seedsLayered(color, "fairy_rose_seeds");
            seedsLayered(color, "foxglove_seeds");
            seedsLayered(color, "hibiscus_seeds");
            seedsLayered(color, "hyacinth_seeds");
            seedsLayered(color, "impala_lily_seeds");
            seedsLayered(color, "jasmine_seeds");
            seedsLayered(color, "lantanas_seeds");
            seedsLayered(color, "lavender_seeds");
            seedsLayered(color, "lilac_seeds");
            seedsLayered(color, "lily_seeds");
            seedsLayered(color, "orchid_seeds");
            seedsLayered(color, "peony_seeds");
            seedsLayered(color, "petals_seeds");
            seedsLayered(color, "pitcher_plant_seeds");
            seedsLayered(color, "poppy_seeds");
            seedsLayered(color, "poppies_seeds");
            seedsLayered(color, "rose_seeds");
            seedsLayered(color, "rose_bush_seeds");
            seedsLayered(color, "rose_bushlet_seeds");
            seedsLayered(color, "sunflower_seeds");
            seedsLayered(color, "torchflower_seeds");
            seedsLayered(color, "tulip_seeds");
            seedsLayered(color, "wildflower_seeds");
            seedsLayered(color, "wither_rose_seeds");
        }

        if (ModList.get().isLoaded("serene_shrubbery")) {
            for (FloweraryColor floweraryColor : FloweraryColor.values()) {
                String color = floweraryColor.getSerializedName();
//                itemGenerated(color + "_blanket_flower", "serene_shrubbery/" + color + "_blanket_flower");
                itemGenerated(color + "_butterfly_bush", "serene_shrubbery/" + color + "_butterfly_bush");
//                itemGenerated(color + "_fireweed", "serene_shrubbery/" + color + "_fireweed");
//                itemGenerated(color + "_serene_foxglove", "serene_shrubbery/" + color + "_serene_foxglove");
                itemGenerated(color + "_hydrangea", "serene_shrubbery/" + color + "_hydrangea");
                itemGenerated(color + "_darkleaf_hydrangea", "serene_shrubbery/" + color + "_darkleaf_hydrangea");
//                itemGenerated(color + "_liverwort", "serene_shrubbery/" + color + "_liverwort");
//                itemGenerated(color + "_lupine", "serene_shrubbery/" + color + "_lupine");
                itemGenerated(color + "_pansies", "serene_shrubbery/" + color + "_pansies");
//                itemGenerated(color + "_twinflower", "serene_shrubbery/" + color + "_twinflower");
            }
        }
    }

    public void seedsLayered(String color, String name) {
        withExistingParent(color + "_" + name, mcLoc("item/generated"))
                .texture("layer0", modLoc("item/" + name))
                .texture("layer1", modLoc("item/" + color + "_jar"));
    }

    public void blockGenerated(String name) {
        singleTexture(name, mcLoc("item/generated"), "layer0", modLoc("block/" + name));
    }

    public void blockGenerated(String name, String textureName) {
        singleTexture(name, mcLoc("item/generated"), "layer0", modLoc("block/" + textureName));
    }

    public void itemGenerated(String name) {
        singleTexture(name, mcLoc("item/generated"), "layer0", modLoc("item/" + name));
    }

    public void itemGenerated(String name, String textureName) {
        singleTexture(name, mcLoc("item/generated"), "layer0", modLoc("item/" + textureName));
    }
}
