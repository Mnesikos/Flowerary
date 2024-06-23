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
        for (String color : Flowerary.COLORS_LIST) { // todo: potteds
            cross(color + "_allium", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_allium"));
            cross(color + "_azure_bluet", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_azure_bluet"));
            doubleCross(color + "_blazing_star", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_blazing_star"));
            cross(color + "_bromeliad", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_bromeliad"));
            clover(color + "_clover", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_clover"));
            cross(color + "_cornflower", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_cornflower"));
            cross(color + "_daisy", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_daisy"));
            cross(color + "_dandelion", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_dandelion"));
            cross(color + "_dianthus", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_dianthus"));
            cross(color + "_fairy_rose", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_fairy_rose"));
            doubleCross(color + "_foxglove", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_foxglove"));
            cross(color + "_hibiscus", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_hibiscus"));
            cross(color + "_hyacinth", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_hyacinth"));
            doubleCross(color + "_impala_lily", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_impala_lily"));
            cross(color + "_lantanas", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_lantanas"));
            doubleCross(color + "_lilac", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_lilac"));
            cross(color + "_lily", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_lily"));
            cross(color + "_orchid", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_orchid"));
            doubleCross(color + "_peony", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_peony"));
            cross(color + "_poppy", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_poppy"));
            cross(color + "_poppies", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_poppies"));
            doubleCross(color + "_rose_bush", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_rose_bush"));
            cross(color + "_rose_bushlet", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_rose_bushlet"));
            sunflower(color + "_sunflower", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_sunflower"));
            cross(color + "_tulip", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_tulip"));
            cross(color + "_wildflower", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_wildflower"));
            cross(color + "_wither_rose", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + color + "_wither_rose"));
        }

        plant("allium");
        plant("azure_bluet");
        plant("blazing_star");
        plant("bromeliad");
        plant("cornflower");
        plant("daisy");
        plant("dandelion");
        plant("dianthus");
        plant("fairy_rose");
        plant("foxglove");
        plant("hibiscus");
        plant("hyacinth");
        plant("impala_lily");
        plant("lantanas");
        plant("lilac");
        plant("lily");
        plant("orchid");
        plant("peony");
        plant("poppy");
        plant("poppies");
        plant("rose_bush");
        plant("rose_bushlet");
        plant("sunflower");
        plant("tulip");
        plant("wildflower");
        plant("wither_rose");
    }

    public void doubleCross(String name, ResourceLocation cross) {
        cross(name + "_top", new ResourceLocation(cross.getNamespace(), cross.getPath() + "_top"));
        cross(name + "_bottom", new ResourceLocation(cross.getNamespace(), cross.getPath() + "_bottom"));
    }

    public void clover(String name, ResourceLocation clover) {
        singleTexture(name, new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/flower_carpet"), "1", clover);
    }

    public void sunflower(String name, ResourceLocation sunflower) {
        singleTexture(name + "_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"), "cross", sunflower);
        singleTexture(name + "_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "cross", mcLoc("block/sunflower_bottom"));
    }

    public void plant(String crop) {
        cross(crop + "_stage0", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + crop + "_stage0"));
        cross(crop + "_stage1", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + crop + "_stage1"));
        cross(crop + "_stage2", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + crop + "_stage2"));
        cross(crop + "_stage3", new ResourceLocation(Flowerary.MOD_ID, BLOCK_FOLDER + "/" + crop + "_stage3"));
    }
}
