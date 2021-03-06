package com.blackout.mythicalbiomes.common.init;

import com.blackout.mythicalbiomes.MythicalBiomes;
import com.google.common.collect.ImmutableList;
import net.minecraft.block.BlockState;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.registry.Registry;
import net.minecraft.util.registry.WorldGenRegistries;
import net.minecraft.world.gen.Heightmap;
import net.minecraft.world.gen.blockstateprovider.SimpleBlockStateProvider;
import net.minecraft.world.gen.feature.*;
import net.minecraft.world.gen.foliageplacer.DarkOakFoliagePlacer;
import net.minecraft.world.gen.placement.AtSurfaceWithExtraConfig;
import net.minecraft.world.gen.placement.Placement;
import net.minecraft.world.gen.treedecorator.TreeDecoratorType;
import net.minecraft.world.gen.trunkplacer.GiantTrunkPlacer;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.OptionalInt;

@Mod.EventBusSubscriber(modid = MythicalBiomes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MBTreeFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, MythicalBiomes.MODID);
    public static final DeferredRegister<TreeDecoratorType<?>> TREE_DECORATORS = DeferredRegister.create(ForgeRegistries.TREE_DECORATOR_TYPES, MythicalBiomes.MODID);


    public static final class Configs {
        public static final BaseTreeFeatureConfig MICHROSIA_TREE_CONFIG = (
                new BaseTreeFeatureConfig.Builder(
                        new SimpleBlockStateProvider(States.MICHROSIA_LOG),
                        new SimpleBlockStateProvider(States.MICHROSIA_LEAVES),
                        new DarkOakFoliagePlacer(FeatureSpread.create((int) 0.85), FeatureSpread.create(-1)), // Width of leaves span, , Height of the leaves
                        new GiantTrunkPlacer(9,2,10), // Min Height, Height Variation, Max Height
                        new ThreeLayerFeature(3,3,3,3,3, OptionalInt.of(1)))
        )
                .setIgnoreVines()
                .setHeightmap(Heightmap.Type.MOTION_BLOCKING)
                .build();

        public static final BaseTreeFeatureConfig MICHROSIA_TREE_WITH_FEW_BEEHIVES_CONFIG = MICHROSIA_TREE_CONFIG.copy(ImmutableList.of(Features.Placements.BEES_0002_PLACEMENT));
        public static final BaseTreeFeatureConfig MICHROSIA_TREE_WITH_BEEHIVES_CONFIG = MICHROSIA_TREE_CONFIG.copy(ImmutableList.of(Features.Placements.BEES_002_PLACEMENT));
        public static final BaseTreeFeatureConfig MICHROSIA_TREE_WITH_MORE_BEEHIVES_CONFIG = MICHROSIA_TREE_CONFIG.copy(ImmutableList.of(Features.Placements.BEES_005_PLACEMENT));
    }

    public static final class States {
        public static final BlockState MICHROSIA_LOG = MBBlocks.MICHROSIA_LOG.get().getDefaultState();
        public static final BlockState MICHROSIA_LEAVES = MBBlocks.MICHROSIA_LEAVES.get().getDefaultState();
    }

    private static <FC extends IFeatureConfig> ConfiguredFeature<FC, ?> register(String key, ConfiguredFeature<FC, ?> configuredFeature) {
        return Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, key, configuredFeature);
    }

    public static final class Configured {
        public static final ConfiguredFeature<BaseTreeFeatureConfig, ?> MICHROSIA_TREE = Feature.TREE.withConfiguration(Configs.MICHROSIA_TREE_CONFIG);

        public static final ConfiguredFeature<?, ?> MICHROSIA_TREE_MICHROSIA = Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(MICHROSIA_TREE.withChance(0.1F)), MICHROSIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(8, 0.1F, 1)));
        public static final ConfiguredFeature<?, ?> MICHROSIA_TREE_MICHROSIA_HILLS = Feature.RANDOM_SELECTOR.withConfiguration(new MultipleRandomFeatureConfig(ImmutableList.of(MICHROSIA_TREE.withChance(0.1F)), MICHROSIA_TREE)).withPlacement(Features.Placements.HEIGHTMAP_PLACEMENT).withPlacement(Placement.COUNT_EXTRA.configure(new AtSurfaceWithExtraConfig(0, 0.1F, 1)));

        private static <FC extends IFeatureConfig> ConfiguredFeature<BaseTreeFeatureConfig, ?> register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
            Registry.register(WorldGenRegistries.CONFIGURED_FEATURE, new ResourceLocation(MythicalBiomes.MODID, name), configuredFeature);
            return null;
        }

        public static void registerConfiguredFeatures() {
            register("michrosia_tree", MICHROSIA_TREE);

            register("michrosia_tree_michrosia", MICHROSIA_TREE_MICHROSIA);
            register("michrosia_tree_michrosia_hills", MICHROSIA_TREE_MICHROSIA_HILLS);
        }
    }
}
