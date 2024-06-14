package net.pxlstxl.anomaly.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.pxlstxl.anomaly.TheAnomalyCompendium;

public class ModItemGroups {
    public static final ItemGroup COMPENDIUM_GROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(TheAnomalyCompendium.MOD_ID, "anomaly_compendium"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.anomaly_compendium"))
                    .icon(() -> new ItemStack(ModItems.COMPENDIUM)).entries((displayContext, entries) -> {
                        entries.add(ModItems.COMPENDIUM);

                    }).build());




    public static void registerItemGroups() {
        TheAnomalyCompendium.LOGGER.info("Registering Item Groups for" + TheAnomalyCompendium.MOD_ID);

    }
}
