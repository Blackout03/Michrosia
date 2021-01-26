package com.blackout.michrosia.common.init;

import com.blackout.michrosia.Michrosia;
import com.minecraftabnormals.abnormals_core.common.items.AbnormalsSpawnEggItem;
import com.minecraftabnormals.abnormals_core.core.util.registry.ItemSubRegistryHelper;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = Michrosia.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MichrosiaItems {
    public static final ItemSubRegistryHelper HELPER = Michrosia.REGISTRY_HELPER.getItemSubHelper();

    public static final RegistryObject<Item> MICHROSIA_BOAT = HELPER.createBoatItem("michrosia", MichrosiaBlocks.MICHROSIA_PLANKS);
}