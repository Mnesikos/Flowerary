package com.github.mnesikos.flowerary.blocks;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.items.FloweraryItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
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

    // CROPS
    public static final Map<String, RegistryObject<Block>> ALLIUM_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BOUGAINVILLEA_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLEMATIS_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLOVER_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DAISY_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DANDELION_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DIANTHUS_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FAIRY_ROSE_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FOXGLOVE_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HYACINTH_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> JASMINE_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPY_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ROSE_BUSHLET_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> SUNFLOWER_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BLAZING_STAR_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BROMELIAD_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HIBISCUS_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> IMPALA_LILY_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LANTANAS_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WILDFLOWER_PLANTS = new HashMap<>();

    // FLOWERS
    public static final Map<String, RegistryObject<Block>> ALLIUM = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BOUGAINVILLEA = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLEMATIS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLOVER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DAISY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DANDELION = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DIANTHUS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FAIRY_ROSE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FOXGLOVE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HYACINTH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> JASMINE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ROSE_BUSHLET = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> SUNFLOWER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BLAZING_STAR = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BROMELIAD = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HIBISCUS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> IMPALA_LILY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LANTANAS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WILDFLOWER = new HashMap<>();

    // POTTED FLOWERS
    public static final Map<String, RegistryObject<Block>> POTTED_ALLIUM = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_DAISY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_DANDELION = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_FAIRY_ROSE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_HYACINTH = new HashMap<>();

    public static final RegistryObject<Block> BLACK_CANDLE = registerWithItem("black_candle", () -> new BlockCandle(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_CANDLE = registerWithItem("blue_candle", () -> new BlockCandle(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_CANDLE = registerWithItem("cyan_candle", () -> new BlockCandle(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_CANDLE = registerWithItem("green_candle", () -> new BlockCandle(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_CANDLE = registerWithItem("orange_candle", () -> new BlockCandle(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_CANDLE = registerWithItem("pink_candle", () -> new BlockCandle(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_CANDLE = registerWithItem("red_candle", () -> new BlockCandle(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WHITE_CANDLE = registerWithItem("white_candle", () -> new BlockCandle(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));

    public static final RegistryObject<Block> STUNTED_BLACK_BOUGAINVILLEA = registerWithItem("stunted_black_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_BLUE_BOUGAINVILLEA = registerWithItem("stunted_blue_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_CYAN_BOUGAINVILLEA = registerWithItem("stunted_cyan_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_RED_BOUGAINVILLEA = registerWithItem("stunted_red_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_MAGENTA_BOUGAINVILLEA = registerWithItem("stunted_magenta_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_ORANGE_BOUGAINVILLEA = registerWithItem("stunted_orange_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_PINK_BOUGAINVILLEA = registerWithItem("stunted_pink_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_WHITE_BOUGAINVILLEA = registerWithItem("stunted_white_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_YELLOW_BOUGAINVILLEA = registerWithItem("stunted_yellow_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_LILAC_BOUGAINVILLEA = registerWithItem("stunted_lilac_bougainvillea", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_BLACK_JASMINE = registerWithItem("stunted_black_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_BLUE_JASMINE = registerWithItem("stunted_blue_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_CYAN_JASMINE = registerWithItem("stunted_cyan_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_RED_JASMINE = registerWithItem("stunted_red_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_MAGENTA_JASMINE = registerWithItem("stunted_magenta_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_ORANGE_JASMINE = registerWithItem("stunted_orange_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_PINK_JASMINE = registerWithItem("stunted_pink_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_WHITE_JASMINE = registerWithItem("stunted_white_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_YELLOW_JASMINE = registerWithItem("stunted_yellow_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_LILAC_JASMINE = registerWithItem("stunted_lilac_jasmine", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_BLACK_CLEMATIS = registerWithItem("stunted_black_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_BLUE_CLEMATIS = registerWithItem("stunted_blue_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_CYAN_CLEMATIS = registerWithItem("stunted_cyan_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_RED_CLEMATIS = registerWithItem("stunted_red_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_MAGENTA_CLEMATIS = registerWithItem("stunted_magenta_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_ORANGE_CLEMATIS = registerWithItem("stunted_orange_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_PINK_CLEMATIS = registerWithItem("stunted_pink_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_WHITE_CLEMATIS = registerWithItem("stunted_white_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_YELLOW_CLEMATIS = registerWithItem("stunted_yellow_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));
    public static final RegistryObject<Block> STUNTED_LILAC_CLEMATIS = registerWithItem("stunted_lilac_clematis", () -> new BlockVineFlower(Block.Properties.of(Material.PLANT).noCollission().sound(SoundType.GRASS)));

    static {
        for (String color : Flowerary.COLORS_LIST) {
            ALLIUM_PLANTS.put(color, REGISTRAR.register(color + "_allium_plant", () -> new FlowerCropBlock(FloweraryItems.ALLIUM_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            BOUGAINVILLEA_PLANTS.put(color, REGISTRAR.register(color + "_bougainvillea_plant", () -> new BlockFlowerVineCrop(FloweraryItems.BOUGAINVILLEA_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            CLEMATIS_PLANTS.put(color, REGISTRAR.register(color + "_clematis_plant", () -> new BlockFlowerVineCrop(FloweraryItems.CLEMATIS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            CLOVER_PLANTS.put(color, REGISTRAR.register(color + "_clover_plant", () -> new FlowerCropBlock(FloweraryItems.CLOVER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            DAISY_PLANTS.put(color, REGISTRAR.register(color + "_daisy_plant", () -> new FlowerCropBlock(FloweraryItems.DAISY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            DANDELION_PLANTS.put(color, REGISTRAR.register(color + "_dandelion_plant", () -> new FlowerCropBlock(FloweraryItems.DANDELION_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            DIANTHUS_PLANTS.put(color, REGISTRAR.register(color + "_dianthus_plant", () -> new FlowerCropBlock(FloweraryItems.DIANTHUS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            FAIRY_ROSE_PLANTS.put(color, REGISTRAR.register(color + "_fairy_rose_plant", () -> new FlowerCropBlock(FloweraryItems.FAIRY_ROSE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            FOXGLOVE_PLANTS.put(color, REGISTRAR.register(color + "_foxglove_plant", () -> new FlowerCropBlock(FloweraryItems.FOXGLOVE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            HYACINTH_PLANTS.put(color, REGISTRAR.register(color + "_hyacinth_plant", () -> new FlowerCropBlock(FloweraryItems.HYACINTH_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            JASMINE_PLANTS.put(color, REGISTRAR.register(color + "_jasmine_plant", () -> new BlockFlowerVineCrop(FloweraryItems.JASMINE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            POPPY_PLANTS.put(color, REGISTRAR.register(color + "_poppy_plant", () -> new FlowerCropBlock(FloweraryItems.POPPY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            ROSE_BUSHLET_PLANTS.put(color, REGISTRAR.register(color + "_rose_bushlet_plant", () -> new FlowerCropBlock(FloweraryItems.ROSE_BUSHLET_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            SUNFLOWER_PLANTS.put(color, REGISTRAR.register(color + "_sunflower_plant", () -> new FlowerCropBlock(FloweraryItems.SUNFLOWER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            BLAZING_STAR_PLANTS.put(color, REGISTRAR.register(color + "_blazing_star_plant", () -> new FlowerCropBlock(FloweraryItems.BLAZING_STAR_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            BROMELIAD_PLANTS.put(color, REGISTRAR.register(color + "_bromeliad_plant", () -> new FlowerCropBlock(FloweraryItems.BROMELIAD_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            HIBISCUS_PLANTS.put(color, REGISTRAR.register(color + "_hibiscus_plant", () -> new FlowerCropBlock(FloweraryItems.HIBISCUS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            IMPALA_LILY_PLANTS.put(color, REGISTRAR.register(color + "_impala_lily_plant", () -> new FlowerCropBlock(FloweraryItems.IMPALA_LILY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            LANTANAS_PLANTS.put(color, REGISTRAR.register(color + "_lantanas_plant", () -> new FlowerCropBlock(FloweraryItems.LANTANAS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            WILDFLOWER_PLANTS.put(color, REGISTRAR.register(color + "_wildflower_plant", () -> new FlowerCropBlock(FloweraryItems.WILDFLOWER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));

            ALLIUM.put(color, registerWithItem(color + "_allium", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 14.0D, 10.0D))));
            BOUGAINVILLEA.put(color, registerWithItem(color + "_bougainvillea", () -> new BlockVineFlower(AbstractBlock.Properties.copy(Blocks.POPPY))));
            CLEMATIS.put(color, registerWithItem(color + "_clematis", () -> new BlockVineFlower(AbstractBlock.Properties.copy(Blocks.POPPY))));
            CLOVER.put(color, registerWithItem(color + "_clover", () -> new BlockFlowerCarpet(AbstractBlock.Properties.copy(Blocks.POPPY))));
            DAISY.put(color, registerWithItem(color + "_daisy", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 9.0D, 10.0D))));
            DANDELION.put(color, registerWithItem(color + "_dandelion", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 9.0D, 10.0D))));
            DIANTHUS.put(color, registerWithItem(color + "_dianthus", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(3.0D, 0.0D, 3.0D, 13.0D, 5.0D, 13.0D))));
            FAIRY_ROSE.put(color, registerWithItem(color + "_fairy_rose", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 13.0D, 10.0D))));
            FOXGLOVE.put(color, registerWithItem(color + "_foxglove", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D))));
            HYACINTH.put(color, registerWithItem(color + "_hyacinth", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(2.0D, 0.0D, 2.0D, 14.0D, 10.0D, 14.0D))));
            JASMINE.put(color, registerWithItem(color + "_jasmine", () -> new BlockVineFlower(AbstractBlock.Properties.copy(Blocks.POPPY))));
            POPPY.put(color, registerWithItem(color + "_poppy", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D))));
            ROSE_BUSHLET.put(color, registerWithItem(color + "_rose_bushlet", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D))));
            SUNFLOWER.put(color, registerWithItem(color + "_sunflower", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D))));
            BLAZING_STAR.put(color, registerWithItem(color + "_blazing_star", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D))));
            BROMELIAD.put(color, registerWithItem(color + "_bromeliad", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D))));
            HIBISCUS.put(color, registerWithItem(color + "_hibiscus", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D))));
            IMPALA_LILY.put(color, registerWithItem(color + "_impala_lily", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D))));
            LANTANAS.put(color, registerWithItem(color + "_lantanas", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D))));
            WILDFLOWER.put(color, registerWithItem(color + "_wildflower", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(5.0D, 0.0D, 5.0D, 11.0D, 10.0D, 11.0D))));

            POTTED_ALLIUM.put(color, REGISTRAR.register("potted_" + color + "_allium", () -> new FlowerPotBlock(FloweraryBlocks.ALLIUM.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
            POTTED_DAISY.put(color, REGISTRAR.register("potted_" + color + "_daisy", () -> new FlowerPotBlock(FloweraryBlocks.DAISY.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
            POTTED_DANDELION.put(color, REGISTRAR.register("potted_" + color + "_dandelion", () -> new FlowerPotBlock(FloweraryBlocks.DANDELION.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
            POTTED_FAIRY_ROSE.put(color, REGISTRAR.register("potted_" + color + "_fairy_rose", () -> new FlowerPotBlock(FloweraryBlocks.FAIRY_ROSE.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
            POTTED_HYACINTH.put(color, REGISTRAR.register("potted_" + color + "_hyacinth", () -> new FlowerPotBlock(FloweraryBlocks.HYACINTH.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
        }
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