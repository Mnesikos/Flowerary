package com.github.mnesikos.flowerary.item;

import net.minecraft.item.DyeColor;
import net.minecraft.util.IStringSerializable;

public enum FloweraryColor implements IStringSerializable {
//    BURNING("burning", DyeColor.RED),
    RED("red", DyeColor.RED),
    ORANGE("orange", DyeColor.ORANGE),
    YELLOW("yellow", DyeColor.YELLOW),
    LIME("lime", DyeColor.LIME),
    MINT("mint", DyeColor.LIME),
    CYAN("cyan", DyeColor.CYAN),
//    FREEZING("freezing", DyeColor.LIGHT_BLUE),
    LIGHT_BLUE("light_blue", DyeColor.LIGHT_BLUE),
    BLUE("blue", DyeColor.BLUE),
    LAVENDER("lavender", DyeColor.PURPLE),
    PURPLE("purple", DyeColor.PURPLE),
    LILAC("lilac", DyeColor.PURPLE),
    MAGENTA("magenta", DyeColor.MAGENTA),
    PINK("pink", DyeColor.PINK),
    PEACH("peach", DyeColor.PINK),
    MULTICOLOR("multicolor", DyeColor.WHITE),
    WHITE("white", DyeColor.WHITE),
//    PLATINUM("platinum", DyeColor.LIGHT_GRAY),
    BLACK("black", DyeColor.BLACK),
    WILTED("wilted", DyeColor.BROWN);

    private final String name;
    private final DyeColor dyeColor;

    FloweraryColor(String name, DyeColor dyeColor) {
        this.name = name;
        this.dyeColor = dyeColor;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }

    public DyeColor getDyeColor() {
        return dyeColor;
    }
}
