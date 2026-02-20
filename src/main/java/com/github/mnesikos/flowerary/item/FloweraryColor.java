package com.github.mnesikos.flowerary.item;

import net.minecraft.util.StringRepresentable;
import net.minecraft.world.item.DyeColor;

public enum FloweraryColor implements StringRepresentable {
//    BURNING("burning", DyeColor.RED),
    RED("red", "Red", DyeColor.RED),
    ORANGE("orange", "Orange", DyeColor.ORANGE),
    YELLOW("yellow", "Yellow", DyeColor.YELLOW),
    LIME("lime", "Lime", DyeColor.LIME),
    MINT("mint", "Mint", DyeColor.LIME),
    CYAN("cyan", "Cyan", DyeColor.CYAN),
//    FREEZING("freezing", DyeColor.LIGHT_BLUE),
    BLUE("blue", "Blue", DyeColor.BLUE),
    LIGHT_BLUE("light_blue", "Light Blue", DyeColor.LIGHT_BLUE),
    LAVENDER("lavender", "Lavender", DyeColor.PURPLE),
    PURPLE("purple", "Purple", DyeColor.PURPLE),
    LILAC("lilac", "Lilac", DyeColor.PURPLE),
    MAGENTA("magenta", "Magenta", DyeColor.MAGENTA),
    PINK("pink", "Pink", DyeColor.PINK),
    PEACH("peach", "Peach", DyeColor.PINK),
    MULTICOLOR("multicolor", "Multicolor", DyeColor.WHITE),
    WHITE("white", "White", DyeColor.WHITE),
//    PLATINUM("platinum", DyeColor.LIGHT_GRAY),
    BLACK("black", "Black", DyeColor.BLACK),
    WILTED("wilted", "Wilted", DyeColor.BROWN);

    private final String name;
    private final String lang;
    private final DyeColor dyeColor;

    FloweraryColor(String name, String lang, DyeColor dyeColor) {
        this.name = name;
        this.lang = lang;
        this.dyeColor = dyeColor;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }

    public String getLangName() {
        return this.lang;
    }

    public DyeColor getDyeColor() {
        return dyeColor;
    }
}
