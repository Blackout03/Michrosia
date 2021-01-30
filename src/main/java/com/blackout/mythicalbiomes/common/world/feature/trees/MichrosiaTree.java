package com.blackout.mythicalbiomes.common.world.feature.trees;

import com.blackout.mythicalbiomes.common.init.MBTreeFeatures;
import net.minecraft.block.trees.Tree;
import net.minecraft.world.gen.feature.BaseTreeFeatureConfig;
import net.minecraft.world.gen.feature.ConfiguredFeature;
import net.minecraft.world.gen.feature.Feature;

import javax.annotation.Nullable;
import java.util.Random;

public class MichrosiaTree extends Tree {

    @Nullable
    protected ConfiguredFeature<BaseTreeFeatureConfig, ?> getTreeFeature(Random randomIn, boolean beehive) {
        return Feature.TREE.withConfiguration(beehive ? MBTreeFeatures.Configs.MICHROSIA_TREE_WITH_MORE_BEEHIVES_CONFIG : MBTreeFeatures.Configs.MICHROSIA_TREE_CONFIG);
    }
}
