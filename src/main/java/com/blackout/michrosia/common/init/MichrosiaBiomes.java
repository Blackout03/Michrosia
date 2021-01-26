package com.blackout.michrosia.common.init;

import com.blackout.michrosia.Michrosia;
import com.blackout.michrosia.common.config.MichrosiaConfig;
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

@Mod.EventBusSubscriber(modid = Michrosia.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MichrosiaBiomes {
    private static final BiomeSubRegistryHelper HELPER = Michrosia.REGISTRY_HELPER.getBiomeSubHelper();

    public static final BiomeSubRegistryHelper.KeyedBiome MICHROSIA = HELPER.createBiome("michrosia", () -> createMichrosiaBiome(0.0F, 0.0F));
    public static final BiomeSubRegistryHelper.KeyedBiome MICHROSIA_HILLS = HELPER.createBiome("michrosia_hills", () -> createMichrosiaBiome(0.2F, 1.4F));

    public static void addBiomesToGeneration() {
        BiomeUtil.addHillBiome(MICHROSIA.getKey(), Pair.of(MICHROSIA.getKey(), 3), Pair.of(MICHROSIA_HILLS.getKey(), 1));

        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(MICHROSIA.getKey(), MichrosiaConfig.COMMON.michrosiaWeight.get()));
        BiomeManager.addBiome(BiomeManager.BiomeType.WARM, new BiomeManager.BiomeEntry(MICHROSIA_HILLS.getKey(), MichrosiaConfig.COMMON.michrosiaHillsWeight.get()));
    }

    public static void addBiomeTypes() {
        BiomeDictionary.addTypes(MICHROSIA.getKey(), Type.OVERWORLD, Type.FOREST, Type.RARE);
        BiomeDictionary.addTypes(MICHROSIA_HILLS.getKey(), Type.OVERWORLD, Type.FOREST, Type.RARE, Type.MOUNTAIN, Type.HILLS);
    }

    private static Biome createMichrosiaBiome(float depth, float scale) {
        return (new Biome.Builder()).precipitation(Biome.RainType.RAIN).category(Biome.Category.FOREST).depth(depth).scale(scale).temperature(0.75F).downfall(0.8F).setEffects((new BiomeAmbience.Builder()).withGrassColor(0x81C3FF).withFoliageColor(0x81C3FF).setWaterColor(0x4F97B6).setWaterFogColor(0x051E33).setFogColor(0xC0D8FF).withSkyColor(getSkyColorWithTemperatureModifier(0.75F)).setMoodSound(MoodSoundAmbience.DEFAULT_CAVE).build()).withMobSpawnSettings(new MobSpawnInfo.Builder().copy()).withGenerationSettings((new BiomeGenerationSettings.Builder()).withSurfaceBuilder(ConfiguredSurfaceBuilders.field_244178_j).build()).build();
    }

    private static int getSkyColorWithTemperatureModifier(float temperature) {
        float lvt_1_1_ = temperature / 3.0F;
        lvt_1_1_ = MathHelper.clamp(lvt_1_1_, -1.0F, 1.0F);
        return MathHelper.hsvToRGB(0.62222224F - lvt_1_1_ * 0.05F, 0.5F + lvt_1_1_ * 0.1F, 1.0F);
    }
}
