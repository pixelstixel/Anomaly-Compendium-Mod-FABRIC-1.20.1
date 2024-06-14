package net.pxlstxl.anomaly.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.pxlstxl.anomaly.TheAnomalyCompendium;

public class ModItems {
   public static final Item COMPENDIUM = registerItem("anomaly_compendium", new Item(new FabricItemSettings()));

   // Add items here
   private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
       entries.add(COMPENDIUM);


   }


   private static Item registerItem(String name, Item item) {
       return Registry.register(Registries.ITEM, new Identifier(TheAnomalyCompendium.MOD_ID, name), item);

   }
   public static void registerModItems() {
       TheAnomalyCompendium.LOGGER.info("Registering Mod Items for" + TheAnomalyCompendium.MOD_ID);

       ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
   }
}
