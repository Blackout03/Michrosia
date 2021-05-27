package com.blackout.mythicalbiomes.common.world.surfacebuilders;

import com.blackout.mythicalbiomes.common.init.MBSurfaceBuilders;
import com.mojang.serialization.Codec;
import net.minecraft.block.BlockState;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.chunk.IChunk;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;

import java.util.Random;

public class RainbowOceanSurfaceBuilder extends SurfaceBuilder<SurfaceBuilderConfig> {
    public RainbowOceanSurfaceBuilder(Codec<SurfaceBuilderConfig> p_i51315_1_) {
        super(p_i51315_1_);
    }

    public void buildSurface(Random random, IChunk chunkIn, Biome biomeIn, int x, int z, int startHeight, double noise, BlockState defaultBlock, BlockState defaultFluid, int seaLevel, long seed, SurfaceBuilderConfig config) {
        if (noise < -3.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_PINK_SAND);
        }
        if (noise < -3.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_PINK_SANDSTONE);
        }
        if (noise > -3.0D && noise < -2.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_CRIMSON_SAND);
        }
        if (noise > -3.0D && noise < -2.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_CRIMSON_SANDSTONE);
        }
        if (noise > -2.0D && noise < -0.75D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_PURPLE_SAND);
        }
        if (noise > -2.0D && noise < -0.75D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_PURPLE_SANDSTONE);
        }
        if (noise > -0.75D && noise < 0.75D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_YELLOW_SAND);
        }
        if (noise > -0.75D && noise < 0.75D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_YELLOW_SANDSTONE);
        }
        if (noise > 0.75D && noise < 2.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_GREEN_SAND);
        }
        if (noise > 0.75D && noise < 2.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_GREEN_SANDSTONE);
        }
        if (noise > 2.0D && noise < 3.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_BLUE_SAND);
        }
        if (noise > 2.0D && noise < 3.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_BLUE_SANDSTONE);
        }
        if (noise > 3.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_RED_SAND);
        }
        if (noise > 3.0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MBSurfaceBuilders.Configs.RO_RED_SANDSTONE);
        }
    }
}
