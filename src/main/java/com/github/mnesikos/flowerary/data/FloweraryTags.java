package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import net.minecraft.data.BlockTagsProvider;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.ItemTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

import javax.annotation.Nullable;

public class FloweraryTags {
    public static class FloweraryBlockTags extends BlockTagsProvider {
        public FloweraryBlockTags(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
            super(generator, Flowerary.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags() {
        }
    }

    public static class FloweraryItemTags extends ItemTagsProvider {
        public FloweraryItemTags(DataGenerator generator, @Nullable ExistingFileHelper existingFileHelper) {
            super(generator, new FloweraryBlockTags(generator, existingFileHelper), Flowerary.MOD_ID, existingFileHelper);
        }

        @Override
        protected void addTags() {
        }
    }
}
