package com.github.mnesikos.flowerary.items;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.blocks.FloweraryBlocks;
import net.minecraft.item.BlockNamedItem;
import net.minecraft.item.Item;
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

    public static final Map<String, RegistryObject<Item>> ALLIUM_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> BLAZING_STAR_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> BOUGAINVILLEA_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> BROMELIAD_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> CLEMATIS_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> CLOVER_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> DAISY_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> DANDELION_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> DIANTHUS_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> FAIRY_ROSE_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> FOXGLOVE_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> HIBISCUS_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> HYACINTH_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> IMPALA_LILY_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> JASMINE_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> LANTANAS_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> POPPY_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> ROSE_BUSHLET_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> SUNFLOWER_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> WILDFLOWER_SEEDS = new HashMap<>();

    static {
        for (String color : Flowerary.COLORS_LIST) {
            ALLIUM_SEEDS.put(color, REGISTRAR.register(color + "_allium_seeds", () -> new BlockNamedItem(FloweraryBlocks.ALLIUM_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            BLAZING_STAR_SEEDS.put(color, REGISTRAR.register(color + "_blazing_star_seeds", () -> new BlockNamedItem(FloweraryBlocks.BLAZING_STAR_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            BOUGAINVILLEA_SEEDS.put(color, REGISTRAR.register(color + "_bougainvillea_seeds", () -> new BlockNamedItem(FloweraryBlocks.BOUGAINVILLEA_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            BROMELIAD_SEEDS.put(color, REGISTRAR.register(color + "_bromeliad_seeds", () -> new BlockNamedItem(FloweraryBlocks.BROMELIAD_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            CLEMATIS_SEEDS.put(color, REGISTRAR.register(color + "_clematis_seeds", () -> new BlockNamedItem(FloweraryBlocks.CLEMATIS_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            CLOVER_SEEDS.put(color, REGISTRAR.register(color + "_clover_seeds", () -> new BlockNamedItem(FloweraryBlocks.CLOVER_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            DAISY_SEEDS.put(color, REGISTRAR.register(color + "_daisy_seeds", () -> new BlockNamedItem(FloweraryBlocks.DAISY_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            DANDELION_SEEDS.put(color, REGISTRAR.register(color + "_dandelion_seeds", () -> new BlockNamedItem(FloweraryBlocks.DANDELION_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            DIANTHUS_SEEDS.put(color, REGISTRAR.register(color + "_dianthus_seeds", () -> new BlockNamedItem(FloweraryBlocks.DIANTHUS_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            FAIRY_ROSE_SEEDS.put(color, REGISTRAR.register(color + "_fairy_rose_seeds", () -> new BlockNamedItem(FloweraryBlocks.FAIRY_ROSE_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            FOXGLOVE_SEEDS.put(color, REGISTRAR.register(color + "_foxglove_seeds", () -> new BlockNamedItem(FloweraryBlocks.FOXGLOVE_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            HIBISCUS_SEEDS.put(color, REGISTRAR.register(color + "_hibiscus_seeds", () -> new BlockNamedItem(FloweraryBlocks.HIBISCUS_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            HYACINTH_SEEDS.put(color, REGISTRAR.register(color + "_hyacinth_seeds", () -> new BlockNamedItem(FloweraryBlocks.HYACINTH_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            IMPALA_LILY_SEEDS.put(color, REGISTRAR.register(color + "_impala_lily_seeds", () -> new BlockNamedItem(FloweraryBlocks.IMPALA_LILY_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            JASMINE_SEEDS.put(color, REGISTRAR.register(color + "_jasmine_seeds", () -> new BlockNamedItem(FloweraryBlocks.JASMINE_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            LANTANAS_SEEDS.put(color, REGISTRAR.register(color + "_lantanas_seeds", () -> new BlockNamedItem(FloweraryBlocks.LANTANAS_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            POPPY_SEEDS.put(color, REGISTRAR.register(color + "_poppy_seeds", () -> new BlockNamedItem(FloweraryBlocks.POPPY_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            ROSE_BUSHLET_SEEDS.put(color, REGISTRAR.register(color + "_rose_bushlet_seeds", () -> new BlockNamedItem(FloweraryBlocks.ROSE_BUSHLET_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            SUNFLOWER_SEEDS.put(color, REGISTRAR.register(color + "_sunflower_seeds", () -> new BlockNamedItem(FloweraryBlocks.SUNFLOWER_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            WILDFLOWER_SEEDS.put(color, REGISTRAR.register(color + "_wildflower_seeds", () -> new BlockNamedItem(FloweraryBlocks.WILDFLOWER_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
        }
    }
}