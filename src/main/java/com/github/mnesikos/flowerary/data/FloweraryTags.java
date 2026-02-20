package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.DyeColor;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;
import java.util.concurrent.CompletableFuture;

public class FloweraryTags {
    public static class FloweraryBlockTags extends BlockTagsProvider {
        public FloweraryBlockTags(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(output, lookupProvider, Flowerary.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            for (FloweraryColor floweraryColor : FloweraryColor.values()) {
                String color = floweraryColor.getSerializedName();
                tag(BlockTags.SMALL_FLOWERS).add(
                        FloweraryBlocks.ALLIUM.get(color).get(), FloweraryBlocks.ALYSSUM.get(color).get(), FloweraryBlocks.AZURE_BLUET.get(color).get(),
                        FloweraryBlocks.BOUGAINVILLEA.get(color).get(), FloweraryBlocks.BROMELIAD.get(color).get(), FloweraryBlocks.CHICORY.get(color).get(),
                        FloweraryBlocks.CLEMATIS.get(color).get(), FloweraryBlocks.CLOVER.get(color).get(), FloweraryBlocks.CORNFLOWER.get(color).get(),
                        FloweraryBlocks.DAFFODIL.get(color).get(), FloweraryBlocks.DAISY.get(color).get(), FloweraryBlocks.DANDELION.get(color).get(),
                        FloweraryBlocks.DIANTHUS.get(color).get(), FloweraryBlocks.FAIRY_ROSE.get(color).get(), FloweraryBlocks.HIBISCUS.get(color).get(),
                        FloweraryBlocks.HYACINTH.get(color).get(), FloweraryBlocks.JASMINE.get(color).get(), FloweraryBlocks.LANTANAS.get(color).get(),
                        FloweraryBlocks.LILY.get(color).get(), FloweraryBlocks.ORCHID.get(color).get(), FloweraryBlocks.PETALS.get(color).get(),
                        FloweraryBlocks.POPPY.get(color).get(), FloweraryBlocks.POPPIES.get(color).get(), FloweraryBlocks.ROSE.get(color).get(),
                        FloweraryBlocks.ROSE_BUSHLET.get(color).get(), FloweraryBlocks.TORCHFLOWER.get(color).get(), FloweraryBlocks.TULIP.get(color).get(),
                        FloweraryBlocks.WILDFLOWER.get(color).get(), FloweraryBlocks.WITHER_ROSE.get(color).get());
                tag(BlockTags.FLOWER_POTS).add(
                        FloweraryBlocks.POTTED_ALLIUMS.get(color).get(), FloweraryBlocks.POTTED_AZURE_BLUETS.get(color).get(), FloweraryBlocks.POTTED_CORNFLOWERS.get(color).get(),
                        FloweraryBlocks.POTTED_DAFFODILS.get(color).get(), FloweraryBlocks.POTTED_DAISYS.get(color).get(), FloweraryBlocks.POTTED_DANDELIONS.get(color).get(),
                        FloweraryBlocks.POTTED_FAIRY_ROSES.get(color).get(), FloweraryBlocks.POTTED_HYACINTHS.get(color).get(), FloweraryBlocks.POTTED_LILYS.get(color).get(),
                        FloweraryBlocks.POTTED_ORCHIDS.get(color).get(), FloweraryBlocks.POTTED_POPPYS.get(color).get(), FloweraryBlocks.POTTED_ROSES.get(color).get(),
                        FloweraryBlocks.POTTED_TORCHFLOWERS.get(color).get(), FloweraryBlocks.POTTED_TULIPS.get(color).get(), FloweraryBlocks.POTTED_WITHER_ROSES.get(color).get());
                tag(BlockTags.TALL_FLOWERS).add(
                        FloweraryBlocks.BLAZING_STAR.get(color).get(), FloweraryBlocks.FOXGLOVE.get(color).get(), FloweraryBlocks.IMPALA_LILY.get(color).get(),
                        FloweraryBlocks.LAVENDER.get(color).get(), FloweraryBlocks.LILAC.get(color).get(), FloweraryBlocks.PEONY.get(color).get(),
                        FloweraryBlocks.PITCHER_PLANT.get(color).get(), FloweraryBlocks.ROSE_BUSH.get(color).get(), FloweraryBlocks.SUNFLOWER.get(color).get());
                tag(BlockTags.CROPS).add(
                        FloweraryBlocks.ALLIUM_PLANTS.get(color).get(), FloweraryBlocks.ALYSSUM_PLANTS.get(color).get(), FloweraryBlocks.AZURE_BLUET_PLANTS.get(color).get(),
                        FloweraryBlocks.BLAZING_STAR_PLANTS.get(color).get(), FloweraryBlocks.BOUGAINVILLEA_PLANTS.get(color).get(), FloweraryBlocks.BROMELIAD_PLANTS.get(color).get(),
                        FloweraryBlocks.CHICORY_PLANTS.get(color).get(), FloweraryBlocks.CLEMATIS_PLANTS.get(color).get(), FloweraryBlocks.CLOVER_PLANTS.get(color).get(),
                        FloweraryBlocks.CORNFLOWER_PLANTS.get(color).get(), FloweraryBlocks.DAFFODIL_PLANTS.get(color).get(), FloweraryBlocks.DAISY_PLANTS.get(color).get(),
                        FloweraryBlocks.DANDELION_PLANTS.get(color).get(), FloweraryBlocks.DIANTHUS_PLANTS.get(color).get(), FloweraryBlocks.FAIRY_ROSE_PLANTS.get(color).get(),
                        FloweraryBlocks.FOXGLOVE_PLANTS.get(color).get(), FloweraryBlocks.HIBISCUS_PLANTS.get(color).get(), FloweraryBlocks.HYACINTH_PLANTS.get(color).get(),
                        FloweraryBlocks.IMPALA_LILY_PLANTS.get(color).get(), FloweraryBlocks.JASMINE_PLANTS.get(color).get(), FloweraryBlocks.LANTANAS_PLANTS.get(color).get(),
                        FloweraryBlocks.LAVENDER_PLANTS.get(color).get(), FloweraryBlocks.LILAC_PLANTS.get(color).get(), FloweraryBlocks.LILY_PLANTS.get(color).get(),
                        FloweraryBlocks.ORCHID_PLANTS.get(color).get(), FloweraryBlocks.PEONY_PLANTS.get(color).get(), FloweraryBlocks.PETALS_PLANTS.get(color).get(),
                        FloweraryBlocks.PITCHER_PLANT_PLANTS.get(color).get(), FloweraryBlocks.POPPY_PLANTS.get(color).get(), FloweraryBlocks.POPPIES_PLANTS.get(color).get(),
                        FloweraryBlocks.ROSE_PLANTS.get(color).get(), FloweraryBlocks.ROSE_BUSH_PLANTS.get(color).get(), FloweraryBlocks.ROSE_BUSHLET_PLANTS.get(color).get(),
                        FloweraryBlocks.SUNFLOWER_PLANTS.get(color).get(), FloweraryBlocks.TORCHFLOWER_PLANTS.get(color).get(), FloweraryBlocks.TULIP_PLANTS.get(color).get(),
                        FloweraryBlocks.WILDFLOWER_PLANTS.get(color).get(), FloweraryBlocks.WITHER_ROSE_PLANTS.get(color).get());
                tag(BlockTags.MAINTAINS_FARMLAND).add(
                        FloweraryBlocks.ALLIUM_PLANTS.get(color).get(), FloweraryBlocks.ALYSSUM_PLANTS.get(color).get(), FloweraryBlocks.AZURE_BLUET_PLANTS.get(color).get(),
                        FloweraryBlocks.BLAZING_STAR_PLANTS.get(color).get(), FloweraryBlocks.BOUGAINVILLEA_PLANTS.get(color).get(), FloweraryBlocks.BROMELIAD_PLANTS.get(color).get(),
                        FloweraryBlocks.CHICORY_PLANTS.get(color).get(), FloweraryBlocks.CLEMATIS_PLANTS.get(color).get(), FloweraryBlocks.CLOVER_PLANTS.get(color).get(),
                        FloweraryBlocks.CORNFLOWER_PLANTS.get(color).get(), FloweraryBlocks.DAFFODIL_PLANTS.get(color).get(), FloweraryBlocks.DAISY_PLANTS.get(color).get(),
                        FloweraryBlocks.DANDELION_PLANTS.get(color).get(), FloweraryBlocks.DIANTHUS_PLANTS.get(color).get(), FloweraryBlocks.FAIRY_ROSE_PLANTS.get(color).get(),
                        FloweraryBlocks.FOXGLOVE_PLANTS.get(color).get(), FloweraryBlocks.HIBISCUS_PLANTS.get(color).get(), FloweraryBlocks.HYACINTH_PLANTS.get(color).get(),
                        FloweraryBlocks.IMPALA_LILY_PLANTS.get(color).get(), FloweraryBlocks.JASMINE_PLANTS.get(color).get(), FloweraryBlocks.LANTANAS_PLANTS.get(color).get(),
                        FloweraryBlocks.LAVENDER_PLANTS.get(color).get(), FloweraryBlocks.LILAC_PLANTS.get(color).get(), FloweraryBlocks.LILY_PLANTS.get(color).get(),
                        FloweraryBlocks.ORCHID_PLANTS.get(color).get(), FloweraryBlocks.PEONY_PLANTS.get(color).get(), FloweraryBlocks.PETALS_PLANTS.get(color).get(),
                        FloweraryBlocks.PITCHER_PLANT_PLANTS.get(color).get(), FloweraryBlocks.POPPY_PLANTS.get(color).get(), FloweraryBlocks.POPPIES_PLANTS.get(color).get(),
                        FloweraryBlocks.ROSE_PLANTS.get(color).get(), FloweraryBlocks.ROSE_BUSH_PLANTS.get(color).get(), FloweraryBlocks.ROSE_BUSHLET_PLANTS.get(color).get(),
                        FloweraryBlocks.SUNFLOWER_PLANTS.get(color).get(), FloweraryBlocks.TORCHFLOWER_PLANTS.get(color).get(), FloweraryBlocks.TULIP_PLANTS.get(color).get(),
                        FloweraryBlocks.WILDFLOWER_PLANTS.get(color).get(), FloweraryBlocks.WITHER_ROSE_PLANTS.get(color).get());

                tag(BlockTags.create(new ResourceLocation("betterbeekeeping", "spicy_flowers"))).add(
                        FloweraryBlocks.ALLIUM.get(color).get(),
                        FloweraryBlocks.CORNFLOWER.get(color).get(),
                        FloweraryBlocks.PEONY.get(color).get(),
                        FloweraryBlocks.ALYSSUM.get(color).get(),
                        FloweraryBlocks.CHICORY.get(color).get()
                );
                tag(BlockTags.create(new ResourceLocation("betterbeekeeping", "warm_flowers"))).add(
                        FloweraryBlocks.FAIRY_ROSE.get(color).get(),
                        FloweraryBlocks.ROSE.get(color).get(),
                        FloweraryBlocks.ROSE_BUSH.get(color).get(),
                        FloweraryBlocks.ROSE_BUSHLET.get(color).get(),
                        FloweraryBlocks.TULIP.get(color).get(),
                        FloweraryBlocks.BOUGAINVILLEA.get(color).get(),
                        FloweraryBlocks.JASMINE.get(color).get()
                );
                tag(BlockTags.create(new ResourceLocation("betterbeekeeping", "bright_flowers"))).add(
                        FloweraryBlocks.AZURE_BLUET.get(color).get(),
                        FloweraryBlocks.POPPY.get(color).get(),
                        FloweraryBlocks.POPPIES.get(color).get(),
                        FloweraryBlocks.SUNFLOWER.get(color).get(),
                        FloweraryBlocks.TORCHFLOWER.get(color).get(),
                        FloweraryBlocks.BLAZING_STAR.get(color).get(),
                        FloweraryBlocks.BROMELIAD.get(color).get(),
                        FloweraryBlocks.DIANTHUS.get(color).get()
                );
                tag(BlockTags.create(new ResourceLocation("betterbeekeeping", "lively_flowers"))).add(
                        FloweraryBlocks.DAISY.get(color).get(),
                        FloweraryBlocks.LILY.get(color).get(),
                        FloweraryBlocks.PETALS.get(color).get(),
                        FloweraryBlocks.CLOVER.get(color).get(),
                        FloweraryBlocks.LAVENDER.get(color).get(),
                        FloweraryBlocks.HIBISCUS.get(color).get()
                );
                tag(BlockTags.create(new ResourceLocation("betterbeekeeping", "cool_flowers"))).add(
                        FloweraryBlocks.DANDELION.get(color).get(),
                        FloweraryBlocks.LILAC.get(color).get(),
                        FloweraryBlocks.ORCHID.get(color).get(),
                        FloweraryBlocks.PITCHER_PLANT.get(color).get(),
                        FloweraryBlocks.HYACINTH.get(color).get(),
                        FloweraryBlocks.WILDFLOWER.get(color).get()
                );
                tag(BlockTags.create(new ResourceLocation("betterbeekeeping", "strange_flowers"))).add(
                        FloweraryBlocks.WITHER_ROSE.get(color).get(),
                        FloweraryBlocks.FOXGLOVE.get(color).get(),
                        FloweraryBlocks.CLEMATIS.get(color).get(),
                        FloweraryBlocks.DAFFODIL.get(color).get(),
                        FloweraryBlocks.IMPALA_LILY.get(color).get(),
                        FloweraryBlocks.LANTANAS.get(color).get()
                );
                tag(BlockTags.create(new ResourceLocation("flowerpatch", "bonemeal_able_flowers"))).add(
                        FloweraryBlocks.ALLIUM.get(color).get(),
                        FloweraryBlocks.AZURE_BLUET.get(color).get(),
                        FloweraryBlocks.CLOVER.get(color).get(),
                        FloweraryBlocks.CORNFLOWER.get(color).get(),
                        FloweraryBlocks.DAFFODIL.get(color).get(),
                        FloweraryBlocks.DAISY.get(color).get(),
                        FloweraryBlocks.DANDELION.get(color).get(),
                        FloweraryBlocks.DIANTHUS.get(color).get(),
                        FloweraryBlocks.FAIRY_ROSE.get(color).get(),
                        FloweraryBlocks.HYACINTH.get(color).get(),
                        FloweraryBlocks.LILY.get(color).get(),
                        FloweraryBlocks.ORCHID.get(color).get(),
                        FloweraryBlocks.POPPY.get(color).get(),
                        FloweraryBlocks.ROSE.get(color).get(),
                        FloweraryBlocks.TORCHFLOWER.get(color).get(),
                        FloweraryBlocks.TULIP.get(color).get(),
                        FloweraryBlocks.WITHER_ROSE.get(color).get()
                );
                tag(BlockTags.FLOWERS).add(
                        FloweraryBlocks.ALLIUM.get(color).get(),
                        FloweraryBlocks.AZURE_BLUET.get(color).get(),
                        FloweraryBlocks.CLOVER.get(color).get(),
                        FloweraryBlocks.CORNFLOWER.get(color).get(),
                        FloweraryBlocks.DAFFODIL.get(color).get(),
                        FloweraryBlocks.DAISY.get(color).get(),
                        FloweraryBlocks.DANDELION.get(color).get(),
                        FloweraryBlocks.DIANTHUS.get(color).get(),
                        FloweraryBlocks.FAIRY_ROSE.get(color).get(),
                        FloweraryBlocks.HYACINTH.get(color).get(),
                        FloweraryBlocks.LILY.get(color).get(),
                        FloweraryBlocks.ORCHID.get(color).get(),
                        FloweraryBlocks.POPPY.get(color).get(),
                        FloweraryBlocks.ROSE.get(color).get(),
                        FloweraryBlocks.TORCHFLOWER.get(color).get(),
                        FloweraryBlocks.TULIP.get(color).get(),
                        FloweraryBlocks.WITHER_ROSE.get(color).get()
                );
            }
        }
    }

