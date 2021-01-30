package com.blackout.mythicalbiomes.common.init;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.BlockState;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraft.entity.EntityType;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockReader;
import net.minecraftforge.common.ToolType;

public class MBProperties {
    public static final AbstractBlock.Properties MELON_DIRT = AbstractBlock.Properties.create(Material.GOURD, MaterialColor.RED).hardnessAndResistance(1.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE);
    public static final AbstractBlock.Properties MELON_GRASS = AbstractBlock.Properties.create(Material.GOURD, MaterialColor.LIME).setRequiresTool().hardnessAndResistance(1.0F).sound(SoundType.WOOD).harvestTool(ToolType.AXE);

    public static final AbstractBlock.Properties CRIMSON_SAND = AbstractBlock.Properties.create(Material.SAND, MaterialColor.RED).hardnessAndResistance(0.5F).sound(SoundType.SAND).harvestTool(ToolType.SHOVEL);
    public static final AbstractBlock.Properties CRIMSON_SANDSTONE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.RED).setRequiresTool().hardnessAndResistance(0.8F).sound(SoundType.SAND).harvestTool(ToolType.PICKAXE);
    public static final AbstractBlock.Properties YELLOW_SAND = AbstractBlock.Properties.create(Material.SAND, MaterialColor.YELLOW).hardnessAndResistance(0.5F).sound(SoundType.SAND).harvestTool(ToolType.SHOVEL);
    public static final AbstractBlock.Properties YELLOW_SANDSTONE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.YELLOW).setRequiresTool().hardnessAndResistance(0.8F).sound(SoundType.SAND).harvestTool(ToolType.PICKAXE);
    public static final AbstractBlock.Properties GREEN_SAND = AbstractBlock.Properties.create(Material.SAND, MaterialColor.GREEN).hardnessAndResistance(0.5F).sound(SoundType.SAND).harvestTool(ToolType.SHOVEL);
    public static final AbstractBlock.Properties GREEN_SANDSTONE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GREEN).setRequiresTool().hardnessAndResistance(0.8F).sound(SoundType.SAND).harvestTool(ToolType.PICKAXE);
    public static final AbstractBlock.Properties BLUE_SAND = AbstractBlock.Properties.create(Material.SAND, MaterialColor.BLUE).hardnessAndResistance(0.5F).sound(SoundType.SAND).harvestTool(ToolType.SHOVEL);
    public static final AbstractBlock.Properties BLUE_SANDSTONE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).setRequiresTool().hardnessAndResistance(0.8F).sound(SoundType.SAND).harvestTool(ToolType.PICKAXE);
    public static final AbstractBlock.Properties PINK_SAND = AbstractBlock.Properties.create(Material.SAND, MaterialColor.PINK).hardnessAndResistance(0.5F).sound(SoundType.SAND).harvestTool(ToolType.SHOVEL);
    public static final AbstractBlock.Properties PINK_SANDSTONE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.PINK).setRequiresTool().hardnessAndResistance(0.8F).sound(SoundType.SAND).harvestTool(ToolType.PICKAXE);
    public static final AbstractBlock.Properties PURPLE_SAND = AbstractBlock.Properties.create(Material.SAND, MaterialColor.PURPLE).hardnessAndResistance(0.5F).sound(SoundType.SAND).harvestTool(ToolType.SHOVEL);
    public static final AbstractBlock.Properties PURPLE_SANDSTONE = AbstractBlock.Properties.create(Material.ROCK, MaterialColor.PURPLE).setRequiresTool().hardnessAndResistance(0.8F).sound(SoundType.SAND).harvestTool(ToolType.PICKAXE);

    public static final AbstractBlock.Properties MICHROSIA_PLANKS = AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).hardnessAndResistance(2.0F, 3.0F).sound(SoundType.WOOD);
    public static final AbstractBlock.Properties MICHROSIA_DOOR = AbstractBlock.Properties.create(Material.WOOD, MaterialColor.WOOD).notSolid().hardnessAndResistance(3.0F).sound(SoundType.WOOD);
    public static final AbstractBlock.Properties MICHROSIA_BUTTON = AbstractBlock.Properties.create(Material.MISCELLANEOUS).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD);
    public static final AbstractBlock.Properties MICHROSIA_PRESSURE_PLATE = AbstractBlock.Properties.create(Material.WOOD).doesNotBlockMovement().hardnessAndResistance(0.5F).sound(SoundType.WOOD);
    public static final AbstractBlock.Properties MICHROSIA_LADDER = AbstractBlock.Properties.create(Material.MISCELLANEOUS).notSolid().harvestTool(ToolType.AXE).hardnessAndResistance(0.4F).sound(SoundType.LADDER);
    public static final AbstractBlock.Properties MICHROSIA_BOOKSHELF = AbstractBlock.Properties.create(Material.WOOD).hardnessAndResistance(1.5F).sound(SoundType.WOOD);
    public static final AbstractBlock.Properties MICHROSIA_LOG = AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BROWN).hardnessAndResistance(2.0F).sound(SoundType.WOOD);
    public static final AbstractBlock.Properties MICHROSIA_SAPLING = AbstractBlock.Properties.create(Material.PLANTS).doesNotBlockMovement().tickRandomly().hardnessAndResistance(0.0F).sound(SoundType.PLANT);

    public static final AbstractBlock.Properties FLOWER_POT = AbstractBlock.Properties.create(Material.MISCELLANEOUS).hardnessAndResistance(0.0F).notSolid();

    public static AbstractBlock.Properties createLeaves(MaterialColor color) {
        return AbstractBlock.Properties.create(Material.LEAVES, color).harvestTool(ToolType.HOE).notSolid().hardnessAndResistance(0.2f).tickRandomly().sound(SoundType.PLANT).setAllowsSpawn(MBProperties::allowsSpawnOnLeaves).setSuffocates(MBProperties::isntSolid).setBlocksVision(MBProperties::isntSolid);
    }

    public static AbstractBlock.Properties createLeafCarpet(MaterialColor color) {
        return AbstractBlock.Properties.create(Material.CARPET, color).hardnessAndResistance(0.0F).sound(SoundType.PLANT).harvestTool(ToolType.HOE).notSolid();
    }

    public static boolean allowsSpawnOnLeaves(BlockState state, IBlockReader access, BlockPos pos, EntityType<?> entity) {
        return entity == EntityType.OCELOT || entity == EntityType.PARROT;
    }

    public static boolean alwaysAllowSpawn(BlockState state, IBlockReader reader, BlockPos pos, EntityType<?> entity) {
        return true;
    }

    public static boolean needsPostProcessing(BlockState state, IBlockReader reader, BlockPos pos) {
        return true;
    }

    public static boolean isntSolid(BlockState state, IBlockReader reader, BlockPos pos) {
        return false;
    }
}
