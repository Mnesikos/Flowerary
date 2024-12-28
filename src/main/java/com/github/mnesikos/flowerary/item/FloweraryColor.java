package com.github.mnesikos.flowerary.item;

import net.minecraft.util.IStringSerializable;

public enum FloweraryColor implements IStringSerializable {
    RED("red"),
    ORANGE("orange"),
    YELLOW("yellow"),
    CYAN("cyan"),
    BLUE("blue"),
    LILAC("lilac"),
    MAGENTA("magenta"),
    PINK("pink"),
    WHITE("white"),
    BLACK("black");

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
