package me.withers_overhaul;

import me.withers_overhaul.registry.OverhaulBlocks;
import me.withers_overhaul.registry.OverhaulItemGroups;
import me.withers_overhaul.registry.OverhaulItems;
import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WithersOverhaul implements ModInitializer {
	public static final String MOD_ID = "withers_overhaul";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {

		OverhaulItems.registerItems();
		OverhaulBlocks.registerBlocks();
		OverhaulItemGroups.registerItemGroups();

		LOGGER.info("Wither's Overhaul is overhauling");

	}
}