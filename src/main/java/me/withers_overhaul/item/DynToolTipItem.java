package me.withers_overhaul.item;

import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.tooltip.TooltipType;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;

import java.util.List;

public class DynToolTipItem extends Item {

    public DynToolTipItem(Settings settings) {
        super(settings);

    }

    @Override
    public void appendTooltip(ItemStack itemStack, Item.TooltipContext context, List<Text> tooltip, TooltipType tooltipType) {

        tooltip.add(Text.translatable(this.getTranslationKey()+".desc").formatted(Formatting.GRAY));

    }



}
