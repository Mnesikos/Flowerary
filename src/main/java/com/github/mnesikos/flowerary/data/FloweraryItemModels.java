package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FloweraryItemModels extends ItemModelProvider {
    public FloweraryItemModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Flowerary.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        singleTexture("empty_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/empty_pollen_jar"));
        singleTexture("dandelion_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("poppy_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("orchid_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("allium_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("azure_bluet_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("red_tulip_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("orange_tulip_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("white_tulip_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("pink_tulip_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("daisy_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("cornflower_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("lily_of_the_valley_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("wither_rose_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("sunflower_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("lilac_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("rose_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));
        singleTexture("peony_pollen_jar", mcLoc("item/generated"), "layer0", modLoc("item/pollen_jar"));

        withExistingParent("black_candle", modLoc("block/candles/black_candle_one"));
        withExistingParent("blue_candle", modLoc("block/candles/blue_candle_one"));
        withExistingParent("cyan_candle", modLoc("block/candles/cyan_candle_one"));
        withExistingParent("green_candle", modLoc("block/candles/green_candle_one"));
        withExistingParent("orange_candle", modLoc("block/candles/orange_candle_one"));
        withExistingParent("pink_candle", modLoc("block/candles/pink_candle_one"));
        withExistingParent("red_candle", modLoc("block/candles/red_candle_one"));
        withExistingParent("white_candle", modLoc("block/candles/white_candle_one"));

        for (String color : Flowerary.COLORS_LIST) {
            singleTexture(color + "_allium", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_allium"));
            withExistingParent(color + "_alyssum", modLoc("block/" + color + "_alyssum"));
            singleTexture(color + "_azure_bluet", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_azure_bluet"));
            singleTexture(color + "_blazing_star", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_blazing_star_top"));
            singleTexture(color + "_bougainvillea", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_bougainvillea"));
            singleTexture(color + "_bromeliad", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_bromeliad"));
            singleTexture(color + "_chicory", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_chicory"));
            singleTexture(color + "_clematis", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_clematis"));
            withExistingParent(color + "_clover", modLoc("block/" + color + "_clover"));
            singleTexture(color + "_cornflower", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_cornflower"));
            singleTexture(color + "_daisy", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_daisy"));
            singleTexture(color + "_dandelion", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_dandelion"));
            singleTexture(color + "_dianthus", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_dianthus"));
            singleTexture(color + "_fairy_rose", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_fairy_rose"));
            singleTexture(color + "_foxglove", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_foxglove_top"));
            singleTexture(color + "_hibiscus", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_hibiscus"));
            singleTexture(color + "_hyacinth", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_hyacinth"));
            singleTexture(color + "_impala_lily", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_impala_lily_top"));
            singleTexture(color + "_jasmine", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_jasmine"));
            singleTexture(color + "_lantanas", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_lantanas"));
            singleTexture(color + "_lavender", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_lavender_top"));
            singleTexture(color + "_lilac", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_lilac_top"));
            singleTexture(color + "_lily", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_lily"));
            singleTexture(color + "_orchid", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_orchid"));
            singleTexture(color + "_peony", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_peony_top"));
            singleTexture(color + "_poppy", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_poppy"));
            singleTexture(color + "_poppies", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_poppies"));
            singleTexture(color + "_rose_bush", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_rose_bush_top"));
            singleTexture(color + "_rose_bushlet", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_rose_bushlet"));
            singleTexture(color + "_sunflower", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_sunflower"));
            singleTexture(color + "_tulip", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_tulip"));
            singleTexture(color + "_wildflower", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_wildflower"));
            singleTexture(color + "_wither_rose", mcLoc("item/generated"), "layer0", modLoc("block/" + color + "_wither_rose"));

            singleTexture(color + "_allium_seeds", mcLoc("item/generated"), "layer0", modLoc("item/allium_seeds"));
            singleTexture(color + "_alyssum_seeds", mcLoc("item/generated"), "layer0", modLoc("item/alyssum_seeds"));
            singleTexture(color + "_azure_bluet_seeds", mcLoc("item/generated"), "layer0", modLoc("item/azure_bluet_seeds"));
            singleTexture(color + "_blazing_star_seeds", mcLoc("item/generated"), "layer0", modLoc("item/blazing_star_seeds"));
            singleTexture(color + "_bougainvillea_seeds", mcLoc("item/generated"), "layer0", modLoc("item/bougainvillea_seeds"));
            singleTexture(color + "_bromeliad_seeds", mcLoc("item/generated"), "layer0", modLoc("item/bromeliad_seeds"));
            singleTexture(color + "_chicory_seeds", mcLoc("item/generated"), "layer0", modLoc("item/chicory_seeds"));
            singleTexture(color + "_clematis_seeds", mcLoc("item/generated"), "layer0", modLoc("item/clematis_seeds"));
            singleTexture(color + "_clover_seeds", mcLoc("item/generated"), "layer0", modLoc("item/clover_seeds"));
            singleTexture(color + "_cornflower_seeds", mcLoc("item/generated"), "layer0", modLoc("item/cornflower_seeds"));
            singleTexture(color + "_daisy_seeds", mcLoc("item/generated"), "layer0", modLoc("item/daisy_seeds"));
            singleTexture(color + "_dandelion_seeds", mcLoc("item/generated"), "layer0", modLoc("item/dandelion_seeds"));
            singleTexture(color + "_dianthus_seeds", mcLoc("item/generated"), "layer0", modLoc("item/dianthus_seeds"));
            singleTexture(color + "_fairy_rose_seeds", mcLoc("item/generated"), "layer0", modLoc("item/fairy_rose_seeds"));
            singleTexture(color + "_foxglove_seeds", mcLoc("item/generated"), "layer0", modLoc("item/foxglove_seeds"));
            singleTexture(color + "_hibiscus_seeds", mcLoc("item/generated"), "layer0", modLoc("item/hibiscus_seeds"));
            singleTexture(color + "_hyacinth_seeds", mcLoc("item/generated"), "layer0", modLoc("item/hyacinth_seeds"));
            singleTexture(color + "_impala_lily_seeds", mcLoc("item/generated"), "layer0", modLoc("item/impala_lily_seeds"));
            singleTexture(color + "_jasmine_seeds", mcLoc("item/generated"), "layer0", modLoc("item/jasmine_seeds"));
            singleTexture(color + "_lantanas_seeds", mcLoc("item/generated"), "layer0", modLoc("item/lantanas_seeds"));
            singleTexture(color + "_lavender_seeds", mcLoc("item/generated"), "layer0", modLoc("item/lavender_seeds"));
            singleTexture(color + "_lilac_seeds", mcLoc("item/generated"), "layer0", modLoc("item/lilac_seeds"));
            singleTexture(color + "_lily_seeds", mcLoc("item/generated"), "layer0", modLoc("item/lily_seeds"));
            singleTexture(color + "_orchid_seeds", mcLoc("item/generated"), "layer0", modLoc("item/orchid_seeds"));
            singleTexture(color + "_peony_seeds", mcLoc("item/generated"), "layer0", modLoc("item/peony_seeds"));
            singleTexture(color + "_poppy_seeds", mcLoc("item/generated"), "layer0", modLoc("item/poppy_seeds"));
            singleTexture(color + "_poppies_seeds", mcLoc("item/generated"), "layer0", modLoc("item/poppies_seeds"));
            singleTexture(color + "_rose_bush_seeds", mcLoc("item/generated"), "layer0", modLoc("item/rose_bush_seeds"));
            singleTexture(color + "_rose_bushlet_seeds", mcLoc("item/generated"), "layer0", modLoc("item/rose_bushlet_seeds"));
            singleTexture(color + "_sunflower_seeds", mcLoc("item/generated"), "layer0", modLoc("item/sunflower_seeds"));
            singleTexture(color + "_tulip_seeds", mcLoc("item/generated"), "layer0", modLoc("item/tulip_seeds"));
            singleTexture(color + "_wildflower_seeds", mcLoc("item/generated"), "layer0", modLoc("item/wildflower_seeds"));
            singleTexture(color + "_wither_rose_seeds", mcLoc("item/generated"), "layer0", modLoc("item/wither_rose_seeds"));
        }
    }
}
