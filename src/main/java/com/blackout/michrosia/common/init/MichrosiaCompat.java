package com.blackout.michrosia.common.init;

import com.blackout.michrosia.Michrosia;
import com.minecraftabnormals.abnormals_core.core.registry.LootInjectionRegistry;
import com.minecraftabnormals.abnormals_core.core.util.DataUtil;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.RenderTypeLookup;
import net.minecraft.loot.LootTables;

public class MichrosiaCompat {

    public static void registerCompat() {
        registerLootInjectors();
        registerCompostables();
        registerFlammables();
    }

    public static void registerLootInjectors() {
        LootInjectionRegistry.LootInjector injector = new LootInjectionRegistry.LootInjector(Michrosia.MODID);
        injector.addLootInjection(injector.buildLootPool("shipwreck_supply", 1, 0), LootTables.CHESTS_SHIPWRECK_SUPPLY);
        injector.addLootInjection(injector.buildLootPool("simple_dungeon", 1, 0), LootTables.CHESTS_SIMPLE_DUNGEON);
    }

    public static void registerCompostables() {
        DataUtil.registerCompostable(MichrosiaBlocks.MICHROSIA_LEAVES.get(), 0.30F);
        DataUtil.registerCompostable(MichrosiaBlocks.MICHROSIA_SAPLING.get(), 0.30F);
        DataUtil.registerCompostable(MichrosiaBlocks.MICHROSIA_LEAF_CARPET.get(), 0.30F);
    }

    public static void registerFlammables() {
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_LEAVES.get(), 30, 60);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_LOG.get(), 5, 5);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_WOOD.get(), 5, 5);
        DataUtil.registerFlammable(MichrosiaBlocks.STRIPPED_MICHROSIA_LOG.get(), 5, 5);
        DataUtil.registerFlammable(MichrosiaBlocks.STRIPPED_MICHROSIA_WOOD.get(), 5, 5);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_PLANKS.get(), 5, 20);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_SLAB.get(), 5, 20);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_STAIRS.get(), 5, 20);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_FENCE.get(), 5, 20);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_FENCE_GATE.get(), 5, 20);
        DataUtil.registerFlammable(MichrosiaBlocks.VERTICAL_MICHROSIA_PLANKS.get(), 5, 20);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_LEAF_CARPET.get(), 30, 60);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_VERTICAL_SLAB.get(), 5, 20);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_BOOKSHELF.get(), 30, 20);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_CRATE.get(), 5, 20);
        DataUtil.registerFlammable(MichrosiaBlocks.MICHROSIA_BEEHIVE.get(), 5, 20);
    }

    public static void setRenderLayers() {
        RenderTypeLookup.setRenderLayer(MichrosiaBlocks.MICHROSIA_DOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MichrosiaBlocks.MICHROSIA_TRAPDOOR.get(), RenderType.getCutout());
        RenderTypeLookup.setRenderLayer(MichrosiaBlocks.MICHROSIA_LADDER.get(), RenderType.getCutout());

        RenderTypeLookup.setRenderLayer(MichrosiaBlocks.MICHROSIA_LEAVES.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(MichrosiaBlocks.MICHROSIA_LEAF_CARPET.get(), RenderType.getCutoutMipped());
        RenderTypeLookup.setRenderLayer(MichrosiaBlocks.MICHROSIA_SAPLING.get(), RenderType.getCutout());
    }
}
