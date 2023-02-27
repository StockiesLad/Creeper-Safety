package net.stockieslad.creepersafety;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CreeperSafety implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("creepersafety");

	@Override
	public void onInitialize() {
		LOGGER.info("Protecting our beautiful creepers");
	}
}
