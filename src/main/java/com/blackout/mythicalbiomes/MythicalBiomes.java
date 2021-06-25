package com.blackout.mythicalbiomes;

import com.blackout.mythicalbiomes.common.init.*;
import com.minecraftabnormals.abnormals_core.core.util.registry.RegistryHelper;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


@Mod(MythicalBiomes.MODID)
public class MythicalBiomes {
	public static final String MODID = "mythicalbiomes";
    public static final RegistryHelper REGISTRY_HELPER = new RegistryHelper(MODID);

    public static final Logger LOGGER = LogManager.getLogger();

    public MythicalBiomes() {
        IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        MinecraftForge.EVENT_BUS.register(this);

        REGISTRY_HELPER.register(bus);
        MBTreeFeatures.FEATURES.register(bus);
        MBTreeFeatures.TREE_DECORATORS.register(bus);
        MBDataSerializers.SERIALIZERS.register(bus);

        bus.addListener(this::setupCommon);
        DistExecutor.unsafeRunWhenOn(Dist.CLIENT, () -> () -> bus.addListener(this::setupClient));
    }

    private void setupCommon(final FMLCommonSetupEvent event) {
        event.enqueueWork(() -> {
            MBCompat.registerCompat();
            MBTreeFeatures.Configured.registerConfiguredFeatures();
            MBSurfaceBuilders.Configured.registerConfiguredSurfaceBuilders();
            MBBiomes.addBiomeTypes();
            MBBiomes.addBiomesToGeneration();
        });
    }

    private void setupClient(final FMLClientSetupEvent event) {
        MBCompat.setRenderLayers();
    }
}
