package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.block.TallFlowerCropBlock;
import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.CropsBlock;
import net.minecraft.block.DoublePlantBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.state.properties.DoubleBlockHalf;
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
        for (String color : Flowerary.COLORS_LIST) {
            block(FloweraryBlocks.ALLIUM.get(color).get());
            rotateYBlock(FloweraryBlocks.ALYSSUM.get(color).get());
            block(FloweraryBlocks.AZURE_BLUET.get(color).get());
            doubleBlock(FloweraryBlocks.BLAZING_STAR.get(color).get());
            block(FloweraryBlocks.BROMELIAD.get(color).get());
            block(FloweraryBlocks.CHICORY.get(color).get());
            rotateYBlock(FloweraryBlocks.CLOVER.get(color).get());
            block(FloweraryBlocks.CORNFLOWER.get(color).get());
            block(FloweraryBlocks.DAISY.get(color).get());
            block(FloweraryBlocks.DANDELION.get(color).get());
            block(FloweraryBlocks.DIANTHUS.get(color).get());
            block(FloweraryBlocks.FAIRY_ROSE.get(color).get());
            doubleBlock(FloweraryBlocks.FOXGLOVE.get(color).get());
            block(FloweraryBlocks.HIBISCUS.get(color).get());
            block(FloweraryBlocks.HYACINTH.get(color).get());
            doubleBlock(FloweraryBlocks.IMPALA_LILY.get(color).get());
            block(FloweraryBlocks.LANTANAS.get(color).get());
            doubleBlock(FloweraryBlocks.LAVENDER.get(color).get());
            doubleBlock(FloweraryBlocks.LILAC.get(color).get());
            block(FloweraryBlocks.LILY.get(color).get());
            block(FloweraryBlocks.ORCHID.get(color).get());
            doubleBlock(FloweraryBlocks.PEONY.get(color).get());
            block(FloweraryBlocks.POPPY.get(color).get());
            block(FloweraryBlocks.POPPIES.get(color).get());
            doubleBlock(FloweraryBlocks.ROSE_BUSH.get(color).get());
            block(FloweraryBlocks.ROSE_BUSHLET.get(color).get());
            doubleBlock(FloweraryBlocks.SUNFLOWER.get(color).get());
            block(FloweraryBlocks.TULIP.get(color).get());
            block(FloweraryBlocks.WILDFLOWER.get(color).get());
            block(FloweraryBlocks.WITHER_ROSE.get(color).get());

            block(FloweraryBlocks.POTTED_ALLIUMS.get(color).get());
            block(FloweraryBlocks.POTTED_AZURE_BLUETS.get(color).get());
            block(FloweraryBlocks.POTTED_CORNFLOWERS.get(color).get());
            block(FloweraryBlocks.POTTED_DAISYS.get(color).get());
            block(FloweraryBlocks.POTTED_DANDELIONS.get(color).get());
            block(FloweraryBlocks.POTTED_FAIRY_ROSES.get(color).get());
            block(FloweraryBlocks.POTTED_HYACINTHS.get(color).get());
            block(FloweraryBlocks.POTTED_LILYS.get(color).get());
            block(FloweraryBlocks.POTTED_ORCHIDS.get(color).get());
            block(FloweraryBlocks.POTTED_POPPYS.get(color).get());
            block(FloweraryBlocks.POTTED_TULIPS.get(color).get());
            block(FloweraryBlocks.POTTED_WITHER_ROSES.get(color).get());

            crop(FloweraryBlocks.ALLIUM_PLANTS.get(color).get(), color, "allium");
            crop(FloweraryBlocks.ALYSSUM_PLANTS.get(color).get(), color, "alyssum");
            crop(FloweraryBlocks.AZURE_BLUET_PLANTS.get(color).get(), color, "azure_bluet");
            doubleCrop(FloweraryBlocks.BLAZING_STAR_PLANTS.get(color).get(), color, "blazing_star");
            crop(FloweraryBlocks.BROMELIAD_PLANTS.get(color).get(), color, "bromeliad");
            crop(FloweraryBlocks.CHICORY_PLANTS.get(color).get(), color, "chicory");
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
            doubleCrop(FloweraryBlocks.LAVENDER_PLANTS.get(color).get(), color, "lavender");
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

    public void rotateYBlock(Block block) {
        ModelFile model = models().getExistingFile(block.getRegistryName());
        getVariantBuilder(block).partialState()
                .addModels(new ConfiguredModel(model, 0, 0, false))
                .addModels(new ConfiguredModel(model, 0, 90, false))
                .addModels(new ConfiguredModel(model, 0, 180, false))
                .addModels(new ConfiguredModel(model, 0, 270, false));
    }

    public void block(Block block) {
        ModelFile model = models().getExistingFile(block.getRegistryName());
        getVariantBuilder(block).partialState().addModels(new ConfiguredModel(model));
    }

    public void doubleBlock(Block block) {
        ModelFile crossLower = models().getExistingFile(modLoc("block/" + Objects.requireNonNull(block.getRegistryName()).getPath() + "_bottom"));
        ModelFile crossUpper = models().getExistingFile(modLoc("block/" + block.getRegistryName().getPath() + "_top"));
        getVariantBuilder(block).forAllStatesExcept(state -> ConfiguredModel.builder()
                .modelFile(state.getValue(DoublePlantBlock.HALF) == DoubleBlockHalf.LOWER ? crossLower : crossUpper)
                .build());
    }

    public void crop(Block block, String color, String plant) {
        ModelFile stage0 = models().getExistingFile(modLoc("block/" + plant + "_stage0"));
        ModelFile stage1 = models().getExistingFile(modLoc("block/" + plant + "_stage1"));
        ModelFile stage2 = models().getExistingFile(modLoc("block/" + plant + "_stage2"));
        ModelFile stage3 = models().getExistingFile(modLoc("block/" + plant + "_stage3"));
        ModelFile stage7 = models().getExistingFile(modLoc("block/" + color + "_" + plant));
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
        ModelFile stage0Lower = models().getExistingFile(modLoc("block/" + plant + "_stage0_bottom"));
        ModelFile stage1Lower = models().getExistingFile(modLoc("block/" + plant + "_stage1_bottom"));
        ModelFile stage2Lower = models().getExistingFile(modLoc("block/" + plant + "_stage2_bottom"));
        ModelFile stage3Lower = models().getExistingFile(modLoc("block/" + plant + "_stage3_bottom"));
        ModelFile stage7Lower = models().getExistingFile(modLoc("block/" + color + "_" + plant + "_bottom"));
        ModelFile stage0Upper = models().getExistingFile(modLoc("block/" + plant + "_stage0_top"));
        ModelFile stage1Upper = models().getExistingFile(modLoc("block/" + plant + "_stage1_top"));
        ModelFile stage2Upper = models().getExistingFile(modLoc("block/" + plant + "_stage2_top"));
        ModelFile stage3Upper = models().getExistingFile(modLoc("block/" + plant + "_stage3_top"));
        ModelFile stage7Upper = models().getExistingFile(modLoc("block/" + color + "_" + plant + "_top"));
        getVariantBuilder(block).forAllStates(state -> {
            DoubleBlockHalf segment = state.getValue(TallFlowerCropBlock.SEGMENT);
            switch (state.getValue(CropsBlock.AGE)) {
                case 0:
                    return ConfiguredModel.builder().modelFile(segment == DoubleBlockHalf.LOWER ? stage0Lower : stage0Upper).build();
                case 1:
                case 2:
                    return ConfiguredModel.builder().modelFile(segment == DoubleBlockHalf.LOWER ? stage1Lower : stage1Upper).build();
                case 3:
                case 4:
                    return ConfiguredModel.builder().modelFile(segment == DoubleBlockHalf.LOWER ? stage2Lower : stage2Upper).build();
                case 5:
                case 6:
                    return ConfiguredModel.builder().modelFile(segment == DoubleBlockHalf.LOWER ? stage3Lower : stage3Upper).build();
                case 7:
                    return ConfiguredModel.builder().modelFile(segment == DoubleBlockHalf.LOWER ? stage7Lower : stage7Upper).build();
                default:
                    throw new IllegalStateException("Unexpected value: " + state.getValue(CropsBlock.AGE));
            }
        });
    }
}
