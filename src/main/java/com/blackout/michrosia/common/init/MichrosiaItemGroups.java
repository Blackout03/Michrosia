package com.blackout.michrosia.common.init;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class MichrosiaItemGroups {

    public static final ItemGroup MICHROSIA_BLOCKS = new ItemGroup("michrosia_blocks") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(MichrosiaBlocks.MICHROSIA_LOG.get());
        }
    };

    public static final ItemGroup MICHROSIA_ITEMS = new ItemGroup("michrosia_items") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(MichrosiaItems.MICHROSIA_BOAT.get());
        }
    };

    public static final ItemGroup MICHROSIA_TOOLS = new ItemGroup("michrosia_tools") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(MichrosiaItems.MICHROSIA_BOAT.get());
        }
    };

    public static final ItemGroup MICHROSIA_ARMOR = new ItemGroup("michrosia_armor") {
        @Override
        @OnlyIn(Dist.CLIENT)
        public ItemStack createIcon() {
            return new ItemStack(MichrosiaItems.MICHROSIA_BOAT.get());
        }
    };
}
