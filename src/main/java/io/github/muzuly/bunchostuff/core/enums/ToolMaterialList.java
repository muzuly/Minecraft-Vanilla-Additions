package io.github.muzuly.bunchostuff.core.enums;

import net.minecraft.item.IItemTier;
import io.github.muzuly.bunchostuff.core.init.ItemInit;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;

public enum ToolMaterialList implements IItemTier {
	
	EMERALDTOOLMATERIAL(1f, 7f, 827, 4, 22, Items.EMERALD),
	OBSIDIANTOOLMATERIAL(1f, 8f, 2400, 5, 9, Items.OBSIDIAN),
	RUBYTOOLMATERIAL(1f, 8f, 1652, 5, 19, ItemInit.RUBY.get()); 
	
	private float attackDamage, efficiency;
	private int durability, harvestLevel, enchantability;
	private Item repairMaterial;
	
	private ToolMaterialList(float attackDamage, float efficiency, int durability, int harvestLevel, int enchantability, Item repairMaterial) 
	{
		this.attackDamage = attackDamage;
		this.efficiency = efficiency;
		this.durability = durability;
		this.harvestLevel = harvestLevel;
		this.enchantability = enchantability;
		this.repairMaterial = repairMaterial;
	}

	@Override
	public float getAttackDamage() 
	{
		return this.attackDamage;
	}

	@Override
	public float getEfficiency() 
	{
		return this.efficiency;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}

	@Override
	public int getHarvestLevel()
	{
		return this.harvestLevel;
	}

	@Override
	public int getMaxUses() 
	{
		return this.durability;
	}

	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairMaterial);
	}
}
