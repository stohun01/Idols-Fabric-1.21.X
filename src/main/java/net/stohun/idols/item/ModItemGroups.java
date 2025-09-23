package net.stohun.idols.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.stohun.idols.Idols;
import net.stohun.idols.block.ModBlocks;

public class ModItemGroups {

    public static final ItemGroup IDOLS_BLOCKS_GROUP = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(Idols.MOD_ID, "idols_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(ModBlocks.VIKING))
                    .displayName(Text.translatable("itemgroup.idols.idols_blocks"))
                    .entries((displayContext, entries) -> {
                        entries.add(ModBlocks.VIKING);
                        entries.add(ModBlocks.MOLTEN);
                        entries.add(ModBlocks.SPARTAN);

                    }).build());

    public static void registerItemGroups() {
        Idols.LOGGER.info("Registering Item Group for " + Idols.MOD_ID);
    }
}