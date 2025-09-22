package net.stohun.idols.block;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.stohun.idols.Idols;
import net.stohun.idols.block.custom.VikingIdol;

public class ModBlocks {

    public static final Block TEST = registerBlock("test",
            new Block(AbstractBlock.Settings.create().strength(1f).sounds(BlockSoundGroup.WOOD)));

    public static final Block VIKING = registerBlock("viking",
            new VikingIdol(AbstractBlock.Settings.create().nonOpaque()));

    private static boolean always(BlockState state, BlockView world, BlockPos pos) {
        return true;
    }

    private static Block registerBlock(String name, Block block) {
        registerBlockItem(name, block);
        return Registry.register(Registries.BLOCK, Identifier.of(Idols.MOD_ID, name), block);
    }

    private static void registerBlockItem(String name, Block block) {
        Registry.register(Registries.ITEM, Identifier.of(Idols.MOD_ID, name),
                new BlockItem(block, new Item.Settings()));
    }

    public static void registerModBlocks() {
        Idols.LOGGER.info("Registering Mod Blocks for " + Idols.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(entries -> {
            entries.add(ModBlocks.TEST);
        });
    }
}