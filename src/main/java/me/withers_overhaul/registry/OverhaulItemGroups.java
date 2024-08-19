package me.withers_overhaul.registry;

import me.withers_overhaul.WithersOverhaul;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.Blocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class OverhaulItemGroups {

    public static final ItemGroup WITHERS_OVERHAUL_BLOCKS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WithersOverhaul.MOD_ID, "withers_overhaul_blocks"),
            FabricItemGroup.builder().icon(() -> new ItemStack(OverhaulBlocks.FIR_LOG))
                    .displayName(Text.translatable("item_group.withers_overhaul.blocks"))
                    .entries(((displayContext, content) -> {
                        //WOOD

                        //MAPLE
                        content.add(OverhaulBlocks.MAPLE_LOG);

                        //POPLAR
                        content.add(OverhaulBlocks.POPLAR_LOG);

                        //BEECH
                        content.add(OverhaulBlocks.BEECH_LOG);

                        //CEDAR
                        content.add(OverhaulBlocks.CEDAR_LOG);

                        //REDWOOD
                        content.add(OverhaulBlocks.REDWOOD_LOG);

                        //FIR
                        content.add(OverhaulBlocks.FIR_LOG);

                        //HEMLOCK
                        content.add(OverhaulBlocks.HEMLOCK_LOG);

                        //HOLLY
                        content.add(OverhaulBlocks.HOLLY_LOG);

                        //PINE
                        content.add(OverhaulBlocks.PINE_LOG);

                        //LARCH
                        content.add(OverhaulBlocks.LARCH_LOG);

                        //ASPEN
                        content.add(OverhaulBlocks.ASPEN_LOG);

                        //KAPOK
                        content.add(OverhaulBlocks.KAPOK_LOG);

                        //MAHOGANY
                        content.add(OverhaulBlocks.MAHOGANY_LOG);

                        //EUCALYPTUS
                        content.add(OverhaulBlocks.EUCALYPTUS_LOG);

                        //BAOBAB
                        content.add(OverhaulBlocks.BAOBAB_LOG);

                        //PALO VERDE
                        content.add(OverhaulBlocks.PALO_VERDE_LOG);

                        //JOSHUA
                        content.add(OverhaulBlocks.JOSHUA_LOG);

                        //JUNIPER
                        content.add(OverhaulBlocks.JUNIPER_LOG);

                        //PALM
                        content.add(OverhaulBlocks.PALM_LOG);

                        //EBONY
                        content.add(OverhaulBlocks.EBONY_LOG);

                        //TEAK
                        content.add(OverhaulBlocks.TEAK_LOG);

                        //ELM
                        content.add(OverhaulBlocks.ELM_LOG);

                        //WILLOW
                        content.add(OverhaulBlocks.WILLOW_LOG);

                        //CYPRESS
                        content.add(OverhaulBlocks.CYPRESS_LOG);

                        //SAKURA
                        content.add(OverhaulBlocks.SAKURA_LOG);

                        //MAGNOLIA
                        content.add(OverhaulBlocks.MAGNOLIA_LOG);

                        //JACARANDA
                        content.add(OverhaulBlocks.JACARANDA_LOG);

                        //STONE

                        //GNEISS
                        content.add(OverhaulBlocks.GNEISS);
                        content.add(OverhaulBlocks.POLISHED_GNEISS);

                        //SHALE
                        content.add(OverhaulBlocks.SHALE);
                        content.add(OverhaulBlocks.SHALE_BRICKS);

                        //LIMESTONE
                        content.add(OverhaulBlocks.LIMESTONE);
                        content.add(OverhaulBlocks.LIMESTONE_BRICKS);

                        //MARBLE
                        content.add(OverhaulBlocks.MARBLE);
                        content.add(OverhaulBlocks.MARBLE_BRICKS);

                        //GABBRO
                        content.add(OverhaulBlocks.GABBRO);
                        content.add(OverhaulBlocks.GABBRO_STAIRS);
                        content.add(OverhaulBlocks.GABBRO_SLAB);
                        content.add(OverhaulBlocks.GABBRO_WALL);
                        content.add(OverhaulBlocks.CHISELED_GABBRO);
                        content.add(OverhaulBlocks.POLISHED_GABBRO);
                        content.add(OverhaulBlocks.POLISHED_GABBRO_STAIRS);
                        content.add(OverhaulBlocks.POLISHED_GABBRO_SLAB);
                        content.add(OverhaulBlocks.POLISHED_GABBRO_WALL);
                        content.add(OverhaulBlocks.GABBRO_BRICKS);
                        content.add(OverhaulBlocks.GABBRO_BRICK_STAIRS);
                        content.add(OverhaulBlocks.GABBRO_BRICK_SLAB);
                        content.add(OverhaulBlocks.GABBRO_BRICK_WALL);

                        //PHYLLITE
                        content.add(OverhaulBlocks.PHYLLITE);
                        content.add(OverhaulBlocks.POLISHED_PHYLLITE);
                        content.add(OverhaulBlocks.PHYLLITE_BRICKS);

                        //ORE

                        //COAL
                        content.add(OverhaulBlocks.GRANITE_COAL_ORE);
                        content.add(OverhaulBlocks.DIORITE_COAL_ORE);
                        content.add(OverhaulBlocks.ANDESITE_COAL_ORE);
                        content.add(OverhaulBlocks.TUFF_COAL_ORE);
                        content.add(OverhaulBlocks.MARBLE_COAL_ORE);
                        content.add(OverhaulBlocks.GNEISS_COAL_ORE);
                        content.add(OverhaulBlocks.SHALE_COAL_ORE);
                        content.add(OverhaulBlocks.LIMESTONE_COAL_ORE);
                        content.add(OverhaulBlocks.GABBRO_COAL_ORE);
                        content.add(OverhaulBlocks.PHYLLITE_COAL_ORE);

                        //IRON
                        content.add(OverhaulBlocks.GRANITE_IRON_ORE);
                        content.add(OverhaulBlocks.DIORITE_IRON_ORE);
                        content.add(OverhaulBlocks.ANDESITE_IRON_ORE);
                        content.add(OverhaulBlocks.TUFF_IRON_ORE);
                        content.add(OverhaulBlocks.MARBLE_IRON_ORE);
                        content.add(OverhaulBlocks.GNEISS_IRON_ORE);
                        content.add(OverhaulBlocks.SHALE_IRON_ORE);
                        content.add(OverhaulBlocks.LIMESTONE_IRON_ORE);
                        content.add(OverhaulBlocks.GABBRO_IRON_ORE);
                        content.add(OverhaulBlocks.PHYLLITE_IRON_ORE);

                        //COPPER
                        content.add(OverhaulBlocks.GRANITE_COPPER_ORE);
                        content.add(OverhaulBlocks.DIORITE_COPPER_ORE);
                        content.add(OverhaulBlocks.ANDESITE_COPPER_ORE);
                        content.add(OverhaulBlocks.TUFF_COPPER_ORE);
                        content.add(OverhaulBlocks.MARBLE_COPPER_ORE);
                        content.add(OverhaulBlocks.GNEISS_COPPER_ORE);
                        content.add(OverhaulBlocks.SHALE_COPPER_ORE);
                        content.add(OverhaulBlocks.LIMESTONE_COPPER_ORE);
                        content.add(OverhaulBlocks.GABBRO_COPPER_ORE);
                        content.add(OverhaulBlocks.PHYLLITE_COPPER_ORE);

                        //GOLD
                        content.add(OverhaulBlocks.GRANITE_GOLD_ORE);
                        content.add(OverhaulBlocks.DIORITE_GOLD_ORE);
                        content.add(OverhaulBlocks.ANDESITE_GOLD_ORE);
                        content.add(OverhaulBlocks.TUFF_GOLD_ORE);
                        content.add(OverhaulBlocks.MARBLE_GOLD_ORE);
                        content.add(OverhaulBlocks.GNEISS_GOLD_ORE);
                        content.add(OverhaulBlocks.SHALE_GOLD_ORE);
                        content.add(OverhaulBlocks.LIMESTONE_GOLD_ORE);
                        content.add(OverhaulBlocks.GABBRO_GOLD_ORE);
                        content.add(OverhaulBlocks.PHYLLITE_GOLD_ORE);

                        //REDSTONE
                        content.add(OverhaulBlocks.GRANITE_REDSTONE_ORE);
                        content.add(OverhaulBlocks.DIORITE_REDSTONE_ORE);
                        content.add(OverhaulBlocks.ANDESITE_REDSTONE_ORE);
                        content.add(OverhaulBlocks.TUFF_REDSTONE_ORE);
                        content.add(OverhaulBlocks.MARBLE_REDSTONE_ORE);
                        content.add(OverhaulBlocks.GNEISS_REDSTONE_ORE);
                        content.add(OverhaulBlocks.SHALE_REDSTONE_ORE);
                        content.add(OverhaulBlocks.LIMESTONE_REDSTONE_ORE);
                        content.add(OverhaulBlocks.GABBRO_REDSTONE_ORE);
                        content.add(OverhaulBlocks.PHYLLITE_REDSTONE_ORE);

                        //EMERALD
                        content.add(OverhaulBlocks.GRANITE_EMERALD_ORE);
                        content.add(OverhaulBlocks.DIORITE_EMERALD_ORE);
                        content.add(OverhaulBlocks.ANDESITE_EMERALD_ORE);
                        content.add(OverhaulBlocks.TUFF_EMERALD_ORE);
                        content.add(OverhaulBlocks.MARBLE_EMERALD_ORE);
                        content.add(OverhaulBlocks.GNEISS_EMERALD_ORE);
                        content.add(OverhaulBlocks.SHALE_EMERALD_ORE);
                        content.add(OverhaulBlocks.LIMESTONE_EMERALD_ORE);
                        content.add(OverhaulBlocks.GABBRO_EMERALD_ORE);
                        content.add(OverhaulBlocks.PHYLLITE_EMERALD_ORE);

                        //LAPIS
                        content.add(OverhaulBlocks.GRANITE_LAPIS_ORE);
                        content.add(OverhaulBlocks.DIORITE_LAPIS_ORE);
                        content.add(OverhaulBlocks.ANDESITE_LAPIS_ORE);
                        content.add(OverhaulBlocks.TUFF_LAPIS_ORE);
                        content.add(OverhaulBlocks.MARBLE_LAPIS_ORE);
                        content.add(OverhaulBlocks.GNEISS_LAPIS_ORE);
                        content.add(OverhaulBlocks.SHALE_LAPIS_ORE);
                        content.add(OverhaulBlocks.LIMESTONE_LAPIS_ORE);
                        content.add(OverhaulBlocks.GABBRO_LAPIS_ORE);
                        content.add(OverhaulBlocks.PHYLLITE_LAPIS_ORE);

                        //DIAMOND
                        content.add(OverhaulBlocks.GRANITE_DIAMOND_ORE);
                        content.add(OverhaulBlocks.DIORITE_DIAMOND_ORE);
                        content.add(OverhaulBlocks.ANDESITE_DIAMOND_ORE);
                        content.add(OverhaulBlocks.TUFF_DIAMOND_ORE);
                        content.add(OverhaulBlocks.MARBLE_DIAMOND_ORE);
                        content.add(OverhaulBlocks.GNEISS_DIAMOND_ORE);
                        content.add(OverhaulBlocks.SHALE_DIAMOND_ORE);
                        content.add(OverhaulBlocks.LIMESTONE_DIAMOND_ORE);
                        content.add(OverhaulBlocks.GABBRO_DIAMOND_ORE);
                        content.add(OverhaulBlocks.PHYLLITE_DIAMOND_ORE);

                    }))
                    .build());

    public static final ItemGroup WITHERS_OVERHAUL_ITEMS = Registry.register(Registries.ITEM_GROUP,
            Identifier.of(WithersOverhaul.MOD_ID, "withers_overhaul_items"),
            FabricItemGroup.builder().icon(() -> new ItemStack(OverhaulItems.RUNE_AQUA_AFFINITY))
                    .displayName(Text.translatable("item_group.withers_overhaul.items"))
                    .entries(((displayContext, content) -> {
                        content.add(OverhaulItems.RUNE_AQUA_AFFINITY);
                        content.add(OverhaulItems.RUNE_BANE_OF_ARTHROPODS);
                        content.add(OverhaulItems.RUNE_BLAST_PROTECTION);
                        content.add(OverhaulItems.RUNE_BREACH);
                        content.add(OverhaulItems.RUNE_CHANNELING);
                        content.add(OverhaulItems.RUNE_DENSITY);
                        content.add(OverhaulItems.RUNE_DEPTH_STRIDER);
                        content.add(OverhaulItems.RUNE_EFFICIENCY);
                        content.add(OverhaulItems.RUNE_FEATHER_FALLING);
                        content.add(OverhaulItems.RUNE_FIRE_ASPECT);
                        content.add(OverhaulItems.RUNE_FIRE_PROTECTION);
                        content.add(OverhaulItems.RUNE_FLAME);
                        content.add(OverhaulItems.RUNE_FORTUNE);
                        content.add(OverhaulItems.RUNE_FROST_WALKER);
                        content.add(OverhaulItems.RUNE_IMPALING);
                        content.add(OverhaulItems.RUNE_INFINITY);
                        content.add(OverhaulItems.RUNE_KNOCKBACK);
                        content.add(OverhaulItems.RUNE_LOOTING);
                        content.add(OverhaulItems.RUNE_LOYALTY);
                        content.add(OverhaulItems.RUNE_LUCK_OF_THE_SEA);
                        content.add(OverhaulItems.RUNE_LURE);
                        content.add(OverhaulItems.RUNE_MENDING);
                        content.add(OverhaulItems.RUNE_MULTISHOT);
                        content.add(OverhaulItems.RUNE_PIERCING);
                        content.add(OverhaulItems.RUNE_POWER);
                        content.add(OverhaulItems.RUNE_PROJECTILE_PROTECTION);
                        content.add(OverhaulItems.RUNE_PROTECTION);
                        content.add(OverhaulItems.RUNE_PUNCH);
                        content.add(OverhaulItems.RUNE_QUICK_CHARGE);
                        content.add(OverhaulItems.RUNE_RESPIRATION);
                        content.add(OverhaulItems.RUNE_RIPTIDE);
                        content.add(OverhaulItems.RUNE_SHARPNESS);
                        content.add(OverhaulItems.RUNE_SILK_TOUCH);
                        content.add(OverhaulItems.RUNE_SMITE);
                        content.add(OverhaulItems.RUNE_SOUL_SPEED);
                        content.add(OverhaulItems.RUNE_SWEEPING_EDGE);
                        content.add(OverhaulItems.RUNE_SWIFT_SNEAK);
                        content.add(OverhaulItems.RUNE_THORNS);
                        content.add(OverhaulItems.RUNE_UNBREAKING);
                        content.add(OverhaulItems.RUNE_WIND_BURST);
                    }))
                    .build());

    public static void registerItemGroups() {
        WithersOverhaul.LOGGER.info("Loading Item Groups for " + WithersOverhaul.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(content -> {

            //STONE

            //GNEISS
            content.addAfter(Blocks.POLISHED_ANDESITE_SLAB, OverhaulBlocks.GNEISS);
            content.addAfter(OverhaulBlocks.GNEISS, OverhaulBlocks.POLISHED_GNEISS);

            //SHALE
            content.addAfter(OverhaulBlocks.POLISHED_GNEISS, OverhaulBlocks.SHALE);
            content.addAfter(OverhaulBlocks.SHALE, OverhaulBlocks.SHALE_BRICKS);

            //LIMESTONE
            content.addAfter(OverhaulBlocks.SHALE_BRICKS, OverhaulBlocks.LIMESTONE);
            content.addAfter(OverhaulBlocks.LIMESTONE, OverhaulBlocks.LIMESTONE_BRICKS);

            //MARBLE
            content.addAfter(OverhaulBlocks.LIMESTONE_BRICKS, OverhaulBlocks.MARBLE);
            content.addAfter(OverhaulBlocks.MARBLE, OverhaulBlocks.MARBLE_BRICKS);

            //GABBRO
            content.addAfter(OverhaulBlocks.MARBLE_BRICKS, OverhaulBlocks.GABBRO);
            content.addAfter(OverhaulBlocks.GABBRO, OverhaulBlocks.GABBRO_STAIRS);
            content.addAfter(OverhaulBlocks.GABBRO_STAIRS, OverhaulBlocks.GABBRO_SLAB);
            content.addAfter(OverhaulBlocks.GABBRO_SLAB, OverhaulBlocks.GABBRO_WALL);
            content.addAfter(OverhaulBlocks.GABBRO_WALL, OverhaulBlocks.CHISELED_GABBRO);
            content.addAfter(OverhaulBlocks.CHISELED_GABBRO, OverhaulBlocks.POLISHED_GABBRO);
            content.addAfter(OverhaulBlocks.POLISHED_GABBRO, OverhaulBlocks.POLISHED_GABBRO_STAIRS);
            content.addAfter(OverhaulBlocks.POLISHED_GABBRO_STAIRS, OverhaulBlocks.POLISHED_GABBRO_SLAB);
            content.addAfter(OverhaulBlocks.POLISHED_GABBRO_SLAB, OverhaulBlocks.POLISHED_GABBRO_WALL);
            content.addAfter(OverhaulBlocks.POLISHED_GABBRO_WALL, OverhaulBlocks.GABBRO_BRICKS);
            content.addAfter(OverhaulBlocks.GABBRO_BRICKS, OverhaulBlocks.GABBRO_BRICK_STAIRS);
            content.addAfter(OverhaulBlocks.GABBRO_BRICK_STAIRS, OverhaulBlocks.GABBRO_BRICK_SLAB);
            content.addAfter(OverhaulBlocks.GABBRO_BRICK_SLAB, OverhaulBlocks.GABBRO_BRICK_WALL);

            //PHYLLITE
            content.addAfter(OverhaulBlocks.GABBRO_BRICK_WALL, OverhaulBlocks.PHYLLITE);
            content.addAfter(OverhaulBlocks.PHYLLITE, OverhaulBlocks.POLISHED_PHYLLITE);
            content.addAfter(OverhaulBlocks.POLISHED_PHYLLITE, OverhaulBlocks.PHYLLITE_BRICKS);

            //DOLOMITE
            content.addAfter(Blocks.AMETHYST_BLOCK, OverhaulBlocks.DOLOMITE);

            //GYPSUM
            content.addAfter(OverhaulBlocks.DOLOMITE, OverhaulBlocks.GYPSUM);

            //WOOD

            //MAPLE
            content.addAfter(Blocks.OAK_BUTTON, OverhaulBlocks.MAPLE_LOG);

            //POPLAR
            content.addAfter(OverhaulBlocks.MAPLE_LOG, OverhaulBlocks.POPLAR_LOG);

            //BEECH
            content.addAfter(OverhaulBlocks.POPLAR_LOG, OverhaulBlocks.BEECH_LOG);

            //CEDAR
            content.addAfter(Blocks.SPRUCE_BUTTON, OverhaulBlocks.CEDAR_LOG);

            //REDWOOD
            content.addAfter(OverhaulBlocks.CEDAR_LOG, OverhaulBlocks.REDWOOD_LOG);

            //FIR
            content.addAfter(OverhaulBlocks.REDWOOD_LOG, OverhaulBlocks.FIR_LOG);

            //HEMLOCK
            content.addAfter(OverhaulBlocks.FIR_LOG, OverhaulBlocks.HEMLOCK_LOG);

            //HOLLY
            content.addAfter(OverhaulBlocks.HEMLOCK_LOG, OverhaulBlocks.HOLLY_LOG);

            //PINE
            content.addAfter(OverhaulBlocks.HOLLY_LOG, OverhaulBlocks.PINE_LOG);

            //LARCH
            content.addAfter(OverhaulBlocks.PINE_LOG, OverhaulBlocks.LARCH_LOG);

            //ASPEN
            content.addAfter(Blocks.BIRCH_BUTTON, OverhaulBlocks.ASPEN_LOG);

            //KAPOK
            content.addAfter(Blocks.JUNGLE_BUTTON, OverhaulBlocks.KAPOK_LOG);

            //MAHOGANY
            content.addAfter(OverhaulBlocks.KAPOK_LOG, OverhaulBlocks.MAHOGANY_LOG);

            //EUCALYPTUS
            content.addAfter(OverhaulBlocks.MAHOGANY_LOG, OverhaulBlocks.EUCALYPTUS_LOG);

            //BAOBAB
            content.addAfter(Blocks.ACACIA_BUTTON, OverhaulBlocks.BAOBAB_LOG);

            //PALO VERDE
            content.addAfter(OverhaulBlocks.BAOBAB_LOG, OverhaulBlocks.PALO_VERDE_LOG);

            //JOSHUA
            content.addAfter(OverhaulBlocks.PALO_VERDE_LOG, OverhaulBlocks.JOSHUA_LOG);

            //JUNIPER
            content.addAfter(OverhaulBlocks.JOSHUA_LOG, OverhaulBlocks.JUNIPER_LOG);

            //PALM
            content.addAfter(OverhaulBlocks.JUNIPER_LOG, OverhaulBlocks.PALM_LOG);

            //EBONY
            content.addAfter(Blocks.DARK_OAK_BUTTON, OverhaulBlocks.EBONY_LOG);

            //TEAK
            content.addAfter(OverhaulBlocks.EBONY_LOG, OverhaulBlocks.TEAK_LOG);

            //ELM
            content.addAfter(OverhaulBlocks.TEAK_LOG, OverhaulBlocks.ELM_LOG);

            //WILLOW
            content.addAfter(Blocks.MANGROVE_BUTTON, OverhaulBlocks.WILLOW_LOG);

            //CYPRESS
            content.addAfter(OverhaulBlocks.WILLOW_LOG, OverhaulBlocks.CYPRESS_LOG);

            //SAKURA
            content.addAfter(Blocks.CHERRY_BUTTON, OverhaulBlocks.SAKURA_LOG);

            //MAGNOLIA
            content.addAfter(OverhaulBlocks.SAKURA_LOG, OverhaulBlocks.MAGNOLIA_LOG);

            //JACARANDA
            content.addAfter(OverhaulBlocks.MAGNOLIA_LOG, OverhaulBlocks.JACARANDA_LOG);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.NATURAL).register(content -> {

            //STONES
            content.addAfter(Blocks.ANDESITE, OverhaulBlocks.GNEISS);
            content.addAfter(OverhaulBlocks.GNEISS, OverhaulBlocks.SHALE);
            content.addAfter(OverhaulBlocks.SHALE, OverhaulBlocks.LIMESTONE);
            content.addAfter(OverhaulBlocks.LIMESTONE, OverhaulBlocks.MARBLE);
            content.addAfter(OverhaulBlocks.MARBLE, OverhaulBlocks.GABBRO);
            content.addAfter(OverhaulBlocks.GABBRO, OverhaulBlocks.PHYLLITE);
            content.addAfter(Blocks.AMETHYST_CLUSTER, OverhaulBlocks.DOLOMITE);
            content.addAfter(OverhaulBlocks.DOLOMITE, OverhaulBlocks.GYPSUM);

            //ORES

            //COAL
            content.addAfter(Blocks.DEEPSLATE_COAL_ORE, OverhaulBlocks.GRANITE_COAL_ORE);
            content.addAfter(OverhaulBlocks.GRANITE_COAL_ORE, OverhaulBlocks.DIORITE_COAL_ORE);
            content.addAfter(OverhaulBlocks.DIORITE_COAL_ORE, OverhaulBlocks.ANDESITE_COAL_ORE);
            content.addAfter(OverhaulBlocks.ANDESITE_COAL_ORE, OverhaulBlocks.TUFF_COAL_ORE);
            content.addAfter(OverhaulBlocks.TUFF_COAL_ORE, OverhaulBlocks.MARBLE_COAL_ORE);
            content.addAfter(OverhaulBlocks.MARBLE_COAL_ORE, OverhaulBlocks.GNEISS_COAL_ORE);
            content.addAfter(OverhaulBlocks.GNEISS_COAL_ORE, OverhaulBlocks.SHALE_COAL_ORE);
            content.addAfter(OverhaulBlocks.SHALE_COAL_ORE, OverhaulBlocks.LIMESTONE_COAL_ORE);
            content.addAfter(OverhaulBlocks.LIMESTONE_COAL_ORE, OverhaulBlocks.GABBRO_COAL_ORE);
            content.addAfter(OverhaulBlocks.GABBRO_COAL_ORE, OverhaulBlocks.PHYLLITE_COAL_ORE);

            //IRON
            content.addAfter(Blocks.DEEPSLATE_IRON_ORE, OverhaulBlocks.GRANITE_IRON_ORE);
            content.addAfter(OverhaulBlocks.GRANITE_IRON_ORE, OverhaulBlocks.DIORITE_IRON_ORE);
            content.addAfter(OverhaulBlocks.DIORITE_IRON_ORE, OverhaulBlocks.ANDESITE_IRON_ORE);
            content.addAfter(OverhaulBlocks.ANDESITE_IRON_ORE, OverhaulBlocks.TUFF_IRON_ORE);
            content.addAfter(OverhaulBlocks.TUFF_IRON_ORE, OverhaulBlocks.MARBLE_IRON_ORE);
            content.addAfter(OverhaulBlocks.MARBLE_IRON_ORE, OverhaulBlocks.GNEISS_IRON_ORE);
            content.addAfter(OverhaulBlocks.GNEISS_IRON_ORE, OverhaulBlocks.SHALE_IRON_ORE);
            content.addAfter(OverhaulBlocks.SHALE_IRON_ORE, OverhaulBlocks.LIMESTONE_IRON_ORE);
            content.addAfter(OverhaulBlocks.LIMESTONE_IRON_ORE, OverhaulBlocks.GABBRO_IRON_ORE);
            content.addAfter(OverhaulBlocks.GABBRO_IRON_ORE, OverhaulBlocks.PHYLLITE_IRON_ORE);

            //COPPER
            content.addAfter(Blocks.DEEPSLATE_COPPER_ORE, OverhaulBlocks.GRANITE_COPPER_ORE);
            content.addAfter(OverhaulBlocks.GRANITE_COPPER_ORE, OverhaulBlocks.DIORITE_COPPER_ORE);
            content.addAfter(OverhaulBlocks.DIORITE_COPPER_ORE, OverhaulBlocks.ANDESITE_COPPER_ORE);
            content.addAfter(OverhaulBlocks.ANDESITE_COPPER_ORE, OverhaulBlocks.TUFF_COPPER_ORE);
            content.addAfter(OverhaulBlocks.TUFF_COPPER_ORE, OverhaulBlocks.MARBLE_COPPER_ORE);
            content.addAfter(OverhaulBlocks.MARBLE_COPPER_ORE, OverhaulBlocks.GNEISS_COPPER_ORE);
            content.addAfter(OverhaulBlocks.GNEISS_COPPER_ORE, OverhaulBlocks.SHALE_COPPER_ORE);
            content.addAfter(OverhaulBlocks.SHALE_COPPER_ORE, OverhaulBlocks.LIMESTONE_COPPER_ORE);
            content.addAfter(OverhaulBlocks.LIMESTONE_COPPER_ORE, OverhaulBlocks.GABBRO_COPPER_ORE);
            content.addAfter(OverhaulBlocks.GABBRO_COPPER_ORE, OverhaulBlocks.PHYLLITE_COPPER_ORE);

            //GOLD
            content.addAfter(Blocks.DEEPSLATE_GOLD_ORE, OverhaulBlocks.GRANITE_GOLD_ORE);
            content.addAfter(OverhaulBlocks.GRANITE_GOLD_ORE, OverhaulBlocks.DIORITE_GOLD_ORE);
            content.addAfter(OverhaulBlocks.DIORITE_GOLD_ORE, OverhaulBlocks.ANDESITE_GOLD_ORE);
            content.addAfter(OverhaulBlocks.ANDESITE_GOLD_ORE, OverhaulBlocks.TUFF_GOLD_ORE);
            content.addAfter(OverhaulBlocks.TUFF_GOLD_ORE, OverhaulBlocks.MARBLE_GOLD_ORE);
            content.addAfter(OverhaulBlocks.MARBLE_GOLD_ORE, OverhaulBlocks.GNEISS_GOLD_ORE);
            content.addAfter(OverhaulBlocks.GNEISS_GOLD_ORE, OverhaulBlocks.SHALE_GOLD_ORE);
            content.addAfter(OverhaulBlocks.SHALE_GOLD_ORE, OverhaulBlocks.LIMESTONE_GOLD_ORE);
            content.addAfter(OverhaulBlocks.LIMESTONE_GOLD_ORE, OverhaulBlocks.GABBRO_GOLD_ORE);
            content.addAfter(OverhaulBlocks.GABBRO_GOLD_ORE, OverhaulBlocks.PHYLLITE_GOLD_ORE);

            //REDSTONE
            content.addAfter(Blocks.DEEPSLATE_REDSTONE_ORE, OverhaulBlocks.GRANITE_REDSTONE_ORE);
            content.addAfter(OverhaulBlocks.GRANITE_REDSTONE_ORE, OverhaulBlocks.DIORITE_REDSTONE_ORE);
            content.addAfter(OverhaulBlocks.DIORITE_REDSTONE_ORE, OverhaulBlocks.ANDESITE_REDSTONE_ORE);
            content.addAfter(OverhaulBlocks.ANDESITE_REDSTONE_ORE, OverhaulBlocks.TUFF_REDSTONE_ORE);
            content.addAfter(OverhaulBlocks.TUFF_REDSTONE_ORE, OverhaulBlocks.MARBLE_REDSTONE_ORE);
            content.addAfter(OverhaulBlocks.MARBLE_REDSTONE_ORE, OverhaulBlocks.GNEISS_REDSTONE_ORE);
            content.addAfter(OverhaulBlocks.GNEISS_REDSTONE_ORE, OverhaulBlocks.SHALE_REDSTONE_ORE);
            content.addAfter(OverhaulBlocks.SHALE_REDSTONE_ORE, OverhaulBlocks.LIMESTONE_REDSTONE_ORE);
            content.addAfter(OverhaulBlocks.LIMESTONE_REDSTONE_ORE, OverhaulBlocks.GABBRO_REDSTONE_ORE);
            content.addAfter(OverhaulBlocks.GABBRO_REDSTONE_ORE, OverhaulBlocks.PHYLLITE_REDSTONE_ORE);

            //EMERALD
            content.addAfter(Blocks.DEEPSLATE_EMERALD_ORE, OverhaulBlocks.GRANITE_EMERALD_ORE);
            content.addAfter(OverhaulBlocks.GRANITE_EMERALD_ORE, OverhaulBlocks.DIORITE_EMERALD_ORE);
            content.addAfter(OverhaulBlocks.DIORITE_EMERALD_ORE, OverhaulBlocks.ANDESITE_EMERALD_ORE);
            content.addAfter(OverhaulBlocks.ANDESITE_EMERALD_ORE, OverhaulBlocks.TUFF_EMERALD_ORE);
            content.addAfter(OverhaulBlocks.TUFF_EMERALD_ORE, OverhaulBlocks.MARBLE_EMERALD_ORE);
            content.addAfter(OverhaulBlocks.MARBLE_EMERALD_ORE, OverhaulBlocks.GNEISS_EMERALD_ORE);
            content.addAfter(OverhaulBlocks.GNEISS_EMERALD_ORE, OverhaulBlocks.SHALE_EMERALD_ORE);
            content.addAfter(OverhaulBlocks.SHALE_EMERALD_ORE, OverhaulBlocks.LIMESTONE_EMERALD_ORE);
            content.addAfter(OverhaulBlocks.LIMESTONE_EMERALD_ORE, OverhaulBlocks.GABBRO_EMERALD_ORE);
            content.addAfter(OverhaulBlocks.GABBRO_EMERALD_ORE, OverhaulBlocks.PHYLLITE_EMERALD_ORE);

            //LAPIS
            content.addAfter(Blocks.DEEPSLATE_LAPIS_ORE, OverhaulBlocks.GRANITE_LAPIS_ORE);
            content.addAfter(OverhaulBlocks.GRANITE_LAPIS_ORE, OverhaulBlocks.DIORITE_LAPIS_ORE);
            content.addAfter(OverhaulBlocks.DIORITE_LAPIS_ORE, OverhaulBlocks.ANDESITE_LAPIS_ORE);
            content.addAfter(OverhaulBlocks.ANDESITE_LAPIS_ORE, OverhaulBlocks.TUFF_LAPIS_ORE);
            content.addAfter(OverhaulBlocks.TUFF_LAPIS_ORE, OverhaulBlocks.MARBLE_LAPIS_ORE);
            content.addAfter(OverhaulBlocks.MARBLE_LAPIS_ORE, OverhaulBlocks.GNEISS_LAPIS_ORE);
            content.addAfter(OverhaulBlocks.GNEISS_LAPIS_ORE, OverhaulBlocks.SHALE_LAPIS_ORE);
            content.addAfter(OverhaulBlocks.SHALE_LAPIS_ORE, OverhaulBlocks.LIMESTONE_LAPIS_ORE);
            content.addAfter(OverhaulBlocks.LIMESTONE_LAPIS_ORE, OverhaulBlocks.GABBRO_LAPIS_ORE);
            content.addAfter(OverhaulBlocks.GABBRO_LAPIS_ORE, OverhaulBlocks.PHYLLITE_LAPIS_ORE);

            //DIAMOND
            content.addAfter(Blocks.DEEPSLATE_DIAMOND_ORE, OverhaulBlocks.GRANITE_DIAMOND_ORE);
            content.addAfter(OverhaulBlocks.GRANITE_DIAMOND_ORE, OverhaulBlocks.DIORITE_DIAMOND_ORE);
            content.addAfter(OverhaulBlocks.DIORITE_DIAMOND_ORE, OverhaulBlocks.ANDESITE_DIAMOND_ORE);
            content.addAfter(OverhaulBlocks.ANDESITE_DIAMOND_ORE, OverhaulBlocks.TUFF_DIAMOND_ORE);
            content.addAfter(OverhaulBlocks.TUFF_DIAMOND_ORE, OverhaulBlocks.MARBLE_DIAMOND_ORE);
            content.addAfter(OverhaulBlocks.MARBLE_DIAMOND_ORE, OverhaulBlocks.GNEISS_DIAMOND_ORE);
            content.addAfter(OverhaulBlocks.GNEISS_DIAMOND_ORE, OverhaulBlocks.SHALE_DIAMOND_ORE);
            content.addAfter(OverhaulBlocks.SHALE_DIAMOND_ORE, OverhaulBlocks.LIMESTONE_DIAMOND_ORE);
            content.addAfter(OverhaulBlocks.LIMESTONE_DIAMOND_ORE, OverhaulBlocks.GABBRO_DIAMOND_ORE);
            content.addAfter(OverhaulBlocks.GABBRO_DIAMOND_ORE, OverhaulBlocks.PHYLLITE_DIAMOND_ORE);

            //LOGS
            content.addAfter(Blocks.OAK_LOG, OverhaulBlocks.MAPLE_LOG);
            content.addAfter(OverhaulBlocks.MAPLE_LOG, OverhaulBlocks.POPLAR_LOG);
            content.addAfter(OverhaulBlocks.POPLAR_LOG, OverhaulBlocks.BEECH_LOG);
            content.addAfter(Blocks.SPRUCE_LOG, OverhaulBlocks.CEDAR_LOG);
            content.addAfter(OverhaulBlocks.CEDAR_LOG, OverhaulBlocks.REDWOOD_LOG);
            content.addAfter(OverhaulBlocks.REDWOOD_LOG, OverhaulBlocks.FIR_LOG);
            content.addAfter(OverhaulBlocks.FIR_LOG, OverhaulBlocks.HEMLOCK_LOG);
            content.addAfter(OverhaulBlocks.HEMLOCK_LOG, OverhaulBlocks.HOLLY_LOG);
            content.addAfter(OverhaulBlocks.HOLLY_LOG, OverhaulBlocks.PINE_LOG);
            content.addAfter(OverhaulBlocks.PINE_LOG, OverhaulBlocks.LARCH_LOG);
            content.addAfter(Blocks.BIRCH_LOG, OverhaulBlocks.ASPEN_LOG);
            content.addAfter(Blocks.JUNGLE_LOG, OverhaulBlocks.KAPOK_LOG);
            content.addAfter(OverhaulBlocks.KAPOK_LOG, OverhaulBlocks.MAHOGANY_LOG);
            content.addAfter(OverhaulBlocks.MAHOGANY_LOG, OverhaulBlocks.EUCALYPTUS_LOG);
            content.addAfter(Blocks.ACACIA_LOG, OverhaulBlocks.BAOBAB_LOG);
            content.addAfter(OverhaulBlocks.BAOBAB_LOG, OverhaulBlocks.PALO_VERDE_LOG);
            content.addAfter(OverhaulBlocks.PALO_VERDE_LOG, OverhaulBlocks.JOSHUA_LOG);
            content.addAfter(OverhaulBlocks.JOSHUA_LOG, OverhaulBlocks.JUNIPER_LOG);
            content.addAfter(OverhaulBlocks.JUNIPER_LOG, OverhaulBlocks.PALM_LOG);
            content.addAfter(Blocks.DARK_OAK_LOG, OverhaulBlocks.EBONY_LOG);
            content.addAfter(OverhaulBlocks.EBONY_LOG, OverhaulBlocks.TEAK_LOG);
            content.addAfter(OverhaulBlocks.TEAK_LOG, OverhaulBlocks.ELM_LOG);
            content.addAfter(Blocks.MANGROVE_LOG, OverhaulBlocks.WILLOW_LOG);
            content.addAfter(OverhaulBlocks.WILLOW_LOG, OverhaulBlocks.CYPRESS_LOG);
            content.addAfter(Blocks.CHERRY_LOG, OverhaulBlocks.SAKURA_LOG);
            content.addAfter(OverhaulBlocks.SAKURA_LOG, OverhaulBlocks.MAGNOLIA_LOG);
            content.addAfter(OverhaulBlocks.MAGNOLIA_LOG, OverhaulBlocks.JACARANDA_LOG);
        });

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(content -> {
            content.addAfter(Items.OMINOUS_TRIAL_KEY, OverhaulItems.RUNE_AQUA_AFFINITY);
            content.addAfter(OverhaulItems.RUNE_AQUA_AFFINITY, OverhaulItems.RUNE_BANE_OF_ARTHROPODS);
            content.addAfter(OverhaulItems.RUNE_BANE_OF_ARTHROPODS, OverhaulItems.RUNE_BLAST_PROTECTION);
            content.addAfter(OverhaulItems.RUNE_BLAST_PROTECTION, OverhaulItems.RUNE_BREACH);
            content.addAfter(OverhaulItems.RUNE_BREACH, OverhaulItems.RUNE_CHANNELING);
            content.addAfter(OverhaulItems.RUNE_CHANNELING, OverhaulItems.RUNE_DENSITY);
            content.addAfter(OverhaulItems.RUNE_DENSITY, OverhaulItems.RUNE_DEPTH_STRIDER);
            content.addAfter(OverhaulItems.RUNE_DEPTH_STRIDER, OverhaulItems.RUNE_EFFICIENCY);
            content.addAfter(OverhaulItems.RUNE_EFFICIENCY, OverhaulItems.RUNE_FEATHER_FALLING);
            content.addAfter(OverhaulItems.RUNE_FEATHER_FALLING, OverhaulItems.RUNE_FIRE_ASPECT);
            content.addAfter(OverhaulItems.RUNE_FIRE_ASPECT, OverhaulItems.RUNE_FIRE_PROTECTION);
            content.addAfter(OverhaulItems.RUNE_FIRE_PROTECTION, OverhaulItems.RUNE_FLAME);
            content.addAfter(OverhaulItems.RUNE_FLAME, OverhaulItems.RUNE_FORTUNE);
            content.addAfter(OverhaulItems.RUNE_FORTUNE, OverhaulItems.RUNE_FROST_WALKER);
            content.addAfter(OverhaulItems.RUNE_FROST_WALKER, OverhaulItems.RUNE_IMPALING);
            content.addAfter(OverhaulItems.RUNE_IMPALING, OverhaulItems.RUNE_INFINITY);
            content.addAfter(OverhaulItems.RUNE_INFINITY, OverhaulItems.RUNE_KNOCKBACK);
            content.addAfter(OverhaulItems.RUNE_KNOCKBACK, OverhaulItems.RUNE_LOOTING);
            content.addAfter(OverhaulItems.RUNE_LOOTING, OverhaulItems.RUNE_LOYALTY);
            content.addAfter(OverhaulItems.RUNE_LOYALTY, OverhaulItems.RUNE_LUCK_OF_THE_SEA);
            content.addAfter(OverhaulItems.RUNE_LUCK_OF_THE_SEA, OverhaulItems.RUNE_LURE);
            content.addAfter(OverhaulItems.RUNE_LURE, OverhaulItems.RUNE_MENDING);
            content.addAfter(OverhaulItems.RUNE_MENDING, OverhaulItems.RUNE_MULTISHOT);
            content.addAfter(OverhaulItems.RUNE_MULTISHOT, OverhaulItems.RUNE_PIERCING);
            content.addAfter(OverhaulItems.RUNE_PIERCING, OverhaulItems.RUNE_POWER);
            content.addAfter(OverhaulItems.RUNE_POWER, OverhaulItems.RUNE_PROJECTILE_PROTECTION);
            content.addAfter(OverhaulItems.RUNE_PROJECTILE_PROTECTION, OverhaulItems.RUNE_PROTECTION);
            content.addAfter(OverhaulItems.RUNE_PROTECTION, OverhaulItems.RUNE_PUNCH);
            content.addAfter(OverhaulItems.RUNE_PUNCH, OverhaulItems.RUNE_QUICK_CHARGE);
            content.addAfter(OverhaulItems.RUNE_QUICK_CHARGE, OverhaulItems.RUNE_RESPIRATION);
            content.addAfter(OverhaulItems.RUNE_RESPIRATION, OverhaulItems.RUNE_RIPTIDE);
            content.addAfter(OverhaulItems.RUNE_RIPTIDE, OverhaulItems.RUNE_SHARPNESS);
            content.addAfter(OverhaulItems.RUNE_SHARPNESS, OverhaulItems.RUNE_SILK_TOUCH);
            content.addAfter(OverhaulItems.RUNE_SILK_TOUCH, OverhaulItems.RUNE_SMITE);
            content.addAfter(OverhaulItems.RUNE_SMITE, OverhaulItems.RUNE_SOUL_SPEED);
            content.addAfter(OverhaulItems.RUNE_SOUL_SPEED, OverhaulItems.RUNE_SWEEPING_EDGE);
            content.addAfter(OverhaulItems.RUNE_SWEEPING_EDGE, OverhaulItems.RUNE_SWIFT_SNEAK);
            content.addAfter(OverhaulItems.RUNE_SWIFT_SNEAK, OverhaulItems.RUNE_THORNS);
            content.addAfter(OverhaulItems.RUNE_THORNS, OverhaulItems.RUNE_UNBREAKING);
            content.addAfter(OverhaulItems.RUNE_UNBREAKING, OverhaulItems.RUNE_WIND_BURST);
            /*
            content.addAfter(OverhaulItems.RUNE_WIND_BURST, OverhaulItems.SCROLL_AQUA_AFFINITY);
            content.addAfter(OverhaulItems.SCROLL_AQUA_AFFINITY, OverhaulItems.SCROLL_BANE_OF_ARTHROPODS);
            content.addAfter(OverhaulItems.SCROLL_BANE_OF_ARTHROPODS, OverhaulItems.SCROLL_BLAST_PROTECTION);
            content.addAfter(OverhaulItems.SCROLL_BLAST_PROTECTION, OverhaulItems.SCROLL_BREACH);
            content.addAfter(OverhaulItems.SCROLL_BREACH, OverhaulItems.SCROLL_CHANNELING);
            content.addAfter(OverhaulItems.SCROLL_CHANNELING, OverhaulItems.SCROLL_DENSITY);
            content.addAfter(OverhaulItems.SCROLL_DENSITY, OverhaulItems.SCROLL_DEPTH_STRIDER);
            content.addAfter(OverhaulItems.SCROLL_DEPTH_STRIDER, OverhaulItems.SCROLL_EFFICIENCY);
            content.addAfter(OverhaulItems.SCROLL_EFFICIENCY, OverhaulItems.SCROLL_FEATHER_FALLING);
            content.addAfter(OverhaulItems.SCROLL_FEATHER_FALLING, OverhaulItems.SCROLL_FIRE_ASPECT);
            content.addAfter(OverhaulItems.SCROLL_FIRE_ASPECT, OverhaulItems.SCROLL_FIRE_PROTECTION);
            content.addAfter(OverhaulItems.SCROLL_FIRE_PROTECTION, OverhaulItems.SCROLL_FLAME);
            content.addAfter(OverhaulItems.SCROLL_FLAME, OverhaulItems.SCROLL_FORTUNE);
            content.addAfter(OverhaulItems.SCROLL_FORTUNE, OverhaulItems.SCROLL_FROST_WALKER);
            content.addAfter(OverhaulItems.SCROLL_FROST_WALKER, OverhaulItems.SCROLL_IMPALING);
            content.addAfter(OverhaulItems.SCROLL_IMPALING, OverhaulItems.SCROLL_INFINITY);
            content.addAfter(OverhaulItems.SCROLL_INFINITY, OverhaulItems.SCROLL_KNOCKBACK);
            content.addAfter(OverhaulItems.SCROLL_KNOCKBACK, OverhaulItems.SCROLL_LOOTING);
            content.addAfter(OverhaulItems.SCROLL_LOOTING, OverhaulItems.SCROLL_LOYALTY);
            content.addAfter(OverhaulItems.SCROLL_LOYALTY, OverhaulItems.SCROLL_LUCK_OF_THE_SEA);
            content.addAfter(OverhaulItems.SCROLL_LUCK_OF_THE_SEA, OverhaulItems.SCROLL_LURE);
            content.addAfter(OverhaulItems.SCROLL_LURE, OverhaulItems.SCROLL_MENDING);
            content.addAfter(OverhaulItems.SCROLL_MENDING, OverhaulItems.SCROLL_MULTISHOT);
            content.addAfter(OverhaulItems.SCROLL_MULTISHOT, OverhaulItems.SCROLL_PIERCING);
            content.addAfter(OverhaulItems.SCROLL_PIERCING, OverhaulItems.SCROLL_POWER);
            content.addAfter(OverhaulItems.SCROLL_POWER, OverhaulItems.SCROLL_PROJECTILE_PROTECTION);
            content.addAfter(OverhaulItems.SCROLL_PROJECTILE_PROTECTION, OverhaulItems.SCROLL_PROTECTION);
            content.addAfter(OverhaulItems.SCROLL_PROTECTION, OverhaulItems.SCROLL_PUNCH);
            content.addAfter(OverhaulItems.SCROLL_PUNCH, OverhaulItems.SCROLL_QUICK_CHARGE);
            content.addAfter(OverhaulItems.SCROLL_QUICK_CHARGE, OverhaulItems.SCROLL_RESPIRATION);
            content.addAfter(OverhaulItems.SCROLL_RESPIRATION, OverhaulItems.SCROLL_RIPTIDE);
            content.addAfter(OverhaulItems.SCROLL_RIPTIDE, OverhaulItems.SCROLL_SHARPNESS);
            content.addAfter(OverhaulItems.SCROLL_SHARPNESS, OverhaulItems.SCROLL_SILK_TOUCH);
            content.addAfter(OverhaulItems.SCROLL_SILK_TOUCH, OverhaulItems.SCROLL_SMITE);
            content.addAfter(OverhaulItems.SCROLL_SMITE, OverhaulItems.SCROLL_SOUL_SPEED);
            content.addAfter(OverhaulItems.SCROLL_SOUL_SPEED, OverhaulItems.SCROLL_SWEEPING_EDGE);
            content.addAfter(OverhaulItems.SCROLL_SWEEPING_EDGE, OverhaulItems.SCROLL_SWIFT_SNEAK);
            content.addAfter(OverhaulItems.SCROLL_SWIFT_SNEAK, OverhaulItems.SCROLL_THORNS);
            content.addAfter(OverhaulItems.SCROLL_THORNS, OverhaulItems.SCROLL_UNBREAKING);
            content.addAfter(OverhaulItems.SCROLL_UNBREAKING, OverhaulItems.SCROLL_WIND_BURST);
             */
        });
    }
}
