package net.stohun.idols.block;

import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.BlockView;
import net.stohun.idols.Idols;
import net.stohun.idols.block.custom.*;

public class ModBlocks {

    public static final Block VIKING = registerBlock("viking",
            new VikingIdol(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block MOLTEN = registerBlock("molten",
            new MoltenIdol(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block SPARTAN = registerBlock("spartan",
            new SpartanIdol(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block SPECTRAL = registerBlock("spectral",
            new SpectralIdol(AbstractBlock.Settings.create().nonOpaque().emissiveLighting(ModBlocks::always).luminance(value -> 1)));

    public static final Block HELIOS = registerBlock("helios",
            new HeliosIdol(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block DRUID = registerBlock("druid",
            new DruidIdol(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block BLACKGOLD = registerBlock("black_gold",
            new BlackGoldIdol(AbstractBlock.Settings.create().nonOpaque()));

    public static final Block VALKYRIE = registerBlock("valkyrie",
            new ValkyrieIdol(AbstractBlock.Settings.create().nonOpaque()));

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

    }
}