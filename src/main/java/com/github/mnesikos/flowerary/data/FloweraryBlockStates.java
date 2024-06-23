package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.blocks.FloweraryBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.DoubleBlockHalf;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ConfiguredModel;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.util.Objects;

public class FloweraryBlockStates extends BlockStateProvider {
    public FloweraryBlockStates(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Flowerary.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        for (String color : Flowerary.COLORS_LIST) { // todo: potteds
            cross(FloweraryBlocks.ALLIUM.get(color).get());
            cross(FloweraryBlocks.AZURE_BLUET.get(color).get());
            doubleCross(FloweraryBlocks.BLAZING_STAR.get(color).get());
            cross(FloweraryBlocks.BROMELIAD.get(color).get());
            cross(FloweraryBlocks.CLOVER.get(color).get());
            cross(FloweraryBlocks.CORNFLOWER.get(color).get());
            cross(FloweraryBlocks.DAISY.get(color).get());
            cross(FloweraryBlocks.DANDELION.get(color).get());
            cross(FloweraryBlocks.DIANTHUS.get(color).get());
            cross(FloweraryBlocks.FAIRY_ROSE.get(color).get());
            doubleCross(FloweraryBlocks.FOXGLOVE.get(color).get());
            cross(FloweraryBlocks.HIBISCUS.get(color).get());
            cross(FloweraryBlocks.HYACINTH.get(color).get());
            doubleCross(FloweraryBlocks.IMPALA_LILY.get(color).get());
            cross(FloweraryBlocks.LANTANAS.get(color).get());
            doubleCross(FloweraryBlocks.LILAC.get(color).get());
            cross(FloweraryBlocks.LILY.get(color).get());
            cross(FloweraryBlocks.ORCHID.get(color).get());
            doubleCross(FloweraryBlocks.PEONY.get(color).get());
            cross(FloweraryBlocks.POPPY.get(color).get());
            cross(FloweraryBlocks.POPPIES.get(color).get());
            doubleCross(FloweraryBlocks.ROSE_BUSH.get(color).get());
            cross(FloweraryBlocks.ROSE_BUSHLET.get(color).get());
            doubleCross(FloweraryBlocks.SUNFLOWER.get(color).get());
            cross(FloweraryBlocks.TULIP.get(color).get());
            cross(FloweraryBlocks.WILDFLOWER.get(color).get());
            cross(FloweraryBlocks.WITHER_ROSE.get(color).get());

            crop(FloweraryBlocks.ALLIUM_PLANTS.get(color).get(), color, "allium");
            crop(FloweraryBlocks.AZURE_BLUET_PLANTS.get(color).get(), color, "azure_bluet");
            doubleCrop(FloweraryBlocks.BLAZING_STAR_PLANTS.get(color).get(), color, "blazing_star");
            crop(FloweraryBlocks.BROMELIAD_PLANTS.get(color).get(), color, "bromeliad");
            crop(FloweraryBlocks.CORNFLOWER_PLANTS.get(color).get(), color, "cornflower");
            crop(FloweraryBlocks.DAISY_PLANTS.get(color).get(), color, "daisy");
            crop(FloweraryBlocks.DANDELION_PLANTS.get(color).get(), color, "dandelion");
            crop(FloweraryBlocks.DIANTHUS_PLANTS.get(color).get(), color, "dianthus");
            crop(FloweraryBlocks.FAIRY_ROSE_PLANTS.get(color).get(), color, "fairy_rose");
            doubleCrop(FloweraryBlocks.FOXGLOVE_PLANTS.get(color).get(), color, "foxglove");
            crop(FloweraryBlocks.HIBISCUS_PLANTS.get(color).get(), color, "hibiscus");
            crop(FloweraryBlocks.HYACINTH_PLANTS.get(color).get(), color, "hyacinth");
            doubleCrop(FloweraryBlocks.IMPALA_LILY_PLANTS.get(color).get(), color, "impala_lily");
            crop(FloweraryBlocks.LANTANAS_PLANTS.get(color).get(), color, "lantanas");
            doubleCrop(FloweraryBlocks.LILAC_PLANTS.get(color).get(), color, "lilac");
            crop(FloweraryBlocks.LILY_PLANTS.get(color).get(), color, "lily");
            crop(FloweraryBlocks.ORCHID_PLANTS.get(color).get(), color, "orchid");
            doubleCrop(FloweraryBlocks.PEONY_PLANTS.get(color).get(), color, "peony");
            crop(FloweraryBlocks.POPPY_PLANTS.get(color).get(), color, "poppy");
            crop(FloweraryBlocks.POPPIES_PLANTS.get(color).get(), color, "poppies");
            doubleCrop(FloweraryBlocks.ROSE_BUSH_PLANTS.get(color).get(), color, "rose_bush");
            crop(FloweraryBlocks.ROSE_BUSHLET_PLANTS.get(color).get(), color, "rose_bushlet");
            doubleCrop(FloweraryBlocks.SUNFLOWER_PLANTS.get(color).get(), color, "sunflower");
            crop(FloweraryBlocks.TULIP_PLANTS.get(color).get(), color, "tulip");
            crop(FloweraryBlocks.WILDFLOWER_PLANTS.get(color).get(), color, "wildflower");
            crop(FloweraryBlocks.WITHER_ROSE_PLANTS.get(color).get(), color, "wither_rose");
        }
    }

