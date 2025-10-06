package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
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
            }
        }
    }
}
