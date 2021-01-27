package com.blackout.michrosia.common.config;

import it.unimi.dsi.fastutil.doubles.Double2BooleanRBTreeMap;
import net.minecraftforge.common.ForgeConfigSpec;
import net.minecraftforge.common.ForgeConfigSpec.*;
import org.apache.commons.lang3.tuple.Pair;

public class MichrosiaConfig {

    public static class Common {
        public final ConfigValue<String> michrosiaID;
        public final ConfigValue<String> originDimension;

        public final ConfigValue<Integer> michrosiaWeight;
        public final ConfigValue<Integer> michrosiaHillsWeight;
        public final ConfigValue<Integer> darkstoneHillsWeight;
        public final ConfigValue<Integer> rainbowDesertWeight;

        public final ConfigValue<Boolean> limitFarmAnimalSpawns;


        Common(ForgeConfigSpec.Builder builder) {
            builder.push("worldgen");
                builder.push("dimension");
                    michrosiaID = builder
                        .comment("Destination dimension for Michrosia Portals and some other logic as well.")
                        .worldRestart()
                        .define("Michrosia dimension ID", "michrosia:michrosia");
                    originDimension = builder
                        .comment("The dimension you can always travel to the Michrosia from, as well as the dimension you will return to. Defaults to the overworld. (domain:regname).")
                        .define("Origin dimension", "minecraft:overworld");
                    builder.push("biomes");
                        builder.push("michrosia");
                            michrosiaWeight = builder
                                    .define("Michrosia weight", 6);
                            michrosiaHillsWeight = builder
                                    .define("Michrosia hills weight", 4);
                        builder.pop();
                        builder.push("darkstone");
                            darkstoneHillsWeight = builder
                                    .define("Darkstone hills weight", 3);
                        builder.pop();
                        builder.push("rainbowdesert");
                            rainbowDesertWeight = builder
                                    .define("Rainbow Desert weight", 1);
                        builder.pop();
                    builder.pop();
                builder.pop();
            builder.pop();

            builder.push("entities");
                limitFarmAnimalSpawns = builder
                        .comment("Make farm animals spawn in less biomes to allow new mobs to take their place and diversify biome spawns")
                        .define("Limit farm animal spawns", true);
            builder.pop();
        }
    }

    public static final ForgeConfigSpec COMMON_SPEC;
    public static final Common COMMON;

    static {
        final Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
        COMMON_SPEC = commonSpecPair.getRight();
        COMMON = commonSpecPair.getLeft();
    }
}
