package com.blackout.mythicalbiomes.common.block;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.Blocks;
import net.minecraft.block.SandBlock;
import net.minecraft.fluid.FluidState;
import net.minecraft.tags.FluidTags;
import net.minecraft.util.Direction;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.IPlantable;
import net.minecraftforge.common.PlantType;

public class MichrosiaSandBlock extends SandBlock {
    public MichrosiaSandBlock(int p_i48338_1_, Block.Properties properties)
    {
        super(p_i48338_1_, properties);
    }

    @Override
    public boolean canSustainPlant(BlockState state, IBlockReader world, BlockPos pos, Direction facing, IPlantable plantable)
    {
        PlantType type = plantable.getPlantType(world, pos.offset(facing));

        if (type == PlantType.DESERT)      return true;
        else if (type == PlantType.CAVE)   return true;
        else if (type == PlantType.BEACH)
        {
            for(Direction direction : Direction.Plane.HORIZONTAL) {
                BlockState blockstate1 = world.getBlockState(pos.offset(direction));
                FluidState fluidstate = world.getFluidState(pos.offset(direction));
                if (fluidstate.isTagged(FluidTags.WATER) || blockstate1.matchesBlock(Blocks.FROSTED_ICE)) {
                    return true;
                }
            }
        }

        return super.canSustainPlant(state, world, pos, facing, plantable);
    }
}