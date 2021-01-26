package com.blackout.michrosia.common.init;


import com.blackout.michrosia.Michrosia;
import com.minecraftabnormals.abnormals_core.core.util.DataUtil;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.biome.BiomeGenerationSettings;
import net.minecraft.world.biome.DefaultBiomeFeatures;
import net.minecraft.world.gen.GenerationStage;
import net.minecraft.world.gen.feature.Features;
import net.minecraft.world.gen.feature.structure.StructureFeatures;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.common.world.MobSpawnInfoBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Michrosia.MODID)
public class MichrosiaBiomeFeatures {

    @SubscribeEvent
    public static void onBiomeLoad(BiomeLoadingEvent event) {
        ResourceLocation biome = event.getName();
        BiomeGenerationSettingsBuilder generation = event.getGeneration();
        MobSpawnInfoBuilder spawns = event.getSpawns();

        if (DataUtil.matchesKeys(biome, MichrosiaBiomes.MICHROSIA.getKey(), MichrosiaBiomes.MICHROSIA_HILLS.getKey())) {
            MichrosiaBiomeFeatures.withMichrosiaFeatures(generation);
            MichrosiaBiomeFeatures.withExtraDiamondOre(generation);
            if (DataUtil.matchesKeys(biome, MichrosiaBiomes.MICHROSIA_HILLS.getKey()))
                MichrosiaBiomeFeatures.withMichrosiaHillsFeatures(generation);

            DefaultBiomeFeatures.withPassiveMobs(spawns);
            DefaultBiomeFeatures.withBatsAndHostiles(spawns);
        }
    }

    public static void withBaseMichrosiaFeatures(BiomeGenerationSettingsBuilder builder) {
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

    public static void withExtraDiamondOre(BiomeGenerationSettings.Builder builder) {
        builder.withFeature(GenerationStage.Decoration.UNDERGROUND_ORES, Features.ORE_DIAMOND);
    }

    public static void withMichrosiaFeatures(BiomeGenerationSettingsBuilder builder) {
        MichrosiaBiomeFeatures.withBaseMichrosiaFeatures(builder);
        MichrosiaBiomeFeatures.withMichrosiaVegetation(builder);
    }

    public static void withMichrosiaHillsFeatures(BiomeGenerationSettingsBuilder builder) {
        MichrosiaBiomeFeatures.withBaseMichrosiaFeatures(builder);
        MichrosiaBiomeFeatures.withMichrosiaHillsVegetation(builder);
    }

    public static void withMichrosiaVegetation(BiomeGenerationSettingsBuilder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MichrosiaTreeFeatures.Configured.MICHROSIA_TREE_MICHROSIA);
    }

    public static void withMichrosiaHillsVegetation(BiomeGenerationSettingsBuilder builder) {
        builder.withFeature(GenerationStage.Decoration.VEGETAL_DECORATION, MichrosiaTreeFeatures.Configured.MICHROSIA_TREE_MICHROSIA_HILLS);
    }
}