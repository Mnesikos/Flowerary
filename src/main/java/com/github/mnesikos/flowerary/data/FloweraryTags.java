package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
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
        }
    }

    public static class FloweraryItemTags extends ItemTagsProvider {
        public FloweraryItemTags(PackOutput packOutput, CompletableFuture<HolderLookup.Provider> lookupProvider, BlockTagsProvider tagsProvider, @Nullable ExistingFileHelper existingFileHelper) {
            super(packOutput, lookupProvider, tagsProvider.contentsGetter(), Flowerary.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags(HolderLookup.Provider provider) {
        }
    }
}
