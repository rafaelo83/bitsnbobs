package de.rafaelo_.bitsnbobs.item;

import de.rafaelo_.bitsnbobs.BitsNBobs;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;

public class ModItems
{
    public static final Item GOLD_COIN = registerItem("gold_coin", new Item(new Item.Settings()));

    private static Item registerItem(String name,Item item)
    {
        return Registry.register(Registries.ITEM, Identifier.of(BitsNBobs.MOD_ID, name),item);
    }

    public static void registerModItems()
    {
        BitsNBobs.LOGGER.info("Registering Items for" + BitsNBobs.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(entries -> {
            entries.add(GOLD_COIN);
        });
    }
}
