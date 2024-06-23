package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FloweraryItemModels extends ItemModelProvider {
    public FloweraryItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Flowerary.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture("empty_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/empty_pollen_jar"));
        singleTexture("dandelion_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("poppy_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("orchid_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("allium_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("azure_bluet_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("red_tulip_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("orange_tulip_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("white_tulip_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("pink_tulip_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("daisy_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("cornflower_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("lily_of_the_valley_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("wither_rose_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("sunflower_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("lilac_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("rose_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));
        singleTexture("peony_pollen_jar", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/pollen_jar"));

        withExistingParent("black_candle", new ResourceLocation(Flowerary.MOD_ID, "block/candles/black_candle_one"));
        withExistingParent("blue_candle", new ResourceLocation(Flowerary.MOD_ID, "block/candles/blue_candle_one"));
        withExistingParent("cyan_candle", new ResourceLocation(Flowerary.MOD_ID, "block/candles/cyan_candle_one"));
        withExistingParent("green_candle", new ResourceLocation(Flowerary.MOD_ID, "block/candles/green_candle_one"));
        withExistingParent("orange_candle", new ResourceLocation(Flowerary.MOD_ID, "block/candles/orange_candle_one"));
        withExistingParent("pink_candle", new ResourceLocation(Flowerary.MOD_ID, "block/candles/pink_candle_one"));
        withExistingParent("red_candle", new ResourceLocation(Flowerary.MOD_ID, "block/candles/red_candle_one"));
        withExistingParent("white_candle", new ResourceLocation(Flowerary.MOD_ID, "block/candles/white_candle_one"));

        for (String color : Flowerary.COLORS_LIST) { // todo: candles
            singleTexture(color + "_allium", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_allium"));
            singleTexture(color + "_azure_bluet", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_azure_bluet"));
            singleTexture(color + "_blazing_star", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_blazing_star_top"));
            singleTexture(color + "_bougainvillea", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_bougainvillea"));
            singleTexture(color + "_bromeliad", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_bromeliad"));
            singleTexture(color + "_clematis", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_clematis"));
            singleTexture(color + "_clover", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_clover"));
            singleTexture(color + "_cornflower", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_cornflower"));
            singleTexture(color + "_daisy", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_daisy"));
            singleTexture(color + "_dandelion", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_dandelion"));
            singleTexture(color + "_dianthus", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_dianthus"));
            singleTexture(color + "_fairy_rose", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_fairy_rose"));
            singleTexture(color + "_foxglove", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_foxglove_top"));
            singleTexture(color + "_hibiscus", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_hibiscus"));
            singleTexture(color + "_hyacinth", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_hyacinth"));
            singleTexture(color + "_impala_lily", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_impala_lily_top"));
            singleTexture(color + "_jasmine", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_jasmine"));
            singleTexture(color + "_lantanas", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_lantanas"));
            singleTexture(color + "_lilac", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_lilac_top"));
            singleTexture(color + "_lily", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_lily"));
            singleTexture(color + "_orchid", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_orchid"));
            singleTexture(color + "_peony", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_peony_top"));
            singleTexture(color + "_poppy", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_poppy"));
            singleTexture(color + "_poppies", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_poppies"));
            singleTexture(color + "_rose_bush", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_rose_bush_top"));
            singleTexture(color + "_rose_bushlet", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_rose_bushlet"));
            singleTexture(color + "_sunflower", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_sunflower"));
            singleTexture(color + "_tulip", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_tulip"));
            singleTexture(color + "_wildflower", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_wildflower"));
            singleTexture(color + "_wither_rose", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_wither_rose"));

            singleTexture(color + "_allium_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/allium_seeds"));
            singleTexture(color + "_azure_bluet_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/azure_bluet_seeds"));
            singleTexture(color + "_blazing_star_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/blazing_star_seeds"));
            singleTexture(color + "_bougainvillea_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/bougainvillea_seeds"));
            singleTexture(color + "_bromeliad_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/bromeliad_seeds"));
            singleTexture(color + "_clematis_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/clematis_seeds"));
            singleTexture(color + "_clover_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/clover_seeds"));
            singleTexture(color + "_cornflower_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/cornflower_seeds"));
            singleTexture(color + "_daisy_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/daisy_seeds"));
            singleTexture(color + "_dandelion_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/dandelion_seeds"));
            singleTexture(color + "_dianthus_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/dianthus_seeds"));
            singleTexture(color + "_fairy_rose_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/fairy_rose_seeds"));
            singleTexture(color + "_foxglove_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/foxglove_seeds"));
            singleTexture(color + "_hibiscus_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/hibiscus_seeds"));
            singleTexture(color + "_hyacinth_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/hyacinth_seeds"));
            singleTexture(color + "_impala_lily_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/impala_lily_seeds"));
            singleTexture(color + "_jasmine_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/jasmine_seeds"));
            singleTexture(color + "_lantanas_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/lantanas_seeds"));
            singleTexture(color + "_lilac_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/lilac_seeds"));
            singleTexture(color + "_lily_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/lily_seeds"));
            singleTexture(color + "_orchid_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/orchid_seeds"));
            singleTexture(color + "_peony_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/peony_seeds"));
            singleTexture(color + "_poppy_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/poppy_seeds"));
            singleTexture(color + "_poppies_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/poppies_seeds"));
            singleTexture(color + "_rose_bush_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/rose_bush_seeds"));
            singleTexture(color + "_rose_bushlet_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/rose_bushlet_seeds"));
            singleTexture(color + "_sunflower_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/sunflower_seeds"));
            singleTexture(color + "_tulip_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/tulip_seeds"));
            singleTexture(color + "_wildflower_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/wildflower_seeds"));
            singleTexture(color + "_wither_rose_seeds", new ResourceLocation("item/generated"), "layer0", new ResourceLocation(Flowerary.MOD_ID, "item/wither_rose_seeds"));
        }
    }
}
