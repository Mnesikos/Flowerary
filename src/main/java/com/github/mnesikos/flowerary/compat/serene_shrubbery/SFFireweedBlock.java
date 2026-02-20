package com.github.mnesikos.flowerary.compat.serene_shrubbery;

import net.minecraft.core.BlockPos;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SFFireweedBlock extends FlowerBlock {
    public SFFireweedBlock() {
        super(() -> MobEffects.FIRE_RESISTANCE, 100, Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).instabreak().lightLevel((s) -> 1).noCollission().offsetType(OffsetType.XZ).pushReaction(PushReaction.DESTROY));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Vec3 offset = state.getOffset(level, pos);
        return box(0.0F, 0.0F, 0.0F, 16.0F, 32.0F, 16.0F).move(offset.x, offset.y, offset.z);
    }
}
