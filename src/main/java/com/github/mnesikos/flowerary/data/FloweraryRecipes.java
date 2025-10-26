package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.DyeItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.common.Tags;

import java.util.function.Consumer;

public class FloweraryRecipes extends RecipeProvider {
    public FloweraryRecipes(PackOutput packOutput) {
        super(packOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> consumer) {
        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, FloweraryItems.EMPTY_POLLEN_JAR.get())
                .pattern("g g")
                .pattern(" g ")
                .define('g', Tags.Items.GLASS_PANES)
                .unlockedBy("has_glass_pane", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(Tags.Items.GLASS_PANES).build()))
                .save(consumer);

        emptyPollenJarRecipe(consumer, ItemTags.create(new ResourceLocation("flowerary", "pollen_jars")));
        emptyPollenJarRecipe(consumer, ItemTags.create(new ResourceLocation("flowerary", "seed_jars")));

        for (DyeColor dyeColor : DyeColor.values()) {
            DyeItem dyeItem = DyeItem.byColor(dyeColor);
            TagKey<Item> flowerTag = ItemTags.create(new ResourceLocation("flowerary", dyeColor.getName() + "_flowers"));

            ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, dyeItem).requires(flowerTag)
                    .group(dyeItem.getDyeColor().getSerializedName() + "_dye")
                    .unlockedBy("has_flower", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(flowerTag).build()))
                    .save(consumer, flowerTag.location().withSuffix("_dye"));
        }
    }

    public static void emptyPollenJarRecipe(Consumer<FinishedRecipe> consumer, TagKey<Item> pollenJar) {
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, FloweraryItems.EMPTY_POLLEN_JAR.get()).requires(pollenJar)
                .unlockedBy("has_pollen", InventoryChangeTrigger.TriggerInstance.hasItems(ItemPredicate.Builder.item().of(pollenJar).build()))
                .save(consumer, pollenJar.location().withPrefix("empty_"));
    }
}
