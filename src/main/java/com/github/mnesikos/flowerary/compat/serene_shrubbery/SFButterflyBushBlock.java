package com.github.mnesikos.flowerary.compat.serene_shrubbery;

import net.mcreator.sereneshrubbery.init.SereneShrubberyModParticleTypes;
import net.mcreator.sereneshrubbery.procedures.ButterflyBushPlantDestroyedByPlayerProcedure;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.FlowerBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.MapColor;
import net.minecraft.world.level.material.PushReaction;
import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;

public class SFButterflyBushBlock extends FlowerBlock {
    public SFButterflyBushBlock() {
        super(() -> MobEffects.SLOW_FALLING, 200, Properties.of().mapColor(MapColor.PLANT).sound(SoundType.GRASS).strength(0.1F, 1.0F).lightLevel((s) -> 1).noCollission().offsetType(OffsetType.XZ).pushReaction(PushReaction.DESTROY));
    }

    @Override
    public VoxelShape getShape(BlockState state, BlockGetter level, BlockPos pos, CollisionContext context) {
        Vec3 offset = state.getOffset(level, pos);
        return box(0.0F, 0.0F, 0.0F, 16.0F, 16.0F, 16.0F).move(offset.x, offset.y, offset.z);
    }

    @Override
    public boolean onDestroyedByPlayer(BlockState state, Level level, BlockPos pos, Player player, boolean willHarvest, FluidState fluid) {
        boolean onDestroyedByPlayer = super.onDestroyedByPlayer(state, level, pos, player, willHarvest, fluid);
        if (level instanceof ServerLevel serverLevel)
            serverLevel.sendParticles(SereneShrubberyModParticleTypes.BUTTERFLY_BUSH_PARTICLE.get(), pos.getX(), pos.getY(), pos.getZ(), 10,  1.0F,  1.0F,  1.0F, 0.01);
        return onDestroyedByPlayer;
    }
}
