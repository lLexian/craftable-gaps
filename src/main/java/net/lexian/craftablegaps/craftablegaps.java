package net.lexian.craftablegaps;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class craftablegaps implements ModInitializer {
	public static final Logger LOGGER = LoggerFactory.getLogger("Lexian");

	@Override
	public void onInitialize() {

		LOGGER.info("Enchanted Golden Apples = Craftable!");
	}
}