    public static class FloweraryItemTags extends ItemTagsProvider {
        public FloweraryItemTags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider tagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(packOutput, lookupProvider, tagsProvider.contentsGetter(), Flowerary.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
            for (FloweraryColor floweraryColor : FloweraryColor.values()) {
                String color = floweraryColor.getSerializedName();
                tag(ItemTags.SMALL_FLOWERS).add(
                        FloweraryBlocks.ALLIUM.get(color).get().asItem(), FloweraryBlocks.ALYSSUM.get(color).get().asItem(), FloweraryBlocks.AZURE_BLUET.get(color).get().asItem(),
                        FloweraryBlocks.BOUGAINVILLEA.get(color).get().asItem(), FloweraryBlocks.BROMELIAD.get(color).get().asItem(), FloweraryBlocks.CHICORY.get(color).get().asItem(),
                        FloweraryBlocks.CLEMATIS.get(color).get().asItem(), FloweraryBlocks.CLOVER.get(color).get().asItem(), FloweraryBlocks.CORNFLOWER.get(color).get().asItem(),
                        FloweraryBlocks.DAFFODIL.get(color).get().asItem(), FloweraryBlocks.DAISY.get(color).get().asItem(), FloweraryBlocks.DANDELION.get(color).get().asItem(),
                        FloweraryBlocks.DIANTHUS.get(color).get().asItem(), FloweraryBlocks.FAIRY_ROSE.get(color).get().asItem(), FloweraryBlocks.HIBISCUS.get(color).get().asItem(),
                        FloweraryBlocks.HYACINTH.get(color).get().asItem(), FloweraryBlocks.JASMINE.get(color).get().asItem(), FloweraryBlocks.LANTANAS.get(color).get().asItem(),
                        FloweraryBlocks.LILY.get(color).get().asItem(), FloweraryBlocks.ORCHID.get(color).get().asItem(), FloweraryBlocks.PETALS.get(color).get().asItem(),
                        FloweraryBlocks.POPPY.get(color).get().asItem(), FloweraryBlocks.POPPIES.get(color).get().asItem(), FloweraryBlocks.ROSE.get(color).get().asItem(),
                        FloweraryBlocks.ROSE_BUSHLET.get(color).get().asItem(), FloweraryBlocks.TORCHFLOWER.get(color).get().asItem(), FloweraryBlocks.TULIP.get(color).get().asItem(),
                        FloweraryBlocks.WILDFLOWER.get(color).get().asItem(), FloweraryBlocks.WITHER_ROSE.get(color).get().asItem());
                tag(ItemTags.TALL_FLOWERS).add(
                        FloweraryBlocks.BLAZING_STAR.get(color).get().asItem(), FloweraryBlocks.FOXGLOVE.get(color).get().asItem(), FloweraryBlocks.IMPALA_LILY.get(color).get().asItem(),
                        FloweraryBlocks.LAVENDER.get(color).get().asItem(), FloweraryBlocks.LILAC.get(color).get().asItem(), FloweraryBlocks.PEONY.get(color).get().asItem(),
                        FloweraryBlocks.PITCHER_PLANT.get(color).get().asItem(), FloweraryBlocks.ROSE_BUSH.get(color).get().asItem(), FloweraryBlocks.SUNFLOWER.get(color).get().asItem());

                tag(ItemTags.create(new ResourceLocation("flowerary", "seed_jars"))).add(
                        FloweraryItems.ALLIUM_SEEDS.get(color).get(), FloweraryItems.ALYSSUM_SEEDS.get(color).get(), FloweraryItems.AZURE_BLUET_SEEDS.get(color).get(),
                        FloweraryItems.BLAZING_STAR_SEEDS.get(color).get(), FloweraryItems.BOUGAINVILLEA_SEEDS.get(color).get(), FloweraryItems.BROMELIAD_SEEDS.get(color).get(),
                        FloweraryItems.CHICORY_SEEDS.get(color).get(), FloweraryItems.CLEMATIS_SEEDS.get(color).get(), FloweraryItems.CLOVER_SEEDS.get(color).get(),
                        FloweraryItems.CORNFLOWER_SEEDS.get(color).get(), FloweraryItems.DAFFODIL_SEEDS.get(color).get(), FloweraryItems.DAISY_SEEDS.get(color).get(),
                        FloweraryItems.DANDELION_SEEDS.get(color).get(), FloweraryItems.DIANTHUS_SEEDS.get(color).get(), FloweraryItems.FAIRY_ROSE_SEEDS.get(color).get(),
                        FloweraryItems.FOXGLOVE_SEEDS.get(color).get(), FloweraryItems.HIBISCUS_SEEDS.get(color).get(), FloweraryItems.HYACINTH_SEEDS.get(color).get(),
                        FloweraryItems.IMPALA_LILY_SEEDS.get(color).get(), FloweraryItems.JASMINE_SEEDS.get(color).get(), FloweraryItems.LANTANAS_SEEDS.get(color).get(),
                        FloweraryItems.LAVENDER_SEEDS.get(color).get(), FloweraryItems.LILAC_SEEDS.get(color).get(), FloweraryItems.LILY_SEEDS.get(color).get(),
                        FloweraryItems.ORCHID_SEEDS.get(color).get(), FloweraryItems.PEONY_SEEDS.get(color).get(), FloweraryItems.PETALS_SEEDS.get(color).get(),
                        FloweraryItems.PITCHER_PLANT_SEEDS.get(color).get(), FloweraryItems.POPPY_SEEDS.get(color).get(), FloweraryItems.POPPIES_SEEDS.get(color).get(),
                        FloweraryItems.ROSE_SEEDS.get(color).get(), FloweraryItems.ROSE_BUSH_SEEDS.get(color).get(), FloweraryItems.ROSE_BUSHLET_SEEDS.get(color).get(),
                        FloweraryItems.SUNFLOWER_SEEDS.get(color).get(), FloweraryItems.TORCHFLOWER_SEEDS.get(color).get(), FloweraryItems.TULIP_SEEDS.get(color).get(),
                        FloweraryItems.WILDFLOWER_SEEDS.get(color).get(), FloweraryItems.WITHER_ROSE_SEEDS.get(color).get()
                );

                tag(ItemTags.create(new ResourceLocation("flowerary", "pollen_jars"))).add(
                        FloweraryItems.DANDELION_POLLEN_JAR.get(), FloweraryItems.POPPY_POLLEN_JAR.get(), FloweraryItems.BLUE_ORCHID_POLLEN_JAR.get(),
                        FloweraryItems.ALLIUM_POLLEN_JAR.get(), FloweraryItems.AZURE_BLUET_POLLEN_JAR.get(), FloweraryItems.RED_TULIP_POLLEN_JAR.get(),
                        FloweraryItems.ORANGE_TULIP_POLLEN_JAR.get(), FloweraryItems.WHITE_TULIP_POLLEN_JAR.get(), FloweraryItems.PINK_TULIP_POLLEN_JAR.get(),
                        FloweraryItems.OXEYE_DAISY_POLLEN_JAR.get(), FloweraryItems.CORNFLOWER_POLLEN_JAR.get(), FloweraryItems.LILY_OF_THE_VALLEY_POLLEN_JAR.get(),
                        FloweraryItems.TORCHFLOWER_POLLEN_JAR.get(), FloweraryItems.WITHER_ROSE_POLLEN_JAR.get(), FloweraryItems.PINK_PETALS_POLLEN_JAR.get(),
                        FloweraryItems.SUNFLOWER_POLLEN_JAR.get(), FloweraryItems.LILAC_POLLEN_JAR.get(), FloweraryItems.ROSE_BUSH_POLLEN_JAR.get(),
                        FloweraryItems.PEONY_POLLEN_JAR.get(), FloweraryItems.PITCHER_PLANT_POLLEN_JAR.get()
                );

                DyeColor dyeColor = floweraryColor.getDyeColor();
                tag(ItemTags.create(new ResourceLocation("flowerary", dyeColor.getName() + "_flowers"))).add(
                        FloweraryBlocks.ALLIUM.get(color).get().asItem(), FloweraryBlocks.ALYSSUM.get(color).get().asItem(), FloweraryBlocks.AZURE_BLUET.get(color).get().asItem(),
                        FloweraryBlocks.BLAZING_STAR.get(color).get().asItem(), FloweraryBlocks.BOUGAINVILLEA.get(color).get().asItem(), FloweraryBlocks.BROMELIAD.get(color).get().asItem(),
                        FloweraryBlocks.CHICORY.get(color).get().asItem(), FloweraryBlocks.CLEMATIS.get(color).get().asItem(), FloweraryBlocks.CLOVER.get(color).get().asItem(),
                        FloweraryBlocks.CORNFLOWER.get(color).get().asItem(), FloweraryBlocks.DAFFODIL.get(color).get().asItem(), FloweraryBlocks.DAISY.get(color).get().asItem(),
                        FloweraryBlocks.DANDELION.get(color).get().asItem(), FloweraryBlocks.DIANTHUS.get(color).get().asItem(), FloweraryBlocks.FAIRY_ROSE.get(color).get().asItem(),
                        FloweraryBlocks.FOXGLOVE.get(color).get().asItem(), FloweraryBlocks.HIBISCUS.get(color).get().asItem(), FloweraryBlocks.HYACINTH.get(color).get().asItem(),
                        FloweraryBlocks.IMPALA_LILY.get(color).get().asItem(), FloweraryBlocks.JASMINE.get(color).get().asItem(), FloweraryBlocks.LANTANAS.get(color).get().asItem(),
                        FloweraryBlocks.LAVENDER.get(color).get().asItem(), FloweraryBlocks.LILAC.get(color).get().asItem(), FloweraryBlocks.LILY.get(color).get().asItem(),
                        FloweraryBlocks.ORCHID.get(color).get().asItem(), FloweraryBlocks.PEONY.get(color).get().asItem(), FloweraryBlocks.PETALS.get(color).get().asItem(),
                        FloweraryBlocks.PITCHER_PLANT.get(color).get().asItem(), FloweraryBlocks.POPPY.get(color).get().asItem(), FloweraryBlocks.POPPIES.get(color).get().asItem(),
                        FloweraryBlocks.ROSE.get(color).get().asItem(), FloweraryBlocks.ROSE_BUSH.get(color).get().asItem(), FloweraryBlocks.ROSE_BUSHLET.get(color).get().asItem(),
                        FloweraryBlocks.SUNFLOWER.get(color).get().asItem(), FloweraryBlocks.TORCHFLOWER.get(color).get().asItem(), FloweraryBlocks.TULIP.get(color).get().asItem(),
                        FloweraryBlocks.WILDFLOWER.get(color).get().asItem(), FloweraryBlocks.WITHER_ROSE.get(color).get().asItem()
                );
            }
        }
    }
}
