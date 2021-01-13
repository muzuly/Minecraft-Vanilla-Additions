package io.github.muzuly.bunchostuff.common.items.ObsidianTools;

import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.item.ShovelItem;

public class ObsidianShovel extends ShovelItem
{
	public ObsidianShovel (IItemTier tier, float attackDamageIn, float attackSpeedIn, Item.Properties builder)
	{
		super(tier, attackDamageIn, attackSpeedIn, builder);
	}
	
	@Override
	public boolean isBookEnchantable(ItemStack stack, ItemStack book)
	{
		return true;
	}

	@Override
	public boolean getIsRepairable(ItemStack toRepair, ItemStack repair)
	{
		return repair.getItem() == Items.EMERALD.getItem();
	}
}