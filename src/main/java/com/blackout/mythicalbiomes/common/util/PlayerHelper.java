package com.blackout.mythicalbiomes.common.util;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.PlayerAdvancements;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;

import java.util.Objects;

public class PlayerHelper {
    @Deprecated
    public static void grantAdvancement(ServerPlayerEntity player, ResourceLocation id) {
        PlayerAdvancements advancements = player.getAdvancements();
        Advancement advancement = Objects.requireNonNull(player.getServer()).getAdvancementManager().getAdvancement(id);
        if (advancement != null) {
            for (String criterion : advancements.getProgress(advancement).getRemaningCriteria()) {
                advancements.grantCriterion(advancement, criterion);
            }
        }
    }

    @Deprecated
    public static void grantCriterion(ServerPlayerEntity player, ResourceLocation id, String criterion) {
        PlayerAdvancements advancements = player.getAdvancements();
        Advancement advancement = Objects.requireNonNull(player.getServer()).getAdvancementManager().getAdvancement(id);
        if (advancement != null) {
            advancements.grantCriterion(advancement, criterion);
        }
    }
}
