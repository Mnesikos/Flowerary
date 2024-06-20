package com.github.mnesikos.flowerary;

import com.github.mnesikos.flowerary.blocks.FloweraryBlocks;
import com.github.mnesikos.flowerary.items.FlowerComposting;
import com.github.mnesikos.flowerary.items.FloweraryItems;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Flowerary.MOD_ID)
public class Flowerary {
    public static final String MOD_ID = "flowerary";

    public Flowerary() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        FloweraryBlocks.REGISTRAR.register(bus);
        FloweraryItems.REGISTRAR.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::setupClient);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(FlowerComposting::registerCompostables);
    }

    private void setupClient(final FMLClientSetupEvent event) {
        FloweraryBlocks.setRenderLayers();
    }
}