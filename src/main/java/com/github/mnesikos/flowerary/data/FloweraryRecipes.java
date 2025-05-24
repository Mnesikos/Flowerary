package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeCategory;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapelessRecipeBuilder;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.ItemLike;

import java.util.function.Consumer;

public class FloweraryRecipes extends RecipeProvider {
    public FloweraryRecipes(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        emptyPollenJarRecipe(consumer, FloweraryItems.DANDELION_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.POPPY_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.BLUE_ORCHID_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.ALLIUM_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.AZURE_BLUET_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.RED_TULIP_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.ORANGE_TULIP_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.WHITE_TULIP_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.PINK_TULIP_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.OXEYE_DAISY_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.CORNFLOWER_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.LILY_OF_THE_VALLEY_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.TORCHFLOWER_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.WITHER_ROSE_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.PINK_PETALS_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.SUNFLOWER_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.LILAC_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.ROSE_BUSH_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.PEONY_POLLEN_JAR.get());
        emptyPollenJarRecipe(consumer, FloweraryItems.PITCHER_PLANT_POLLEN_JAR.get());

        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            DyeColor dyeColor = floweraryColor.getDyeColor();
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.ALLIUM.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.ALYSSUM.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.AZURE_BLUET.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.BLAZING_STAR.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.BOUGAINVILLEA.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.BROMELIAD.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.CHICORY.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.CLEMATIS.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.CLOVER.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.CORNFLOWER.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.DAFFODIL.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.DAISY.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.DANDELION.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.DIANTHUS.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.FAIRY_ROSE.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.FOXGLOVE.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.HIBISCUS.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.HYACINTH.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.IMPALA_LILY.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.JASMINE.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.LANTANAS.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.LAVENDER.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.LILAC.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.LILY.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.ORCHID.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.PEONY.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.PETALS.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.PITCHER_PLANT.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.POPPY.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.POPPIES.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.ROSE.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.ROSE_BUSH.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.ROSE_BUSHLET.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.SUNFLOWER.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.TORCHFLOWER.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.TULIP.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.WILDFLOWER.get(color).get());
            flowerToDyeRecipe(consumer, DyeItem.byColor(dyeColor), FloweraryBlocks.WITHER_ROSE.get(color).get());
        }
    }

    public static void flowerToDyeRecipe(Consumer<FinishedRecipe> consumer, DyeItem dye, ItemLike flower) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dye).requires(flower)
                .group(dye.getDyeColor().getSerializedName() + "_dye")
                .unlockedBy("has_flower", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(flower).build()))
                .save(consumer, BuiltInRegistries.ITEM.getKey(flower.asItem()).withSuffix("_dye"));
    }

    public static void emptyPollenJarRecipe(Consumer<FinishedRecipe> consumer, ItemLike pollenJar) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, FloweraryItems.EMPTY_POLLEN_JAR.get()).requires(pollenJar)
                .unlockedBy("has_pollen", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(pollenJar).build()))
                .save(consumer, "empty_" + BuiltInRegistries.ITEM.getKey(pollenJar.asItem()));
    }
}
