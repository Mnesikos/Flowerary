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
    public static final RegistryObject<Item> DANDELION_POLLEN_JAR = REGISTRAR.register("dandelion_pollen_jar", () -> new PollenJarItem("yellow", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> POPPY_POLLEN_JAR = REGISTRAR.register("poppy_pollen_jar", () -> new PollenJarItem("red", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
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
    public static final RegistryObject<Item> WITHER_ROSE_POLLEN_JAR = REGISTRAR.register("wither_rose_pollen_jar", () -> new PollenJarItem("black", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> SUNFLOWER_POLLEN_JAR = REGISTRAR.register("sunflower_pollen_jar", () -> new PollenJarItem("yellow", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> LILAC_POLLEN_JAR = REGISTRAR.register("lilac_pollen_jar", () -> new PollenJarItem("lilac", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> ROSE_POLLEN_JAR = REGISTRAR.register("rose_pollen_jar", () -> new PollenJarItem("red", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
    public static final RegistryObject<Item> PEONY_POLLEN_JAR = REGISTRAR.register("peony_pollen_jar", () -> new PollenJarItem("pink", new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));

    public static final Map<String, RegistryObject<Item>> ALLIUM_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> AZURE_BLUET_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> BLAZING_STAR_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> BOUGAINVILLEA_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> BROMELIAD_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> CHICORY_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> CLEMATIS_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> CLOVER_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> CORNFLOWER_SEEDS = new HashMap<>();
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
    public static final Map<String, RegistryObject<Item>> LAVENDER_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> LILAC_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> LILY_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> ORCHID_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> PEONY_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> POPPY_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> POPPIES_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> ROSE_BUSH_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> ROSE_BUSHLET_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> SUNFLOWER_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> TULIP_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> WILDFLOWER_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> WITHER_ROSE_SEEDS = new HashMap<>();

    static {
        for (String color : Flowerary.COLORS_LIST) {
            ALLIUM_SEEDS.put(color, REGISTRAR.register(color + "_allium_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.ALLIUM_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            AZURE_BLUET_SEEDS.put(color, REGISTRAR.register(color + "_azure_bluet_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.AZURE_BLUET_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            BLAZING_STAR_SEEDS.put(color, REGISTRAR.register(color + "_blazing_star_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.BLAZING_STAR_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            BOUGAINVILLEA_SEEDS.put(color, REGISTRAR.register(color + "_bougainvillea_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.BOUGAINVILLEA_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            BROMELIAD_SEEDS.put(color, REGISTRAR.register(color + "_bromeliad_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.BROMELIAD_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            CHICORY_SEEDS.put(color, REGISTRAR.register(color + "_chicory_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.CHICORY_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            CLEMATIS_SEEDS.put(color, REGISTRAR.register(color + "_clematis_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.CLEMATIS_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            CLOVER_SEEDS.put(color, REGISTRAR.register(color + "_clover_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.CLOVER_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            CORNFLOWER_SEEDS.put(color, REGISTRAR.register(color + "_cornflower_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.CORNFLOWER_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            DAISY_SEEDS.put(color, REGISTRAR.register(color + "_daisy_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.DAISY_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            DANDELION_SEEDS.put(color, REGISTRAR.register(color + "_dandelion_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.DANDELION_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            DIANTHUS_SEEDS.put(color, REGISTRAR.register(color + "_dianthus_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.DIANTHUS_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            FAIRY_ROSE_SEEDS.put(color, REGISTRAR.register(color + "_fairy_rose_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.FAIRY_ROSE_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            FOXGLOVE_SEEDS.put(color, REGISTRAR.register(color + "_foxglove_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.FOXGLOVE_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            HIBISCUS_SEEDS.put(color, REGISTRAR.register(color + "_hibiscus_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.HIBISCUS_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            HYACINTH_SEEDS.put(color, REGISTRAR.register(color + "_hyacinth_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.HYACINTH_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            IMPALA_LILY_SEEDS.put(color, REGISTRAR.register(color + "_impala_lily_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.IMPALA_LILY_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            JASMINE_SEEDS.put(color, REGISTRAR.register(color + "_jasmine_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.JASMINE_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            LANTANAS_SEEDS.put(color, REGISTRAR.register(color + "_lantanas_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.LANTANAS_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            LAVENDER_SEEDS.put(color, REGISTRAR.register(color + "_lavender_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.LAVENDER_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            LILAC_SEEDS.put(color, REGISTRAR.register(color + "_lilac_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.LILAC_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            LILY_SEEDS.put(color, REGISTRAR.register(color + "_lily_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.LILY_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            ORCHID_SEEDS.put(color, REGISTRAR.register(color + "_orchid_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.ORCHID_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            PEONY_SEEDS.put(color, REGISTRAR.register(color + "_peony_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.PEONY_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            POPPY_SEEDS.put(color, REGISTRAR.register(color + "_poppy_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.POPPY_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            POPPIES_SEEDS.put(color, REGISTRAR.register(color + "_poppies_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.POPPIES_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            ROSE_BUSH_SEEDS.put(color, REGISTRAR.register(color + "_rose_bush_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.ROSE_BUSH_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            ROSE_BUSHLET_SEEDS.put(color, REGISTRAR.register(color + "_rose_bushlet_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.ROSE_BUSHLET_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            SUNFLOWER_SEEDS.put(color, REGISTRAR.register(color + "_sunflower_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.SUNFLOWER_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            TULIP_SEEDS.put(color, REGISTRAR.register(color + "_tulip_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.TULIP_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            WILDFLOWER_SEEDS.put(color, REGISTRAR.register(color + "_wildflower_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.WILDFLOWER_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
            WITHER_ROSE_SEEDS.put(color, REGISTRAR.register(color + "_wither_rose_seeds", () -> new ColoredSeedsItem(FloweraryBlocks.WITHER_ROSE_PLANTS.get(color).get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP))));
        }
    }
}