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

    // FLOWERS
    public static final Map<String, RegistryObject<Block>> ALLIUM = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> AZURE_BLUET = new HashMap<>();
    public static final Map<String, RegistryObject<DoublePlantBlock>> BLAZING_STAR = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BOUGAINVILLEA = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BROMELIAD = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLEMATIS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CLOVER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> CORNFLOWER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DAISY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DANDELION = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DIANTHUS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FAIRY_ROSE = new HashMap<>();
    public static final Map<String, RegistryObject<DoublePlantBlock>> FOXGLOVE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HIBISCUS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HYACINTH = new HashMap<>();
    public static final Map<String, RegistryObject<DoublePlantBlock>> IMPALA_LILY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> JASMINE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LANTANAS = new HashMap<>();
    public static final Map<String, RegistryObject<DoublePlantBlock>> LILAC = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LILY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ORCHID = new HashMap<>();
    public static final Map<String, RegistryObject<DoublePlantBlock>> PEONY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POPPIES = new HashMap<>();
    public static final Map<String, RegistryObject<DoublePlantBlock>> ROSE_BUSH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> ROSE_BUSHLET = new HashMap<>();
    public static final Map<String, RegistryObject<DoublePlantBlock>> SUNFLOWER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> TULIP = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WILDFLOWER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> WITHER_ROSE = new HashMap<>();

    // POTTED FLOWERS
    public static final Map<String, RegistryObject<Block>> POTTED_ALLIUM = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_DAISY = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_DANDELION = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_FAIRY_ROSE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> POTTED_HYACINTH = new HashMap<>();

    // CROPS
    public static final Map<String, RegistryObject<Block>> ALLIUM_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> AZURE_BLUET_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BLAZING_STAR_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BOUGAINVILLEA_PLANTS = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BROMELIAD_PLANTS = new HashMap<>();
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

    public static final RegistryObject<Block> BLACK_CANDLE = registerWithItem("black_candle", () -> new CandleBlock(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> BLUE_CANDLE = registerWithItem("blue_candle", () -> new CandleBlock(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> CYAN_CANDLE = registerWithItem("cyan_candle", () -> new CandleBlock(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> GREEN_CANDLE = registerWithItem("green_candle", () -> new CandleBlock(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> ORANGE_CANDLE = registerWithItem("orange_candle", () -> new CandleBlock(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> PINK_CANDLE = registerWithItem("pink_candle", () -> new CandleBlock(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> RED_CANDLE = registerWithItem("red_candle", () -> new CandleBlock(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));
    public static final RegistryObject<Block> WHITE_CANDLE = registerWithItem("white_candle", () -> new CandleBlock(Block.Properties.of(Material.PLANT).noCollission().lightLevel(state -> 4).sound(SoundType.WOOD)));

    static {
        for (String color : Flowerary.COLORS_LIST) {
            ALLIUM.put(color, registerWithItem(color + "_allium", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            AZURE_BLUET.put(color, registerWithItem(color + "_azure_bluet", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            BLAZING_STAR.put(color, registerWithItem(color + "_blazing_star", () -> new TallFlowerBlock(AbstractBlock.Properties.copy(Blocks.ROSE_BUSH))));
            BOUGAINVILLEA.put(color, registerWithItem(color + "_bougainvillea", () -> new VineBlock(AbstractBlock.Properties.copy(Blocks.VINE))));
            BROMELIAD.put(color, registerWithItem(color + "_bromeliad", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            CLEMATIS.put(color, registerWithItem(color + "_clematis", () -> new VineBlock(AbstractBlock.Properties.copy(Blocks.VINE))));
            CLOVER.put(color, registerWithItem(color + "_clover", () -> new FlowerCarpetBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            CORNFLOWER.put(color, registerWithItem(color + "_cornflower", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            DAISY.put(color, registerWithItem(color + "_daisy", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            DANDELION.put(color, registerWithItem(color + "_dandelion", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            DIANTHUS.put(color, registerWithItem(color + "_dianthus", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            FAIRY_ROSE.put(color, registerWithItem(color + "_fairy_rose", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            FOXGLOVE.put(color, registerWithItem(color + "_foxglove", () -> new TallFlowerBlock(AbstractBlock.Properties.copy(Blocks.ROSE_BUSH))));
            HIBISCUS.put(color, registerWithItem(color + "_hibiscus", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            HYACINTH.put(color, registerWithItem(color + "_hyacinth", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            IMPALA_LILY.put(color, registerWithItem(color + "_impala_lily", () -> new TallFlowerBlock(AbstractBlock.Properties.copy(Blocks.ROSE_BUSH))));
            JASMINE.put(color, registerWithItem(color + "_jasmine", () -> new VineBlock(AbstractBlock.Properties.copy(Blocks.VINE))));
            LANTANAS.put(color, registerWithItem(color + "_lantanas", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            LILAC.put(color, registerWithItem(color + "_lilac", () -> new TallFlowerBlock(AbstractBlock.Properties.copy(Blocks.ROSE_BUSH))));
            LILY.put(color, registerWithItem(color + "_lily", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            ORCHID.put(color, registerWithItem(color + "_orchid", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            PEONY.put(color, registerWithItem(color + "_peony", () -> new TallFlowerBlock(AbstractBlock.Properties.copy(Blocks.ROSE_BUSH))));
            POPPY.put(color, registerWithItem(color + "_poppy", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            POPPIES.put(color, registerWithItem(color + "_poppies", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            ROSE_BUSH.put(color, registerWithItem(color + "_rose_bush", () -> new TallFlowerBlock(AbstractBlock.Properties.copy(Blocks.ROSE_BUSH))));
            ROSE_BUSHLET.put(color, registerWithItem(color + "_rose_bushlet", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            SUNFLOWER.put(color, registerWithItem(color + "_sunflower", () -> new TallFlowerBlock(AbstractBlock.Properties.copy(Blocks.ROSE_BUSH))));
            TULIP.put(color, registerWithItem(color + "_tulip", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            WILDFLOWER.put(color, registerWithItem(color + "_wildflower", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));
            WITHER_ROSE.put(color, registerWithItem(color + "_wither_rose", () -> new FlowerBlock(AbstractBlock.Properties.copy(Blocks.POPPY))));

            POTTED_ALLIUM.put(color, REGISTRAR.register("potted_" + color + "_allium", () -> new FlowerPotBlock(FloweraryBlocks.ALLIUM.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
            POTTED_DAISY.put(color, REGISTRAR.register("potted_" + color + "_daisy", () -> new FlowerPotBlock(FloweraryBlocks.DAISY.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
            POTTED_DANDELION.put(color, REGISTRAR.register("potted_" + color + "_dandelion", () -> new FlowerPotBlock(FloweraryBlocks.DANDELION.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
            POTTED_FAIRY_ROSE.put(color, REGISTRAR.register("potted_" + color + "_fairy_rose", () -> new FlowerPotBlock(FloweraryBlocks.FAIRY_ROSE.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));
            POTTED_HYACINTH.put(color, REGISTRAR.register("potted_" + color + "_hyacinth", () -> new FlowerPotBlock(FloweraryBlocks.HYACINTH.get(color).get(), AbstractBlock.Properties.copy(Blocks.POTTED_POPPY))));

            ALLIUM_PLANTS.put(color, REGISTRAR.register(color + "_allium_plant", () -> new FlowerCropBlock(FloweraryItems.ALLIUM_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            AZURE_BLUET_PLANTS.put(color, REGISTRAR.register(color + "_azure_bluet_plant", () -> new FlowerCropBlock(FloweraryItems.AZURE_BLUET_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            BLAZING_STAR_PLANTS.put(color, REGISTRAR.register(color + "_blazing_star_plant", () -> new DoubleFlowerCropBlock(FloweraryItems.BLAZING_STAR_SEEDS.get(color), 4, AbstractBlock.Properties.copy(Blocks.WHEAT))));
            BOUGAINVILLEA_PLANTS.put(color, REGISTRAR.register(color + "_bougainvillea_plant", () -> new FlowerVineCropBlock(FloweraryItems.BOUGAINVILLEA_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            BROMELIAD_PLANTS.put(color, REGISTRAR.register(color + "_bromeliad_plant", () -> new FlowerCropBlock(FloweraryItems.BROMELIAD_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            CLEMATIS_PLANTS.put(color, REGISTRAR.register(color + "_clematis_plant", () -> new FlowerVineCropBlock(FloweraryItems.CLEMATIS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            CLOVER_PLANTS.put(color, REGISTRAR.register(color + "_clover_plant", () -> new FlowerCropBlock(FloweraryItems.CLOVER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            CORNFLOWER_PLANTS.put(color, REGISTRAR.register(color + "_cornflower_plant", () -> new FlowerCropBlock(FloweraryItems.CORNFLOWER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            DAISY_PLANTS.put(color, REGISTRAR.register(color + "_daisy_plant", () -> new FlowerCropBlock(FloweraryItems.DAISY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            DANDELION_PLANTS.put(color, REGISTRAR.register(color + "_dandelion_plant", () -> new FlowerCropBlock(FloweraryItems.DANDELION_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            DIANTHUS_PLANTS.put(color, REGISTRAR.register(color + "_dianthus_plant", () -> new FlowerCropBlock(FloweraryItems.DIANTHUS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            FAIRY_ROSE_PLANTS.put(color, REGISTRAR.register(color + "_fairy_rose_plant", () -> new FlowerCropBlock(FloweraryItems.FAIRY_ROSE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            FOXGLOVE_PLANTS.put(color, REGISTRAR.register(color + "_foxglove_plant", () -> new DoubleFlowerCropBlock(FloweraryItems.FOXGLOVE_SEEDS.get(color), 4, AbstractBlock.Properties.copy(Blocks.WHEAT))));
            HIBISCUS_PLANTS.put(color, REGISTRAR.register(color + "_hibiscus_plant", () -> new FlowerCropBlock(FloweraryItems.HIBISCUS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            HYACINTH_PLANTS.put(color, REGISTRAR.register(color + "_hyacinth_plant", () -> new FlowerCropBlock(FloweraryItems.HYACINTH_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            IMPALA_LILY_PLANTS.put(color, REGISTRAR.register(color + "_impala_lily_plant", () -> new DoubleFlowerCropBlock(FloweraryItems.IMPALA_LILY_SEEDS.get(color), 4, AbstractBlock.Properties.copy(Blocks.WHEAT))));
            JASMINE_PLANTS.put(color, REGISTRAR.register(color + "_jasmine_plant", () -> new FlowerVineCropBlock(FloweraryItems.JASMINE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            LANTANAS_PLANTS.put(color, REGISTRAR.register(color + "_lantanas_plant", () -> new FlowerCropBlock(FloweraryItems.LANTANAS_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            LILAC_PLANTS.put(color, REGISTRAR.register(color + "_lilac_plant", () -> new DoubleFlowerCropBlock(FloweraryItems.LILAC_SEEDS.get(color), 4, AbstractBlock.Properties.copy(Blocks.WHEAT))));
            LILY_PLANTS.put(color, REGISTRAR.register(color + "_lily_plant", () -> new FlowerCropBlock(FloweraryItems.LILY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            ORCHID_PLANTS.put(color, REGISTRAR.register(color + "_orchid_plant", () -> new FlowerCropBlock(FloweraryItems.ORCHID_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            PEONY_PLANTS.put(color, REGISTRAR.register(color + "_peony_plant", () -> new DoubleFlowerCropBlock(FloweraryItems.PEONY_SEEDS.get(color), 4, AbstractBlock.Properties.copy(Blocks.WHEAT))));
            POPPY_PLANTS.put(color, REGISTRAR.register(color + "_poppy_plant", () -> new FlowerCropBlock(FloweraryItems.POPPY_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            POPPIES_PLANTS.put(color, REGISTRAR.register(color + "_poppies_plant", () -> new FlowerCropBlock(FloweraryItems.POPPIES_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            ROSE_BUSH_PLANTS.put(color, REGISTRAR.register(color + "_rose_bush_plant", () -> new DoubleFlowerCropBlock(FloweraryItems.ROSE_BUSH_SEEDS.get(color), 4, AbstractBlock.Properties.copy(Blocks.WHEAT))));
            ROSE_BUSHLET_PLANTS.put(color, REGISTRAR.register(color + "_rose_bushlet_plant", () -> new FlowerCropBlock(FloweraryItems.ROSE_BUSHLET_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            SUNFLOWER_PLANTS.put(color, REGISTRAR.register(color + "_sunflower_plant", () -> new DoubleFlowerCropBlock(FloweraryItems.SUNFLOWER_SEEDS.get(color), 4, AbstractBlock.Properties.copy(Blocks.WHEAT))));
            TULIP_PLANTS.put(color, REGISTRAR.register(color + "_tulip_plant", () -> new FlowerCropBlock(FloweraryItems.TULIP_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            WILDFLOWER_PLANTS.put(color, REGISTRAR.register(color + "_wildflower_plant", () -> new FlowerCropBlock(FloweraryItems.WILDFLOWER_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
            WITHER_ROSE_PLANTS.put(color, REGISTRAR.register(color + "_wither_rose_plant", () -> new FlowerCropBlock(FloweraryItems.WITHER_ROSE_SEEDS.get(color), AbstractBlock.Properties.copy(Blocks.WHEAT))));
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