package com.github.mnesikos.flowerary.compat.serene_shrubbery;

import com.github.mnesikos.flowerary.Flowerary;
import com.github.mnesikos.flowerary.item.FloweraryColor;
import com.github.mnesikos.flowerary.item.FloweraryItems;
import net.mcreator.sereneshrubbery.block.BlueLiverwortBlock;
import net.mcreator.sereneshrubbery.block.TwinflowerBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class SereneFloweraryBlocks {
    public static final DeferredRegister<Block> REGISTRAR = DeferredRegister.create(ForgeRegistries.BLOCKS, Flowerary.MOD_ID);
    public static final DeferredRegister<Item> ITEMS_REGISTRAR = DeferredRegister.create(ForgeRegistries.ITEMS, Flowerary.MOD_ID);

    public static final Map<String, RegistryObject<Block>> BLANKET_FLOWER = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> BUTTERFLY_BUSH = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> FIREWEED = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> SERENE_FOXGLOVE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> HYDRANGEA = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> DARKLEAF_HYDRANGEA = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LIVERWORT = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> LUPINE = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> PANSIES = new HashMap<>();
    public static final Map<String, RegistryObject<Block>> TWINFLOWER = new HashMap<>();

    static {
        for (FloweraryColor floweraryColor : FloweraryColor.values()) {
            String color = floweraryColor.getSerializedName();
            BLANKET_FLOWER.put(color, registerWithItem(color + "_blanket_flower", BlanketFlowerBlock::new));
            BUTTERFLY_BUSH.put(color, registerWithItem(color + "_butterfly_bush", SFButterflyBushBlock::new));
            FIREWEED.put(color, registerWithItem(color + "_fireweed", SFFireweedBlock::new));
            SERENE_FOXGLOVE.put(color, registerWithItem(color + "_serene_foxglove", SereneFoxgloveBlock::new));
            HYDRANGEA.put(color, registerWithItem(color + "_hydrangea", SFHydrangeaBlock::new));
            DARKLEAF_HYDRANGEA.put(color, registerWithItem(color + "_darkleaf_hydrangea", SFHydrangeaBlock::new));
            LIVERWORT.put(color, registerWithItem(color + "_liverwort", BlueLiverwortBlock::new));
            LUPINE.put(color, registerWithItem(color + "_lupine", SFLupineBlock::new));
            PANSIES.put(color, registerWithItem(color + "_pansies", SFPansiesBlock::new));
            TWINFLOWER.put(color, registerWithItem(color + "_twinflower", TwinflowerBlock::new));
        }
    }

    private static <T extends Block> RegistryObject<T> registerWithItem(String name, Supplier<T> block) {
        RegistryObject<T> registryObject = REGISTRAR.register(name, block);
        ITEMS_REGISTRAR.register(name, () -> new BlockItem(registryObject.get(), new Item.Properties()));
        return registryObject;
    }
}