    public void cross(Block block) {
        ModelFile cross = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + Objects.requireNonNull(block.getRegistryName()).getPath()));
        getVariantBuilder(block).forAllStatesExcept(state -> ConfiguredModel.builder().modelFile(cross).build());
    }

    public void doubleCross(DoublePlantBlock block) {
        ModelFile crossLower = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + Objects.requireNonNull(block.getRegistryName()).getPath() + "_bottom"));
        ModelFile crossUpper = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + block.getRegistryName().getPath() + "_top"));
        getVariantBuilder(block).forAllStatesExcept(state -> ConfiguredModel.builder()
                .modelFile(state.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.LOWER ? crossLower : crossUpper)
                .build());
    }

    public void crop(Block block, String color, String plant) {
        ModelFile stage0 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + plant + "_stage0"));
        ModelFile stage1 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + plant + "_stage1"));
        ModelFile stage2 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + plant + "_stage2"));
        ModelFile stage3 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + plant + "_stage3"));
        ModelFile stage7 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_" + plant));
        getVariantBuilder(block).forAllStates(state -> {
            switch (state.getValue(CropsBlock.AGE)) {
                case 0:
                    return ConfiguredModel.builder().modelFile(stage0).build();
                case 1:
                case 2:
                    return ConfiguredModel.builder().modelFile(stage1).build();
                case 3:
                case 4:
                    return ConfiguredModel.builder().modelFile(stage2).build();
                case 5:
                case 6:
                    return ConfiguredModel.builder().modelFile(stage3).build();
                case 7:
                    return ConfiguredModel.builder().modelFile(stage7).build();
                default:
                    throw new IllegalStateException("Unexpected value: " + state.getValue(CropsBlock.AGE));
            }
        });
    }

    public void doubleCrop(Block block, String color, String plant) {
        ModelFile stage0 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + plant + "_stage0"));
        ModelFile stage1 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + plant + "_stage1"));
        ModelFile stage2 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + plant + "_stage2"));
        ModelFile stage3 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + plant + "_stage3"));
        ModelFile stage7 = models().getExistingFile(new ResourceLocation(Flowerary.MOD_ID, "block/" + color + "_" + plant + "_bottom"));
        getVariantBuilder(block).forAllStates(state -> {
            switch (state.getValue(CropsBlock.AGE)) {
                case 0:
                    return ConfiguredModel.builder().modelFile(stage0).build();
                case 1:
                case 2:
                    return ConfiguredModel.builder().modelFile(stage1).build();
                case 3:
                case 4:
                    return ConfiguredModel.builder().modelFile(stage2).build();
                case 5:
                case 6:
                    return ConfiguredModel.builder().modelFile(stage3).build();
                case 7:
                    return ConfiguredModel.builder().modelFile(stage7).build();
                default:
                    throw new IllegalStateException("Unexpected value: " + state.getValue(CropsBlock.AGE));
            }
        });
    }
}
