package com.github.mnesikos.flowerary.blocks;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.items.FloweraryItems;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.util.Util;
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
    public static final Map<String, RegistryObject<Block>> ROSE_BUSHLET_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_rose_bushlet_plant", () -> new FlowerCropBlock(FloweraryItems.ROSE_BUSHLET_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> POPPY_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_poppy_plant", () -> new FlowerCropBlock(FloweraryItems.POPPY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> DANDELION_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_dandelion_plant", () -> new FlowerCropBlock(FloweraryItems.DANDELION_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> CLEMATIS_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_clematis_plant", () -> new BlockFlowerVineCrop(FloweraryItems.CLEMATIS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> ALLIUM_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_allium_plant", () -> new FlowerCropBlock(FloweraryItems.ALLIUM_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> CLOVER_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_clover_plant", () -> new FlowerCropBlock(FloweraryItems.CLOVER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> HYACINTH_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_hyacinth_plant", () -> new FlowerCropBlock(FloweraryItems.HYACINTH_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> DAISY_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_daisy_plant", () -> new FlowerCropBlock(FloweraryItems.DAISY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> DIANTHUS_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_dianthus_plant", () -> new FlowerCropBlock(FloweraryItems.DIANTHUS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> BOUGAINVILLEA_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_bougainvillea_plant", () -> new BlockFlowerVineCrop(FloweraryItems.BOUGAINVILLEA_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> FAIRY_ROSE_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_fairy_rose_plant", () -> new FlowerCropBlock(FloweraryItems.FAIRY_ROSE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> SUNFLOWER_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_sunflower_plant", () -> new FlowerCropBlock(FloweraryItems.SUNFLOWER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> JASMINE_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_jasmine_plant", () -> new BlockFlowerVineCrop(FloweraryItems.JASMINE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });
    public static final Map<String, RegistryObject<Block>> FOXGLOVE_PLANT = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register(color + "_foxglove_plant", () -> new FlowerCropBlock(FloweraryItems.FOXGLOVE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
    });

    // FLOWERS
    public static final Map<String, RegistryObject<Block>> ROSE_BUSHLET = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_rose_bushlet", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D))));
    });
    public static final Map<String, RegistryObject<Block>> POPPY = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_poppy", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(3.0D, 0.0D, 3.0D, 13.0D, 10.0D, 13.0D))));
    });
    public static final Map<String, RegistryObject<Block>> DANDELION = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_dandelion", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 9.0D, 10.0D))));
    });
    public static final Map<String, RegistryObject<Block>> CLEMATIS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_clematis", () -> new BlockVineFlower(AbstractBlock.Properties.copy(Blocks.POPPY))));
    });
    public static final Map<String, RegistryObject<Block>> ALLIUM = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_allium", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 14.0D, 10.0D))));
    });
    public static final Map<String, RegistryObject<Block>> CLOVER = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_clover", () -> new BlockFlowerCarpet(AbstractBlock.Properties.copy(Blocks.POPPY))));
    });
    public static final Map<String, RegistryObject<Block>> HYACINTH = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_hyacinth", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(2.0D, 0.0D, 2.0D, 14.0D, 10.0D, 14.0D))));
    });
    public static final Map<String, RegistryObject<Block>> DAISY = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_daisy", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 9.0D, 10.0D))));
    });
    public static final Map<String, RegistryObject<Block>> DIANTHUS = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_dianthus", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(3.0D, 0.0D, 3.0D, 13.0D, 5.0D, 13.0D))));
    });
    public static final Map<String, RegistryObject<Block>> BOUGAINVILLEA = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_bougainvillea", () -> new BlockVineFlower(AbstractBlock.Properties.copy(Blocks.POPPY))));
    });
    public static final Map<String, RegistryObject<Block>> FAIRY_ROSE = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_fairy_rose", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 13.0D, 10.0D))));
    });
    public static final Map<String, RegistryObject<Block>> SUNFLOWER = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_sunflower", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(6.0D, 0.0D, 6.0D, 10.0D, 16.0D, 10.0D))));
    });
    public static final Map<String, RegistryObject<Block>> JASMINE = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_jasmine", () -> new BlockVineFlower(AbstractBlock.Properties.copy(Blocks.POPPY))));
    });
    public static final Map<String, RegistryObject<Block>> FOXGLOVE = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, registerWithItem(color + "_foxglove", () -> new BlockFlower(AbstractBlock.Properties.copy(Blocks.POPPY), Block.box(3.0D, 0.0D, 3.0D, 13.0D, 16.0D, 13.0D))));
    });

    // POTTED FLOWERS
    public static final Map<String, RegistryObject<Block>> POTTED_FAIRY_ROSE = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register("potted_" + color + "_fairy_rose", () -> new FlowerPotBlock(FloweraryBlocks.FAIRY_ROSE.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
    });
    public static final Map<String, RegistryObject<Block>> POTTED_DANDELION = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register("potted_" + color + "_dandelion", () -> new FlowerPotBlock(FloweraryBlocks.DANDELION.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
    });
    public static final Map<String, RegistryObject<Block>> POTTED_ALLIUM = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register("potted_" + color + "_allium", () -> new FlowerPotBlock(FloweraryBlocks.ALLIUM.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
    });
    public static final Map<String, RegistryObject<Block>> POTTED_HYACINTH = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register("potted_" + color + "_hyacinth", () -> new FlowerPotBlock(FloweraryBlocks.HYACINTH.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
    });
    public static final Map<String, RegistryObject<Block>> POTTED_DAISY = Util.make(new HashMap<>(), map -> {
        for (String color : Flowerary.COLORS_LIST)
            map.put(color, REGISTRAR.register("potted_" + color + "_daisy", () -> new FlowerPotBlock(FloweraryBlocks.DAISY.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
    });

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