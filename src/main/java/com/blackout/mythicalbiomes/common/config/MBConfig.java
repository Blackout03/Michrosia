//package com.blackout.mythicalbiomes.common.config;
//
//import net.minecraftforge.common.ForgeConfigSpec;
//import net.minecraftforge.common.ForgeConfigSpec.*;
//import org.apache.commons.lang3.tuple.Pair;
//
//public class MBConfig {
//
//    public static class Common {
//        public final ConfigValue<Integer> michrosiaForestWeight;
//        public final ConfigValue<Integer> michrosiaForestHillsWeight;
//        public final ConfigValue<Integer> rainbowDesertWeight;
//        public final ConfigValue<Integer> rainbowOceanWeight;
//
//
//        Common(ForgeConfigSpec.Builder builder) {
//            builder.push("worldgen");
//                builder.push("biomes");
//                    builder.push("michrosia");
//                        michrosiaForestWeight = builder
//                                .define("MythicalBiomes Forest weight", 3);
//                        michrosiaForestHillsWeight = builder
//                                .define("MythicalBiomes Forest Hills weight", 1);
//                    builder.pop();
//                    builder.push("rainbow");
//                        rainbowDesertWeight = builder
//                                .define("Rainbow Desert weight", 1);
//                        rainbowOceanWeight = builder
//                                .define("Rainbow Ocean weight", 1);
//                    builder.pop();
//                builder.pop();
//            builder.pop();
//        }
//    }
//
//    public static final ForgeConfigSpec COMMON_SPEC;
//    public static final Common COMMON;
//
//    static {
//        final Pair<Common, ForgeConfigSpec> commonSpecPair = new ForgeConfigSpec.Builder().configure(Common::new);
//        COMMON_SPEC = commonSpecPair.getRight();
//        COMMON = commonSpecPair.getLeft();
//    }
//}
