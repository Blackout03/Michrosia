package com.blackout.michrosia;

import com.blackout.michrosia.common.config.MichrosiaConfig;
import com.blackout.michrosia.common.init.*;
import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import net.minecraft.item.Rarity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.TextFormatting;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(Michrosia.MODID)
public class Michrosia
{
	public static final String MODID = "michrosia";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MODID);

    public static final Logger LOGGER = LogManager.getLogger();

    private static final Rarity rarity = Rarity.create("MICHROSIAN", TextFormatting.DARK_RED);


    public static ResourceLocation locate(String name)
    {
        return new ResourceLocation(MODID, name);
    }

    public static String find(String name)
    {
        return MODID + ":" + name;
    }


    public Michrosia() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        REGISTRY_HELPER.register(bus);
        MichrosiaTreeFeatures.FEATURES.register(bus);
        MichrosiaTreeFeatures.TREE_DECORATORS.register(bus);
        MichrosiaDataSerializers.SERIALIZERS.register(bus);

        bus.addListener(this::setupCommon);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> {
            bus.addListener(this::setupClient);
        });

        ModLoadingContext.get().registerConfig(ModConfig.Type.COMMON, MichrosiaConfig.COMMON_SPEC);
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            MichrosiaTreeFeatures.Configured.registerConfiguredFeatures();
            MichrosiaSurfaceBuilders.Configured.registerConfiguredSurfaceBuilders();
            MichrosiaBiomes.addBiomeTypes();
            MichrosiaBiomes.addBiomesToGeneration();
        });
    }

    private void setupClient(final FMLClientSetupEvent event) {
        MichrosiaCompat.setRenderLayers();
    }

    public static ResourceLocation prefix(String name) {
        return new ResourceLocation(MODID, name);
    }

    public static Rarity getRarity() {
        return rarity != null ? rarity : Rarity.EPIC;
    }
}
