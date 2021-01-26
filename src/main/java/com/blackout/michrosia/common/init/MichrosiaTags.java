package com.blackout.michrosia.common.init;

import com.blackout.michrosia.Michrosia;
import net.minecraft.entity.EntityType;
import net.minecraft.item.Item;
import net.minecraft.tags.ITag;
import net.minecraft.tags.ItemTags;
import net.minecraft.util.ResourceLocation;

public class MichrosiaTags {
    public static class Items {
    }

    private static ITag.INamedTag<Item> createWrapperItemTag(String tagName) {
        return ItemTags.createOptional(new ResourceLocation(Michrosia.MODID, tagName));
    }
}