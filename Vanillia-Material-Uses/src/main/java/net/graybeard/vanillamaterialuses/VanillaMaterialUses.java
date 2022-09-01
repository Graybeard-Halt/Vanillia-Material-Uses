package net.graybeard.vanillamaterialuses;

import net.fabricmc.api.ModInitializer;
import net.graybeard.vanillamaterialuses.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class VanillaMaterialUses implements ModInitializer {
	public static final String MOD_ID = "vanillamaterialuses";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItems.registerModItems();
	}
}
