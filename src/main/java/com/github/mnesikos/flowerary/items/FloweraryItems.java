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
    public static final RegistryObject<Item> ROSE_POLLEN_JAR = REGISTRAR.register("rose_pollen_jar", () -> new PollenJarItem("red", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> WITHER_ROSE_POLLEN_JAR = REGISTRAR.register("wither_rose_pollen_jar", () -> new PollenJarItem("black", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POPPY_POLLEN_JAR = REGISTRAR.register("poppy_pollen_jar", () -> new PollenJarItem("red", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> DANDELION_POLLEN_JAR = REGISTRAR.register("dandelion_pollen_jar", () -> new PollenJarItem("yellow", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> ORCHID_POLLEN_JAR = REGISTRAR.register("orchid_pollen_jar", () -> new PollenJarItem("cyan", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> ALLIUM_POLLEN_JAR = REGISTRAR.register("allium_pollen_jar", () -> new PollenJarItem("magenta", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> AZURE_BLUET_POLLEN_JAR = REGISTRAR.register("azure_bluet_pollen_jar", () -> new PollenJarItem("white", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> RED_TULIP_POLLEN_JAR = REGISTRAR.register("red_tulip_pollen_jar", () -> new PollenJarItem("red", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> ORANGE_TULIP_POLLEN_JAR = REGISTRAR.register("orange_tulip_pollen_jar", () -> new PollenJarItem("orange", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> WHITE_TULIP_POLLEN_JAR = REGISTRAR.register("white_tulip_pollen_jar", () -> new PollenJarItem("white", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> PINK_TULIP_POLLEN_JAR = REGISTRAR.register("pink_tulip_pollen_jar", () -> new PollenJarItem("pink", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> DAISY_POLLEN_JAR = REGISTRAR.register("daisy_pollen_jar", () -> new PollenJarItem("white", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> CORNFLOWER_POLLEN_JAR = REGISTRAR.register("cornflower_pollen_jar", () -> new PollenJarItem("blue", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_POLLEN_JAR = REGISTRAR.register("lily_of_the_valley_pollen_jar", () -> new PollenJarItem("white", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> SUNFLOWER_POLLEN_JAR = REGISTRAR.register("sunflower_pollen_jar", () -> new PollenJarItem("yellow", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> LILAC_POLLEN_JAR = REGISTRAR.register("lilac_pollen_jar", () -> new PollenJarItem("lilac", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> PEONY_POLLEN_JAR = REGISTRAR.register("peony_pollen_jar", () -> new PollenJarItem("pink", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));

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