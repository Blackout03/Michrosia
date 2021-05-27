package com.blackout.mythicalbiomes.common.init;

import com.blackout.mythicalbiomes.MythicalBiomes;
import com.blackout.mythicalbiomes.common.world.surfacebuilders.RainbowDesertSurfaceBuilder;
import com.blackout.mythicalbiomes.common.world.surfacebuilders.RainbowOceanSurfaceBuilder;
import net.minecraft.block.Blocks;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.ISurfaceBuilderConfig;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilder;
import net.minecraft.world.gen.surfacebuilders.SurfaceBuilderConfig;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;


@Mod.EventBusSubscriber(modid = MythicalBiomes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MBSurfaceBuilders {
    public static final SurfaceBuilder<SurfaceBuilderConfig> RAINBOW_DESERT = new RainbowDesertSurfaceBuilder(SurfaceBuilderConfig.CODEC);
    public static final SurfaceBuilder<SurfaceBuilderConfig> RAINBOW_OCEAN = new RainbowOceanSurfaceBuilder(SurfaceBuilderConfig.CODEC);

    @SubscribeEvent
    public static void registerSurfaceBuilders(RegistryEvent.Register<SurfaceBuilder<?>> event) {
        event.getRegistry().registerAll(
                RAINBOW_DESERT.setRegistryName(MythicalBiomes.MODID, "rainbow_desert"),
                RAINBOW_OCEAN.setRegistryName(MythicalBiomes.MODID, "rainbow_ocean")
        );
    }

    public static final class Configs {
        public static final SurfaceBuilderConfig RAINBOW_DESERT = new SurfaceBuilderConfig(MBBlocks.YELLOW_SAND.get().getDefaultState(), MBBlocks.YELLOW_SAND.get().getDefaultState(), MBBlocks.YELLOW_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_CRIMSON_SAND = new SurfaceBuilderConfig(MBBlocks.CRIMSON_SAND.get().getDefaultState(), MBBlocks.CRIMSON_SAND.get().getDefaultState(), MBBlocks.CRIMSON_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_CRIMSON_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.CRIMSON_SANDSTONE.get().getDefaultState(), MBBlocks.CRIMSON_SANDSTONE.get().getDefaultState(), MBBlocks.CRIMSON_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_RED_SAND = new SurfaceBuilderConfig(Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState());
        public static final SurfaceBuilderConfig RD_RED_SANDSTONE = new SurfaceBuilderConfig(Blocks.RED_SANDSTONE.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState());
        public static final SurfaceBuilderConfig RD_YELLOW_SAND = new SurfaceBuilderConfig(MBBlocks.YELLOW_SAND.get().getDefaultState(), MBBlocks.YELLOW_SAND.get().getDefaultState(), MBBlocks.YELLOW_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_YELLOW_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.YELLOW_SANDSTONE.get().getDefaultState(), MBBlocks.YELLOW_SANDSTONE.get().getDefaultState(), MBBlocks.YELLOW_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_GREEN_SAND = new SurfaceBuilderConfig(MBBlocks.GREEN_SAND.get().getDefaultState(), MBBlocks.GREEN_SAND.get().getDefaultState(), MBBlocks.GREEN_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_GREEN_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.GREEN_SANDSTONE.get().getDefaultState(), MBBlocks.GREEN_SANDSTONE.get().getDefaultState(), MBBlocks.GREEN_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_BLUE_SAND = new SurfaceBuilderConfig(MBBlocks.BLUE_SAND.get().getDefaultState(), MBBlocks.BLUE_SAND.get().getDefaultState(), MBBlocks.BLUE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_BLUE_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.BLUE_SANDSTONE.get().getDefaultState(), MBBlocks.BLUE_SANDSTONE.get().getDefaultState(), MBBlocks.BLUE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_PINK_SAND = new SurfaceBuilderConfig(MBBlocks.PINK_SAND.get().getDefaultState(), MBBlocks.PINK_SAND.get().getDefaultState(), MBBlocks.PINK_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_PINK_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.PINK_SANDSTONE.get().getDefaultState(), MBBlocks.PINK_SANDSTONE.get().getDefaultState(), MBBlocks.PINK_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_PURPLE_SAND = new SurfaceBuilderConfig(MBBlocks.PURPLE_SAND.get().getDefaultState(), MBBlocks.PURPLE_SAND.get().getDefaultState(), MBBlocks.PURPLE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_PURPLE_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.PURPLE_SANDSTONE.get().getDefaultState(), MBBlocks.PURPLE_SANDSTONE.get().getDefaultState(), MBBlocks.PURPLE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RAINBOW_OCEAN = new SurfaceBuilderConfig(MBBlocks.YELLOW_SAND.get().getDefaultState(), MBBlocks.YELLOW_SAND.get().getDefaultState(), MBBlocks.YELLOW_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_CRIMSON_SAND = new SurfaceBuilderConfig(MBBlocks.CRIMSON_SAND.get().getDefaultState(), MBBlocks.CRIMSON_SAND.get().getDefaultState(), MBBlocks.CRIMSON_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_CRIMSON_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.CRIMSON_SANDSTONE.get().getDefaultState(), MBBlocks.CRIMSON_SANDSTONE.get().getDefaultState(), MBBlocks.CRIMSON_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_RED_SAND = new SurfaceBuilderConfig(Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState());
        public static final SurfaceBuilderConfig RO_RED_SANDSTONE = new SurfaceBuilderConfig(Blocks.RED_SANDSTONE.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState());
        public static final SurfaceBuilderConfig RO_YELLOW_SAND = new SurfaceBuilderConfig(MBBlocks.YELLOW_SAND.get().getDefaultState(), MBBlocks.YELLOW_SAND.get().getDefaultState(), MBBlocks.YELLOW_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_YELLOW_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.YELLOW_SANDSTONE.get().getDefaultState(), MBBlocks.YELLOW_SANDSTONE.get().getDefaultState(), MBBlocks.YELLOW_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_GREEN_SAND = new SurfaceBuilderConfig(MBBlocks.GREEN_SAND.get().getDefaultState(), MBBlocks.GREEN_SAND.get().getDefaultState(), MBBlocks.GREEN_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_GREEN_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.GREEN_SANDSTONE.get().getDefaultState(), MBBlocks.GREEN_SANDSTONE.get().getDefaultState(), MBBlocks.GREEN_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_BLUE_SAND = new SurfaceBuilderConfig(MBBlocks.BLUE_SAND.get().getDefaultState(), MBBlocks.BLUE_SAND.get().getDefaultState(), MBBlocks.BLUE_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_BLUE_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.BLUE_SANDSTONE.get().getDefaultState(), MBBlocks.BLUE_SANDSTONE.get().getDefaultState(), MBBlocks.BLUE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_PINK_SAND = new SurfaceBuilderConfig(MBBlocks.PINK_SAND.get().getDefaultState(), MBBlocks.PINK_SAND.get().getDefaultState(), MBBlocks.PINK_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_PINK_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.PINK_SANDSTONE.get().getDefaultState(), MBBlocks.PINK_SANDSTONE.get().getDefaultState(), MBBlocks.PINK_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_PURPLE_SAND = new SurfaceBuilderConfig(MBBlocks.PURPLE_SAND.get().getDefaultState(), MBBlocks.PURPLE_SAND.get().getDefaultState(), MBBlocks.PURPLE_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_PURPLE_SANDSTONE = new SurfaceBuilderConfig(MBBlocks.PURPLE_SANDSTONE.get().getDefaultState(), MBBlocks.PURPLE_SANDSTONE.get().getDefaultState(), MBBlocks.PURPLE_SANDSTONE.get().getDefaultState());
    }

    public static final class Configured {
        public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> RAINBOW_DESERT = MBSurfaceBuilders.RAINBOW_DESERT.func_242929_a(Configs.RAINBOW_DESERT);
        public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> RAINBOW_OCEAN = MBSurfaceBuilders.RAINBOW_OCEAN.func_242929_a(Configs.RAINBOW_OCEAN);

        private static <SC extends ISurfaceBuilderConfig> void register(String key, ConfiguredSurfaceBuilder<SC> builder) {
            WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(MythicalBiomes.MODID, key), builder);
        }

        public static void registerConfiguredSurfaceBuilders() {
            register("rainbow_desert", RAINBOW_DESERT);
            register("rainbow_ocean", RAINBOW_OCEAN);
        }
    }
}