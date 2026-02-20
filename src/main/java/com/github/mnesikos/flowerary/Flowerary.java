package com.github.mnesikos.flowerary;

import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.client.color.ColorEvents;
import com.github.mnesikos.flowerary.compat.flowerpatch.FloweraryPatch;
import com.github.mnesikos.flowerary.compat.flowerpatch.FloweraryPatchBlocks;
import com.github.mnesikos.flowerary.compat.serene_shrubbery.SereneFloweraryBlocks;
import com.github.mnesikos.flowerary.data.*;
import com.github.mnesikos.flowerary.item.FlowerComposting;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.PackOutput;
import net.minecraft.data.loot.LootTableProvider;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.PackType;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.storage.loot.parameters.LootContextParamSets;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.data.event.GatherDataEvent;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.fml.loading.FMLEnvironment;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

import java.util.Collections;
import java.util.List;

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

        if (ModList.get().isLoaded("flowerpatch")) {
            FloweraryPatchBlocks.REGISTRAR.register(bus);
            bus.addListener(FloweraryPatch::setupClient);
            MinecraftForge.EVENT_BUS.addListener(FloweraryPatch::onBlockInteraction);
            MinecraftForge.EVENT_BUS.addListener(FloweraryPatch::onBonemeal);
        }
        if (ModList.get().isLoaded("serene_shrubbery")) {
            SereneFloweraryBlocks.REGISTRAR.register(bus);
            SereneFloweraryBlocks.ITEMS_REGISTRAR.register(bus);
            bus.addListener(this::addCreativeTabs);
        }
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(FlowerComposting::registerCompostables);
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        PackOutput packOutput = dataGenerator.getPackOutput();
        ExistingFileHelper existingFileHelper = ignoreResources(event.getExistingFileHelper());

        dataGenerator.addProvider(event.includeClient(), new FloweraryBlockModels(packOutput, existingFileHelper));
        dataGenerator.addProvider(event.includeClient(), new FloweraryBlockStates(packOutput, existingFileHelper));
        dataGenerator.addProvider(event.includeClient(), new FloweraryItemModels(packOutput, existingFileHelper));
        dataGenerator.addProvider(event.includeClient(), new FloweraryLang(packOutput));

        FloweraryTags.FloweraryBlockTags blockTagsProvider = new FloweraryTags.FloweraryBlockTags(packOutput, event.getLookupProvider(), existingFileHelper);
        dataGenerator.addProvider(event.includeServer(), blockTagsProvider);
        dataGenerator.addProvider(event.includeServer(), new FloweraryTags.FloweraryItemTags(packOutput, event.getLookupProvider(), blockTagsProvider, existingFileHelper));
        dataGenerator.addProvider(event.includeServer(), new LootTableProvider(packOutput, Collections.emptySet(),
                List.of(new LootTableProvider.SubProviderEntry(FloweraryLootTables::new, LootContextParamSets.BLOCK))));
        dataGenerator.addProvider(event.includeServer(), new FloweraryRecipes(packOutput));
    }

    private static ExistingFileHelper ignoreResources(ExistingFileHelper existingFileHelper) {
        String flowerpatch = "flowerpatch";
        for (int flowers = 2; flowers < 5; flowers++) {
            existingFileHelper.trackGenerated(new ResourceLocation(flowerpatch, "block/patch" + flowers), PackType.CLIENT_RESOURCES, ".json", "models");
        }

        return existingFileHelper;
    }

    private void setupClient(final FMLClientSetupEvent event) {
        FloweraryBlocks.setRenderLayers();
    }

    private void addCreativeTabs(BuildCreativeModeTabContentsEvent event) {
        if (ModList.get().isLoaded("serene_shrubbery")) {
            if (event.getTabKey() == FLOWERARY_GROUP.getKey()) SereneFloweraryBlocks.ITEMS_REGISTRAR.getEntries().forEach(item -> event.accept(item.get()));
        }
    }
}