package com.blackout.michrosia.common.init;

import com.blackout.michrosia.Michrosia;
import com.blackout.michrosia.common.world.surfacebuilders.RainbowDesertSurfaceBuilder;
import com.blackout.michrosia.common.world.surfacebuilders.RainbowOceanSurfaceBuilder;
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


@Mod.EventBusSubscriber(modid = Michrosia.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MichrosiaSurfaceBuilders {
    public static final SurfaceBuilder<SurfaceBuilderConfig> RAINBOW_DESERT = new RainbowDesertSurfaceBuilder(SurfaceBuilderConfig.field_237203_a_);
    public static final SurfaceBuilder<SurfaceBuilderConfig> RAINBOW_OCEAN = new RainbowOceanSurfaceBuilder(SurfaceBuilderConfig.field_237203_a_);

    @SubscribeEvent
    public static void registerSurfaceBuilders(RegistryEvent.Register<SurfaceBuilder<?>> event) {
        event.getRegistry().registerAll(
                RAINBOW_DESERT.setRegistryName(Michrosia.MODID, "rainbow_desert"),
                RAINBOW_OCEAN.setRegistryName(Michrosia.MODID, "rainbow_ocean")
        );
    }

    public static final class Configs {
        public static final SurfaceBuilderConfig RAINBOW_DESERT = new SurfaceBuilderConfig(MichrosiaBlocks.YELLOW_SAND.get().getDefaultState(), MichrosiaBlocks.YELLOW_SAND.get().getDefaultState(), MichrosiaBlocks.YELLOW_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_RED_SAND = new SurfaceBuilderConfig(Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState());
        public static final SurfaceBuilderConfig RD_RED_SANDSTONE = new SurfaceBuilderConfig(Blocks.RED_SANDSTONE.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState());
        public static final SurfaceBuilderConfig RD_YELLOW_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.YELLOW_SAND.get().getDefaultState(), MichrosiaBlocks.YELLOW_SAND.get().getDefaultState(), MichrosiaBlocks.YELLOW_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_YELLOW_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.YELLOW_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.YELLOW_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.YELLOW_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_GREEN_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.GREEN_SAND.get().getDefaultState(), MichrosiaBlocks.GREEN_SAND.get().getDefaultState(), MichrosiaBlocks.GREEN_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_GREEN_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.GREEN_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.GREEN_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.GREEN_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_BLUE_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.BLUE_SAND.get().getDefaultState(), MichrosiaBlocks.BLUE_SAND.get().getDefaultState(), MichrosiaBlocks.BLUE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_BLUE_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.BLUE_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.BLUE_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.BLUE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_PINK_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.PINK_SAND.get().getDefaultState(), MichrosiaBlocks.PINK_SAND.get().getDefaultState(), MichrosiaBlocks.PINK_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_PINK_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.PINK_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.PINK_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.PINK_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_PURPLE_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.PURPLE_SAND.get().getDefaultState(), MichrosiaBlocks.PURPLE_SAND.get().getDefaultState(), MichrosiaBlocks.PURPLE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RD_PURPLE_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.PURPLE_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.PURPLE_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.PURPLE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RAINBOW_OCEAN = new SurfaceBuilderConfig(MichrosiaBlocks.YELLOW_SAND.get().getDefaultState(), MichrosiaBlocks.YELLOW_SAND.get().getDefaultState(), MichrosiaBlocks.YELLOW_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_RED_SAND = new SurfaceBuilderConfig(Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState(), Blocks.RED_SAND.getDefaultState());
        public static final SurfaceBuilderConfig RO_RED_SANDSTONE = new SurfaceBuilderConfig(Blocks.RED_SANDSTONE.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState(), Blocks.RED_SANDSTONE.getDefaultState());
        public static final SurfaceBuilderConfig RO_YELLOW_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.YELLOW_SAND.get().getDefaultState(), MichrosiaBlocks.YELLOW_SAND.get().getDefaultState(), MichrosiaBlocks.YELLOW_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_YELLOW_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.YELLOW_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.YELLOW_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.YELLOW_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_GREEN_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.GREEN_SAND.get().getDefaultState(), MichrosiaBlocks.GREEN_SAND.get().getDefaultState(), MichrosiaBlocks.GREEN_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_GREEN_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.GREEN_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.GREEN_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.GREEN_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_BLUE_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.BLUE_SAND.get().getDefaultState(), MichrosiaBlocks.BLUE_SAND.get().getDefaultState(), MichrosiaBlocks.BLUE_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_BLUE_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.BLUE_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.BLUE_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.BLUE_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_PINK_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.PINK_SAND.get().getDefaultState(), MichrosiaBlocks.PINK_SAND.get().getDefaultState(), MichrosiaBlocks.PINK_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_PINK_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.PINK_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.PINK_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.PINK_SANDSTONE.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_PURPLE_SAND = new SurfaceBuilderConfig(MichrosiaBlocks.PURPLE_SAND.get().getDefaultState(), MichrosiaBlocks.PURPLE_SAND.get().getDefaultState(), MichrosiaBlocks.PURPLE_SAND.get().getDefaultState());
        public static final SurfaceBuilderConfig RO_PURPLE_SANDSTONE = new SurfaceBuilderConfig(MichrosiaBlocks.PURPLE_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.PURPLE_SANDSTONE.get().getDefaultState(), MichrosiaBlocks.PURPLE_SANDSTONE.get().getDefaultState());
    }

    public static final class Configured {
        public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> RAINBOW_DESERT = MichrosiaSurfaceBuilders.RAINBOW_DESERT.func_242929_a(Configs.RAINBOW_DESERT);
        public static final ConfiguredSurfaceBuilder<SurfaceBuilderConfig> RAINBOW_OCEAN = MichrosiaSurfaceBuilders.RAINBOW_OCEAN.func_242929_a(Configs.RAINBOW_OCEAN);

        private static <SC extends ISurfaceBuilderConfig> void register(String key, ConfiguredSurfaceBuilder<SC> builder) {
            WorldGenRegistries.register(WorldGenRegistries.CONFIGURED_SURFACE_BUILDER, new ResourceLocation(Michrosia.MODID, key), builder);
        }

        public static void registerConfiguredSurfaceBuilders() {
            register("rainbow_desert", RAINBOW_DESERT);
            register("rainbow_ocean", RAINBOW_OCEAN);
        }
    }
}