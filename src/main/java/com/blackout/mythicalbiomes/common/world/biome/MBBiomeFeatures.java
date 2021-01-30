package com.blackout.mythicalbiomes.common.world.biome;


import com.blackout.mythicalbiomes.MythicalBiomes;
import com.blackout.mythicalbiomes.common.init.MBBiomes;
import com.blackout.mythicalbiomes.common.init.MBTreeFeatures;
import com.minecraftabnormals.abnormals_core.core.util.DataUtil;
import net.minecraft.entity.EntityClassification;
import net.minecraft.entity.EntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.biome.MobSpawnInfo;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MythicalBiomes.MODID)
public class MBBiomeFeatures {

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        ResourceLocation biome = event.getName();
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        MobSpawnInfoBuilder spawns = event.getSpawns();

        if (DataUtil.matchesKeys(biome, MBBiomes.MICHROSIA_FOREST.getKey(), MBBiomes.MICHROSIA_FOREST_HILLS.getKey())) {
            MBBiomeFeatures.withMichrosiaForestFeatures(generation);
            if (DataUtil.matchesKeys(biome, MBBiomes.MICHROSIA_FOREST_HILLS.getKey()))
                MBBiomeFeatures.withMichrosiaForestHillsFeatures(generation);

            DefaultBiomeFeatures.withPassiveMobs(spawns);
            DefaultBiomeFeatures.withBatsAndHostiles(spawns);
        }

        if (DataUtil.matchesKeys(biome, MBBiomes.RAINBOW_DESERT.getKey())) {
            MBBiomeFeatures.withBaseRainbowDesertFeatures(generation);

            DefaultBiomeFeatures.withDesertMobs(spawns);
        }

        if (DataUtil.matchesKeys(biome, MBBiomes.RAINBOW_OCEAN.getKey())) {
            MBBiomeFeatures.withBaseRainbowOceanFeatures(generation);

            spawns.withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.PUFFERFISH, 5, 1, 3)).withSpawner(EntityClassification.WATER_AMBIENT, new MobSpawnInfo.Spawners(EntityType.TROPICAL_FISH, 25, 8, 8)).withSpawner(EntityClassification.WATER_CREATURE, new MobSpawnInfo.Spawners(EntityType.DOLPHIN, 2, 1, 2));
            DefaultBiomeFeatures.withOceanMobs(spawns, 8, 4, 8);
        }
    }

    public static void withBaseRainbowDesertFeatures(BiomeGenerationSettingsBuilder builder) {
        builder.withStructure(StructureFeatures.RUINED_PORTAL_DESERT);

        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_DEAD_BUSH_2);
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_CACTUS_DESERT);
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.PATCH_SUGAR_CANE);

        DefaultBiomeFeatures.withDesertWells(builder);
        DefaultBiomeFeatures.withCavesAndCanyons(builder);
        DefaultBiomeFeatures.withLavaAndWaterLakes(builder);
        DefaultBiomeFeatures.withMonsterRoom(builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(builder);
        DefaultBiomeFeatures.withOverworldOres(builder);
        DefaultBiomeFeatures.withDisks(builder);
        DefaultBiomeFeatures.withLavaAndWaterSprings(builder);
        DefaultBiomeFeatures.withFrozenTopLayer(builder);
    }

    public static void withBaseRainbowOceanFeatures(BiomeGenerationSettingsBuilder builder) {
        builder.withStructure(StructureFeatures.RUINED_PORTAL_OCEAN);
        builder.withStructure(StructureFeatures.OCEAN_RUIN_WARM);
        builder.withStructure(StructureFeatures.MONUMENT);

        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.WARM_OCEAN_VEGETATION);
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.SEAGRASS_WARM);
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, Features.SEA_PICKLE);

        DefaultBiomeFeatures.withOceanCavesAndCanyons(builder);
        DefaultBiomeFeatures.withMonsterRoom(builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(builder);
        DefaultBiomeFeatures.withOverworldOres(builder);
        DefaultBiomeFeatures.withDisks(builder);
        DefaultBiomeFeatures.withSimpleSeagrass(builder);
        DefaultBiomeFeatures.withWarmKelp(builder);
        DefaultBiomeFeatures.withFrozenTopLayer(builder);
    }

    public static void withBaseMichrosiaForestFeatures(BiomeGenerationSettingsBuilder builder) {
        DefaultBiomeFeatures.withStrongholdAndMineshaft(builder);
        builder.withStructure(StructureFeatures.RUINED_PORTAL_MOUNTAIN);

        DefaultBiomeFeatures.withCavesAndCanyons(builder);
        DefaultBiomeFeatures.withCommonOverworldBlocks(builder);
        DefaultBiomeFeatures.withOverworldOres(builder);
        DefaultBiomeFeatures.withDisks(builder);
        DefaultBiomeFeatures.withForestGrass(builder);
        DefaultBiomeFeatures.withMonsterRoom(builder);
        DefaultBiomeFeatures.withWarmFlowers(builder);
        DefaultBiomeFeatures.withBadlandsOakTrees(builder);
    }

    public static void withMichrosiaForestFeatures(BiomeGenerationSettingsBuilder builder) {
        MBBiomeFeatures.withBaseMichrosiaForestFeatures(builder);
        MBBiomeFeatures.withMichrosiaForestVegetation(builder);
    }

    public static void withMichrosiaForestHillsFeatures(BiomeGenerationSettingsBuilder builder) {
        MBBiomeFeatures.withBaseMichrosiaForestFeatures(builder);
        MBBiomeFeatures.withMichrosiaForestHillsVegetation(builder);
    }

    public static void withMichrosiaForestVegetation(BiomeGenerationSettingsBuilder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MBTreeFeatures.Configured.MICHROSIA_TREE_MICHROSIA);
    }

    public static void withMichrosiaForestHillsVegetation(BiomeGenerationSettingsBuilder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MBTreeFeatures.Configured.MICHROSIA_TREE_MICHROSIA_HILLS);
    }
}