package de.rafaelo_.bitsnbobs.item;

import de.rafaelo_.bitsnbobs.BitsNBobs;
import de.rafaelo_.bitsnbobs.block.ModBlocks;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups
{
    public static final ItemGroup BITSNBOBS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(BitsNBobs.MOD_ID,"bits_n_bobs"),
            FabricItemGroup.builder()
                    .icon(() -> new ItemStack(ModItems.GOLD_COIN))
                    .displayName(Text.translatable("itemgroup.bitsnbobs.bits_n_bobs"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModItems.GOLD_COIN);
                        entries.add(ModBlocks.GOLD_COIN_BLOCK);
                    })
                    .build());

    public static void registerItemGroups()
    {
        BitsNBobs.LOGGER.info("Registering Item Groups for" + BitsNBobs.MOD_ID);
    }
}
