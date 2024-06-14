package net.pxlstxl.anomaly;

import net.fabricmc.api.ModInitializer;

import net.pxlstxl.anomaly.item.ModItemGroups;
import net.pxlstxl.anomaly.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TheAnomalyCompendium implements ModInitializer {

	public static final String MOD_ID = "anomaly_compendium";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		LOGGER.info("Hello Fabric world!");
		ModItems.registerModItems();

	}
}