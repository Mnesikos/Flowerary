package com.github.mnesikos.flowerary.item;

import net.minecraft.util.IStringSerializable;

public enum FloweraryColor implements IStringSerializable {
    BURNING("burning"),
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    LIME("lime"),
    MINT("mint"),
    FREEZING("freezing"),
    CYAN("cyan"),
    BLUE("blue"),
    LIGHT_BLUE("light_blue"),
    LAVENDER("lavender"),
    PURPLE("purple"),
    LILAC("lilac"),
    MAGENTA("magenta"),
    PINK("pink"),
    PEACH("peach"),
    MULTICOLOR("multicolor"),
    WHITE("white"),
    PLATINUM("platinum"),
    BLACK("black"),
    WILTED("wilted");

    private final String name;

    FloweraryColor(String name) {
        this.name = name;
    }

    public String toString() {
        return this.name;
    }

    @Override
    public String getSerializedName() {
        return this.name;
    }
}
