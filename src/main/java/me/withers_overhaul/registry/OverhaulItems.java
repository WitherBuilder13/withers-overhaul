package me.withers_overhaul.registry;

import me.withers_overhaul.WithersOverhaul;
import me.withers_overhaul.item.RuneItem;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

public class OverhaulItems {

    //RUNES
    public static final Item RUNE_AQUA_AFFINITY = registerRuneItem("aqua_affinity", 1);
    public static final Item RUNE_BANE_OF_ARTHROPODS = registerRuneItem("bane_of_arthropods", 1);
    public static final Item RUNE_BLAST_PROTECTION = registerRuneItem("blast_protection", 1);
    public static final Item RUNE_BREACH = registerRuneItem ("breach", 2);
    public static final Item RUNE_CHANNELING = registerRuneItem("channeling", 2);
    public static final Item RUNE_DENSITY = registerRuneItem("density", 2);
    public static final Item RUNE_DEPTH_STRIDER = registerRuneItem("depth_strider", 1);
    public static final Item RUNE_EFFICIENCY = registerRuneItem("efficiency", 1);
    public static final Item RUNE_FEATHER_FALLING = registerRuneItem("feather_falling", 1);
    public static final Item RUNE_FIRE_ASPECT = registerRuneItem("fire_aspect", 1);
    public static final Item RUNE_FIRE_PROTECTION = registerRuneItem("fire_protection", 1);
    public static final Item RUNE_FLAME = registerRuneItem("flame", 1);
    public static final Item RUNE_FORTUNE = registerRuneItem("fortune", 1);
    public static final Item RUNE_FROST_WALKER = registerRuneItem("frost_walker", 1);
    public static final Item RUNE_IMPALING = registerRuneItem("impaling", 2);
    public static final Item RUNE_INFINITY = registerRuneItem("infinity", 2);
    public static final Item RUNE_KNOCKBACK = registerRuneItem("knockback", 1);
    public static final Item RUNE_LOOTING = registerRuneItem("looting", 1);
    public static final Item RUNE_LOYALTY = registerRuneItem("loyalty", 2);
    public static final Item RUNE_LUCK_OF_THE_SEA = registerRuneItem("luck_of_the_sea", 1);
    public static final Item RUNE_LURE = registerRuneItem("lure", 1);
    public static final Item RUNE_MENDING = registerRuneItem("mending", 3);
    public static final Item RUNE_MULTISHOT = registerRuneItem("multishot", 1);
    public static final Item RUNE_PIERCING = registerRuneItem("piercing", 1);
    public static final Item RUNE_POWER = registerRuneItem("power", 1);
    public static final Item RUNE_PROJECTILE_PROTECTION = registerRuneItem("projectile_protection", 1);
    public static final Item RUNE_PROTECTION = registerRuneItem("protection", 1);
    public static final Item RUNE_PUNCH = registerRuneItem("punch", 1);
    public static final Item RUNE_QUICK_CHARGE = registerRuneItem("quick_charge", 1);
    public static final Item RUNE_RESPIRATION = registerRuneItem("respiration", 1);
    public static final Item RUNE_RIPTIDE = registerRuneItem("riptide", 3);
    public static final Item RUNE_SHARPNESS = registerRuneItem("sharpness", 1);
    public static final Item RUNE_SILK_TOUCH = registerRuneItem("silk_touch", 1);
    public static final Item RUNE_SMITE = registerRuneItem("smite", 1);
    public static final Item RUNE_SOUL_SPEED = registerRuneItem("soul_speed", 2);
    public static final Item RUNE_SWEEPING_EDGE = registerRuneItem("sweeping_edge", 1);
    public static final Item RUNE_SWIFT_SNEAK = registerRuneItem("swift_sneak", 2);
    public static final Item RUNE_THORNS = registerRuneItem("thorns", 2);
    public static final Item RUNE_UNBREAKING = registerRuneItem("unbreaking", 1);
    public static final Item RUNE_WIND_BURST = registerRuneItem("wind_burst", 3);

