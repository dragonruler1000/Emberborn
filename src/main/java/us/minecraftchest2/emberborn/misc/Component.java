package us.minecraftchest2.emberborn.misc;

import net.minecraft.nbt.NbtCompound;

public interface Component {
    void readFromNbt(NbtCompound tag);
    void writeToNbt(NbtCompound tag);
}
