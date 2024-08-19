package me.withers_overhaul.registry;

import me.withers_overhaul.WithersOverhaul;
import net.minecraft.block.*;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.UniformIntProvider;

import static net.minecraft.block.Blocks.createLightLevelFromLitBlockState;

public class OverhaulBlocks {

    //GABBRO
    public static final Block GABBRO = registerBlock("gabbro", new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block GABBRO_SLAB = registerBlock("gabbro_slab", new SlabBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block GABBRO_STAIRS = registerBlock("gabbro_stairs", new StairsBlock(OverhaulBlocks.GABBRO.getDefaultState(), Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block GABBRO_WALL = registerBlock("gabbro_wall", new WallBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block POLISHED_GABBRO = registerBlock("polished_gabbro", new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool()),true);
    public static final Block POLISHED_GABBRO_SLAB = registerBlock("polished_gabbro_slab", new SlabBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool()),true);
    public static final Block POLISHED_GABBRO_STAIRS = registerBlock("polished_gabbro_stairs", new StairsBlock(POLISHED_GABBRO.getDefaultState(), Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block POLISHED_GABBRO_WALL = registerBlock("polished_gabbro_wall", new WallBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block GABBRO_BRICKS = registerBlock("gabbro_bricks", new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block GABBRO_BRICK_SLAB = registerBlock("gabbro_brick_slab", new SlabBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block GABBRO_BRICK_STAIRS = registerBlock("gabbro_brick_stairs", new StairsBlock(GABBRO_BRICKS.getDefaultState(), Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block GABBRO_BRICK_WALL = registerBlock("gabbro_brick_wall", new WallBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block CHISELED_GABBRO = registerBlock("chiseled_gabbro", new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);

    //LIMESTONE
    public static final Block LIMESTONE = registerBlock("limestone", new Block(Block.Settings.create().strength(1.5f,4.0f).requiresTool()), true);
    public static final Block LIMESTONE_BRICKS = registerBlock("limestone_bricks", new Block(Block.Settings.create().strength(1.5f,4.0f).requiresTool()), true);

    //MARBLE
    public static final Block MARBLE = registerBlock("marble", new Block(Block.Settings.create().strength(1.5f,4.0f).requiresTool()), true);
    public static final Block MARBLE_BRICKS = registerBlock("marble_bricks", new Block(Block.Settings.create().strength(1.5f,4.0f).requiresTool()), true);

    //GNEISS
    public static final Block GNEISS = registerBlock("gneiss", new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block POLISHED_GNEISS = registerBlock("polished_gneiss", new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);

    //SHALE
    public static final Block SHALE = registerBlock("shale", new Block(Block.Settings.create().strength(1.5f,4.0f).requiresTool()), true);
    public static final Block SHALE_BRICKS = registerBlock("shale_bricks", new Block(Block.Settings.create().strength(1.5f,4.0f).requiresTool()), true);

    //PHYLLITE
    public static final Block PHYLLITE = registerBlock("phyllite", new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block POLISHED_PHYLLITE = registerBlock("polished_phyllite", new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);
    public static final Block PHYLLITE_BRICKS = registerBlock("phyllite_bricks", new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool()), true);

    //GYPSUM
    public static final Block GYPSUM = registerBlock("gypsum", new Block(Block.Settings.create().strength(0.8f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE)), true);

    //DOLOMITE
    public static final Block DOLOMITE = registerBlock("dolomite", new Block(Block.Settings.create().strength(0.8f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE)), true);

    //ORES

    //COAL
    public static final Block ANDESITE_COAL_ORE = registerOreBlock("andesite", "coal");
    public static final Block GRANITE_COAL_ORE = registerOreBlock("granite", "coal");
    public static final Block DIORITE_COAL_ORE = registerOreBlock("diorite","coal");
    public static final Block TUFF_COAL_ORE = registerOreBlock("tuff","coal");
    public static final Block GABBRO_COAL_ORE = registerOreBlock("gabbro","coal");
    public static final Block LIMESTONE_COAL_ORE = registerOreBlock("limestone","coal");
    public static final Block MARBLE_COAL_ORE = registerOreBlock("marble","coal");
    public static final Block GNEISS_COAL_ORE = registerOreBlock("gneiss","coal");
    public static final Block SHALE_COAL_ORE = registerOreBlock("shale","coal");
    public static final Block PHYLLITE_COAL_ORE = registerOreBlock("phyllite","coal");

    //IRON
    public static final Block ANDESITE_IRON_ORE = registerOreBlock("andesite", "iron");
    public static final Block GRANITE_IRON_ORE = registerOreBlock("granite", "iron");
    public static final Block DIORITE_IRON_ORE = registerOreBlock("diorite", "iron");
    public static final Block TUFF_IRON_ORE = registerOreBlock("tuff", "iron");
    public static final Block GABBRO_IRON_ORE = registerOreBlock("gabbro", "iron");
    public static final Block LIMESTONE_IRON_ORE = registerOreBlock("limestone", "iron");
    public static final Block MARBLE_IRON_ORE = registerOreBlock("marble", "iron");
    public static final Block GNEISS_IRON_ORE = registerOreBlock("gneiss", "iron");
    public static final Block SHALE_IRON_ORE = registerOreBlock("shale", "iron");
    public static final Block PHYLLITE_IRON_ORE = registerOreBlock("phyllite", "iron");

    //COPPER
    public static final Block ANDESITE_COPPER_ORE = registerOreBlock("andesite", "copper");
    public static final Block GRANITE_COPPER_ORE = registerOreBlock("granite", "copper");
    public static final Block DIORITE_COPPER_ORE = registerOreBlock("diorite", "copper");
    public static final Block TUFF_COPPER_ORE = registerOreBlock("tuff", "copper");
    public static final Block GABBRO_COPPER_ORE = registerOreBlock("gabbro", "copper");
    public static final Block LIMESTONE_COPPER_ORE = registerOreBlock("limestone", "copper");
    public static final Block MARBLE_COPPER_ORE = registerOreBlock("marble", "copper");
    public static final Block GNEISS_COPPER_ORE = registerOreBlock("gneiss", "copper");
    public static final Block SHALE_COPPER_ORE = registerOreBlock("shale", "copper");
    public static final Block PHYLLITE_COPPER_ORE = registerOreBlock("phyllite", "copper");

    //LAPIS_LAZULI
    public static final Block ANDESITE_LAPIS_ORE = registerOreBlock("andesite", "lapis");
    public static final Block GRANITE_LAPIS_ORE = registerOreBlock("granite", "lapis");
    public static final Block DIORITE_LAPIS_ORE = registerOreBlock("diorite", "lapis");
    public static final Block TUFF_LAPIS_ORE = registerOreBlock("tuff", "lapis");
    public static final Block GABBRO_LAPIS_ORE = registerOreBlock("gabbro", "lapis");
    public static final Block LIMESTONE_LAPIS_ORE = registerOreBlock("limestone", "lapis");
    public static final Block MARBLE_LAPIS_ORE = registerOreBlock("marble", "lapis");
    public static final Block GNEISS_LAPIS_ORE = registerOreBlock("gneiss", "lapis");
    public static final Block SHALE_LAPIS_ORE = registerOreBlock("shale", "lapis");
    public static final Block PHYLLITE_LAPIS_ORE = registerOreBlock("phyllite", "lapis");

    //GOLD
    public static final Block ANDESITE_GOLD_ORE = registerOreBlock("andesite", "gold");
    public static final Block GRANITE_GOLD_ORE = registerOreBlock("granite", "gold");
    public static final Block DIORITE_GOLD_ORE = registerOreBlock("diorite", "gold");
    public static final Block TUFF_GOLD_ORE = registerOreBlock("tuff", "gold");
    public static final Block GABBRO_GOLD_ORE = registerOreBlock("gabbro", "gold");
    public static final Block LIMESTONE_GOLD_ORE = registerOreBlock("limestone", "gold");
    public static final Block MARBLE_GOLD_ORE = registerOreBlock("marble", "gold");
    public static final Block GNEISS_GOLD_ORE = registerOreBlock("gneiss", "gold");
    public static final Block SHALE_GOLD_ORE = registerOreBlock("shale", "gold");
    public static final Block PHYLLITE_GOLD_ORE = registerOreBlock("phyllite", "gold" );

    //EMERALD
    public static final Block ANDESITE_EMERALD_ORE = registerOreBlock("andesite", "emerald");
    public static final Block GRANITE_EMERALD_ORE = registerOreBlock("granite", "emerald");
    public static final Block DIORITE_EMERALD_ORE = registerOreBlock("diorite", "emerald");
    public static final Block TUFF_EMERALD_ORE = registerOreBlock("tuff", "emerald");
    public static final Block GABBRO_EMERALD_ORE = registerOreBlock("gabbro", "emerald");
    public static final Block LIMESTONE_EMERALD_ORE = registerOreBlock("limestone", "emerald");
    public static final Block MARBLE_EMERALD_ORE = registerOreBlock("marble", "emerald");
    public static final Block GNEISS_EMERALD_ORE = registerOreBlock("gneiss", "emerald");
    public static final Block SHALE_EMERALD_ORE = registerOreBlock("shale", "emerald");
    public static final Block PHYLLITE_EMERALD_ORE = registerOreBlock("phyllite", "emerald");

    //REDSTONE
    public static final Block ANDESITE_REDSTONE_ORE = registerOreBlock("andesite", "redstone");
    public static final Block GRANITE_REDSTONE_ORE = registerOreBlock("granite", "redstone");
    public static final Block DIORITE_REDSTONE_ORE = registerOreBlock("diorite", "redstone");
    public static final Block TUFF_REDSTONE_ORE = registerOreBlock("tuff", "redstone");
    public static final Block GABBRO_REDSTONE_ORE = registerOreBlock("gabbro", "redstone");
    public static final Block LIMESTONE_REDSTONE_ORE = registerOreBlock("limestone", "redstone");
    public static final Block MARBLE_REDSTONE_ORE = registerOreBlock("marble", "redstone");
    public static final Block GNEISS_REDSTONE_ORE = registerOreBlock("gneiss", "redstone");
    public static final Block SHALE_REDSTONE_ORE = registerOreBlock("shale", "redstone");
    public static final Block PHYLLITE_REDSTONE_ORE = registerOreBlock("phyllite", "redstone");

    //DIAMOND
    public static final Block ANDESITE_DIAMOND_ORE = registerOreBlock("andesite", "diamond");
    public static final Block GRANITE_DIAMOND_ORE = registerOreBlock("granite", "diamond");
    public static final Block DIORITE_DIAMOND_ORE = registerOreBlock("diorite", "diamond");
    public static final Block TUFF_DIAMOND_ORE = registerOreBlock("tuff", "diamond");
    public static final Block GABBRO_DIAMOND_ORE = registerOreBlock("gabbro", "diamond");
    public static final Block LIMESTONE_DIAMOND_ORE = registerOreBlock("limestone", "diamond");
    public static final Block MARBLE_DIAMOND_ORE = registerOreBlock("marble", "diamond");
    public static final Block GNEISS_DIAMOND_ORE = registerOreBlock("gneiss", "diamond");
    public static final Block SHALE_DIAMOND_ORE = registerOreBlock("shale", "diamond");
    public static final Block PHYLLITE_DIAMOND_ORE = registerOreBlock("phyllite", "diamond");


    private static Block registerOreBlock(String stoneType, String oreType) {
        return switch (oreType) {
            case "iron", "copper", "gold" ->
                    registerBlock(stoneType + "_" + oreType + "_ore", new Block(Block.Settings.create().strength(3.0f, 3.0f).requiresTool()), true);
            case "coal" ->
                    registerBlock(stoneType + "_coal_ore", new ExperienceDroppingBlock(UniformIntProvider.create(0, 2), Block.Settings.create().strength(3.0f, 3.0f).requiresTool()), true);
            case "lapis" ->
                    registerBlock(stoneType + "_lapis_ore", new ExperienceDroppingBlock(UniformIntProvider.create(2, 5), Block.Settings.create().strength(3.0f, 3.0f).requiresTool()), true);
            case "emerald", "diamond" ->
                    registerBlock(stoneType + "_" + oreType + "_ore", new ExperienceDroppingBlock(UniformIntProvider.create(3, 7), Block.Settings.create().strength(3.0f, 3.0f).requiresTool()), true);
            case "redstone" ->
                    registerBlock(stoneType + "_redstone_ore", new RedstoneOreBlock(Block.Settings.create().strength(3.0f, 3.0f).requiresTool().ticksRandomly().luminance(createLightLevelFromLitBlockState(9))), true);
            default ->
                    throw new IllegalStateException("Unexpected value for 'oreType':" + oreType);

        };
    }

    //WOOD

    //LOGS
    public static final Block FIR_LOG = registerLogBlock("fir_log");
    public static final Block HEMLOCK_LOG = registerLogBlock("hemlock_log");
    public static final Block HOLLY_LOG = registerLogBlock("holly_log");
    public static final Block CEDAR_LOG = registerLogBlock("cedar_log");
    public static final Block REDWOOD_LOG = registerLogBlock("redwood_log");
    public static final Block PINE_LOG = registerLogBlock("pine_log");
    public static final Block LARCH_LOG = registerLogBlock("larch_log");
    public static final Block ASPEN_LOG = registerLogBlock("aspen_log");
    public static final Block MAPLE_LOG = registerLogBlock("maple_log");
    public static final Block POPLAR_LOG = registerLogBlock("poplar_log");
    public static final Block BEECH_LOG = registerLogBlock("beech_log");
    public static final Block SAKURA_LOG = registerLogBlock("sakura_log");
    public static final Block BAOBAB_LOG = registerLogBlock("baobab_log");
    public static final Block MAGNOLIA_LOG = registerLogBlock("magnolia_log");
    public static final Block JACARANDA_LOG = registerLogBlock("jacaranda_log");
    public static final Block EBONY_LOG = registerLogBlock("ebony_log");
    public static final Block PALO_VERDE_LOG = registerLogBlock("palo_verde_log");
    public static final Block TEAK_LOG = registerLogBlock("teak_log");
    public static final Block ELM_LOG = registerLogBlock("elm_log");
    public static final Block JOSHUA_LOG = registerLogBlock("joshua_log");
    public static final Block KAPOK_LOG = registerLogBlock("kapok_log");
    public static final Block MAHOGANY_LOG = registerLogBlock("mahogany_log");
    public static final Block EUCALYPTUS_LOG = registerLogBlock("eucalyptus_log");
    public static final Block JUNIPER_LOG = registerLogBlock("juniper_log");
    public static final Block WILLOW_LOG = registerLogBlock("willow_log");
    public static final Block CYPRESS_LOG = registerLogBlock("cypress_log");
    public static final Block PALM_LOG = registerLogBlock("palm_log");


    private static Block registerLogBlock(String name) {
        return registerBlock(name, new PillarBlock(Block.Settings.create().strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable()), true);
    }
    private static Block registerBlock(String name, Block block, boolean registerBlockItem) {
        if (registerBlockItem) {
            BlockItem blockItem = new BlockItem(block, new Item.Settings());
            Registry.register(Registries.ITEM, Identifier.of(WithersOverhaul.MOD_ID, name), blockItem);
        }
        return Registry.register(Registries.BLOCK, Identifier.of(WithersOverhaul.MOD_ID, name), block);
        }

    public static void registerBlocks() {

        WithersOverhaul.LOGGER.info("Registering blocks for " + WithersOverhaul.MOD_ID);

    }

}
