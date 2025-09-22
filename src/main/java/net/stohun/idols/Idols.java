package net.stohun.idols;

import net.fabricmc.api.ModInitializer;

import net.stohun.idols.block.ModBlocks;
import net.stohun.idols.item.ModItemGroups;
import net.stohun.idols.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Idols implements ModInitializer {
	public static final String MOD_ID = "idols";

	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}