    /*
    //SCROLLS
    public static final Item SCROLL_AQUA_AFFINITY = registerScrollItem("aqua_affinity");
    public static final Item SCROLL_BANE_OF_ARTHROPODS = registerScrollItem("bane_of_arthropods");
    public static final Item SCROLL_BLAST_PROTECTION = registerScrollItem("blast_protection");
    public static final Item SCROLL_BREACH = registerScrollItem("breach");
    public static final Item SCROLL_CHANNELING = registerScrollItem("channeling");
    public static final Item SCROLL_DENSITY = registerScrollItem("density");
    public static final Item SCROLL_DEPTH_STRIDER = registerScrollItem("depth_strider");
    public static final Item SCROLL_EFFICIENCY = registerScrollItem("efficiency");
    public static final Item SCROLL_FEATHER_FALLING = registerScrollItem("feather_falling");
    public static final Item SCROLL_FIRE_ASPECT = registerScrollItem("fire_aspect");
    public static final Item SCROLL_FIRE_PROTECTION = registerScrollItem("fire_protection");
    public static final Item SCROLL_FLAME = registerScrollItem("flame");
    public static final Item SCROLL_FORTUNE = registerScrollItem("fortune");
    public static final Item SCROLL_FROST_WALKER = registerScrollItem("frost_walker");
    public static final Item SCROLL_IMPALING = registerScrollItem("impaling");
    public static final Item SCROLL_INFINITY = registerScrollItem("infinity");
    public static final Item SCROLL_KNOCKBACK = registerScrollItem("knockback");
    public static final Item SCROLL_LOOTING = registerScrollItem("looting");
    public static final Item SCROLL_LOYALTY = registerScrollItem("loyalty");
    public static final Item SCROLL_LUCK_OF_THE_SEA = registerScrollItem("luck_of_the_sea");
    public static final Item SCROLL_LURE = registerScrollItem("lure");
    public static final Item SCROLL_MENDING = registerScrollItem("mending");
    public static final Item SCROLL_MULTISHOT = registerScrollItem("multishot");
    public static final Item SCROLL_PIERCING = registerScrollItem("piercing");
    public static final Item SCROLL_POWER = registerScrollItem("power");
    public static final Item SCROLL_PROJECTILE_PROTECTION = registerScrollItem("projectile_protection");
    public static final Item SCROLL_PROTECTION = registerScrollItem("protection");
    public static final Item SCROLL_PUNCH = registerScrollItem("punch");
    public static final Item SCROLL_QUICK_CHARGE = registerScrollItem("quick_charge");
    public static final Item SCROLL_RESPIRATION = registerScrollItem("respiration");
    public static final Item SCROLL_RIPTIDE = registerScrollItem("riptide");
    public static final Item SCROLL_SHARPNESS = registerScrollItem("sharpness");
    public static final Item SCROLL_SILK_TOUCH = registerScrollItem("silk_touch");
    public static final Item SCROLL_SMITE = registerScrollItem("smite");
    public static final Item SCROLL_SOUL_SPEED = registerScrollItem("soul_speed");
    public static final Item SCROLL_SWEEPING_EDGE = registerScrollItem("sweeping_edge");
    public static final Item SCROLL_SWIFT_SNEAK = registerScrollItem("swift_sneak");
    public static final Item SCROLL_THORNS = registerScrollItem("thorns");
    public static final Item SCROLL_UNBREAKING = registerScrollItem("unbreaking");
    public static final Item SCROLL_WIND_BURST = registerScrollItem("wind_burst");
     */

    private static Item registerRuneItem(String enchantmentName, int rarity) {
        return switch (rarity) {
            case 1 ->
                    registerItem("rune_" + enchantmentName, new RuneItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
            case 2 ->
                    registerItem("rune_" + enchantmentName, new RuneItem(new Item.Settings().rarity(Rarity.RARE)));
            case 3 ->
                    registerItem("rune_" + enchantmentName, new RuneItem(new Item.Settings().rarity(Rarity.EPIC)));
            default -> throw new IllegalStateException("Unexpected value for 'rarity' in RuneItem(s): " + rarity + "; allowed values are 1, 2, or 3");
        };
    }

    /*
    private static Item registerScrollItem(String enchantmentName) {
        return Registry.register(Registries.ITEM, Identifier.of(WithersOverhaul.MOD_ID, "scroll_" + enchantmentName), new DynToolTipItem(new Item.Settings().rarity(Rarity.UNCOMMON)));
    }
     */
    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, Identifier.of(WithersOverhaul.MOD_ID, name), item);
    }

    public static void registerItems() {

        WithersOverhaul.LOGGER.info("Registering items for " + WithersOverhaul.MOD_ID);

    }
}
