package com.github.mnesikos.flowerary.data;

import com.github.mnesikos.flowerary.Flowerary;
import net.minecraft.data.loot.packs.VanillaBlockLoot;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.Map;
import java.util.stream.Collectors;

public class FloweraryLootTables extends VanillaBlockLoot {
    @Override
    protected void generate() {
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ForgeRegistries.BLOCKS.getEntries().stream()
                .filter(e -> e.getKey().location().getNamespace().equals(Flowerary.MOD_ID))
                .map(Map.Entry::getValue)
                .collect(Collectors.toList());
    }
}
