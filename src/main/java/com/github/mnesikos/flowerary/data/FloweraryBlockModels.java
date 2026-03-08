package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.compat.flowerpatch.FloweraryPatchBlocks;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.mrbysco.flowerpatch.block.PatchBlock;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.BlockModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class FloweraryBlockModels extends BlockModelProvider {
    public FloweraryBlockModels(PackOutput packOutput, ExistingFileHelper existingFileHelper) {
        super(packOutput, Flowerary.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            cross(color + "_allium", modLoc(BLOCK_FOLDER + "/" + color + "_allium"));
            alyssum(color + "_alyssum", modLoc(BLOCK_FOLDER + "/" + color + "_alyssum"));
            cross(color + "_azure_bluet", modLoc(BLOCK_FOLDER + "/" + color + "_azure_bluet"));
            doubleCross(color + "_blazing_star", modLoc(BLOCK_FOLDER + "/" + color + "_blazing_star"));
            vine(color + "_bougainvillea", modLoc(BLOCK_FOLDER + "/" + color + "_bougainvillea"));
            cross(color + "_bromeliad", modLoc(BLOCK_FOLDER + "/" + color + "_bromeliad"));
            cross(color + "_chicory", modLoc(BLOCK_FOLDER + "/" + color + "_chicory"));
            vine(color + "_clematis", modLoc(BLOCK_FOLDER + "/" + color + "_clematis"));
            clover(color + "_clover", modLoc(BLOCK_FOLDER + "/" + color + "_clover"));
            cross(color + "_cornflower", modLoc(BLOCK_FOLDER + "/" + color + "_cornflower"));
            cross(color + "_daffodil", modLoc(BLOCK_FOLDER + "/" + color + "_daffodil"));
            cross(color + "_daisy", modLoc(BLOCK_FOLDER + "/" + color + "_daisy"));
            cross(color + "_dandelion", modLoc(BLOCK_FOLDER + "/" + color + "_dandelion"));
            cross(color + "_dianthus", modLoc(BLOCK_FOLDER + "/" + color + "_dianthus"));
            cross(color + "_fairy_rose", modLoc(BLOCK_FOLDER + "/" + color + "_fairy_rose"));
            doubleCross(color + "_foxglove", modLoc(BLOCK_FOLDER + "/" + color + "_foxglove"));
            cross(color + "_hibiscus", modLoc(BLOCK_FOLDER + "/" + color + "_hibiscus"));
            cross(color + "_hyacinth", modLoc(BLOCK_FOLDER + "/" + color + "_hyacinth"));
            doubleCross(color + "_impala_lily", modLoc(BLOCK_FOLDER + "/" + color + "_impala_lily"));
            vine(color + "_jasmine", modLoc(BLOCK_FOLDER + "/" + color + "_jasmine"));
            cross(color + "_lantanas", modLoc(BLOCK_FOLDER + "/" + color + "_lantanas"));
            doubleCross(color + "_lavender", modLoc(BLOCK_FOLDER + "/" + color + "_lavender"));
            doubleCross(color + "_lilac", modLoc(BLOCK_FOLDER + "/" + color + "_lilac"));
            cross(color + "_lily", modLoc(BLOCK_FOLDER + "/" + color + "_lily"));
            cross(color + "_orchid", modLoc(BLOCK_FOLDER + "/" + color + "_orchid"));
            doubleCross(color + "_peony", modLoc(BLOCK_FOLDER + "/" + color + "_peony"));
            petals(color + "_petals", modLoc(BLOCK_FOLDER + "/" + color + "_petals"));
            pitcher(color + "_pitcher_plant", modLoc(BLOCK_FOLDER + "/" + color + "_pitcher_plant"));
            cross(color + "_poppy", modLoc(BLOCK_FOLDER + "/" + color + "_poppy"));
            cross(color + "_poppies", modLoc(BLOCK_FOLDER + "/" + color + "_poppies"));
            cross(color + "_rose", modLoc(BLOCK_FOLDER + "/" + color + "_rose"));
            doubleCross(color + "_rose_bush", modLoc(BLOCK_FOLDER + "/" + color + "_rose_bush"));
            cross(color + "_rose_bushlet", modLoc(BLOCK_FOLDER + "/" + color + "_rose_bushlet"));
            sunflower(color + "_sunflower", modLoc(BLOCK_FOLDER + "/" + color + "_sunflower"));
            cross(color + "_torchflower", modLoc(BLOCK_FOLDER + "/" + color + "_torchflower"));
            cross(color + "_tulip", modLoc(BLOCK_FOLDER + "/" + color + "_tulip"));
            cross(color + "_wildflower", modLoc(BLOCK_FOLDER + "/" + color + "_wildflower"));
            cross(color + "_wither_rose", modLoc(BLOCK_FOLDER + "/" + color + "_wither_rose"));

            pottedCross("potted_" + color + "_allium", modLoc(BLOCK_FOLDER + "/" + color + "_allium"));
            pottedCross("potted_" + color + "_azure_bluet", modLoc(BLOCK_FOLDER + "/" + color + "_azure_bluet"));
            pottedCross("potted_" + color + "_cornflower", modLoc(BLOCK_FOLDER + "/" + color + "_cornflower"));
            pottedCross("potted_" + color + "_daffodil", modLoc(BLOCK_FOLDER + "/" + color + "_daffodil"));
            pottedCross("potted_" + color + "_daisy", modLoc(BLOCK_FOLDER + "/" + color + "_daisy"));
            pottedCross("potted_" + color + "_dandelion", modLoc(BLOCK_FOLDER + "/" + color + "_dandelion"));
            pottedCross("potted_" + color + "_fairy_rose", modLoc(BLOCK_FOLDER + "/" + color + "_fairy_rose"));
            pottedCross("potted_" + color + "_hyacinth", modLoc(BLOCK_FOLDER + "/" + color + "_hyacinth"));
            pottedCross("potted_" + color + "_lily", modLoc(BLOCK_FOLDER + "/" + color + "_lily"));
            pottedCross("potted_" + color + "_orchid", modLoc(BLOCK_FOLDER + "/" + color + "_orchid"));
            pottedCross("potted_" + color + "_poppy", modLoc(BLOCK_FOLDER + "/" + color + "_poppy"));
            pottedCross("potted_" + color + "_rose", modLoc(BLOCK_FOLDER + "/" + color + "_rose"));
            pottedCross("potted_" + color + "_torchflower", modLoc(BLOCK_FOLDER + "/" + color + "_torchflower"));
            pottedCross("potted_" + color + "_tulip", modLoc(BLOCK_FOLDER + "/" + color + "_tulip"));
            pottedCross("potted_" + color + "_wither_rose", modLoc(BLOCK_FOLDER + "/" + color + "_wither_rose"));
        }

        plant("allium");
        alyssumPlant("alyssum");
        plant("azure_bluet");
        doublePlant("blazing_star");
        vinePlant("bougainvillea");
        plant("bromeliad");
        plant("chicory");
        vinePlant("clematis");
        //clover
        plant("cornflower");
        plant("daffodil");
        plant("daisy");
        plant("dandelion");
        plant("dianthus");
        plant("fairy_rose");
        doublePlant("foxglove");
        plant("hibiscus");
        plant("hyacinth");
        doublePlant("impala_lily");
        vinePlant("jasmine");
        plant("lantanas");
        doublePlant("lavender");
        doublePlant("lilac");
        plant("lily");
        plant("orchid");
        doublePlant("peony");
        petalsPlant("petals");
//        pitcherPlant("pitcher_plant");
        plant("poppy");
        plant("poppies");
        plant("rose");
        doublePlant("rose_bush");
        plant("rose_bushlet");
        sunflowerPlant("sunflower");
//        plant("torchflower");
        plant("tulip");
        plant("wildflower");
        plant("wither_rose");

        if (ModList.get().isLoaded("flowerpatch")) {
            for (RegistryObject<Block> registryObject : FloweraryPatchBlocks.REGISTRAR.getEntries()) {
                if (registryObject.get() instanceof PatchBlock) {
                    crossPatchBlock(registryObject.get());
                }
            }
        }

        if (ModList.get().isLoaded("serene_shrubbery")) {
            for (FloweraryColor floweraryColor : FloweraryColor.values()) {
                String color = floweraryColor.getSerializedName();
                sereneBlock(color + "_butterfly_bush", modLoc(BLOCK_FOLDER + "/serene_shrubbery/" + color + "_butterfly_bush"), "butterfly_bush");
                sereneBlock(color + "_hydrangea", modLoc(BLOCK_FOLDER + "/serene_shrubbery/" + color + "_hydrangea"), "hydrangea");
                sereneBlock(color + "_darkleaf_hydrangea", modLoc(BLOCK_FOLDER + "/serene_shrubbery/" + color + "_darkleaf_hydrangea"), "hydrangea");
                sereneBlock(color + "_pansies", modLoc(BLOCK_FOLDER + "/serene_shrubbery/" + color + "_pansies"), "pansies");
            }
        }
    }

    private void crossPatchBlock(Block block) {
        patchBlock(block, 2);
        patchBlock(block, 3);
        patchBlock(block, 4);
    }

    private void patchBlock(Block block, int flowers) {
        String path = ForgeRegistries.BLOCKS.getKey(block).getPath() + "_" + flowers;
        ResourceLocation patchDelegate = ForgeRegistries.BLOCKS.getKey(((PatchBlock) block).getPatchDelegate().get());
        singleTexture(path, new ResourceLocation("flowerpatch",BLOCK_FOLDER + "/patch" + flowers),
                "cross", new ResourceLocation(patchDelegate.getNamespace(), BLOCK_FOLDER + "/" + patchDelegate.getPath())).renderType("cutout");
    }

    public void sereneBlock(String name, ResourceLocation location, String parent) {
        withExistingParent(name, modLoc(BLOCK_FOLDER + "/serene_shrubbery/" + parent))
                .texture("all", location)
                .texture("particle", location)
                .texture("0", location);
    }

    public void doubleCross(String name, ResourceLocation cross) {
        cross(name + "_top", new ResourceLocation(cross.getNamespace(), cross.getPath() + "_top"));
        cross(name + "_bottom", new ResourceLocation(cross.getNamespace(), cross.getPath() + "_bottom"));
    }

    public void clover(String name, ResourceLocation clover) {
        singleTexture(name, modLoc(BLOCK_FOLDER + "/flower_carpet"), "1", clover);
    }

    public void alyssum(String name, ResourceLocation alyssum) {
        singleTexture(name, modLoc(BLOCK_FOLDER + "/alyssum"), "1", alyssum);
    }

    public void petals(String name, ResourceLocation petals) {
        singleTexture(name + "_1", ResourceLocation.parse(BLOCK_FOLDER + "/pink_petals_1"), "flowerbed", petals);
        singleTexture(name + "_2", ResourceLocation.parse(BLOCK_FOLDER + "/pink_petals_2"), "flowerbed", petals);
        singleTexture(name + "_3", ResourceLocation.parse(BLOCK_FOLDER + "/pink_petals_3"), "flowerbed", petals);
        singleTexture(name + "_4", ResourceLocation.parse(BLOCK_FOLDER + "/pink_petals_4"), "flowerbed", petals);
        withExistingParent(name, modLoc(BLOCK_FOLDER + "/petals")).texture("stem", modLoc(BLOCK_FOLDER + "/petals_stage3_stem")).texture("flowerbed", petals);
    }

    public void pitcher(String name, ResourceLocation pitcher) {
        singleTexture(name + "_top", new ResourceLocation(BLOCK_FOLDER + "/pitcher_plant_top"), "top", new ResourceLocation(pitcher.getNamespace(), pitcher.getPath() + "_top"));
        singleTexture(name + "_bottom", new ResourceLocation(BLOCK_FOLDER + "/pitcher_plant_bottom"), "bottom", new ResourceLocation(pitcher.getNamespace(), pitcher.getPath() + "_bottom"));
    }

    public void vine(String name, ResourceLocation vine) {
        singleTexture(name + "_1", modLoc(BLOCK_FOLDER + "/vine_1"), "vine", vine);
        singleTexture(name + "_1u", modLoc(BLOCK_FOLDER + "/vine_1u"), "vine", vine);
        singleTexture(name + "_2", modLoc(BLOCK_FOLDER + "/vine_2"), "vine", vine);
        singleTexture(name + "_2_opposite", modLoc(BLOCK_FOLDER + "/vine_2_opposite"), "vine", vine);
        singleTexture(name + "_2u", modLoc(BLOCK_FOLDER + "/vine_2u"), "vine", vine);
        singleTexture(name + "_2u_opposite", modLoc(BLOCK_FOLDER + "/vine_2u_opposite"), "vine", vine);
        singleTexture(name + "_3", modLoc(BLOCK_FOLDER + "/vine_3"), "vine", vine);
        singleTexture(name + "_3u", modLoc(BLOCK_FOLDER + "/vine_3u"), "vine", vine);
        singleTexture(name + "_4", modLoc(BLOCK_FOLDER + "/vine_4"), "vine", vine);
        singleTexture(name + "_4u", modLoc(BLOCK_FOLDER + "/vine_4u"), "vine", vine);
        singleTexture(name + "_u", modLoc(BLOCK_FOLDER + "/vine_u"), "vine", vine);
        singleTexture(name, modLoc(BLOCK_FOLDER + "/vine_plant"), "vine", vine);
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

    public void vinePlant(String crop) {
        singleTexture(crop + "_stage0", modLoc(BLOCK_FOLDER + "/" + "vine_plant_stage0"), "vine", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0"));
        singleTexture(crop + "_stage1", modLoc(BLOCK_FOLDER + "/" + "vine_plant_stage1"), "vine", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1"));
        singleTexture(crop + "_stage2", modLoc(BLOCK_FOLDER + "/" + "vine_plant_stage2"), "vine", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2"));
        singleTexture(crop + "_stage3", modLoc(BLOCK_FOLDER + "/" + "vine_plant_stage3"), "vine", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3"));
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

    public void alyssumPlant(String crop) {
        singleTexture(crop + "_stage0", modLoc(BLOCK_FOLDER + "/alyssum"), "1", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0"));
        singleTexture(crop + "_stage1", modLoc(BLOCK_FOLDER + "/alyssum"), "1", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1"));
        singleTexture(crop + "_stage2", modLoc(BLOCK_FOLDER + "/alyssum"), "1", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2"));
        singleTexture(crop + "_stage3", modLoc(BLOCK_FOLDER + "/alyssum"), "1", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3"));
    }

    public void petalsPlant(String crop) {
        withExistingParent(crop + "_stage0", modLoc(BLOCK_FOLDER + "/petals")).texture("stem", modLoc(BLOCK_FOLDER + "/petals_stage0_stem")).texture("flowerbed", modLoc(BLOCK_FOLDER + "/petals_stage0"));
        withExistingParent(crop + "_stage1", modLoc(BLOCK_FOLDER + "/petals")).texture("stem", modLoc(BLOCK_FOLDER + "/petals_stage1_stem")).texture("flowerbed", modLoc(BLOCK_FOLDER + "/petals_stage0"));
        withExistingParent(crop + "_stage2", modLoc(BLOCK_FOLDER + "/petals")).texture("stem", modLoc(BLOCK_FOLDER + "/petals_stage2_stem")).texture("flowerbed", modLoc(BLOCK_FOLDER + "/petals_stage2"));
        withExistingParent(crop + "_stage3", modLoc(BLOCK_FOLDER + "/petals")).texture("stem", modLoc(BLOCK_FOLDER + "/petals_stage3_stem")).texture("flowerbed", modLoc(BLOCK_FOLDER + "/petals_stage3"));
    }

    public void sunflowerPlant(String crop) {
        singleTexture(crop + "_stage0_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "cross", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_bottom"));
        singleTexture(crop + "_stage1_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "cross", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_bottom"));
        singleTexture(crop + "_stage2_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "cross", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_bottom"));
        singleTexture(crop + "_stage3_bottom", mcLoc(BLOCK_FOLDER + "/sunflower_bottom"), "cross", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_bottom"));
        withExistingParent(crop + "_stage0_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"))
                .texture("cross", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_top"))
                .texture("back", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_back"))
                .texture("front", modLoc(BLOCK_FOLDER + "/" + crop + "_stage0_front"));
        withExistingParent(crop + "_stage1_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"))
                .texture("cross", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_top"))
                .texture("back", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_back"))
                .texture("front", modLoc(BLOCK_FOLDER + "/" + crop + "_stage1_front"));
        withExistingParent(crop + "_stage2_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"))
                .texture("cross", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_top"))
                .texture("back", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_back"))
                .texture("front", modLoc(BLOCK_FOLDER + "/" + crop + "_stage2_front"));
        withExistingParent(crop + "_stage3_top", mcLoc(BLOCK_FOLDER + "/sunflower_top"))
                .texture("cross", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_top"))
                .texture("back", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_back"))
                .texture("front", modLoc(BLOCK_FOLDER + "/" + crop + "_stage3_front"));
    }
}
