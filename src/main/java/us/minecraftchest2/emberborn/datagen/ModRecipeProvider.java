package us.minecraftchest2.emberborn.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.RegistryWrapper;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import us.minecraftchest2.emberborn.blocks.ModBlocks;
import us.minecraftchest2.emberborn.item.ModItems;

public class ModRecipeProvider extends FabricRecipeProvider {
    public ModRecipeProvider(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected RecipeGenerator getRecipeGenerator(RegistryWrapper.WrapperLookup registryLookup, RecipeExporter exporter) {
        return new RecipeGenerator(registryLookup, exporter) {
            @Override
            public void generate() {
                RegistryWrapper.Impl<Item> itemLookup = registries.getOrThrow(RegistryKeys.ITEM);
                this.offerSmelting(
                        List.of(ModBlocks.TIN_ORE),
                        RecipeCategory.MISC,
                        ModItems.TIN_INGOT,
                        0.1f,
                        300,
                        "ore_to_ingot/tin"
                );
                this.offerSmelting(
                        List.of(ModBlocks.IRON_ORE),
                        RecipeCategory.MISC,
                        ModItems.IRON_INGOT,
                        0.1f,
                        300,
                        "ore_to_ingot/iron"
                );
                this.offerSmelting(
                        List.of(ModBlocks.COPPER_ORE),
                        RecipeCategory.MISC,
                        ModItems.COPPER_INGOT,
                        0.1f,
                        300,
                        "ore_to_ingot/copper"
                );
                this.offerSmelting(
                        List.of(ModBlocks.ZINC_ORE),
                        RecipeCategory.MISC,
                        ModItems.ZINC_INGOT,
                        0.1f,
                        300,
                        "ore_to_ingot/zinc"
                );
            }
        };
    }

    @Override
    public String getName() {
        return "ModRecipeProvider";
    }
}