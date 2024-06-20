package com.github.mnesikos.flowerary.blocks;

import net.minecraft.block.BlockState;
import net.minecraft.block.BushBlock;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.vector.Vector3d;
import net.minecraft.world.IBlockReader;

public class BlockFlower extends BushBlock {
    private final VoxelShape shape;

    public BlockFlower(Properties properties, VoxelShape ShapeIn) {
        super(properties);
        this.shape = ShapeIn;
    }

    public OffsetType getOffsetType() {
        return OffsetType.XZ;
    }

    @Override
    public VoxelShape getShape(BlockState state, IBlockReader world, BlockPos pos, ISelectionContext context) {
        Vector3d offset = state.getOffset(world, pos);
        return this.shape.move(offset.x, offset.y, offset.z);
    }
}