package us.minecraftchest2.emberborn;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import us.minecraftchest2.emberborn.item.ModItems;

public class Emberborn implements ModInitializer {
	public static final String MOD_ID = "emberborn";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}