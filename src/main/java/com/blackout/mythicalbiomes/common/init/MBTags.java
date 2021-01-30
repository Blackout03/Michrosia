package com.blackout.mythicalbiomes.common.init;

import com.blackout.mythicalbiomes.MythicalBiomes;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class MBTags {
    public static class Items {
    }

    private static ITag.INamedTag<Item> createWrapperItemTag(String tagName) {
        return ItemTags.createOptional(new ResourceLocation(MythicalBiomes.MODID, tagName));
    }
}