package com.blackout.michrosia.common.world.surfacebuilders;

import com.blackout.michrosia.common.init.MichrosiaSurfaceBuilders;
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
        if (noise < -2.50D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_YELLOW_SAND);
        }
        if (noise < -2.50D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_YELLOW_SANDSTONE);
        }
        if (noise > -2.50D && noise < -1.25D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_BLUE_SAND);
        }
        if (noise > -2.50D && noise < -1.25D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_BLUE_SANDSTONE);
        }
        if (noise > -1.25D && noise < 0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_PINK_SAND);
        }
        if (noise > -1.25D && noise < 0D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_PINK_SANDSTONE);
        }
        if (noise > 0D && noise < 1.25D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_PURPLE_SAND);
        }
        if (noise > 0D && noise < 1.25D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_PURPLE_SANDSTONE);
        }
        if (noise > 1.25D && noise < 2.50D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_GREEN_SAND);
        }
        if (noise > 1.25D && noise < 2.50D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_GREEN_SANDSTONE);
        }
        if (noise > 2.50D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_RED_SAND);
        }
        if (noise > 2.50D) {
            SurfaceBuilder.DEFAULT.buildSurface(random, chunkIn, biomeIn, x, z, startHeight, noise, defaultBlock, defaultFluid, seaLevel, seed, MichrosiaSurfaceBuilders.Configs.RO_RED_SANDSTONE);
        }
    }
}
