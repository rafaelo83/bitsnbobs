package de.rafaelo_.bitsnbobs.block;

import de.rafaelo_.bitsnbobs.BitsNBobs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks
{
    private static final Block GOLD_COIN_BLOCK = registerBlock("gold_coin_block",
            new Block(AbstractBlock.Settings.create().strength(4f).sounds(BlockSoundGroup.AMETHYST_BLOCK)));

    private static void registerBlockItemMethod(String name, Block block)
    {
        Registry.register(Registries.ITEM, Identifier.of(BitsNBobs.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    private static Block registerBlock(String name,Block block)
    {
        registerBlockItemMethod(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(BitsNBobs.MOD_ID, name), block);
    }

    public static void registerModBlocks()
    {
        BitsNBobs.LOGGER.info("Registering Mod Blocks for" + BitsNBobs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(GOLD_COIN_BLOCK);
        });
    }
}
