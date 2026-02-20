package com.github.mnesikos.flowerary.compat.serene_shrubbery;

import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;

public class SFPansiesBlock extends FlowerBlock {
    public SFPansiesBlock() {
        super(() -> MobEffects.REGENERATION, 100, Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().lightLevel((s) -> 1).noCollission().offsetType(OffsetType.XZ).pushReaction(PushReaction.DESTROY));
    }
}
