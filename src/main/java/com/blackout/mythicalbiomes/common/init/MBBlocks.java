package com.blackout.mythicalbiomes.common.init;

import com.blackout.mythicalbiomes.MythicalBiomes;
import com.blackout.mythicalbiomes.common.block.MichrosiaLeavesBlock;
import com.blackout.mythicalbiomes.common.block.MichrosiaSandBlock;
import com.blackout.mythicalbiomes.common.world.feature.trees.MichrosiaTree;
import com.minecraftabnormals.abnormals_core.common.blocks.*;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.chest.AbnormalsTrappedChestBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsStandingSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.sign.AbnormalsWallSignBlock;
import com.minecraftabnormals.abnormals_core.common.blocks.wood.*;
import com.minecraftabnormals.abnormals_core.core.util.registry.BlockSubRegistryHelper;
import com.mojang.datafixers.util.Pair;
import net.minecraft.block.*;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = MythicalBiomes.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MBBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MythicalBiomes.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, MythicalBiomes.MODID);


    public static final BlockSubRegistryHelper HELPER = MythicalBiomes.REGISTRY_HELPER.getBlockSubHelper();

    // MELON //
    public static final RegistryObject<Block> MELON_DIRT = HELPER.createBlock("melon_dirt", () -> new Block(MBProperties.MELON_DIRT), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MELON_GRASS = HELPER.createBlock("melon_grass", () -> new Block(MBProperties.MELON_GRASS), MBItemGroups.MICHROSIA_BLOCKS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> MELON_CHESTS = HELPER.createCompatChestBlocks("melon", MaterialColor.RED, String.valueOf(MBItemGroups.MICHROSIA_BLOCKS));

    // SAND //
    public static final RegistryObject<Block> CRIMSON_SAND = HELPER.createBlock("crimson_sand", () -> new MichrosiaSandBlock(13631488, MBProperties.CRIMSON_SAND), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> CRIMSON_SANDSTONE = HELPER.createBlock("crimson_sandstone", () -> new Block(MBProperties.CRIMSON_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> CHISELED_CRIMSON_SANDSTONE = HELPER.createBlock("chiseled_crimson_sandstone", () -> new Block(MBProperties.CRIMSON_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> YELLOW_SAND = HELPER.createBlock("yellow_sand", () -> new MichrosiaSandBlock(11506224, MBProperties.YELLOW_SAND), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> YELLOW_SANDSTONE = HELPER.createBlock("yellow_sandstone", () -> new Block(MBProperties.YELLOW_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> CHISELED_YELLOW_SANDSTONE = HELPER.createBlock("chiseled_yellow_sandstone", () -> new Block(MBProperties.YELLOW_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> GREEN_SAND = HELPER.createBlock("green_sand", () -> new MichrosiaSandBlock(2919462, MBProperties.GREEN_SAND), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> GREEN_SANDSTONE = HELPER.createBlock("green_sandstone", () -> new Block(MBProperties.GREEN_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> CHISELED_GREEN_SANDSTONE = HELPER.createBlock("chiseled_green_sandstone", () -> new Block(MBProperties.GREEN_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> BLUE_SAND = HELPER.createBlock("blue_sand", () -> new MichrosiaSandBlock(3176111, MBProperties.BLUE_SAND), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> BLUE_SANDSTONE = HELPER.createBlock("blue_sandstone", () -> new Block(MBProperties.BLUE_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> CHISELED_BLUE_SANDSTONE = HELPER.createBlock("chiseled_blue_sandstone", () -> new Block(MBProperties.BLUE_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> PINK_SAND = HELPER.createBlock("pink_sand", () -> new MichrosiaSandBlock(11481206, MBProperties.PINK_SAND), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> PINK_SANDSTONE = HELPER.createBlock("pink_sandstone", () -> new Block(MBProperties.PINK_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> CHISELED_PINK_SANDSTONE = HELPER.createBlock("chiseled_pink_sandstone", () -> new Block(MBProperties.PINK_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> PURPLE_SAND = HELPER.createBlock("purple_sand", () -> new MichrosiaSandBlock(5451951, MBProperties.PURPLE_SAND), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> PURPLE_SANDSTONE = HELPER.createBlock("purple_sandstone", () -> new Block(MBProperties.PURPLE_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> CHISELED_PURPLE_SANDSTONE = HELPER.createBlock("chiseled_purple_sandstone", () -> new Block(MBProperties.PURPLE_SANDSTONE), MBItemGroups.MICHROSIA_BLOCKS);

    // MICHROSIA //
    public static final RegistryObject<Block> STRIPPED_MICHROSIA_LOG = HELPER.createBlock("stripped_michrosia_log", () -> new StrippedLogBlock(MBProperties.MICHROSIA_LOG), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_MICHROSIA_WOOD = HELPER.createBlock("stripped_michrosia_wood", () -> new StrippedWoodBlock(MBProperties.MICHROSIA_LOG), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_LOG = HELPER.createBlock("michrosia_log", () -> new AbnormalsLogBlock(STRIPPED_MICHROSIA_LOG, MBProperties.MICHROSIA_LOG), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_WOOD = HELPER.createBlock("michrosia_wood", () -> new WoodBlock(STRIPPED_MICHROSIA_WOOD, MBProperties.MICHROSIA_LOG), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_PLANKS = HELPER.createBlock("michrosia_planks", () -> new PlanksBlock(MBProperties.MICHROSIA_PLANKS), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_SLAB = HELPER.createBlock("michrosia_slab", () -> new WoodSlabBlock(MBProperties.MICHROSIA_PLANKS), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_STAIRS = HELPER.createBlock("michrosia_stairs", () -> new WoodStairsBlock(MICHROSIA_PLANKS.get().getDefaultState(), MBProperties.MICHROSIA_PLANKS), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_FENCE = HELPER.createBlock("michrosia_fence", () -> new WoodFenceBlock(MBProperties.MICHROSIA_PLANKS), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_FENCE_GATE = HELPER.createBlock("michrosia_fence_gate", () -> new WoodFenceGateBlock(MBProperties.MICHROSIA_PLANKS), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_PRESSURE_PLATE = HELPER.createBlock("michrosia_pressure_plate", () -> new WoodPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, MBProperties.MICHROSIA_PRESSURE_PLATE), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_DOOR = HELPER.createBlock("michrosia_door", () -> new WoodDoorBlock(MBProperties.MICHROSIA_DOOR), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_TRAPDOOR = HELPER.createBlock("michrosia_trapdoor", () -> new WoodTrapDoorBlock(MBProperties.MICHROSIA_DOOR), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_BUTTON = HELPER.createBlock("michrosia_button", () -> new AbnormalsWoodButtonBlock(MBProperties.MICHROSIA_BUTTON), MBItemGroups.MICHROSIA_BLOCKS);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>, RegistryObject<AbnormalsWallSignBlock>> MICHROSIA_SIGNS = HELPER.createSignBlock("michrosia", MaterialColor.RED);

    public static final RegistryObject<Block> MICHROSIA_LEAVES = HELPER.createBlock("michrosia_leaves", () -> new MichrosiaLeavesBlock(MBProperties.createLeaves(MaterialColor.PURPLE)), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_SAPLING = HELPER.createBlock("michrosia_sapling", () -> new AbnormalsSaplingBlock(new MichrosiaTree(), MBProperties.MICHROSIA_SAPLING), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> POTTED_MICHROSIA_SAPLING = HELPER.createBlockNoItem("potted_michrosia_sapling", () -> new FlowerPotBlock(MBBlocks.MICHROSIA_SAPLING.get(), MBProperties.FLOWER_POT));

    public static final RegistryObject<Block> VERTICAL_MICHROSIA_PLANKS = HELPER.createCompatBlock("quark", "vertical_michrosia_planks", () -> new Block(MBProperties.MICHROSIA_PLANKS), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "michrosia_vertical_slab", () -> new VerticalSlabBlock(MBProperties.MICHROSIA_PLANKS), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_LADDER = HELPER.createCompatBlock("quark", "michrosia_ladder", () -> new AbnormalsLadderBlock(MBProperties.MICHROSIA_LADDER), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_BOOKSHELF = HELPER.createCompatBlock("quark", "michrosia_bookshelf", () -> new BookshelfBlock(MBProperties.MICHROSIA_BOOKSHELF), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_LEAF_CARPET = HELPER.createCompatBlock("quark", "michrosia_leaf_carpet", () -> new LeafCarpetBlock(MBProperties.createLeafCarpet(MaterialColor.PURPLE)), MBItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_BEEHIVE = HELPER.createCompatBlock("buzzier_bees", "michrosia_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.from(Blocks.BEEHIVE)), MBItemGroups.MICHROSIA_BLOCKS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> MICHROSIA_CHESTS = HELPER.createCompatChestBlocks("michrosia", MaterialColor.PURPLE, String.valueOf(MBItemGroups.MICHROSIA_BLOCKS));

    public static final RegistryObject<Block> MICHROSIA_CRATE = HELPER.createCompatBlock("quark", "michrosia_crate", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.PURPLE).hardnessAndResistance(1.5F).sound(SoundType.WOOD)), MBItemGroups.MICHROSIA_BLOCKS);


    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        RegistryObject<B> block = MBBlocks.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup)));
        return block;
    }
}