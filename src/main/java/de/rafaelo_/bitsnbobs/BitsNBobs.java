package de.rafaelo_.bitsnbobs;

import de.rafaelo_.bitsnbobs.block.ModBlocks;
import de.rafaelo_.bitsnbobs.item.ModItemGroups;
import de.rafaelo_.bitsnbobs.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BitsNBobs implements ModInitializer {
	public static final String MOD_ID = "bitsnbobs";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize()
	{
		ModItemGroups.registerItemGroups();

		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}
