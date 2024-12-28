package com.github.mnesikos.flowerary.block;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.minecraft.block.*;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public final class FloweraryBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, Flowerary.MOD_ID);

    // FLOWERS
    public static final Map<String, RegistryObject<Block>> ALLIUM = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ALYSSUM = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> AZURE_BLUET = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BLAZING_STAR = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BOUGAINVILLEA = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BROMELIAD = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CHICORY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLEMATIS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLOVER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CORNFLOWER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DAISY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DANDELION = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DIANTHUS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FAIRY_ROSE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FOXGLOVE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HIBISCUS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HYACINTH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> IMPALA_LILY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> JASMINE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LANTANAS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LAVENDER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LILAC = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LILY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ORCHID = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> PEONY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPIES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ROSE_BUSH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ROSE_BUSHLET = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> SUNFLOWER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> TULIP = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WILDFLOWER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WITHER_ROSE = new HashMap<>();

    // POTTED FLOWERS
    public static final Map<String, RegistryObject<Block>> POTTED_ALLIUMS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_AZURE_BLUETS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_CORNFLOWERS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_DAISYS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_DANDELIONS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_FAIRY_ROSES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_HYACINTHS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_LILYS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_ORCHIDS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_POPPYS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_TULIPS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_WITHER_ROSES = new HashMap<>();

    // CROPS
    public static final Map<String, RegistryObject<Block>> ALLIUM_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ALYSSUM_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> AZURE_BLUET_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BLAZING_STAR_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BOUGAINVILLEA_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BROMELIAD_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CHICORY_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLEMATIS_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLOVER_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CORNFLOWER_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DAISY_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DANDELION_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DIANTHUS_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FAIRY_ROSE_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FOXGLOVE_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HIBISCUS_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HYACINTH_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> IMPALA_LILY_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> JASMINE_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LANTANAS_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LAVENDER_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LILAC_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LILY_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ORCHID_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> PEONY_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPY_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPIES_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ROSE_BUSH_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ROSE_BUSHLET_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> SUNFLOWER_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> TULIP_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WILDFLOWER_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WITHER_ROSE_PLANTS = new HashMap<>();

    static {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            registerFlowerAndCrop(color, "allium", ALLIUM, ALLIUM_PLANTS, FloweraryItems.ALLIUM_SEEDS, POTTED_ALLIUMS);
            registerFlowerCarpetAndCrop(color, "alyssum", ALYSSUM, ALYSSUM_PLANTS, FloweraryItems.ALYSSUM_SEEDS);
            registerFlowerAndCrop(color, "azure_bluet", AZURE_BLUET, AZURE_BLUET_PLANTS, FloweraryItems.AZURE_BLUET_SEEDS, POTTED_AZURE_BLUETS);
            registerTallFlower(color, "blazing_star", BLAZING_STAR);
            BLAZING_STAR_PLANTS.put(color, REGISTRAR.register(color + "_blazing_star_plant", () -> new TallFlowerCropBlock.BlazingStarCropBlock(FloweraryItems.BLAZING_STAR_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            registerFlowerVineAndCrop(color, "bougainvillea", BOUGAINVILLEA, BOUGAINVILLEA_PLANTS, FloweraryItems.BOUGAINVILLEA_SEEDS);
            registerFlowerBushAndCrop(color, "bromeliad", BROMELIAD, BROMELIAD_PLANTS, FloweraryItems.BROMELIAD_SEEDS);
            registerFlowerBushAndCrop(color, "chicory", CHICORY, CHICORY_PLANTS, FloweraryItems.CHICORY_SEEDS);
            registerFlowerVineAndCrop(color, "clematis", CLEMATIS, CLEMATIS_PLANTS, FloweraryItems.CLEMATIS_SEEDS);
            registerFlowerCarpetAndCrop(color, "clover", CLOVER, CLOVER_PLANTS, FloweraryItems.CLOVER_SEEDS);
            registerFlowerAndCrop(color, "cornflower", CORNFLOWER, CORNFLOWER_PLANTS, FloweraryItems.CORNFLOWER_SEEDS, POTTED_CORNFLOWERS);
            registerFlowerAndCrop(color, "daisy", DAISY, DAISY_PLANTS, FloweraryItems.DAISY_SEEDS, POTTED_DAISYS);
            registerFlowerAndCrop(color, "dandelion", DANDELION, DANDELION_PLANTS, FloweraryItems.DANDELION_SEEDS, POTTED_DANDELIONS);
            registerFlowerAndCrop(color, "dianthus", DIANTHUS, DIANTHUS_PLANTS, FloweraryItems.DIANTHUS_SEEDS, null);
            registerFlowerAndCrop(color, "fairy_rose", FAIRY_ROSE, FAIRY_ROSE_PLANTS, FloweraryItems.FAIRY_ROSE_SEEDS, POTTED_FAIRY_ROSES);
            registerTallFlower(color, "foxglove", FOXGLOVE);
            FOXGLOVE_PLANTS.put(color, REGISTRAR.register(color + "_foxglove_plant", () -> new TallFlowerCropBlock.FoxgloveCropBlock(FloweraryItems.FOXGLOVE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            registerFlowerBushAndCrop(color, "hibiscus", HIBISCUS, HIBISCUS_PLANTS, FloweraryItems.HIBISCUS_SEEDS);
            registerFlowerAndCrop(color, "hyacinth", HYACINTH, HYACINTH_PLANTS, FloweraryItems.HYACINTH_SEEDS, POTTED_HYACINTHS);
            registerTallFlower(color, "impala_lily", IMPALA_LILY);
            IMPALA_LILY_PLANTS.put(color, REGISTRAR.register(color + "_impala_lily_plant", () -> new TallFlowerCropBlock.ImpalaLilyCropBlock(FloweraryItems.IMPALA_LILY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            registerFlowerVineAndCrop(color, "jasmine", JASMINE, JASMINE_PLANTS, FloweraryItems.JASMINE_SEEDS);
            registerFlowerBushAndCrop(color, "lantanas", LANTANAS, LANTANAS_PLANTS, FloweraryItems.LANTANAS_SEEDS);
            registerTallFlower(color, "lavender", LAVENDER);
            LAVENDER_PLANTS.put(color, REGISTRAR.register(color + "_lavender_plant", () -> new TallFlowerCropBlock.LavenderCropBlock(FloweraryItems.LAVENDER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            registerTallFlower(color, "lilac", LILAC);
            LILAC_PLANTS.put(color, REGISTRAR.register(color + "_lilac_plant", () -> new TallFlowerCropBlock.LilacCropBlock(FloweraryItems.LILAC_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            registerFlowerAndCrop(color, "lily", LILY, LILY_PLANTS, FloweraryItems.LILY_SEEDS, POTTED_LILYS);
            registerFlowerAndCrop(color, "orchid", ORCHID, ORCHID_PLANTS, FloweraryItems.ORCHID_SEEDS, POTTED_ORCHIDS);
            registerTallFlower(color, "peony", PEONY);
            PEONY_PLANTS.put(color, REGISTRAR.register(color + "_peony_plant", () -> new TallFlowerCropBlock.PeonyCropBlock(FloweraryItems.PEONY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            registerFlowerAndCrop(color, "poppy", POPPY, POPPY_PLANTS, FloweraryItems.POPPY_SEEDS, POTTED_POPPYS);
            registerFlowerBushAndCrop(color, "poppies", POPPIES, POPPIES_PLANTS, FloweraryItems.POPPIES_SEEDS);
            registerTallFlower(color, "rose_bush", ROSE_BUSH);
            ROSE_BUSH_PLANTS.put(color, REGISTRAR.register(color + "_rose_bush_plant", () -> new TallFlowerCropBlock.RoseBushCropBlock(FloweraryItems.ROSE_BUSH_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            registerFlowerBushAndCrop(color, "rose_bushlet", ROSE_BUSHLET, ROSE_BUSHLET_PLANTS, FloweraryItems.ROSE_BUSHLET_SEEDS);
            registerTallFlower(color, "sunflower", SUNFLOWER);
            SUNFLOWER_PLANTS.put(color, REGISTRAR.register(color + "_sunflower_plant", () -> new TallFlowerCropBlock.SunflowerCropBlock(FloweraryItems.SUNFLOWER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            registerFlowerAndCrop(color, "tulip", TULIP, TULIP_PLANTS, FloweraryItems.TULIP_SEEDS, POTTED_TULIPS);
            registerFlowerBushAndCrop(color, "wildflower", WILDFLOWER, WILDFLOWER_PLANTS, FloweraryItems.WILDFLOWER_SEEDS);
            registerFlowerAndCrop(color, "wither_rose", WITHER_ROSE, WITHER_ROSE_PLANTS, FloweraryItems.WITHER_ROSE_SEEDS, POTTED_WITHER_ROSES);
        }
    }

    private static void registerTallFlower(String color, String flower, Map<String, RegistryObject<Block>> flowersMap) {
        flowersMap.put(color, registerWithItem(color + "_" + flower, () -> new TallFlowerBlock(AbstractBlock.Properties.copy(Blocks.ROSE_BUSH))));
    }

    private static void registerFlowerAndCrop(String color, String flower, Map<String, RegistryObject<Block>> flowersMap, Map<String, RegistryObject<Block>> cropsMap, Map<String, RegistryObject<Item>> seedsMap, Map<String, RegistryObject<Block>> pottedsMap) {
        flowersMap.put(color, registerWithItem(color + "_" + flower, () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
        cropsMap.put(color, REGISTRAR.register(color + "_" + flower + "_plant", () -> new FlowerCropBlock(seedsMap.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
        if (pottedsMap != null)
            pottedsMap.put(color, REGISTRAR.register("potted_" + color + "_" + flower, () -> new FlowerPotBlock(null, flowersMap.get(color), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
    }

    private static void registerFlowerCarpetAndCrop(String color, String flower, Map<String, RegistryObject<Block>> flowersMap, Map<String, RegistryObject<Block>> cropsMap, Map<String, RegistryObject<Item>> seedsMap) {
        flowersMap.put(color, registerWithItem(color + "_" + flower, () -> new FlowerCarpetBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
        cropsMap.put(color, REGISTRAR.register(color + "_" + flower + "_plant", () -> new FlowerCropBlock(seedsMap.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    }

    private static void registerFlowerVineAndCrop(String color, String flower, Map<String, RegistryObject<Block>> flowersMap, Map<String, RegistryObject<Block>> cropsMap, Map<String, RegistryObject<Item>> seedsMap) {
        flowersMap.put(color, registerWithItem(color + "_" + flower, () -> new VineBlock(AbstractBlock.Properties.copy(Blocks.VINE))));
        cropsMap.put(color, REGISTRAR.register(color + "_" + flower + "_plant", () -> new FlowerCropBlock(seedsMap.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    }

    private static void registerFlowerBushAndCrop(String color, String flower, Map<String, RegistryObject<Block>> flowersMap, Map<String, RegistryObject<Block>> cropsMap, Map<String, RegistryObject<Item>> seedsMap) {
        flowersMap.put(color, registerWithItem(color + "_" + flower, () -> new FlowerBushBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
        cropsMap.put(color, REGISTRAR.register(color + "_" + flower + "_plant", () -> new FlowerCropBlock(seedsMap.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    }

    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        FloweraryItems.REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties().tab(Flowerary.FLOWERARY_GROUP)));
        return registryObject;
    }

    @OnlyIn(Dist.CLIENT)
    public static void setRenderLayers() {
        RenderType cutout = RenderType.cutout();
        REGISTRAR.getEntries().stream().map(RegistryObject::get).forEach(block -> RenderTypeLookup.setRenderLayer(block, cutout));
    }
}