package com.blackout.mythicalbiomes.common.init;

import com.blackout.mythicalbiomes.MythicalBiomes;
import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.item.Item;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = MythicalBiomes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MBItems {
    public static final ItemSubRegistryHelper HELPER = MythicalBiomes.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> MICHROSIA_BOAT = HELPER.createBoatItem("michrosia", MBBlocks.MICHROSIA_PLANKS);
}