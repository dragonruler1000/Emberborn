package us.minecraftchest2.emberborn.datagen;

import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;
import net.minecraft.client.data.Models;
import us.minecraftchest2.emberborn.item.ModItems;

public class BlockModelProvider extends FabricModelProvider {
    public BlockModelProvider(FabricDataOutput output){
        super(output);
    }
    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
//        itemModelGenerator.register(ModItems.TIN_VIAL);
        itemModelGenerator.register(ModItems.TIN_VIAL, Models.GENERATED);

    }

    @Override
    public String getName() {
        return "Emberborn Block and Item Models";
    }
}
