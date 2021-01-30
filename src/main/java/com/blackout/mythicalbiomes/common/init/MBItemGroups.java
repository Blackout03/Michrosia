package com.blackout.mythicalbiomes.common.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MBItemGroups {

    public static final ItemGroup MYTHICAL_BIOMES_BLOCKS = new ItemGroup("mythicalbiomes_blocks") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(MBBlocks.MICHROSIA_LOG.get());
        }
    };

    public static final ItemGroup MYTHICAL_BIOMES_ITEMS = new ItemGroup("mythicalbiomes_items") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(MBItems.MICHROSIA_BOAT.get());
        }
    };

    public static final ItemGroup MYTHICAL_BIOMES_TOOLS = new ItemGroup("mythicalbiomes_tools") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(MBItems.MICHROSIA_BOAT.get());
        }
    };

    public static final ItemGroup MYTHICAL_BIOMES_ARMOR = new ItemGroup("mythicalbiomes_armor") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(MBItems.MICHROSIA_BOAT.get());
        }
    };
}
