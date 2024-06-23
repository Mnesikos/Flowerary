package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import net.minecraft.data.DataGenerator;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class FloweraryBlockModels extends BlockModelProvider {
    public FloweraryBlockModels(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Flowerary.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (String color : Flowerary.COLORS_LIST) {
            cross(color + "_allium", modLoc(BLOCK_FOLDER + "/" + color + "_allium"));
            cross(color + "_azure_bluet", modLoc(BLOCK_FOLDER + "/" + color + "_azure_bluet"));
            doubleCross(color + "_blazing_star", modLoc(BLOCK_FOLDER + "/" + color + "_blazing_star"));
            cross(color + "_bromeliad", modLoc(BLOCK_FOLDER + "/" + color + "_bromeliad"));
            cross(color + "_chicory", modLoc(BLOCK_FOLDER + "/" + color + "_chicory"));
            clover(color + "_clover", modLoc(BLOCK_FOLDER + "/" + color + "_clover"));
            cross(color + "_cornflower", modLoc(BLOCK_FOLDER + "/" + color + "_cornflower"));
            cross(color + "_daisy", modLoc(BLOCK_FOLDER + "/" + color + "_daisy"));
            cross(color + "_dandelion", modLoc(BLOCK_FOLDER + "/" + color + "_dandelion"));
            cross(color + "_dianthus", modLoc(BLOCK_FOLDER + "/" + color + "_dianthus"));
            cross(color + "_fairy_rose", modLoc(BLOCK_FOLDER + "/" + color + "_fairy_rose"));
            doubleCross(color + "_foxglove", modLoc(BLOCK_FOLDER + "/" + color + "_foxglove"));
            cross(color + "_hibiscus", modLoc(BLOCK_FOLDER + "/" + color + "_hibiscus"));
            cross(color + "_hyacinth", modLoc(BLOCK_FOLDER + "/" + color + "_hyacinth"));
            doubleCross(color + "_impala_lily", modLoc(BLOCK_FOLDER + "/" + color + "_impala_lily"));
            cross(color + "_lantanas", modLoc(BLOCK_FOLDER + "/" + color + "_lantanas"));
            doubleCross(color + "_lavender", modLoc(BLOCK_FOLDER + "/" + color + "_lavender"));
            doubleCross(color + "_lilac", modLoc(BLOCK_FOLDER + "/" + color + "_lilac"));
            cross(color + "_lily", modLoc(BLOCK_FOLDER + "/" + color + "_lily"));
            cross(color + "_orchid", modLoc(BLOCK_FOLDER + "/" + color + "_orchid"));
            doubleCross(color + "_peony", modLoc(BLOCK_FOLDER + "/" + color + "_peony"));
            cross(color + "_poppy", modLoc(BLOCK_FOLDER + "/" + color + "_poppy"));
            cross(color + "_poppies", modLoc(BLOCK_FOLDER + "/" + color + "_poppies"));
            doubleCross(color + "_rose_bush", modLoc(BLOCK_FOLDER + "/" + color + "_rose_bush"));
            cross(color + "_rose_bushlet", modLoc(BLOCK_FOLDER + "/" + color + "_rose_bushlet"));
            sunflower(color + "_sunflower", modLoc(BLOCK_FOLDER + "/" + color + "_sunflower"));
            cross(color + "_tulip", modLoc(BLOCK_FOLDER + "/" + color + "_tulip"));
            cross(color + "_wildflower", modLoc(BLOCK_FOLDER + "/" + color + "_wildflower"));
            cross(color + "_wither_rose", modLoc(BLOCK_FOLDER + "/" + color + "_wither_rose"));

            pottedCross("potted_" + color + "_allium", modLoc(BLOCK_FOLDER + "/" + color + "_allium"));
            pottedCross("potted_" + color + "_azure_bluet", modLoc(BLOCK_FOLDER + "/" + color + "_azure_bluet"));
            pottedCross("potted_" + color + "_cornflower", modLoc(BLOCK_FOLDER + "/" + color + "_cornflower"));
            pottedCross("potted_" + color + "_daisy", modLoc(BLOCK_FOLDER + "/" + color + "_daisy"));
            pottedCross("potted_" + color + "_dandelion", modLoc(BLOCK_FOLDER + "/" + color + "_dandelion"));
            pottedCross("potted_" + color + "_fairy_rose", modLoc(BLOCK_FOLDER + "/" + color + "_fairy_rose"));
            pottedCross("potted_" + color + "_hyacinth", modLoc(BLOCK_FOLDER + "/" + color + "_hyacinth"));
            pottedCross("potted_" + color + "_lily", modLoc(BLOCK_FOLDER + "/" + color + "_lily"));
            pottedCross("potted_" + color + "_orchid", modLoc(BLOCK_FOLDER + "/" + color + "_orchid"));
            pottedCross("potted_" + color + "_poppy", modLoc(BLOCK_FOLDER + "/" + color + "_poppy"));
            pottedCross("potted_" + color + "_tulip", modLoc(BLOCK_FOLDER + "/" + color + "_tulip"));
            pottedCross("potted_" + color + "_wither_rose", modLoc(BLOCK_FOLDER + "/" + color + "_wither_rose"));
        }

        plant("allium");
        plant("azure_bluet");
        doublePlant("blazing_star");
        plant("bromeliad");
        plant("chicory");
        plant("cornflower");
        plant("daisy");
        plant("dandelion");
        plant("dianthus");
        plant("fairy_rose");
        doublePlant("foxglove");
        plant("hibiscus");
        plant("hyacinth");
        doublePlant("impala_lily");
        plant("lantanas");
        doublePlant("lavender");
        doublePlant("lilac");
        plant("lily");
        plant("orchid");
        doublePlant("peony");
        plant("poppy");
        plant("poppies");
        doublePlant("rose_bush");
        plant("rose_bushlet");
        sunflowerPlant("sunflower");
        plant("tulip");
        plant("wildflower");
        plant("wither_rose");
    }

    public void doubleCross(String name, ResourceLocation cross) {
        cross(name + "_top", new ResourceLocation(cross.getNamespace(), cross.getPath() + "_top"));
        cross(name + "_bottom", new ResourceLocation(cross.getNamespace(), cross.getPath() + "_bottom"));
    }

    public void clover(String name, ResourceLocation clover) {
        singleTexture(name, modLoc(BLOCK_FOLDER + "/flower_carpet"), "1", clover);
    }

    public void sunflower(String name, ResourceLocation sunflower) {
        singleTexture(name + "_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "block", mcLoc("block/sunflower_bottom"));
        singleTexture(name + "_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"), "front", sunflower);
    }

    public void pottedCross(String name, ResourceLocation plant) {
        withExistingParent(name, mcLoc(BLOCK_FOLDER + "/flower_pot_cross")).texture("plant", plant);
    }

    public void plant(String crop) {
        cross(crop + "_stage0", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0"));
        cross(crop + "_stage1", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1"));
        cross(crop + "_stage2", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2"));
        cross(crop + "_stage3", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3"));
    }

    public void doublePlant(String crop) {
        cross(crop + "_stage0_bottom", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_bottom"));
        cross(crop + "_stage1_bottom", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_bottom"));
        cross(crop + "_stage2_bottom", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_bottom"));
        cross(crop + "_stage3_bottom", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_bottom"));
        cross(crop + "_stage0_top", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_top"));
        cross(crop + "_stage1_top", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_top"));
        cross(crop + "_stage2_top", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_top"));
        cross(crop + "_stage3_top", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_top"));
    }

    public void sunflowerPlant(String crop) {
        singleTexture(crop + "_stage0_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "block", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_bottom"));
        singleTexture(crop + "_stage1_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "block", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_bottom"));
        singleTexture(crop + "_stage2_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "block", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_bottom"));
        singleTexture(crop + "_stage3_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "block", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_bottom"));
        withExistingParent(crop + "_stage0_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"))
                .texture("block", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_top"))
                .texture("back", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_top"))
                .texture("front", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_top"));
        withExistingParent(crop + "_stage1_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"))
                .texture("block", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_top"))
                .texture("back", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_top"))
                .texture("front", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_top"));
        withExistingParent(crop + "_stage2_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"))
                .texture("block", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_top"))
                .texture("back", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_top"))
                .texture("front", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_top"));
        withExistingParent(crop + "_stage3_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"))
                .texture("block", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_top"))
                .texture("back", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_top"))
                .texture("front", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_top"));
    }
}
