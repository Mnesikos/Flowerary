package com.github.mnesikos.flowerary;

import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.client.color.ColorEvents;
import com.github.mnesikos.flowerary.data.*;
import com.github.mnesikos.flowerary.item.FlowerComposting;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

@Mod(Flowerary.MOD_ID)
public class Flowerary {
    public static final String MOD_ID = "flowerary";

    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, Flowerary.MOD_ID);
    public static final RegistryObject<CreativeModeTab> FLOWERARY_GROUP = CREATIVE_MODE_TABS.register(MOD_ID + ".flowerary_group", () -> CreativeModeTab.builder()
            .title(Component.translatable("itemGroup." + MOD_ID + ".flowerary_group"))
            .icon(() -> FloweraryBlocks.POPPIES.get(FloweraryColor.PINK.getSerializedName()).get().asItem().getDefaultInstance())
            .displayItems((itemDisplayParameters, output) -> FloweraryItems.REGISTRAR.getEntries().forEach(item -> output.accept(item.get())))
            .build());

    public Flowerary() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        FloweraryBlocks.REGISTRAR.register(bus);
        FloweraryItems.REGISTRAR.register(bus);
        FloweraryItems.TABLESS_REGISTRAR.register(bus);
        CREATIVE_MODE_TABS.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::gatherData);
        bus.addListener(this::setupClient);

        if (FMLEnvironment.dist == Dist.CLIENT) {
            bus.addListener(ColorEvents::registerColorHandlerBlocks);
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(FlowerComposting::registerCompostables);
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
        dataGenerator.addProvider(event.includeClient(), new FloweraryBlockModels(packOutput, event.getExistingFileHelper()));
        dataGenerator.addProvider(event.includeClient(), new FloweraryBlockStates(packOutput, event.getExistingFileHelper()));
        dataGenerator.addProvider(event.includeClient(), new FloweraryItemModels(packOutput, event.getExistingFileHelper()));

        FloweraryTags.FloweraryBlockTags blockTagsProvider = new FloweraryTags.FloweraryBlockTags(packOutput, event.getLookupProvider(), event.getExistingFileHelper());
        dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
        dataGenerator.addProvider(event.includeServer(), new FloweraryTags.FloweraryItemTags(packOutput, event.getLookupProvider(), blockTagsProvider, event.getExistingFileHelper()));
//        dataGenerator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
//                List.of(new LootTableProvider.SubProviderEntry(FloweraryLootTables::new, LootContextParamSets.BLOCK))));
        dataGenerator.addProvider(event.includeServer(), new FloweraryRecipes(packOutput));
    }

    private void setupClient(final FMLClientSetupEvent event) {
        FloweraryBlocks.setRenderLayers();
    }
}