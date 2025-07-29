package us.minecraftchest2.emberborn.item;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import us.minecraftchest2.emberborn.registerers.ItemRegisterer;

public class ModItems {
    public static final Item PEWTER_INGOT = ItemRegisterer.register(
            "pewter_ingot", new Item.Settings().maxCount(64));
    public static final Item TIN_INGOT = ItemRegisterer.register(
            "tin_ingot", new Item.Settings().maxCount(64));
    public static final Item BRONZE_INGOT = ItemRegisterer.register(
            "bronze_ingot", new Item.Settings().maxCount(64));
    public static final Item COPPER_INGOT = ItemRegisterer.register(
            "copper_ingot", new Item.Settings().maxCount(64));
    public static final Item ZINC_INGOT = ItemRegisterer.register(
            "zinc_ingot", new Item.Settings().maxCount(64));
    public static final Item BRASS_INGOT = ItemRegisterer.register(
            "brass_ingot", new Item.Settings().maxCount(64));
    public static final Item STEEL_INGOT = ItemRegisterer.register(
            "steel_ingot", new Item.Settings().maxCount(64));

    public static void intialize() {
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup)
                -> itemGroup.add(ModItems.PEWTER_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup)
                -> itemGroup.add(ModItems.TIN_INGOT));;
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) ->
                itemGroup.add(ModItems.BRONZE_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) ->
                itemGroup.add(ModItems.COPPER_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) ->
                itemGroup.add(ModItems.ZINC_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) ->
                itemGroup.add(ModItems.BRASS_INGOT));
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register((itemGroup) ->
                itemGroup.add(ModItems.STEEL_INGOT));
    }
}
