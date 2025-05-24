package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.minecraft.advancements.critereon.BlockPredicate;
import net.minecraft.advancements.critereon.LocationPredicate;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.core.BlockPos;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LocationCheck;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemRandomChanceCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Collectors;

public class FloweraryLootTables extends VanillaBlockLoot {
    @Override
    protected void generate() {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            dropSelf(FloweraryBlocks.ALLIUM.get(color).get());
            dropSelf(FloweraryBlocks.ALYSSUM.get(color).get());
            dropSelf(FloweraryBlocks.AZURE_BLUET.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.BLAZING_STAR.get(color).get());
            dropSelf(FloweraryBlocks.BOUGAINVILLEA.get(color).get());
            dropSelf(FloweraryBlocks.BROMELIAD.get(color).get());
            dropSelf(FloweraryBlocks.CHICORY.get(color).get());
            dropSelf(FloweraryBlocks.CLEMATIS.get(color).get());
            dropSelf(FloweraryBlocks.CLOVER.get(color).get());
            dropSelf(FloweraryBlocks.CORNFLOWER.get(color).get());
            dropSelf(FloweraryBlocks.DAFFODIL.get(color).get());
            dropSelf(FloweraryBlocks.DAISY.get(color).get());
            dropSelf(FloweraryBlocks.DANDELION.get(color).get());
            dropSelf(FloweraryBlocks.DIANTHUS.get(color).get());
            dropSelf(FloweraryBlocks.FAIRY_ROSE.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.FOXGLOVE.get(color).get());
            dropSelf(FloweraryBlocks.HIBISCUS.get(color).get());
            dropSelf(FloweraryBlocks.HYACINTH.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.IMPALA_LILY.get(color).get());
            dropSelf(FloweraryBlocks.JASMINE.get(color).get());
            dropSelf(FloweraryBlocks.LANTANAS.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.LAVENDER.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.LILAC.get(color).get());
            dropSelf(FloweraryBlocks.LILY.get(color).get());
            dropSelf(FloweraryBlocks.ORCHID.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.PEONY.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.PETALS.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.PITCHER_PLANT.get(color).get());
            dropSelf(FloweraryBlocks.POPPY.get(color).get());
            dropSelf(FloweraryBlocks.POPPIES.get(color).get());
            dropSelf(FloweraryBlocks.ROSE.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.ROSE_BUSH.get(color).get());
            dropSelf(FloweraryBlocks.ROSE_BUSHLET.get(color).get());
            dropSelfDoubleTall(FloweraryBlocks.SUNFLOWER.get(color).get());
            dropSelf(FloweraryBlocks.TORCHFLOWER.get(color).get());
            dropSelf(FloweraryBlocks.TULIP.get(color).get());
            dropSelf(FloweraryBlocks.WILDFLOWER.get(color).get());
            dropSelf(FloweraryBlocks.WITHER_ROSE.get(color).get());

            dropPottedContents(FloweraryBlocks.POTTED_ALLIUMS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_AZURE_BLUETS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_CORNFLOWERS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_DAFFODILS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_DAISYS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_DANDELIONS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_FAIRY_ROSES.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_HYACINTHS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_LILYS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_ORCHIDS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_POPPYS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_ROSES.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_TORCHFLOWERS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_TULIPS.get(color).get());
            dropPottedContents(FloweraryBlocks.POTTED_WITHER_ROSES.get(color).get());

            dropFlowerCrop(FloweraryBlocks.ALLIUM_PLANTS.get(color).get(), FloweraryBlocks.ALLIUM.get(color).get().asItem(), FloweraryItems.ALLIUM_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.ALYSSUM_PLANTS.get(color).get(), FloweraryBlocks.ALYSSUM.get(color).get().asItem(), FloweraryItems.ALYSSUM_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.AZURE_BLUET_PLANTS.get(color).get(), FloweraryBlocks.AZURE_BLUET.get(color).get().asItem(), FloweraryItems.AZURE_BLUET_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.BLAZING_STAR_PLANTS.get(color).get(), FloweraryBlocks.BLAZING_STAR.get(color).get().asItem(), FloweraryItems.BLAZING_STAR_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.BOUGAINVILLEA_PLANTS.get(color).get(), FloweraryBlocks.BOUGAINVILLEA.get(color).get().asItem(), FloweraryItems.BOUGAINVILLEA_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.BROMELIAD_PLANTS.get(color).get(), FloweraryBlocks.BROMELIAD.get(color).get().asItem(), FloweraryItems.BROMELIAD_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.CHICORY_PLANTS.get(color).get(), FloweraryBlocks.CHICORY.get(color).get().asItem(), FloweraryItems.CHICORY_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.CLEMATIS_PLANTS.get(color).get(), FloweraryBlocks.CLEMATIS.get(color).get().asItem(), FloweraryItems.CLEMATIS_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.CLOVER_PLANTS.get(color).get(), FloweraryBlocks.CLOVER.get(color).get().asItem(), FloweraryItems.CLOVER_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.CORNFLOWER_PLANTS.get(color).get(), FloweraryBlocks.CORNFLOWER.get(color).get().asItem(), FloweraryItems.CORNFLOWER_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.DAFFODIL_PLANTS.get(color).get(), FloweraryBlocks.DAFFODIL.get(color).get().asItem(), FloweraryItems.DAFFODIL_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.DAISY_PLANTS.get(color).get(), FloweraryBlocks.DAISY.get(color).get().asItem(), FloweraryItems.DAISY_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.DANDELION_PLANTS.get(color).get(), FloweraryBlocks.DANDELION.get(color).get().asItem(), FloweraryItems.DANDELION_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.DIANTHUS_PLANTS.get(color).get(), FloweraryBlocks.DIANTHUS.get(color).get().asItem(), FloweraryItems.DIANTHUS_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.FAIRY_ROSE_PLANTS.get(color).get(), FloweraryBlocks.FAIRY_ROSE.get(color).get().asItem(), FloweraryItems.FAIRY_ROSE_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.FOXGLOVE_PLANTS.get(color).get(), FloweraryBlocks.FOXGLOVE.get(color).get().asItem(), FloweraryItems.FOXGLOVE_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.HIBISCUS_PLANTS.get(color).get(), FloweraryBlocks.HIBISCUS.get(color).get().asItem(), FloweraryItems.HIBISCUS_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.HYACINTH_PLANTS.get(color).get(), FloweraryBlocks.HYACINTH.get(color).get().asItem(), FloweraryItems.HYACINTH_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.IMPALA_LILY_PLANTS.get(color).get(), FloweraryBlocks.IMPALA_LILY.get(color).get().asItem(), FloweraryItems.IMPALA_LILY_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.JASMINE_PLANTS.get(color).get(), FloweraryBlocks.JASMINE.get(color).get().asItem(), FloweraryItems.JASMINE_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.LANTANAS_PLANTS.get(color).get(), FloweraryBlocks.LANTANAS.get(color).get().asItem(), FloweraryItems.LANTANAS_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.LAVENDER_PLANTS.get(color).get(), FloweraryBlocks.LAVENDER.get(color).get().asItem(), FloweraryItems.LAVENDER_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.LILAC_PLANTS.get(color).get(), FloweraryBlocks.LILAC.get(color).get().asItem(), FloweraryItems.LILAC_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.LILY_PLANTS.get(color).get(), FloweraryBlocks.LILY.get(color).get().asItem(), FloweraryItems.LILY_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.ORCHID_PLANTS.get(color).get(), FloweraryBlocks.ORCHID.get(color).get().asItem(), FloweraryItems.ORCHID_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.PEONY_PLANTS.get(color).get(), FloweraryBlocks.PEONY.get(color).get().asItem(), FloweraryItems.PEONY_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.PETALS_PLANTS.get(color).get(), FloweraryBlocks.PETALS.get(color).get().asItem(), FloweraryItems.PETALS_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.PITCHER_PLANT_PLANTS.get(color).get(), FloweraryBlocks.PITCHER_PLANT.get(color).get().asItem(), FloweraryItems.PITCHER_PLANT_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.POPPY_PLANTS.get(color).get(), FloweraryBlocks.POPPY.get(color).get().asItem(), FloweraryItems.POPPY_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.POPPIES_PLANTS.get(color).get(), FloweraryBlocks.POPPIES.get(color).get().asItem(), FloweraryItems.POPPIES_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.ROSE_PLANTS.get(color).get(), FloweraryBlocks.ROSE.get(color).get().asItem(), FloweraryItems.ROSE_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.ROSE_BUSH_PLANTS.get(color).get(), FloweraryBlocks.ROSE_BUSH.get(color).get().asItem(), FloweraryItems.ROSE_BUSH_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.ROSE_BUSHLET_PLANTS.get(color).get(), FloweraryBlocks.ROSE_BUSHLET.get(color).get().asItem(), FloweraryItems.ROSE_BUSHLET_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.SUNFLOWER_PLANTS.get(color).get(), FloweraryBlocks.SUNFLOWER.get(color).get().asItem(), FloweraryItems.SUNFLOWER_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.TORCHFLOWER_PLANTS.get(color).get(), FloweraryBlocks.TORCHFLOWER.get(color).get().asItem(), FloweraryItems.TORCHFLOWER_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.TULIP_PLANTS.get(color).get(), FloweraryBlocks.TULIP.get(color).get().asItem(), FloweraryItems.TULIP_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.WILDFLOWER_PLANTS.get(color).get(), FloweraryBlocks.WILDFLOWER.get(color).get().asItem(), FloweraryItems.WILDFLOWER_SEEDS.get(color).get());
            dropFlowerCrop(FloweraryBlocks.WITHER_ROSE_PLANTS.get(color).get(), FloweraryBlocks.WITHER_ROSE.get(color).get().asItem(), FloweraryItems.WITHER_ROSE_SEEDS.get(color).get());
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getEntries().stream()
                .filter(e -> e.getKey().location().getNamespace().equals(Flowerary.MOD_ID))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public void dropSelfDoubleTall(Block block) {
        add(block, createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
    }

    public void dropFlowerCrop(Block cropBlock, Item flowerItem, Item seedsItem) {
        LootItemCondition.Builder dropGrownCropCondition = LootItemBlockStatePropertyCondition.hasBlockStateProperties(cropBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, 7));
        add(cropBlock, applyExplosionDecay(cropBlock, LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(flowerItem).when(dropGrownCropCondition).otherwise(LootItem.lootTableItem(seedsItem))))
                .withPool(LootPool.lootPool().when(dropGrownCropCondition).add(LootItem.lootTableItem(seedsItem).apply(ApplyBonusCount.addBonusBinomialDistributionCount(Enchantments.BLOCK_FORTUNE, 0.5714286F, 3))))));
    }
}
