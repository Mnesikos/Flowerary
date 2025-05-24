package com.github.mnesikos.flowerary.client.color;

import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import net.minecraft.client.renderer.BiomeColors;
import net.minecraft.world.level.GrassColor;
import net.minecraftforge.client.event.RegisterColorHandlersEvent;

public class ColorEvents {
    public static void registerColorHandlerBlocks(final RegisterColorHandlersEvent.Block event) {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String flowerColor = floweraryColor.getSerializedName();
            event.getBlockColors().register((state, reader, pos, color) -> reader != null && pos != null ? BiomeColors.getAverageGrassColor(reader, pos) : GrassColor.get(0.5D, 1.0D),
                    FloweraryBlocks.PETALS.get(flowerColor).get());
        }
    }
}
