package us.minecraftchest2.emberborn.registerers;

import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.util.Identifier;
import us.minecraftchest2.emberborn.Emberborn;

public class ItemGroupRegisterer {
    public static RegistryKey<ItemGroup> register(ItemGroup modItemGroup) {
        RegistryKey<ItemGroup> modItemGroupKey = RegistryKey.of(
                Registries.ITEM_GROUP.getKey(), Identifier.of(Emberborn.MOD_ID, "mod_item_group"));
        Registry.register(Registries.ITEM_GROUP, modItemGroupKey, modItemGroup);
        return modItemGroupKey;
    }
}
