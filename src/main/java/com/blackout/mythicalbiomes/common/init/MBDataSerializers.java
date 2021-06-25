package com.blackout.mythicalbiomes.common.init;

import com.blackout.mythicalbiomes.MythicalBiomes;
import net.minecraft.network.PacketBuffer;
import net.minecraft.network.datasync.IDataSerializer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.DataSerializerEntry;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

@SuppressWarnings("ALL")
public class MBDataSerializers {
    public static final DeferredRegister<DataSerializerEntry> SERIALIZERS = DeferredRegister.create(ForgeRegistries.DATA_SERIALIZERS, MythicalBiomes.MODID);

    public static final IDataSerializer<ResourceLocation> RESOURCE_LOCATION = new IDataSerializer<ResourceLocation>() {
        @Override
        public void write(PacketBuffer buf, ResourceLocation value) {
            buf.writeResourceLocation(value);
        }

        @Override
        public ResourceLocation read(PacketBuffer buf) {
            return buf.readResourceLocation();
        }

        @Override
        public ResourceLocation copyValue(ResourceLocation value) {
            return new ResourceLocation(value.getNamespace(), value.getPath());
        }
    };

    static {
        SERIALIZERS.register("resource_location", () -> new DataSerializerEntry(RESOURCE_LOCATION));
    }
}
