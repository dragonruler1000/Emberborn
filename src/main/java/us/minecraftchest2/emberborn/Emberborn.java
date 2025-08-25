package us.minecraftchest2.emberborn;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.biome.v1.BiomeModification;
import net.fabricmc.fabric.api.biome.v1.BiomeModifications;
import net.fabricmc.fabric.api.biome.v1.BiomeSelectors;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.util.Identifier;
import net.minecraft.world.gen.GenerationStep;
import net.minecraft.world.gen.feature.PlacedFeature;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.minecraftchest2.emberborn.blocks.ModBlocks;
import us.minecraftchest2.emberborn.item.ModItems;
import us.minecraftchest2.emberborn.itemgroups.ModItemGroup;

public class Emberborn implements ModInitializer {
	public static final String MOD_ID = "emberborn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);
    public static final RegistryKey<PlacedFeature> TIN_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("emberborn", "tin_ore"));
    public static final RegistryKey<PlacedFeature> ZINC_ORE_PLACED_KEY = RegistryKey.of(RegistryKeys.PLACED_FEATURE, Identifier.of("emberborn", "zinc_ore"));

	@Override
	public void onInitialize() {
		ModItems.intialize();
		ModBlocks.initialize();
		ModItemGroup.initialize();
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, TIN_ORE_PLACED_KEY);
        BiomeModifications.addFeature(BiomeSelectors.foundInOverworld(), GenerationStep.Feature.UNDERGROUND_ORES, ZINC_ORE_PLACED_KEY);
	}
}