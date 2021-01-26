package com.blackout.michrosia.common.util;

import net.minecraft.advancements.Advancement;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.PlayerAdvancements;
import net.minecraft.client.entity.player.ClientPlayerEntity;
import net.minecraft.client.multiplayer.ClientAdvancementManager;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.entity.player.ServerPlayerEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.server.ServerWorld;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.fml.DistExecutor;

public class PlayerHelper {
    @Deprecated
    public static void grantAdvancement(ServerPlayerEntity player, ResourceLocation id) {
        PlayerAdvancements advancements = player.getAdvancements();
        Advancement advancement = player.getServer().getAdvancementManager().getAdvancement(id);
        if (advancement != null) {
            for (String criterion : advancements.getProgress(advancement).getRemaningCriteria()) {
                advancements.grantCriterion(advancement, criterion);
            }
        }
    }

    @Deprecated
    public static void grantCriterion(ServerPlayerEntity player, ResourceLocation id, String criterion) {
        PlayerAdvancements advancements = player.getAdvancements();
        Advancement advancement = player.getServer().getAdvancementManager().getAdvancement(id);
        if (advancement != null) {
            advancements.grantCriterion(advancement, criterion);
        }
    }
}
