package us.minecraftchest2.emberborn.misc;

import com.mojang.serialization.Codec;
import com.mojang.serialization.codecs.RecordCodecBuilder;
import io.netty.buffer.ByteBuf;
import net.minecraft.network.codec.PacketCodec;
import net.minecraft.network.codec.PacketCodecs;

public record ModCustomAttachedData(float metalPoints) {
    // Codec for saving/loading
    public static Codec<ModCustomAttachedData> CODEC = RecordCodecBuilder.create(instance -> instance.group(
            Codec.FLOAT.fieldOf("metalPoints").forGetter(ModCustomAttachedData::metalPoints)
    ).apply(instance, ModCustomAttachedData::new));

    // Packet codec for syncing
    public static PacketCodec<ByteBuf, ModCustomAttachedData> PACKET_CODEC = PacketCodecs.codec(CODEC);

    // Default = zero points
    public static ModCustomAttachedData DEFAULT = new ModCustomAttachedData(0);

    // Helper methods
    public ModCustomAttachedData add(float amount) {
        return new ModCustomAttachedData(this.metalPoints + amount);
    }

    public ModCustomAttachedData remove(float amount) {
        return new ModCustomAttachedData(Math.max(0, this.metalPoints - amount));
    }

    public ModCustomAttachedData clear() {
        return DEFAULT;
    }

    public ModCustomAttachedData addFloat(float v) {
    }
}
