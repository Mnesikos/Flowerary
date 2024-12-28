package com.github.mnesikos.flowerary;

import com.github.mnesikos.flowerary.block.FloweraryBlocks;
import com.github.mnesikos.flowerary.data.FloweraryBlockModels;
import com.github.mnesikos.flowerary.data.FloweraryBlockStates;
import com.github.mnesikos.flowerary.data.FloweraryItemModels;
import com.github.mnesikos.flowerary.item.FlowerComposting;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.minecraft.data.DataGenerator;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.GatherDataEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(Flowerary.MOD_ID)
public class Flowerary {
    public static final String MOD_ID = "flowerary";
    public static final String[] COLORS_LIST = new String[]{
            "black", "blue", "cyan", "red", "magenta", "orange", "pink", "white", "yellow", "lilac"
    };

    public static final ItemGroup FLOWERARY_GROUP = new ItemGroup(MOD_ID + ".flowerary_group") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(FloweraryBlocks.POPPIES.get("pink").get());
        }
    };

    public Flowerary() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();

        FloweraryBlocks.REGISTRAR.register(bus);
        FloweraryItems.REGISTRAR.register(bus);

        bus.addListener(this::setup);
        bus.addListener(this::gatherData);
        bus.addListener(this::setupClient);
    }

    private void setup(final FMLCommonSetupEvent event) {
        event.enqueueWork(FlowerComposting::registerCompostables);
    }

    private void gatherData(final GatherDataEvent event) {
        DataGenerator dataGenerator = event.getGenerator();
        if (event.includeClient()) {
            dataGenerator.addProvider(new FloweraryBlockModels(dataGenerator, event.getExistingFileHelper()));
            dataGenerator.addProvider(new FloweraryItemModels(dataGenerator, event.getExistingFileHelper()));
            dataGenerator.addProvider(new FloweraryBlockStates(dataGenerator, event.getExistingFileHelper()));
        }

//        if (event.includeServer()) {
//            dataGenerator.addProvider(new FloweraryTags.FloweraryBlockTags(dataGenerator, event.getExistingFileHelper()));
//            dataGenerator.addProvider(new FloweraryTags.FloweraryItemTags(dataGenerator, event.getExistingFileHelper()));
//            dataGenerator.addProvider(new FloweraryLootTables(dataGenerator));
//            dataGenerator.addProvider(new FloweraryRecipes(dataGenerator));
//        }
    }

    private void setupClient(final FMLClientSetupEvent event) {
        FloweraryBlocks.setRenderLayers();
    }
}