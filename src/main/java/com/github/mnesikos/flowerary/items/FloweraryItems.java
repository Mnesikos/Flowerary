package com.github.mnesikos.flowerary.items;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.blocks.FloweraryBlocks;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;

public final class FloweraryItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, Flowerary.MOD_ID);

    public static final RegistryObject<Item> EMPTY_POLLEN_JAR = REGISTRAR.register("empty_pollen_jar", () -> new EmptyPollenJarItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_ROSE = REGISTRAR.register("pollen_jar_rose", () -> new PollenJarRedItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_WITHER_ROSE = REGISTRAR.register("pollen_jar_wither_rose", () -> new PollenJarBlackItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_POPPY = REGISTRAR.register("pollen_jar_poppy", () -> new PollenJarRedItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_DANDELION = REGISTRAR.register("pollen_jar_dandelion", () -> new PollenJarYellowItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_ORCHID = REGISTRAR.register("pollen_jar_orchid", () -> new PollenJarCyanItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_ALLIUM = REGISTRAR.register("pollen_jar_allium", () -> new PollenJarMagentaItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_AZURE_BLUET = REGISTRAR.register("pollen_jar_azure_bluet", () -> new PollenJarWhiteItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_RED_TULIP = REGISTRAR.register("pollen_jar_red_tulip", () -> new PollenJarRedItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_ORANGE_TULIP = REGISTRAR.register("pollen_jar_orange_tulip", () -> new PollenJarOrangeItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_WHITE_TULIP = REGISTRAR.register("pollen_jar_white_tulip", () -> new PollenJarWhiteItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_PINK_TULIP = REGISTRAR.register("pollen_jar_pink_tulip", () -> new PollenJarPinkItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_DAISY = REGISTRAR.register("pollen_jar_daisy", () -> new PollenJarWhiteItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_CORNFLOWER = REGISTRAR.register("pollen_jar_cornflower", () -> new PollenJarBlueItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_LILY_OF_THE_VALLEY = REGISTRAR.register("pollen_jar_lily_of_the_valley", () -> new PollenJarWhiteItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_SUNFLOWER = REGISTRAR.register("pollen_jar_sunflower", () -> new PollenJarYellowItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_LILAC = REGISTRAR.register("pollen_jar_lilac", () -> new PollenJarLilacItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POLLEN_JAR_PEONY = REGISTRAR.register("pollen_jar_peony", () -> new PollenJarPinkItem(new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));

    public static final Map<String, RegistryObject<Item>> ROSE_BUSHLET_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_rose_bushlet_seeds", () -> new BlockNamedItem(FloweraryBlocks.ROSE_BUSHLET_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> POPPY_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_poppy_seeds", () -> new BlockNamedItem(FloweraryBlocks.POPPY_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> DANDELION_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_dandelion_seeds", () -> new BlockNamedItem(FloweraryBlocks.DANDELION_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> CLEMATIS_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_clematis_seeds", () -> new BlockNamedItem(FloweraryBlocks.CLEMATIS_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> ALLIUM_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_allium_seeds", () -> new BlockNamedItem(FloweraryBlocks.ALLIUM_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> CLOVER_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_clover_seeds", () -> new BlockNamedItem(FloweraryBlocks.CLOVER_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> HYACINTH_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_hyacinth_seeds", () -> new BlockNamedItem(FloweraryBlocks.HYACINTH_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> DAISY_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_daisy_seeds", () -> new BlockNamedItem(FloweraryBlocks.DAISY_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> DIANTHUS_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_dianthus_seeds", () -> new BlockNamedItem(FloweraryBlocks.DIANTHUS_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> BOUGAINVILLEA_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_bougainvillea_seeds", () -> new BlockNamedItem(FloweraryBlocks.BOUGAINVILLEA_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> FAIRY_ROSE_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_fairy_rose_seeds", () -> new BlockNamedItem(FloweraryBlocks.FAIRY_ROSE_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> SUNFLOWER_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_sunflower_seeds", () -> new BlockNamedItem(FloweraryBlocks.SUNFLOWER_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> JASMINE_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_jasmine_seeds", () -> new BlockNamedItem(FloweraryBlocks.JASMINE_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
    public static final Map<String, RegistryObject<Item>> FOXGLOVE_SEEDS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_foxglove_seeds", () -> new BlockNamedItem(FloweraryBlocks.FOXGLOVE_PLANT.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
    });
}