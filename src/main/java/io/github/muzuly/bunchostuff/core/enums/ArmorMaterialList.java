package io.github.muzuly.bunchostuff.core.enums;

import io.github.muzuly.bunchostuff.BunchOStuff;
import io.github.muzuly.bunchostuff.core.init.ItemInit;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.Item;
import net.minecraft.item.Items;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.SoundEvent;

public enum ArmorMaterialList implements IArmorMaterial
{
	//Armor order: helmet, leggings, chestplate, boots
	EMERALDARMORMATERIAL("emerald_armor_material", 26, new int[] {2, 5, 6, 2}, 25, Items.EMERALD, 0f, 0.00f),
	OBSIDIANARMORMATERIAL("obsidian_armor_material", 41, new int[] {3, 6, 8, 3}, 9, Items.EMERALD, 2f, 0.00f),
	RUBYARMORMATERIAL("ruby_armor_material", 32, new int[] {3, 6, 8, 3}, 28, ItemInit.RUBY.get(), 1.5f, 0.00f);

	private static final int[] max_damage_array = new int[]{13, 15, 16, 11};
	private String name;
	private int durability, enchantability;
	private Item repairItem;
	private int[] damageReductionAmounts;
	private float toughness;
	private final float knockbackResistance;
	
	private ArmorMaterialList(String name, int durability, int[] damageReductionAmounts, int enchantability, Item repairItem, float toughness, float knockbackResistance) 
	{
		this.name = name;
		this.durability = durability;
		this.enchantability = enchantability;
		this.repairItem = repairItem;
		this.damageReductionAmounts = damageReductionAmounts;
		this.toughness = toughness;
		this.knockbackResistance = knockbackResistance;
	}

	@Override
	public int getDamageReductionAmount(EquipmentSlotType slot) 
	{
		return this.damageReductionAmounts[slot.getIndex()];
	}

	@Override
	public int getDurability(EquipmentSlotType slot) 
	{
		return max_damage_array[slot.getIndex()] * this.durability;
	}

	@Override
	public int getEnchantability() 
	{
		return this.enchantability;
	}
	
	@Override
	public Ingredient getRepairMaterial() 
	{
		return Ingredient.fromItems(this.repairItem);
	}

	@Override
	public float getToughness() 
	{
		return this.toughness;
	}

	@Override
	public float getKnockbackResistance()
	{
		return this.knockbackResistance;
	}

	@Override
	public String getName() 
	{
		return BunchOStuff.MOD_ID + ":" + this.name;
	}

	@Override
	public SoundEvent getSoundEvent() {
		// TODO Auto-generated method stub
		return null;
	}

}