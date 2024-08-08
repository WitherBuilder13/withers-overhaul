package me.withers_overhaul;

import me.withers_overhaul.item.DynToolTipItem;
import me.withers_overhaul.registry.OverhaulItems;
import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.*;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import net.minecraft.util.math.intprovider.ConstantIntProvider;
import net.minecraft.util.math.intprovider.UniformIntProvider;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class WithersOverhaul implements ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	public static final String MOD_ID = "withers_overhaul";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);



	//ITEMS

	//RUNES
	public static final Item RUNE_AQUA_AFFINITY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_aqua_affinity"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_BANE_OF_ARTHROPODS =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_bane_of_arthropods"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_BLAST_PROTECTION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_blast_protection"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_BREACH =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_breach"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_CHANNELING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_channeling"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_DENSITY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_density"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_DEPTH_STRIDER =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_depth_strider"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_EFFICIENCY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_efficiency"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_FEATHER_FALLING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_feather_falling"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_FIRE_ASPECT =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_fire_aspect"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_FIRE_PROTECTION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_fire_protection"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_FLAME =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_flame"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_FORTUNE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_fortune"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_FROST_WALKER =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_frost_walker"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_IMPALING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_impaling"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_INFINITY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_infinity"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_KNOCKBACK =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_knockback"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_LOOTING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_looting"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_LOYALTY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_loyalty"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_LUCK_OF_THE_SEA =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_luck_of_the_sea"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_LURE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_lure"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_MENDING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_mending"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_MULTISHOT =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_multishot"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_PIERCING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_piercing"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_POWER =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_power"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_PROJECTILE_PROTECTION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_projectile_protection"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_PROTECTION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_protection"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_PUNCH =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_punch"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_QUICK_CHARGE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_quick_charge"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_RESPIRATION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_respiration"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_RIPTIDE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_riptide"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_SHARPNESS =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_sharpness"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_SILK_TOUCH =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_silk_touch"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_SMITE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_smite"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_SOUL_SPEED =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_soul_speed"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_SWEEPING_EDGE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_sweeping_edge"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_SWIFT_SNEAK =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_swift_sneak"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_THORNS =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_thorns"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_UNBREAKING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_unbreaking"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item RUNE_WIND_BURST =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","rune_wind_burst"),
					new DynToolTipItem(new Item.Settings()));

	//SCROLLS
	public static final Item SCROLL_AQUA_AFFINITY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_aqua_affinity"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_BANE_OF_ARTHROPODS =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_bane_of_arthropods"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_BLAST_PROTECTION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_blast_protection"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_BREACH =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_breach"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_CHANNELING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_channeling"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_DENSITY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_density"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_DEPTH_STRIDER =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_depth_strider"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_EFFICIENCY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_efficiency"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_FEATHER_FALLING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_feather_falling"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_FIRE_ASPECT =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_fire_aspect"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_FIRE_PROTECTION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_fire_protection"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_FLAME =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_flame"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_FORTUNE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_fortune"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_FROST_WALKER =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_frost_walker"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_IMPALING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_impaling"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_INFINITY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_infinity"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_KNOCKBACK =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_knockback"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_LOOTING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_looting"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_LOYALTY =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_loyalty"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_LUCK_OF_THE_SEA =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_luck_of_the_sea"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_LURE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_lure"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_MENDING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_mending"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_MULTISHOT =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_multishot"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_PIERCING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_piercing"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_POWER =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_power"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_PROJECTILE_PROTECTION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_projectile_protection"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_PROTECTION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_protection"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_PUNCH =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_punch"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_QUICK_CHARGE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_quick_charge"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_RESPIRATION =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_respiration"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_RIPTIDE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_riptide"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_SHARPNESS =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_sharpness"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_SILK_TOUCH =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_silk_touch"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_SMITE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_smite"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_SOUL_SPEED =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_soul_speed"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_SWEEPING_EDGE =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_sweeping_edge"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_SWIFT_SNEAK =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_swift_sneak"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_THORNS =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_thorns"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_UNBREAKING =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_unbreaking"),
					new DynToolTipItem(new Item.Settings()));
	public static final Item SCROLL_WIND_BURST =
			Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","scroll_wind_burst"),
					new DynToolTipItem(new Item.Settings()));


	//BLOCKS

	//GABBRO
	public static final Block GABBRO = new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final SlabBlock GABBRO_SLAB = new SlabBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final StairsBlock GABBRO_STAIRS = new StairsBlock(GABBRO.getDefaultState(), Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final WallBlock GABBRO_WALL = new WallBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final Block POLISHED_GABBRO = new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final SlabBlock POLISHED_GABBRO_SLAB = new SlabBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final StairsBlock POLISHED_GABBRO_STAIRS = new StairsBlock(POLISHED_GABBRO.getDefaultState(), Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final WallBlock POLISHED_GABBRO_WALL = new WallBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final Block GABBRO_BRICKS = new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final SlabBlock GABBRO_BRICK_SLAB = new SlabBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final StairsBlock GABBRO_BRICK_STAIRS = new StairsBlock(GABBRO_BRICKS.getDefaultState(), Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final WallBlock GABBRO_BRICK_WALL = new WallBlock(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final Block CHISELED_GABBRO = new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool());

	//LIMESTONE
	public static final Block LIMESTONE = new Block(Block.Settings.create().strength(1.0f,4.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block LIMESTONE_BRICKS = new Block(Block.Settings.create().strength(1.0f,4.0f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS));

	//MARBLE
	public static final Block MARBLE = new Block(Block.Settings.create().strength(0.8f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block MARBLE_BRICKS = new Block(Block.Settings.create().strength(0.8f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));

	//GNEISS
	public static final Block GNEISS = new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final Block POLISHED_GNEISS = new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool());

	//SHALE
	public static final Block SHALE = new Block(Block.Settings.create().strength(1.0f,4.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block SHALE_BRICKS = new Block(Block.Settings.create().strength(1.0f,4.0f).requiresTool().sounds(BlockSoundGroup.TUFF_BRICKS));

	//SLATE
	public static final Block PHYLLITE = new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final Block POLISHED_PHYLLITE = new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool());
	public static final Block PHYLLITE_BRICKS = new Block(Block.Settings.create().strength(1.5f,6.0f).requiresTool());

	//GYPSUM
	public static final Block GYPSUM = new Block(Block.Settings.create().strength(0.8f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));

	//DOLOMITE
	public static final Block DOLOMITE = new Block(Block.Settings.create().strength(0.8f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));

	//SOUL SANDSTONE
	public static final Block SOUL_SANDSTONE = new Block(Block.Settings.create().strength(0.8f).requiresTool());
	public static final Block CUT_SOUL_SANDSTONE = new Block(Block.Settings.create().strength(0.8f).requiresTool());
	public static final Block SMOOTH_SOUL_SANDSTONE = new Block(Block.Settings.create().strength(0.8f).requiresTool());

	//ORES

	//COAL
	public static final Block ANDESITE_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block GRANITE_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block DIORITE_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block CALCITE_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block TUFF_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(3.0f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block GABBRO_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block LIMESTONE_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block MARBLE_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block GNEISS_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block SHALE_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block PHYLLITE_COAL_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(0,2),Block.Settings.create().strength(3.0f,3.0f).requiresTool());

	//IRON
	public static final Block ANDESITE_IRON_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block GRANITE_IRON_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block DIORITE_IRON_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block CALCITE_IRON_ORE = new Block(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block TUFF_IRON_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block GABBRO_IRON_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block LIMESTONE_IRON_ORE = new Block(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block MARBLE_IRON_ORE = new Block(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block GNEISS_IRON_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block SHALE_IRON_ORE = new Block(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block PHYLLITE_IRON_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());


	//COPPER
	public static final Block ANDESITE_COPPER_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block GRANITE_COPPER_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block DIORITE_COPPER_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block CALCITE_COPPER_ORE = new Block(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block TUFF_COPPER_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block GABBRO_COPPER_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block LIMESTONE_COPPER_ORE = new Block(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block MARBLE_COPPER_ORE = new Block(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block GNEISS_COPPER_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block SHALE_COPPER_ORE = new Block(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block PHYLLITE_COPPER_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());

	//LAPIS_LAZULI
	public static final Block ANDESITE_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block GRANITE_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block DIORITE_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block CALCITE_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block TUFF_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(3.0f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block GABBRO_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block LIMESTONE_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block MARBLE_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block GNEISS_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block SHALE_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block PHYLLITE_LAPIS_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(2,5),Block.Settings.create().strength(3.0f,3.0f).requiresTool());

	//GOLD
	public static final Block ANDESITE_GOLD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block GRANITE_GOLD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block DIORITE_GOLD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block CALCITE_GOLD_ORE = new Block(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block TUFF_GOLD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block GABBRO_GOLD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block LIMESTONE_GOLD_ORE = new Block(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block MARBLE_GOLD_ORE = new Block(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block GNEISS_GOLD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block SHALE_GOLD_ORE = new Block(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block PHYLLITE_GOLD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());

	//EMERALD
	public static final Block ANDESITE_EMERALD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block GRANITE_EMERALD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block DIORITE_EMERALD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block CALCITE_EMERALD_ORE = new Block(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block TUFF_EMERALD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block GABBRO_EMERALD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block LIMESTONE_EMERALD_ORE = new Block(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block MARBLE_EMERALD_ORE = new Block(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block GNEISS_EMERALD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block SHALE_EMERALD_ORE = new Block(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block PHYLLITE_EMERALD_ORE = new Block(Block.Settings.create().strength(3.0f,3.0f).requiresTool());

/*
	//REDSTONE
	public static final Block ANDESITE_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(3.0f,3.0f).requiresTool().ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block GRANITE_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(3.0f,3.0f).requiresTool().ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block DIORITE_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(3.0f,3.0f).requiresTool().ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block CALCITE_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE).ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block TUFF_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(3.0f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF).ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block GABBRO_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(3.0f,3.0f).requiresTool().ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block LIMESTONE_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF).ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block MARBLE_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE).ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block GNEISS_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(3.0f,3.0f).requiresTool().ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block SHALE_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF).ticksRandomly().luminance(createLightLevelFromLitBlockState(9));
	public static final Block PHYLLITE_REDSTONE_ORE = new RedstoneOreBlock(Block.Settings.create().strength(3.0f,3.0f).requiresTool().ticksRandomly().luminance(createLightLevelFromLitBlockState(9));

	//DIAMOND
	public static final Block ANDESITE_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block GRANITE_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block DIORITE_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block CALCITE_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block TUFF_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(3.0f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block GABBRO_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block LIMESTONE_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block MARBLE_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(2.0f,3.0f).requiresTool().sounds(BlockSoundGroup.CALCITE));
	public static final Block GNEISS_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
	public static final Block SHALE_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(2.5f,3.0f).requiresTool().sounds(BlockSoundGroup.TUFF));
	public static final Block PHYLLITE_DIAMOND_ORE = new ExperienceDroppingBlock(UniformIntProvider.create(3,7),Block.Settings.create().strength(3.0f,3.0f).requiresTool());
*/

	//FIR WOOD SET
	public static final Block FIR_LOG = new PillarBlock(Block.Settings.create().strength(2.0F).sounds(BlockSoundGroup.WOOD).burnable());


	//ITEM GROUPS
	public static final RegistryKey<ItemGroup> WITHERS_OVERHAUL_KEY = RegistryKey.of(Registries.ITEM_GROUP.getKey(), Identifier.of(WithersOverhaul.MOD_ID, "withers_overhaul"));
	public static final ItemGroup WITHERS_OVERHAUL_ITEM_GROUP = FabricItemGroup.builder()
			.icon(() -> new ItemStack(GABBRO))
			.displayName(Text.translatable("item_group.withers_overhaul"))
			.build();

	@Override
	public void onInitialize() {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		//ITEMS

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
			content.addAfter(Items.OMINOUS_TRIAL_KEY, RUNE_AQUA_AFFINITY);
			content.addAfter(RUNE_AQUA_AFFINITY, RUNE_BANE_OF_ARTHROPODS);
			content.addAfter(RUNE_BANE_OF_ARTHROPODS, RUNE_BLAST_PROTECTION);
			content.addAfter(RUNE_BLAST_PROTECTION, RUNE_BREACH);
			content.addAfter(RUNE_BREACH, RUNE_CHANNELING);
			content.addAfter(RUNE_CHANNELING, RUNE_DENSITY);
			content.addAfter(RUNE_DENSITY, RUNE_DEPTH_STRIDER);
			content.addAfter(RUNE_DEPTH_STRIDER, RUNE_EFFICIENCY);
			content.addAfter(RUNE_EFFICIENCY, RUNE_FEATHER_FALLING);
			content.addAfter(RUNE_FEATHER_FALLING, RUNE_FIRE_ASPECT);
			content.addAfter(RUNE_FIRE_ASPECT, RUNE_FIRE_PROTECTION);
			content.addAfter(RUNE_FIRE_PROTECTION, RUNE_FLAME);
			content.addAfter(RUNE_FLAME, RUNE_FORTUNE);
			content.addAfter(RUNE_FORTUNE, RUNE_FROST_WALKER);
			content.addAfter(RUNE_FROST_WALKER, RUNE_IMPALING);
			content.addAfter(RUNE_IMPALING, RUNE_INFINITY);
			content.addAfter(RUNE_INFINITY, RUNE_KNOCKBACK);
			content.addAfter(RUNE_KNOCKBACK, RUNE_LOOTING);
			content.addAfter(RUNE_LOOTING, RUNE_LOYALTY);
			content.addAfter(RUNE_LOYALTY, RUNE_LUCK_OF_THE_SEA);
			content.addAfter(RUNE_LUCK_OF_THE_SEA, RUNE_LURE);
			content.addAfter(RUNE_LURE, RUNE_MENDING);
			content.addAfter(RUNE_MENDING, RUNE_MULTISHOT);
			content.addAfter(RUNE_MULTISHOT, RUNE_PIERCING);
			content.addAfter(RUNE_PIERCING, RUNE_POWER);
			content.addAfter(RUNE_POWER, RUNE_PROJECTILE_PROTECTION);
			content.addAfter(RUNE_PROJECTILE_PROTECTION, RUNE_PROTECTION);
			content.addAfter(RUNE_PROTECTION, RUNE_PUNCH);
			content.addAfter(RUNE_PUNCH, RUNE_QUICK_CHARGE);
			content.addAfter(RUNE_QUICK_CHARGE, RUNE_RESPIRATION);
			content.addAfter(RUNE_RESPIRATION, RUNE_RIPTIDE);
			content.addAfter(RUNE_RIPTIDE, RUNE_SHARPNESS);
			content.addAfter(RUNE_SHARPNESS, RUNE_SILK_TOUCH);
			content.addAfter(RUNE_SILK_TOUCH, RUNE_SMITE);
			content.addAfter(RUNE_SMITE, RUNE_SOUL_SPEED);
			content.addAfter(RUNE_SOUL_SPEED, RUNE_SWEEPING_EDGE);
			content.addAfter(RUNE_SWEEPING_EDGE, RUNE_SWIFT_SNEAK);
			content.addAfter(RUNE_SWIFT_SNEAK, RUNE_THORNS);
			content.addAfter(RUNE_THORNS, RUNE_UNBREAKING);
			content.addAfter(RUNE_UNBREAKING, RUNE_WIND_BURST);
			content.addAfter(RUNE_WIND_BURST, SCROLL_AQUA_AFFINITY);
			content.addAfter(SCROLL_AQUA_AFFINITY, SCROLL_BANE_OF_ARTHROPODS);
			content.addAfter(SCROLL_BANE_OF_ARTHROPODS, SCROLL_BLAST_PROTECTION);
			content.addAfter(SCROLL_BLAST_PROTECTION, SCROLL_BREACH);
			content.addAfter(SCROLL_BREACH, SCROLL_CHANNELING);
			content.addAfter(SCROLL_CHANNELING, SCROLL_DENSITY);
			content.addAfter(SCROLL_DENSITY, SCROLL_DEPTH_STRIDER);
			content.addAfter(SCROLL_DEPTH_STRIDER, SCROLL_EFFICIENCY);
			content.addAfter(SCROLL_EFFICIENCY, SCROLL_FEATHER_FALLING);
			content.addAfter(SCROLL_FEATHER_FALLING, SCROLL_FIRE_ASPECT);
			content.addAfter(SCROLL_FIRE_ASPECT, SCROLL_FIRE_PROTECTION);
			content.addAfter(SCROLL_FIRE_PROTECTION, SCROLL_FLAME);
			content.addAfter(SCROLL_FLAME, SCROLL_FORTUNE);
			content.addAfter(SCROLL_FORTUNE, SCROLL_FROST_WALKER);
			content.addAfter(SCROLL_FROST_WALKER, SCROLL_IMPALING);
			content.addAfter(SCROLL_IMPALING, SCROLL_INFINITY);
			content.addAfter(SCROLL_INFINITY, SCROLL_KNOCKBACK);
			content.addAfter(SCROLL_KNOCKBACK, SCROLL_LOOTING);
			content.addAfter(SCROLL_LOOTING, SCROLL_LOYALTY);
			content.addAfter(SCROLL_LOYALTY, SCROLL_LUCK_OF_THE_SEA);
			content.addAfter(SCROLL_LUCK_OF_THE_SEA, SCROLL_LURE);
			content.addAfter(SCROLL_LURE, SCROLL_MENDING);
			content.addAfter(SCROLL_MENDING, SCROLL_MULTISHOT);
			content.addAfter(SCROLL_MULTISHOT, SCROLL_PIERCING);
			content.addAfter(SCROLL_PIERCING, SCROLL_POWER);
			content.addAfter(SCROLL_POWER, SCROLL_PROJECTILE_PROTECTION);
			content.addAfter(SCROLL_PROJECTILE_PROTECTION, SCROLL_PROTECTION);
			content.addAfter(SCROLL_PROTECTION, SCROLL_PUNCH);
			content.addAfter(SCROLL_PUNCH, SCROLL_QUICK_CHARGE);
			content.addAfter(SCROLL_QUICK_CHARGE, SCROLL_RESPIRATION);
			content.addAfter(SCROLL_RESPIRATION, SCROLL_RIPTIDE);
			content.addAfter(SCROLL_RIPTIDE, SCROLL_SHARPNESS);
			content.addAfter(SCROLL_SHARPNESS, SCROLL_SILK_TOUCH);
			content.addAfter(SCROLL_SILK_TOUCH, SCROLL_SMITE);
			content.addAfter(SCROLL_SMITE, SCROLL_SOUL_SPEED);
			content.addAfter(SCROLL_SOUL_SPEED, SCROLL_SWEEPING_EDGE);
			content.addAfter(SCROLL_SWEEPING_EDGE, SCROLL_SWIFT_SNEAK);
			content.addAfter(SCROLL_SWIFT_SNEAK, SCROLL_THORNS);
			content.addAfter(SCROLL_THORNS, SCROLL_UNBREAKING);
			content.addAfter(SCROLL_UNBREAKING, SCROLL_WIND_BURST);
		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {
					content.addAfter(Items.POLISHED_ANDESITE_SLAB, GABBRO);
					content.addAfter(GABBRO, GABBRO_STAIRS);
					content.addAfter(GABBRO_STAIRS, GABBRO_SLAB);
					content.addAfter(GABBRO_SLAB, GABBRO_WALL);
					content.addAfter(GABBRO_WALL, CHISELED_GABBRO);
					content.addAfter(CHISELED_GABBRO, POLISHED_GABBRO);
					content.addAfter(POLISHED_GABBRO, POLISHED_GABBRO_STAIRS);
					content.addAfter(POLISHED_GABBRO_STAIRS, POLISHED_GABBRO_SLAB);
					content.addAfter(POLISHED_GABBRO_SLAB, POLISHED_GABBRO_WALL);
					content.addAfter(POLISHED_GABBRO_WALL, GABBRO_BRICKS);
					content.addAfter(GABBRO_BRICKS, GABBRO_BRICK_STAIRS);
					content.addAfter(GABBRO_BRICK_STAIRS, GABBRO_BRICK_SLAB);
					content.addAfter(GABBRO_BRICK_SLAB, GABBRO_BRICK_WALL);
					content.addAfter(GABBRO_BRICK_WALL, LIMESTONE);
					content.addAfter(LIMESTONE, LIMESTONE_BRICKS);
					content.addAfter(LIMESTONE_BRICKS, MARBLE);
					content.addAfter(MARBLE, MARBLE_BRICKS);
					content.addAfter(MARBLE_BRICKS, GNEISS);
					content.addAfter(GNEISS, POLISHED_GNEISS);
					content.addAfter(POLISHED_GNEISS, SHALE);
					content.addAfter(SHALE, SHALE_BRICKS);
					content.addAfter(SHALE_BRICKS, PHYLLITE);
					content.addAfter(PHYLLITE, POLISHED_PHYLLITE);
					content.addAfter(POLISHED_PHYLLITE, PHYLLITE_BRICKS);
					content.addAfter(Blocks.AMETHYST_BLOCK, GYPSUM);
					content.addAfter(GYPSUM, DOLOMITE);
					content.addAfter(Items.RED_NETHER_BRICK_WALL, SOUL_SANDSTONE);
					content.addAfter(SOUL_SANDSTONE, SMOOTH_SOUL_SANDSTONE);
					content.addAfter(SMOOTH_SOUL_SANDSTONE, CUT_SOUL_SANDSTONE);

		});

		ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {
					content.addAfter(Blocks.TUFF, GABBRO);
					content.addAfter(GABBRO, LIMESTONE);
					content.addAfter(LIMESTONE, MARBLE);
					content.addAfter(MARBLE, GNEISS);
					content.addAfter(GNEISS, SHALE);
					content.addAfter(SHALE, PHYLLITE);
					content.addAfter(Blocks.AMETHYST_CLUSTER, GYPSUM);
					content.addAfter(GYPSUM, DOLOMITE);
					content.addAfter(Items.DEEPSLATE_COAL_ORE, GRANITE_COAL_ORE);
					content.addAfter(GRANITE_COAL_ORE, DIORITE_COAL_ORE);
					content.addAfter(DIORITE_COAL_ORE, ANDESITE_COAL_ORE);
					content.addAfter(ANDESITE_COAL_ORE, CALCITE_COAL_ORE);
					content.addAfter(CALCITE_COAL_ORE, TUFF_COAL_ORE);
					content.addAfter(TUFF_COAL_ORE, GABBRO_COAL_ORE);
					content.addAfter(GABBRO_COAL_ORE, LIMESTONE_COAL_ORE);
					content.addAfter(LIMESTONE_COAL_ORE, MARBLE_COAL_ORE);
					content.addAfter(MARBLE_COAL_ORE, GNEISS_COAL_ORE);
					content.addAfter(GNEISS_COAL_ORE, SHALE_COAL_ORE);
					content.addAfter(SHALE_COAL_ORE, PHYLLITE_COAL_ORE);
					content.addAfter(Items.DEEPSLATE_IRON_ORE, GRANITE_IRON_ORE);
					content.addAfter(GRANITE_IRON_ORE, DIORITE_IRON_ORE);
					content.addAfter(DIORITE_IRON_ORE, ANDESITE_IRON_ORE);
					content.addAfter(ANDESITE_IRON_ORE, CALCITE_IRON_ORE);
					content.addAfter(CALCITE_IRON_ORE, TUFF_IRON_ORE);
					content.addAfter(TUFF_IRON_ORE, GABBRO_IRON_ORE);
					content.addAfter(GABBRO_IRON_ORE, LIMESTONE_IRON_ORE);
					content.addAfter(LIMESTONE_IRON_ORE, MARBLE_IRON_ORE);
					content.addAfter(MARBLE_IRON_ORE, GNEISS_IRON_ORE);
					content.addAfter(GNEISS_IRON_ORE, SHALE_IRON_ORE);
					content.addAfter(SHALE_IRON_ORE, PHYLLITE_IRON_ORE);
					content.addAfter(Items.DEEPSLATE_COPPER_ORE, GRANITE_COPPER_ORE);
					content.addAfter(GRANITE_COPPER_ORE, DIORITE_COPPER_ORE);
					content.addAfter(DIORITE_COPPER_ORE, ANDESITE_COPPER_ORE);
					content.addAfter(ANDESITE_COPPER_ORE, CALCITE_COPPER_ORE);
					content.addAfter(CALCITE_COPPER_ORE, TUFF_COPPER_ORE);
					content.addAfter(TUFF_COPPER_ORE, GABBRO_COPPER_ORE);
					content.addAfter(GABBRO_COPPER_ORE, LIMESTONE_COPPER_ORE);
					content.addAfter(LIMESTONE_COPPER_ORE, MARBLE_COPPER_ORE);
					content.addAfter(MARBLE_COPPER_ORE, GNEISS_COPPER_ORE);
					content.addAfter(GNEISS_COPPER_ORE, SHALE_COPPER_ORE);
					content.addAfter(SHALE_COPPER_ORE, PHYLLITE_COPPER_ORE);
					content.addAfter(Items.DEEPSLATE_LAPIS_ORE, GRANITE_LAPIS_ORE);
					content.addAfter(GRANITE_LAPIS_ORE, DIORITE_LAPIS_ORE);
					content.addAfter(DIORITE_LAPIS_ORE, ANDESITE_LAPIS_ORE);
					content.addAfter(ANDESITE_LAPIS_ORE, CALCITE_LAPIS_ORE);
					content.addAfter(CALCITE_LAPIS_ORE, TUFF_LAPIS_ORE);
					content.addAfter(TUFF_LAPIS_ORE, GABBRO_LAPIS_ORE);
					content.addAfter(GABBRO_LAPIS_ORE, LIMESTONE_LAPIS_ORE);
					content.addAfter(LIMESTONE_LAPIS_ORE, MARBLE_LAPIS_ORE);
					content.addAfter(MARBLE_LAPIS_ORE, GNEISS_LAPIS_ORE);
					content.addAfter(GNEISS_LAPIS_ORE, SHALE_LAPIS_ORE);
					content.addAfter(SHALE_LAPIS_ORE, PHYLLITE_LAPIS_ORE);
					content.addAfter(Items.DEEPSLATE_GOLD_ORE, GRANITE_GOLD_ORE);
					content.addAfter(GRANITE_GOLD_ORE, DIORITE_GOLD_ORE);
					content.addAfter(DIORITE_GOLD_ORE, ANDESITE_GOLD_ORE);
					content.addAfter(ANDESITE_GOLD_ORE, CALCITE_GOLD_ORE);
					content.addAfter(CALCITE_GOLD_ORE, TUFF_GOLD_ORE);
					content.addAfter(TUFF_GOLD_ORE, GABBRO_GOLD_ORE);
					content.addAfter(GABBRO_GOLD_ORE, LIMESTONE_GOLD_ORE);
					content.addAfter(LIMESTONE_GOLD_ORE, MARBLE_GOLD_ORE);
					content.addAfter(MARBLE_GOLD_ORE, GNEISS_GOLD_ORE);
					content.addAfter(GNEISS_GOLD_ORE, SHALE_GOLD_ORE);
					content.addAfter(SHALE_GOLD_ORE, PHYLLITE_GOLD_ORE);
					content.addAfter(Items.DEEPSLATE_EMERALD_ORE, GRANITE_EMERALD_ORE);
					content.addAfter(GRANITE_EMERALD_ORE, DIORITE_EMERALD_ORE);
					content.addAfter(DIORITE_EMERALD_ORE, ANDESITE_EMERALD_ORE);
					content.addAfter(ANDESITE_EMERALD_ORE, CALCITE_EMERALD_ORE);
					content.addAfter(CALCITE_EMERALD_ORE, TUFF_EMERALD_ORE);
					content.addAfter(TUFF_EMERALD_ORE, GABBRO_EMERALD_ORE);
					content.addAfter(GABBRO_EMERALD_ORE, LIMESTONE_EMERALD_ORE);
					content.addAfter(LIMESTONE_EMERALD_ORE, MARBLE_EMERALD_ORE);
					content.addAfter(MARBLE_EMERALD_ORE, GNEISS_EMERALD_ORE);
					content.addAfter(GNEISS_EMERALD_ORE, SHALE_EMERALD_ORE);
					content.addAfter(SHALE_EMERALD_ORE, PHYLLITE_EMERALD_ORE);
		});

		ItemGroupEvents.modifyEntriesEvent(WITHERS_OVERHAUL_KEY).register(itemGroup -> {
					itemGroup.add(GABBRO);
		});

		//BLOCKS

		//GABBRO
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gabbro"), GABBRO);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro"), new BlockItem(GABBRO, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","gabbro_slab"), GABBRO_SLAB);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro_slab"), new BlockItem(GABBRO_SLAB, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","gabbro_stairs"), GABBRO_STAIRS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","gabbro_stairs"), new BlockItem(GABBRO_STAIRS, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","gabbro_wall"), GABBRO_WALL);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","gabbro_wall"), new BlockItem(GABBRO_WALL, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","polished_gabbro"), POLISHED_GABBRO);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","polished_gabbro"), new BlockItem(POLISHED_GABBRO, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","polished_gabbro_slab"), POLISHED_GABBRO_SLAB);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","polished_gabbro_slab"), new BlockItem(POLISHED_GABBRO_SLAB, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","polished_gabbro_stairs"), POLISHED_GABBRO_STAIRS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","polished_gabbro_stairs"), new BlockItem(POLISHED_GABBRO_STAIRS, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","polished_gabbro_wall"), POLISHED_GABBRO_WALL);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","polished_gabbro_wall"), new BlockItem(POLISHED_GABBRO_WALL, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gabbro_bricks"), GABBRO_BRICKS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro_bricks"), new BlockItem(GABBRO_BRICKS, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","gabbro_brick_slab"), GABBRO_BRICK_SLAB);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro_brick_slab"), new BlockItem(GABBRO_BRICK_SLAB, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","gabbro_brick_stairs"), GABBRO_BRICK_STAIRS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","gabbro_brick_stairs"), new BlockItem(GABBRO_BRICK_STAIRS, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul","gabbro_brick_wall"), GABBRO_BRICK_WALL);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul","gabbro_brick_wall"), new BlockItem(GABBRO_BRICK_WALL, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "chiseled_gabbro"), CHISELED_GABBRO);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "chiseled_gabbro"), new BlockItem(CHISELED_GABBRO, new Item.Settings()));

		//LIMESTONE
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "limestone"), LIMESTONE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "limestone"), new BlockItem(LIMESTONE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "limestone_bricks"), LIMESTONE_BRICKS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "limestone_bricks"), new BlockItem(LIMESTONE_BRICKS, new Item.Settings()));

		//MARBLE
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "marble"), MARBLE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "marble"), new BlockItem(MARBLE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "marble_bricks"), MARBLE_BRICKS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "marble_bricks"), new BlockItem(MARBLE_BRICKS, new Item.Settings()));

		//GNEISS
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gneiss"), GNEISS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gneiss"), new BlockItem(GNEISS, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "polished_gneiss"), POLISHED_GNEISS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "polished_gneiss"), new BlockItem(POLISHED_GNEISS, new Item.Settings()));

		//SHALE
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "shale"), SHALE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "shale"), new BlockItem(SHALE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "shale_bricks"), SHALE_BRICKS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "shale_bricks"), new BlockItem(SHALE_BRICKS, new Item.Settings()));

		//PHYLLITE
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "phyllite"), PHYLLITE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "phyllite"), new BlockItem(PHYLLITE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "polished_phyllite"), POLISHED_PHYLLITE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "polished_phyllite"), new BlockItem(POLISHED_PHYLLITE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "phyllite_bricks"), PHYLLITE_BRICKS);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "phyllite_bricks"), new BlockItem(PHYLLITE_BRICKS, new Item.Settings()));

		//GYPSUM
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gypsum"), GYPSUM);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gypsum"), new BlockItem(GYPSUM, new Item.Settings()));

		//DOLOMITE
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "dolomite"), DOLOMITE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "dolomite"), new BlockItem(DOLOMITE, new Item.Settings()));

		//SOUL SANDSTONE
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "soul_sandstone"), SOUL_SANDSTONE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "soul_sandstone"), new BlockItem(SOUL_SANDSTONE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "cut_soul_sandstone"), CUT_SOUL_SANDSTONE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "cut_soul_sandstone"), new BlockItem(CUT_SOUL_SANDSTONE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "smooth_soul_sandstone"), SMOOTH_SOUL_SANDSTONE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "smooth_soul_sandstone"), new BlockItem(SMOOTH_SOUL_SANDSTONE, new Item.Settings()));

		//ORES

		//COAL
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "andesite_coal_ore"), ANDESITE_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "andesite_coal_ore"), new BlockItem(ANDESITE_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "granite_coal_ore"), GRANITE_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "granite_coal_ore"), new BlockItem(GRANITE_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "diorite_coal_ore"), DIORITE_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "diorite_coal_ore"), new BlockItem(DIORITE_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "calcite_coal_ore"), CALCITE_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "calcite_coal_ore"), new BlockItem(CALCITE_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "tuff_coal_ore"), TUFF_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "tuff_coal_ore"), new BlockItem(TUFF_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gabbro_coal_ore"), GABBRO_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro_coal_ore"), new BlockItem(GABBRO_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "limestone_coal_ore"), LIMESTONE_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "limestone_coal_ore"), new BlockItem(LIMESTONE_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "marble_coal_ore"), MARBLE_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "marble_coal_ore"), new BlockItem(MARBLE_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gneiss_coal_ore"), GNEISS_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gneiss_coal_ore"), new BlockItem(GNEISS_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "shale_coal_ore"), SHALE_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "shale_coal_ore"), new BlockItem(SHALE_COAL_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "phyllite_coal_ore"), PHYLLITE_COAL_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "phyllite_coal_ore"), new BlockItem(PHYLLITE_COAL_ORE, new Item.Settings()));

		//IRON
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "andesite_iron_ore"), ANDESITE_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "andesite_iron_ore"), new BlockItem(ANDESITE_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "granite_iron_ore"), GRANITE_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "granite_iron_ore"), new BlockItem(GRANITE_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "diorite_iron_ore"), DIORITE_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "diorite_iron_ore"), new BlockItem(DIORITE_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "calcite_iron_ore"), CALCITE_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "calcite_iron_ore"), new BlockItem(CALCITE_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "tuff_iron_ore"), TUFF_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "tuff_iron_ore"), new BlockItem(TUFF_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gabbro_iron_ore"), GABBRO_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro_iron_ore"), new BlockItem(GABBRO_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "limestone_iron_ore"), LIMESTONE_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "limestone_iron_ore"), new BlockItem(LIMESTONE_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "marble_iron_ore"), MARBLE_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "marble_iron_ore"), new BlockItem(MARBLE_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gneiss_iron_ore"), GNEISS_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gneiss_iron_ore"), new BlockItem(GNEISS_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "shale_iron_ore"), SHALE_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "shale_iron_ore"), new BlockItem(SHALE_IRON_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "phyllite_iron_ore"), PHYLLITE_IRON_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "phyllite_iron_ore"), new BlockItem(PHYLLITE_IRON_ORE, new Item.Settings()));

		//COPPER
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "andesite_copper_ore"), ANDESITE_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "andesite_copper_ore"), new BlockItem(ANDESITE_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "granite_copper_ore"), GRANITE_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "granite_copper_ore"), new BlockItem(GRANITE_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "diorite_copper_ore"), DIORITE_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "diorite_copper_ore"), new BlockItem(DIORITE_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "calcite_copper_ore"), CALCITE_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "calcite_copper_ore"), new BlockItem(CALCITE_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "tuff_copper_ore"), TUFF_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "tuff_copper_ore"), new BlockItem(TUFF_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gabbro_copper_ore"), GABBRO_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro_copper_ore"), new BlockItem(GABBRO_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "limestone_copper_ore"), LIMESTONE_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "limestone_copper_ore"), new BlockItem(LIMESTONE_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "marble_copper_ore"), MARBLE_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "marble_copper_ore"), new BlockItem(MARBLE_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gneiss_copper_ore"), GNEISS_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gneiss_copper_ore"), new BlockItem(GNEISS_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "shale_copper_ore"), SHALE_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "shale_copper_ore"), new BlockItem(SHALE_COPPER_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "phyllite_copper_ore"), PHYLLITE_COPPER_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "phyllite_copper_ore"), new BlockItem(PHYLLITE_COPPER_ORE, new Item.Settings()));

		//LAPIS
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "andesite_lapis_ore"), ANDESITE_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "andesite_lapis_ore"), new BlockItem(ANDESITE_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "granite_lapis_ore"), GRANITE_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "granite_lapis_ore"), new BlockItem(GRANITE_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "diorite_lapis_ore"), DIORITE_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "diorite_lapis_ore"), new BlockItem(DIORITE_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "calcite_lapis_ore"), CALCITE_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "calcite_lapis_ore"), new BlockItem(CALCITE_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "tuff_lapis_ore"), TUFF_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "tuff_lapis_ore"), new BlockItem(TUFF_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gabbro_lapis_ore"), GABBRO_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro_lapis_ore"), new BlockItem(GABBRO_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "limestone_lapis_ore"), LIMESTONE_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "limestone_lapis_ore"), new BlockItem(LIMESTONE_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "marble_lapis_ore"), MARBLE_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "marble_lapis_ore"), new BlockItem(MARBLE_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gneiss_lapis_ore"), GNEISS_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gneiss_lapis_ore"), new BlockItem(GNEISS_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "shale_lapis_ore"), SHALE_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "shale_lapis_ore"), new BlockItem(SHALE_LAPIS_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "phyllite_lapis_ore"), PHYLLITE_LAPIS_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "phyllite_lapis_ore"), new BlockItem(PHYLLITE_LAPIS_ORE, new Item.Settings()));

		//GOLD
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "andesite_gold_ore"), ANDESITE_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "andesite_gold_ore"), new BlockItem(ANDESITE_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "granite_gold_ore"), GRANITE_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "granite_gold_ore"), new BlockItem(GRANITE_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "diorite_gold_ore"), DIORITE_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "diorite_gold_ore"), new BlockItem(DIORITE_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "calcite_gold_ore"), CALCITE_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "calcite_gold_ore"), new BlockItem(CALCITE_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "tuff_gold_ore"), TUFF_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "tuff_gold_ore"), new BlockItem(TUFF_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gabbro_gold_ore"), GABBRO_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro_gold_ore"), new BlockItem(GABBRO_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "limestone_gold_ore"), LIMESTONE_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "limestone_gold_ore"), new BlockItem(LIMESTONE_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "marble_gold_ore"), MARBLE_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "marble_gold_ore"), new BlockItem(MARBLE_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gneiss_gold_ore"), GNEISS_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gneiss_gold_ore"), new BlockItem(GNEISS_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "shale_gold_ore"), SHALE_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "shale_gold_ore"), new BlockItem(SHALE_GOLD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "phyllite_gold_ore"), PHYLLITE_GOLD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "phyllite_gold_ore"), new BlockItem(PHYLLITE_GOLD_ORE, new Item.Settings()));

		//EMERALD
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "andesite_emerald_ore"), ANDESITE_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "andesite_emerald_ore"), new BlockItem(ANDESITE_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "granite_emerald_ore"), GRANITE_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "granite_emerald_ore"), new BlockItem(GRANITE_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "diorite_emerald_ore"), DIORITE_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "diorite_emerald_ore"), new BlockItem(DIORITE_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "calcite_emerald_ore"), CALCITE_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "calcite_emerald_ore"), new BlockItem(CALCITE_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "tuff_emerald_ore"), TUFF_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "tuff_emerald_ore"), new BlockItem(TUFF_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gabbro_emerald_ore"), GABBRO_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gabbro_emerald_ore"), new BlockItem(GABBRO_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "limestone_emerald_ore"), LIMESTONE_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "limestone_emerald_ore"), new BlockItem(LIMESTONE_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "marble_emerald_ore"), MARBLE_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "marble_emerald_ore"), new BlockItem(MARBLE_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "gneiss_emerald_ore"), GNEISS_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "gneiss_emerald_ore"), new BlockItem(GNEISS_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "shale_emerald_ore"), SHALE_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "shale_emerald_ore"), new BlockItem(SHALE_EMERALD_ORE, new Item.Settings()));
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "phyllite_emerald_ore"), PHYLLITE_EMERALD_ORE);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "phyllite_emerald_ore"), new BlockItem(PHYLLITE_EMERALD_ORE, new Item.Settings()));


		//WOOD

		//FIR
		Registry.register(Registries.BLOCK, Identifier.of("withers_overhaul", "fir_log"), FIR_LOG);
		Registry.register(Registries.ITEM, Identifier.of("withers_overhaul", "fir_log"), new BlockItem(FIR_LOG, new Item.Settings()));




		LOGGER.info("Wither's Overhaul is overhauling");
	}
}