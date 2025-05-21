package com.github.mnesikos.flowerary.item;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemNameBlockItem;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;

public final class FloweraryItems {
    public static final DeferredRegister<Item> REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, Flowerary.MOD_ID);
    public static final DeferredRegister<Item> TABLESS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, Flowerary.MOD_ID);

    public static final RegistryObject<Item> EMPTY_POLLEN_JAR = REGISTRAR.register("empty_pollen_jar", () -> new EmptyPollenJarItem(new Item.Properties()));
    public static final RegistryObject<Item> DANDELION_POLLEN_JAR = REGISTRAR.register("dandelion_pollen_jar", () -> new PollenJarItem(FloweraryColor.YELLOW, FloweraryColor.LIME, new Item.Properties()));
    public static final RegistryObject<Item> POPPY_POLLEN_JAR = REGISTRAR.register("poppy_pollen_jar", () -> new PollenJarItem(FloweraryColor.RED, FloweraryColor.PEACH, new Item.Properties()));
    public static final RegistryObject<Item> BLUE_ORCHID_POLLEN_JAR = REGISTRAR.register("blue_orchid_pollen_jar", () -> new PollenJarItem(FloweraryColor.LIGHT_BLUE, FloweraryColor.MINT, new Item.Properties()));
    public static final RegistryObject<Item> ALLIUM_POLLEN_JAR = REGISTRAR.register("allium_pollen_jar", () -> new PollenJarItem(FloweraryColor.MAGENTA, FloweraryColor.LILAC, new Item.Properties()));
    public static final RegistryObject<Item> AZURE_BLUET_POLLEN_JAR = REGISTRAR.register("azure_bluet_pollen_jar", () -> new PollenJarItem(FloweraryColor.WHITE, FloweraryColor.LIGHT_BLUE, new Item.Properties()));
    public static final RegistryObject<Item> RED_TULIP_POLLEN_JAR = REGISTRAR.register("red_tulip_pollen_jar", () -> new PollenJarItem(FloweraryColor.RED, FloweraryColor.PEACH, new Item.Properties()));
    public static final RegistryObject<Item> ORANGE_TULIP_POLLEN_JAR = REGISTRAR.register("orange_tulip_pollen_jar", () -> new PollenJarItem(FloweraryColor.ORANGE, FloweraryColor.BLUE, new Item.Properties()));
    public static final RegistryObject<Item> WHITE_TULIP_POLLEN_JAR = REGISTRAR.register("white_tulip_pollen_jar", () -> new PollenJarItem(FloweraryColor.WHITE, FloweraryColor.LIGHT_BLUE, new Item.Properties()));
    public static final RegistryObject<Item> PINK_TULIP_POLLEN_JAR = REGISTRAR.register("pink_tulip_pollen_jar", () -> new PollenJarItem(FloweraryColor.PINK, FloweraryColor.LAVENDER, new Item.Properties()));
    public static final RegistryObject<Item> OXEYE_DAISY_POLLEN_JAR = REGISTRAR.register("oxeye_daisy_pollen_jar", () -> new PollenJarItem(FloweraryColor.WHITE, FloweraryColor.LIGHT_BLUE, new Item.Properties()));
    public static final RegistryObject<Item> CORNFLOWER_POLLEN_JAR = REGISTRAR.register("cornflower_pollen_jar", () -> new PollenJarItem(FloweraryColor.BLUE, FloweraryColor.PURPLE, new Item.Properties()));
    public static final RegistryObject<Item> LILY_OF_THE_VALLEY_POLLEN_JAR = REGISTRAR.register("lily_of_the_valley_pollen_jar", () -> new PollenJarItem(FloweraryColor.WHITE, FloweraryColor.LIGHT_BLUE, new Item.Properties()));
    public static final RegistryObject<Item> TORCHFLOWER_POLLEN_JAR = REGISTRAR.register("torchflower_pollen_jar", () -> new PollenJarItem(FloweraryColor.ORANGE, FloweraryColor.BLUE, new Item.Properties()));
    public static final RegistryObject<Item> WITHER_ROSE_POLLEN_JAR = REGISTRAR.register("wither_rose_pollen_jar", () -> new PollenJarItem(FloweraryColor.BLACK, FloweraryColor.WILTED, new Item.Properties()));
    public static final RegistryObject<Item> PINK_PETALS_POLLEN_JAR = REGISTRAR.register("pink_petals_pollen_jar", () -> new PollenJarItem(FloweraryColor.PINK, FloweraryColor.LAVENDER, new Item.Properties()));
    public static final RegistryObject<Item> SUNFLOWER_POLLEN_JAR = REGISTRAR.register("sunflower_pollen_jar", () -> new PollenJarItem(FloweraryColor.YELLOW, FloweraryColor.LIME, new Item.Properties()));
    public static final RegistryObject<Item> LILAC_POLLEN_JAR = REGISTRAR.register("lilac_pollen_jar", () -> new PollenJarItem(FloweraryColor.MAGENTA, FloweraryColor.LILAC, new Item.Properties()));
    public static final RegistryObject<Item> ROSE_BUSH_POLLEN_JAR = REGISTRAR.register("rose_bush_pollen_jar", () -> new PollenJarItem(FloweraryColor.RED, FloweraryColor.PEACH, new Item.Properties()));
    public static final RegistryObject<Item> PEONY_POLLEN_JAR = REGISTRAR.register("peony_pollen_jar", () -> new PollenJarItem(FloweraryColor.PINK, FloweraryColor.LAVENDER, new Item.Properties()));
    public static final RegistryObject<Item> PITCHER_PLANT_POLLEN_JAR = REGISTRAR.register("pitcher_plant_pollen_jar", () -> new PollenJarItem(FloweraryColor.CYAN, FloweraryColor.PURPLE, new Item.Properties()));

    public static final Map<String, RegistryObject<Item>> ALLIUM_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> ALYSSUM_SEEDS = new HashMap<>();
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
    public static final Map<String, RegistryObject<Item>> PETALS_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> PITCHER_PLANT_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> POPPY_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> POPPIES_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> ROSE_BUSH_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> ROSE_BUSHLET_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> SUNFLOWER_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> TORCHFLOWER_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> TULIP_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> WILDFLOWER_SEEDS = new HashMap<>();
    public static final Map<String, RegistryObject<Item>> WITHER_ROSE_SEEDS = new HashMap<>();

    static {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            ALLIUM_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_allium_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.ALLIUM_PLANTS.get(color).get(), new Item.Properties())));
            ALYSSUM_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_alyssum_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.ALYSSUM_PLANTS.get(color).get(), new Item.Properties())));
            AZURE_BLUET_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_azure_bluet_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.AZURE_BLUET_PLANTS.get(color).get(), new Item.Properties())));
            BLAZING_STAR_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_blazing_star_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.BLAZING_STAR_PLANTS.get(color).get(), new Item.Properties())));
            BOUGAINVILLEA_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_bougainvillea_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.BOUGAINVILLEA_PLANTS.get(color).get(), new Item.Properties())));
            BROMELIAD_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_bromeliad_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.BROMELIAD_PLANTS.get(color).get(), new Item.Properties())));
            CHICORY_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_chicory_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.CHICORY_PLANTS.get(color).get(), new Item.Properties())));
            CLEMATIS_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_clematis_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.CLEMATIS_PLANTS.get(color).get(), new Item.Properties())));
            CLOVER_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_clover_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.CLOVER_PLANTS.get(color).get(), new Item.Properties())));
            CORNFLOWER_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_cornflower_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.CORNFLOWER_PLANTS.get(color).get(), new Item.Properties())));
            DAISY_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_daisy_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.DAISY_PLANTS.get(color).get(), new Item.Properties())));
            DANDELION_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_dandelion_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.DANDELION_PLANTS.get(color).get(), new Item.Properties())));
            DIANTHUS_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_dianthus_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.DIANTHUS_PLANTS.get(color).get(), new Item.Properties())));
            FAIRY_ROSE_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_fairy_rose_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.FAIRY_ROSE_PLANTS.get(color).get(), new Item.Properties())));
            FOXGLOVE_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_foxglove_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.FOXGLOVE_PLANTS.get(color).get(), new Item.Properties())));
            HIBISCUS_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_hibiscus_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.HIBISCUS_PLANTS.get(color).get(), new Item.Properties())));
            HYACINTH_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_hyacinth_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.HYACINTH_PLANTS.get(color).get(), new Item.Properties())));
            IMPALA_LILY_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_impala_lily_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.IMPALA_LILY_PLANTS.get(color).get(), new Item.Properties())));
            JASMINE_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_jasmine_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.JASMINE_PLANTS.get(color).get(), new Item.Properties())));
            LANTANAS_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_lantanas_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.LANTANAS_PLANTS.get(color).get(), new Item.Properties())));
            LAVENDER_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_lavender_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.LAVENDER_PLANTS.get(color).get(), new Item.Properties())));
            LILAC_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_lilac_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.LILAC_PLANTS.get(color).get(), new Item.Properties())));
            LILY_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_lily_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.LILY_PLANTS.get(color).get(), new Item.Properties())));
            ORCHID_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_orchid_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.ORCHID_PLANTS.get(color).get(), new Item.Properties())));
            PEONY_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_peony_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.PEONY_PLANTS.get(color).get(), new Item.Properties())));
            PETALS_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_petals_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.PETALS_PLANTS.get(color).get(), new Item.Properties())));
            PITCHER_PLANT_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_pitcher_plant_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.PITCHER_PLANT_PLANTS.get(color).get(), new Item.Properties())));
            POPPY_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_poppy_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.POPPY_PLANTS.get(color).get(), new Item.Properties())));
            POPPIES_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_poppies_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.POPPIES_PLANTS.get(color).get(), new Item.Properties())));
            ROSE_BUSH_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_rose_bush_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.ROSE_BUSH_PLANTS.get(color).get(), new Item.Properties())));
            ROSE_BUSHLET_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_rose_bushlet_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.ROSE_BUSHLET_PLANTS.get(color).get(), new Item.Properties())));
            SUNFLOWER_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_sunflower_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.SUNFLOWER_PLANTS.get(color).get(), new Item.Properties())));
            TORCHFLOWER_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_torchflower_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.TORCHFLOWER_PLANTS.get(color).get(), new Item.Properties())));
            TULIP_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_tulip_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.TULIP_PLANTS.get(color).get(), new Item.Properties())));
            WILDFLOWER_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_wildflower_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.WILDFLOWER_PLANTS.get(color).get(), new Item.Properties())));
            WITHER_ROSE_SEEDS.put(color, TABLESS_REGISTRAR.register(color + "_wither_rose_seeds", () -> new ItemNameBlockItem(FloweraryBlocks.WITHER_ROSE_PLANTS.get(color).get(), new Item.Properties())));
        }
    }
}