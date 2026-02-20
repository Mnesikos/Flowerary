package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.compat.flowerpatch.FloweraryPatchBlocks;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import com.mrbysco.flowerpatch.block.PatchBlock;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.DoublePlantBlock;
import net.minecraft.world.level.block.PinkPetalsBlock;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.predicates.LootItemCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FloweraryLootTables extends VanillaBlockLoot {
    @Override
    protected void generate() {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            dropSelf(FloweraryBlocks.ALLIUM.get(color).get());
            dropSelf(FloweraryBlocks.ALYSSUM.get(color).get());
            dropSelf(FloweraryBlocks.AZURE_BLUET.get(color).get());
            dropDoubleTallSelf(FloweraryBlocks.BLAZING_STAR.get(color).get());
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
            dropDoubleTallSelf(FloweraryBlocks.FOXGLOVE.get(color).get());
            dropSelf(FloweraryBlocks.HIBISCUS.get(color).get());
            dropSelf(FloweraryBlocks.HYACINTH.get(color).get());
            dropDoubleTallSelf(FloweraryBlocks.IMPALA_LILY.get(color).get());
            dropSelf(FloweraryBlocks.JASMINE.get(color).get());
            dropSelf(FloweraryBlocks.LANTANAS.get(color).get());
            dropDoubleTallSelf(FloweraryBlocks.LAVENDER.get(color).get());
            dropDoubleTallSelf(FloweraryBlocks.LILAC.get(color).get());
            dropSelf(FloweraryBlocks.LILY.get(color).get());
            dropSelf(FloweraryBlocks.ORCHID.get(color).get());
            dropDoubleTallSelf(FloweraryBlocks.PEONY.get(color).get());
            dropPetals(FloweraryBlocks.PETALS.get(color).get());
            dropDoubleTallSelf(FloweraryBlocks.PITCHER_PLANT.get(color).get());
            dropSelf(FloweraryBlocks.POPPY.get(color).get());
            dropSelf(FloweraryBlocks.POPPIES.get(color).get());
            dropSelf(FloweraryBlocks.ROSE.get(color).get());
            dropDoubleTallSelf(FloweraryBlocks.ROSE_BUSH.get(color).get());
            dropSelf(FloweraryBlocks.ROSE_BUSHLET.get(color).get());
            dropDoubleTallSelf(FloweraryBlocks.SUNFLOWER.get(color).get());
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

            dropFlowerCrop(FloweraryBlocks.ALLIUM_PLANTS.get(color).get(), FloweraryBlocks.ALLIUM.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.ALYSSUM_PLANTS.get(color).get(), FloweraryBlocks.ALYSSUM.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.AZURE_BLUET_PLANTS.get(color).get(), FloweraryBlocks.AZURE_BLUET.get(color).get().asItem());
            dropDoubleTallFlowerCrop(FloweraryBlocks.BLAZING_STAR_PLANTS.get(color).get(), FloweraryBlocks.BLAZING_STAR.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.BOUGAINVILLEA_PLANTS.get(color).get(), FloweraryBlocks.BOUGAINVILLEA.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.BROMELIAD_PLANTS.get(color).get(), FloweraryBlocks.BROMELIAD.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.CHICORY_PLANTS.get(color).get(), FloweraryBlocks.CHICORY.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.CLEMATIS_PLANTS.get(color).get(), FloweraryBlocks.CLEMATIS.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.CLOVER_PLANTS.get(color).get(), FloweraryBlocks.CLOVER.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.CORNFLOWER_PLANTS.get(color).get(), FloweraryBlocks.CORNFLOWER.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.DAFFODIL_PLANTS.get(color).get(), FloweraryBlocks.DAFFODIL.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.DAISY_PLANTS.get(color).get(), FloweraryBlocks.DAISY.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.DANDELION_PLANTS.get(color).get(), FloweraryBlocks.DANDELION.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.DIANTHUS_PLANTS.get(color).get(), FloweraryBlocks.DIANTHUS.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.FAIRY_ROSE_PLANTS.get(color).get(), FloweraryBlocks.FAIRY_ROSE.get(color).get().asItem());
            dropDoubleTallFlowerCrop(FloweraryBlocks.FOXGLOVE_PLANTS.get(color).get(), FloweraryBlocks.FOXGLOVE.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.HIBISCUS_PLANTS.get(color).get(), FloweraryBlocks.HIBISCUS.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.HYACINTH_PLANTS.get(color).get(), FloweraryBlocks.HYACINTH.get(color).get().asItem());
            dropDoubleTallFlowerCrop(FloweraryBlocks.IMPALA_LILY_PLANTS.get(color).get(), FloweraryBlocks.IMPALA_LILY.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.JASMINE_PLANTS.get(color).get(), FloweraryBlocks.JASMINE.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.LANTANAS_PLANTS.get(color).get(), FloweraryBlocks.LANTANAS.get(color).get().asItem());
            dropDoubleTallFlowerCrop(FloweraryBlocks.LAVENDER_PLANTS.get(color).get(), FloweraryBlocks.LAVENDER.get(color).get().asItem());
            dropDoubleTallFlowerCrop(FloweraryBlocks.LILAC_PLANTS.get(color).get(), FloweraryBlocks.LILAC.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.LILY_PLANTS.get(color).get(), FloweraryBlocks.LILY.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.ORCHID_PLANTS.get(color).get(), FloweraryBlocks.ORCHID.get(color).get().asItem());
            dropDoubleTallFlowerCrop(FloweraryBlocks.PEONY_PLANTS.get(color).get(), FloweraryBlocks.PEONY.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.PETALS_PLANTS.get(color).get(), FloweraryBlocks.PETALS.get(color).get().asItem());
            dropDoubleTallFlowerCrop(FloweraryBlocks.PITCHER_PLANT_PLANTS.get(color).get(), FloweraryBlocks.PITCHER_PLANT.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.POPPY_PLANTS.get(color).get(), FloweraryBlocks.POPPY.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.POPPIES_PLANTS.get(color).get(), FloweraryBlocks.POPPIES.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.ROSE_PLANTS.get(color).get(), FloweraryBlocks.ROSE.get(color).get().asItem());
            dropDoubleTallFlowerCrop(FloweraryBlocks.ROSE_BUSH_PLANTS.get(color).get(), FloweraryBlocks.ROSE_BUSH.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.ROSE_BUSHLET_PLANTS.get(color).get(), FloweraryBlocks.ROSE_BUSHLET.get(color).get().asItem());
            dropDoubleTallFlowerCrop(FloweraryBlocks.SUNFLOWER_PLANTS.get(color).get(), FloweraryBlocks.SUNFLOWER.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.TORCHFLOWER_PLANTS.get(color).get(), FloweraryBlocks.TORCHFLOWER.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.TULIP_PLANTS.get(color).get(), FloweraryBlocks.TULIP.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.WILDFLOWER_PLANTS.get(color).get(), FloweraryBlocks.WILDFLOWER.get(color).get().asItem());
            dropFlowerCrop(FloweraryBlocks.WITHER_ROSE_PLANTS.get(color).get(), FloweraryBlocks.WITHER_ROSE.get(color).get().asItem());
        }

        if (ModList.get().isLoaded("flowerpatch")) {
            for (FloweraryColor floweraryColor : FloweraryColor.values()) {
                String color = floweraryColor.getSerializedName();
                dropFlowerPatch(FloweraryPatchBlocks.ALLIUM_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.AZURE_BLUET_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.CORNFLOWER_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.DAFFODIL_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.DAISY_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.DANDELION_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.DIANTHUS_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.FAIRY_ROSE_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.HYACINTH_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.LILY_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.ORCHID_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.POPPY_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.ROSE_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.TORCHFLOWER_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.TULIP_PATCH.get(color).get());
                dropFlowerPatch(FloweraryPatchBlocks.WITHER_ROSE_PATCH.get(color).get());
            }
        }
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getEntries().stream()
                .filter(e -> e.getKey().location().getNamespace().equals(Flowerary.MOD_ID))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }

    public void dropFlowerPatch(Block block) {
        if (block instanceof PatchBlock patchBlock) {
            add(block, LootTable.lootTable().withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F))
                    .add(applyExplosionDecay(block, LootItem.lootTableItem(patchBlock.getPatchDelegate().get()).apply(List.of(2, 3, 4), (value) ->
                            SetItemCountFunction.setCount(ConstantValue.exactly((float) value)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
                                    .setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(patchBlock.getProperty(), value))))))));
        }
    }

    public void dropPetals(Block block) {
        add(block, LootTable.lootTable()
                .withPool(LootPool.lootPool().setRolls(ConstantValue.exactly(1.0F)).add(applyExplosionDecay(block, LootItem.lootTableItem(block).apply(IntStream.rangeClosed(1, 4).boxed().toList(), (i) -> SetItemCountFunction.setCount(ConstantValue.exactly((float) i)).when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(PinkPetalsBlock.AMOUNT, i))))))));
    }

    public void dropDoubleTallSelf(Block block) {
        add(block, createSinglePropConditionTable(block, DoublePlantBlock.HALF, DoubleBlockHalf.LOWER));
    }

    public void dropFlowerCrop(Block cropBlock, Item flowerItem) {
        LootItemCondition.Builder dropGrownCropCondition = LootItemBlockStatePropertyCondition.hasBlockStateProperties(cropBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, 7));
        add(cropBlock, applyExplosionDecay(cropBlock, LootTable.lootTable()
                .withPool(LootPool.lootPool().add(LootItem.lootTableItem(flowerItem).when(dropGrownCropCondition)))
        ));
    }

    public void dropDoubleTallFlowerCrop(Block cropBlock, Item flowerItem) {
        LootItemCondition.Builder dropGrownCropCondition = LootItemBlockStatePropertyCondition.hasBlockStateProperties(cropBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(CropBlock.AGE, 7));
        add(cropBlock, applyExplosionDecay(cropBlock, LootTable.lootTable()
                .withPool(LootPool.lootPool()
                        .when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(cropBlock).setProperties(StatePropertiesPredicate.Builder.properties().hasProperty(DoublePlantBlock.HALF, DoubleBlockHalf.LOWER)))
                        .add(LootItem.lootTableItem(flowerItem).when(dropGrownCropCondition)))
        ));
    }
}
