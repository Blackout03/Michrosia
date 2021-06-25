package com.blackout.mythicalbiomes.common.init;

import com.blackout.mythicalbiomes.MythicalBiomes;
import com.minecraftabnormals.abnormals_core.core.util.BiomeUtil;
import com.minecraftabnormals.abnormals_core.core.util.registry.BiomeSubRegistryHelper;
import com.mojang.datafixers.util.Pair;
import net.minecraft.util.math.MathHelper;
import net.minecraft.world.biome.*;
import net.minecraft.world.gen.surfacebuilders.ConfiguredSurfaceBuilders;
import net.minecraftforge.common.BiomeDictionary;
import net.minecraftforge.common.BiomeDictionary.Type;
import net.minecraftforge.common.BiomeManager;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MythicalBiomes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MBBiomes {
    private static final BiomeSubRegistryHelper HELPER = MythicalBiomes.REGISTRY_HELPER.getBiomeSubHelper();

    public static final BiomeSubRegistryHelper.KeyedBiome MICHROSIA_FOREST = HELPER.createBiome("michrosia_forest", () -> createMichrosiaForestBiome(0.25F, 0.0F));
    public static final BiomeSubRegistryHelper.KeyedBiome MICHROSIA_FOREST_HILLS = HELPER.createBiome("michrosia_forest_hills", () -> createMichrosiaForestBiome(1.0F, 1.45F));
    public static final BiomeSubRegistryHelper.KeyedBiome RAINBOW_DESERT = HELPER.createBiome("rainbow_desert", () -> createRainbowDesertBiome(0.25F, 0.125F));
    public static final BiomeSubRegistryHelper.KeyedBiome RAINBOW_OCEAN = HELPER.createBiome("rainbow_ocean", () -> createRainbowOceanBiome(-1.35F, 0.1875F));
    public static final BiomeSubRegistryHelper.KeyedBiome MELON_PLAINS = HELPER.createBiome("melon_plains", () -> createMelonPlainsBiome(0.125F, 0.05F));

    public static void addBiomesToGeneration() {
        BiomeUtil.addHillBiome(MICHROSIA_FOREST.getKey(), Pair.of(MICHROSIA_FOREST.getKey(), 3), Pair.of(MICHROSIA_FOREST_HILLS.getKey(), 1));

        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(MICHROSIA_FOREST.getKey(), 2 /*/MBConfig.COMMON.michrosiaForestWeight.get()/*/));
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(MICHROSIA_FOREST_HILLS.getKey(), 1 /*/MBConfig.COMMON.michrosiaForestHillsWeight.get()/*/));
        BiomeManager.addBiome(BiomeManager.BiomeType.DESERT, new BiomeManager.BiomeEntry(RAINBOW_DESERT.getKey(), 1 /*/MBConfig.COMMON.rainbowDesertWeight.get()/*/));
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(RAINBOW_OCEAN.getKey(), 1 /*/MBConfig.COMMON.rainbowOceanWeight.get()/*/));
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(MELON_PLAINS.getKey(), 1 /*/MBConfig.COMMON.melonPlainsWeight.get()/*/));
    }

    public static void addBiomeTypes() {
        BiomeDictionary.addTypes(MICHROSIA_FOREST.getKey(), Type.OVERWORLD, Type.FOREST, Type.RARE);
        BiomeDictionary.addTypes(MICHROSIA_FOREST_HILLS.getKey(), Type.OVERWORLD, Type.FOREST, Type.RARE, Type.MOUNTAIN, Type.HILLS);
        BiomeDictionary.addTypes(RAINBOW_DESERT.getKey(), Type.OVERWORLD, Type.DRY, Type.RARE, Type.HOT, Type.SANDY);
        BiomeDictionary.addTypes(RAINBOW_OCEAN.getKey(), Type.OVERWORLD, Type.WET, Type.RARE, Type.OCEAN, Type.SANDY);
        BiomeDictionary.addTypes(MELON_PLAINS.getKey(), Type.OVERWORLD, Type.WET, Type.RARE, Type.WATER);
    }

    private static Biome createMichrosiaForestBiome(float depth, float scale) {
        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST).depth(depth).scale(scale).temperature(0.75F).downfall(0.8F).setEffects((new BiomeAmbience.Builder()).withGrassColor(0x81C3FF).withFoliageColor(0x81C3FF).setWaterColor(0x4F97B6).setWaterFogColor(0x051E33).setFogColor(0xC0D8FF).withSkyColor(getSkyColorWithTemperatureModifier(0.75F)).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).withMobSpawnSettings(new MobSpawnInfo.Builder().build()).withGenerationSettings((new BiomeGenerationSettings.Builder()).withSurfaceBuilder(ConfiguredSurfaceBuilders.GRASS).build()).build();
    }

    private static Biome createRainbowDesertBiome(float depth, float scale) {
        return (new Biome.Builder()).precipitation(Biome.RainType.NONE).category(Biome.Category.DESERT).depth(depth).scale(scale).temperature(2.0F).downfall(0.0F).setEffects((new BiomeAmbience.Builder()).withGrassColor(0x81C3FF).withFoliageColor(0x81C3FF).setWaterColor(4159204).setWaterFogColor(329011).setFogColor(14988944).withSkyColor(getSkyColorWithTemperatureModifier(2.0F)).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).withMobSpawnSettings(new MobSpawnInfo.Builder().build()).withGenerationSettings((new BiomeGenerationSettings.Builder()).withSurfaceBuilder(MBSurfaceBuilders.Configured.RAINBOW_DESERT).build()).build();
    }

    private static Biome createRainbowOceanBiome(float depth, float scale) {
        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.OCEAN).depth(depth).scale(scale).temperature(1.0F).downfall(1.0F).setEffects((new BiomeAmbience.Builder()).withGrassColor(0x81C3FF).withFoliageColor(0x81C3FF).setWaterColor(4159204).setWaterFogColor(329011).setFogColor(14988944).withSkyColor(getSkyColorWithTemperatureModifier(2.0F)).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).withMobSpawnSettings(new MobSpawnInfo.Builder().build()).withGenerationSettings((new BiomeGenerationSettings.Builder()).withSurfaceBuilder(MBSurfaceBuilders.Configured.RAINBOW_OCEAN).build()).build();
    }

    private static Biome createMelonPlainsBiome(float depth, float scale) {
        return (new Biome.Builder()).precipitation(Biome.RainType.NONE).category(Biome.Category.PLAINS).depth(depth).scale(scale).temperature(0.8F).downfall(0.4F).setEffects((new BiomeAmbience.Builder()).setWaterColor(4159204).setWaterFogColor(329011).setFogColor(12638463).withSkyColor(getSkyColorWithTemperatureModifier(0.8F)).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).withMobSpawnSettings(new MobSpawnInfo.Builder().build()).withGenerationSettings((new BiomeGenerationSettings.Builder()).withSurfaceBuilder(MBSurfaceBuilders.Configured.MELONS).build()).build();
    }

    private static int getSkyColorWithTemperatureModifier(float temperature) {
        float lvt_1_1_ = temperature / 3.0F;
        lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
        return MathHelper.hsvToRGB(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
    }
}
