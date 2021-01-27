package com.blackout.michrosia.common.init;

import com.blackout.michrosia.Michrosia;
import com.blackout.michrosia.common.block.MichrosiaLeavesBlock;
import com.blackout.michrosia.common.block.MichrosiaSandBlock;
import com.blackout.michrosia.common.world.feature.trees.MichrosiaTree;
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

@Mod.EventBusSubscriber(modid = Michrosia.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class MichrosiaBlocks {
    public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Michrosia.MODID);
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Michrosia.MODID);


    public static final BlockSubRegistryHelper HELPER = Michrosia.REGISTRY_HELPER.getBlockSubHelper();

    // SAND //
    public static final RegistryObject<Block> BLUE_SAND = HELPER.createBlock("blue_sand", () -> new MichrosiaSandBlock(3176111, MichrosiaProperties.BLUE_SAND), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> BLUE_SANDSTONE = HELPER.createBlock("blue_sandstone", () -> new Block(MichrosiaProperties.BLUE_SANDSTONE), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> GREEN_SAND = HELPER.createBlock("green_sand", () -> new MichrosiaSandBlock(2919462, MichrosiaProperties.GREEN_SAND), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> GREEN_SANDSTONE = HELPER.createBlock("green_sandstone", () -> new Block(MichrosiaProperties.GREEN_SANDSTONE), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> PINK_SAND = HELPER.createBlock("pink_sand", () -> new MichrosiaSandBlock(11481206, MichrosiaProperties.PINK_SAND), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> PINK_SANDSTONE = HELPER.createBlock("pink_sandstone", () -> new Block(MichrosiaProperties.PINK_SANDSTONE), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> PURPLE_SAND = HELPER.createBlock("purple_sand", () -> new MichrosiaSandBlock(5451951, MichrosiaProperties.PURPLE_SAND), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> PURPLE_SANDSTONE = HELPER.createBlock("purple_sandstone", () -> new Block(MichrosiaProperties.PURPLE_SANDSTONE), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> YELLOW_SAND = HELPER.createBlock("yellow_sand", () -> new MichrosiaSandBlock(11506224, MichrosiaProperties.YELLOW_SAND), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> YELLOW_SANDSTONE = HELPER.createBlock("yellow_sandstone", () -> new Block(MichrosiaProperties.YELLOW_SANDSTONE), MichrosiaItemGroups.MICHROSIA_BLOCKS);

    // MICHROSIA //
    public static final RegistryObject<Block> STRIPPED_MICHROSIA_LOG = HELPER.createBlock("stripped_michrosia_log", () -> new StrippedLogBlock(MichrosiaProperties.MICHROSIA_LOG), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> STRIPPED_MICHROSIA_WOOD = HELPER.createBlock("stripped_michrosia_wood", () -> new StrippedWoodBlock(MichrosiaProperties.MICHROSIA_LOG), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_LOG = HELPER.createBlock("michrosia_log", () -> new AbnormalsLogBlock(STRIPPED_MICHROSIA_LOG, MichrosiaProperties.MICHROSIA_LOG), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_WOOD = HELPER.createBlock("michrosia_wood", () -> new WoodBlock(STRIPPED_MICHROSIA_WOOD, MichrosiaProperties.MICHROSIA_LOG), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_PLANKS = HELPER.createBlock("michrosia_planks", () -> new PlanksBlock(MichrosiaProperties.MICHROSIA_PLANKS), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_SLAB = HELPER.createBlock("michrosia_slab", () -> new WoodSlabBlock(MichrosiaProperties.MICHROSIA_PLANKS), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_STAIRS = HELPER.createBlock("michrosia_stairs", () -> new WoodStairsBlock(MICHROSIA_PLANKS.get().getDefaultState(), MichrosiaProperties.MICHROSIA_PLANKS), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_FENCE = HELPER.createBlock("michrosia_fence", () -> new WoodFenceBlock(MichrosiaProperties.MICHROSIA_PLANKS), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_FENCE_GATE = HELPER.createBlock("michrosia_fence_gate", () -> new WoodFenceGateBlock(MichrosiaProperties.MICHROSIA_PLANKS), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_PRESSURE_PLATE = HELPER.createBlock("michrosia_pressure_plate", () -> new WoodPressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, MichrosiaProperties.MICHROSIA_PRESSURE_PLATE), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_DOOR = HELPER.createBlock("michrosia_door", () -> new WoodDoorBlock(MichrosiaProperties.MICHROSIA_DOOR), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_TRAPDOOR = HELPER.createBlock("michrosia_trapdoor", () -> new WoodTrapDoorBlock(MichrosiaProperties.MICHROSIA_DOOR), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_BUTTON = HELPER.createBlock("michrosia_button", () -> new AbnormalsWoodButtonBlock(MichrosiaProperties.MICHROSIA_BUTTON), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final Pair<RegistryObject<AbnormalsStandingSignBlock>, RegistryObject<AbnormalsWallSignBlock>> MICHROSIA_SIGNS = HELPER.createSignBlock("michrosia", MaterialColor.RED);

    public static final RegistryObject<Block> MICHROSIA_LEAVES = HELPER.createBlock("michrosia_leaves", () -> new MichrosiaLeavesBlock(MichrosiaProperties.createLeaves(MaterialColor.PURPLE)), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_SAPLING = HELPER.createBlock("michrosia_sapling", () -> new AbnormalsSaplingBlock(new MichrosiaTree(), MichrosiaProperties.MICHROSIA_SAPLING), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> POTTED_MICHROSIA_SAPLING = HELPER.createBlockNoItem("potted_michrosia_sapling", () -> new FlowerPotBlock(MichrosiaBlocks.MICHROSIA_SAPLING.get(), MichrosiaProperties.FLOWER_POT));

    public static final RegistryObject<Block> VERTICAL_MICHROSIA_PLANKS = HELPER.createCompatBlock("quark", "vertical_michrosia_planks", () -> new Block(MichrosiaProperties.MICHROSIA_PLANKS), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "michrosia_vertical_slab", () -> new VerticalSlabBlock(MichrosiaProperties.MICHROSIA_PLANKS), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_LADDER = HELPER.createCompatBlock("quark", "michrosia_ladder", () -> new AbnormalsLadderBlock(MichrosiaProperties.MICHROSIA_LADDER), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_BOOKSHELF = HELPER.createCompatBlock("quark", "michrosia_bookshelf", () -> new BookshelfBlock(MichrosiaProperties.MICHROSIA_BOOKSHELF), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_LEAF_CARPET = HELPER.createCompatBlock("quark", "michrosia_leaf_carpet", () -> new LeafCarpetBlock(MichrosiaProperties.createLeafCarpet(MaterialColor.PURPLE)), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final RegistryObject<Block> MICHROSIA_BEEHIVE = HELPER.createCompatBlock("buzzier_bees", "michrosia_beehive", () -> new AbnormalsBeehiveBlock(AbstractBlock.Properties.from(Blocks.BEEHIVE)), MichrosiaItemGroups.MICHROSIA_BLOCKS);
    public static final Pair<RegistryObject<AbnormalsChestBlock>, RegistryObject<AbnormalsTrappedChestBlock>> MICHROSIA_CHESTS = HELPER.createCompatChestBlocks("michrosia", MaterialColor.PURPLE, String.valueOf(MichrosiaItemGroups.MICHROSIA_BLOCKS));

    public static final RegistryObject<Block> MICHROSIA_CRATE = HELPER.createCompatBlock("quark", "michrosia_crate", () -> new Block(Block.Properties.create(Material.WOOD, MaterialColor.PURPLE).hardnessAndResistance(1.5F).sound(SoundType.WOOD)), MichrosiaItemGroups.MICHROSIA_BLOCKS);


    public static <B extends Block> RegistryObject<B> registerBlock(String name, Supplier<? extends B> supplier, ItemGroup itemGroup) {
        RegistryObject<B> block = MichrosiaBlocks.BLOCKS.register(name, supplier);
        ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().group(itemGroup)));
        return block;
    }
}