package us.minecraftchest2.emberborn.datagen;

import java.util.List;
import java.util.concurrent.CompletableFuture;

import net.minecraft.data.recipe.RecipeExporter;
import net.minecraft.data.recipe.RecipeGenerator;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
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
                        List.of(ModBlocks.ZINC_ORE),
                        RecipeCategory.MISC,
                        ModItems.ZINC_INGOT,
                        0.1f,
                        300,
                        "ore_to_ingot/zinc"
                );
                createShapeless(RecipeCategory.MISC, ModItems.BRASS_VIAL)
                        .input(ModItems.BRASS_INGOT).input(Items.POTION)
                        .criterion("has_item", conditionsFromItem(ModItems.BRASS_INGOT))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.TIN_VIAL)
                        .input(ModItems.TIN_INGOT).input(Items.POTION)
                        .criterion("has_item", conditionsFromItem(ModItems.TIN_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BRASS_BLOCK)
                        .pattern("bbb")
                        .pattern("bbb")
                        .pattern("bbb")
                        .input('b', ModItems.BRASS_INGOT)
                        .criterion(hasItem(ModItems.BRASS_INGOT), conditionsFromItem(ModItems.BRASS_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.TIN_BLOCK)
                        .pattern("ttt")
                        .pattern("ttt")
                        .pattern("ttt")
                        .input('t', ModItems.TIN_INGOT)
                        .criterion(hasItem(ModItems.TIN_INGOT), conditionsFromItem(ModItems.TIN_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.BRONZE_BLOCK)
                        .pattern("bbb")
                        .pattern("bbb")
                        .pattern("bbb")
                        .input('b', ModItems.BRONZE_INGOT)
                        .criterion(hasItem(ModItems.BRONZE_INGOT), conditionsFromItem(ModItems.BRONZE_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.PEWTER_BLOCK)
                        .pattern("bbb")
                        .pattern("bbb")
                        .pattern("bbb")
                        .input('b', ModItems.PEWTER_INGOT)
                        .criterion(hasItem(ModItems.PEWTER_INGOT), conditionsFromItem(ModItems.PEWTER_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.STEEL_BLOCK)
                        .pattern("bbb")
                        .pattern("bbb")
                        .pattern("bbb")
                        .input('b', ModItems.STEEL_INGOT)
                        .criterion(hasItem(ModItems.STEEL_INGOT), conditionsFromItem(ModItems.STEEL_INGOT))
                        .offerTo(exporter);
                createShaped(RecipeCategory.MISC, ModBlocks.ZINC_BLOCK)
                        .pattern("bbb")
                        .pattern("bbb")
                        .pattern("bbb")
                        .input('b', ModItems.ZINC_INGOT)
                        .criterion(hasItem(ModItems.ZINC_INGOT), conditionsFromItem(ModItems.ZINC_INGOT))
                        .offerTo(exporter);
                createShapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT, 2)
                        .input(Items.COPPER_INGOT)
                        .input(ModItems.TIN_INGOT)
                        .criterion("has_item", conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter, "bronze_from_copper_and_tin");
                createShapeless(RecipeCategory.MISC, ModItems.PEWTER_INGOT, 2)
                        .input(ModItems.TIN_INGOT)
                        .input(Items.COPPER_INGOT)
                        .criterion("has_item", conditionsFromItem(ModItems.TIN_INGOT))
                        .offerTo(exporter, "pewter_from_tin_and_copper");
                createShapeless(RecipeCategory.MISC, ModItems.BRASS_INGOT, 2)
                        .input(Items.COPPER_INGOT)
                        .input(ModItems.ZINC_INGOT)
                        .criterion("has_item", conditionsFromItem(Items.COPPER_INGOT))
                        .offerTo(exporter, "brass_from_copper_and_zinc");
                createShapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT)
                        .input(Items.IRON_INGOT)
                        .input(Items.COAL)
                        .criterion("has_item", conditionsFromItem(Items.IRON_INGOT))
                        .offerTo(exporter, "steel_from_iron_and_coal");
                createShapeless(RecipeCategory.MISC, ModItems.BRASS_INGOT)
                        .input(ModBlocks.BRASS_BLOCK)
                        .criterion("has_item", conditionsFromItem(ModBlocks.BRASS_BLOCK))
                        .offerTo(exporter, "brass_ingot_from_block");
                createShapeless(RecipeCategory.MISC, ModItems.TIN_INGOT)
                        .input(ModBlocks.TIN_BLOCK)
                        .criterion("has_item", conditionsFromItem(ModBlocks.TIN_BLOCK))
                        .offerTo(exporter, "tin_ingot_from_block");
                createShapeless(RecipeCategory.MISC, ModItems.BRONZE_INGOT)
                        .input(ModBlocks.BRONZE_BLOCK)
                        .criterion("has_item", conditionsFromItem(ModBlocks.BRONZE_BLOCK))
                        .offerTo(exporter, "bronze_ingot_from_block");
                createShapeless(RecipeCategory.MISC, ModItems.PEWTER_INGOT)
                        .input(ModBlocks.PEWTER_BLOCK)
                        .criterion("has_item", conditionsFromItem(ModBlocks.PEWTER_BLOCK))
                        .offerTo(exporter, "pewter_ingot_from_block");
                createShapeless(RecipeCategory.MISC, ModItems.STEEL_INGOT)
                        .input(ModBlocks.STEEL_BLOCK)
                        .criterion("has_item", conditionsFromItem(ModBlocks.STEEL_BLOCK))
                        .offerTo(exporter, "steel_ingot_from_block");
                createShapeless(RecipeCategory.MISC, ModItems.ZINC_INGOT)
                        .input(ModBlocks.ZINC_BLOCK)
                        .criterion("has_item", conditionsFromItem(ModBlocks.ZINC_BLOCK))
                        .offerTo(exporter, "zinc_ingot_from_block");
            }
        };
    }

    @Override
    public String getName() {
        return "ModRecipeProvider";
    }
}