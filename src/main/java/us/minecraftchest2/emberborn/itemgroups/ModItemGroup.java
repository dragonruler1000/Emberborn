package us.minecraftchest2.emberborn.itemgroups;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKey;
import net.minecraft.text.Text;
import us.minecraftchest2.emberborn.blocks.ModBlocks;
import us.minecraftchest2.emberborn.item.ModItems;
import us.minecraftchest2.emberborn.registerers.ItemGroupRegisterer;

public class ModItemGroup {
    private static final RegistryKey<ItemGroup> MOD_ITEM_GROUP_KEY = ItemGroupRegisterer.register(
            FabricItemGroup.builder().displayName(Text.translatable("itemGroup.mod-items"))
                    .icon(() -> new ItemStack(ModItems.BRASS_INGOT)).build()
    );

    public static void initialize() {

        ItemGroupEvents.modifyEntriesEvent(MOD_ITEM_GROUP_KEY).register(itemGroup ->{
            //ingots
            itemGroup.add(ModItems.PEWTER_INGOT);
            itemGroup.add(ModItems.TIN_INGOT);
            itemGroup.add(ModItems.BRONZE_INGOT);
            itemGroup.add(ModItems.COPPER_INGOT);
            itemGroup.add(ModItems.ZINC_INGOT);
            itemGroup.add(ModItems.BRASS_INGOT);
            itemGroup.add(ModItems.IRON_INGOT);
            itemGroup.add(ModItems.STEEL_INGOT);
            //metal blocks
            itemGroup.add(ModBlocks.PEWTER_BLOCK);
            itemGroup.add(ModBlocks.TIN_BLOCK);
            itemGroup.add(ModBlocks.BRONZE_BLOCK);
            itemGroup.add(ModBlocks.COPPER_BLOCK);
            itemGroup.add(ModBlocks.ZINC_BLOCK);
            itemGroup.add(ModBlocks.BRASS_BLOCK);
            itemGroup.add(ModBlocks.IRON_BLOCK);
            itemGroup.add(ModBlocks.STEEL_BLOCK);
            //ores
            itemGroup.add(ModBlocks.TIN_ORE);
            itemGroup.add(ModBlocks.ZINC_ORE);
            itemGroup.add(ModBlocks.COPPER_ORE);
            itemGroup.add(ModBlocks.IRON_ORE);
            //viles
            itemGroup.add(ModItems.BRASS_VILE);
            itemGroup.add(ModItems.TIN_VILE);
        });
    }
}
