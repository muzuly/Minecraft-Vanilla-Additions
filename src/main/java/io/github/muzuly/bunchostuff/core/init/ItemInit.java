package io.github.muzuly.bunchostuff.core.init;

import io.github.muzuly.bunchostuff.BunchOStuff; 
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.SoupItem;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Foods;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldAxe;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldHoe;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldPickaxe;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldShovel;
import io.github.muzuly.bunchostuff.common.items.EmeraldTools.EmeraldSword;
import io.github.muzuly.bunchostuff.common.items.FoodList.FoodList;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndAxe;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndHoe;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndPickaxe;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndShovel;
//import io.github.muzuly.bunchostuff.common.items.EndTools.EndSword;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianAxe;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianHoe;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianPickaxe;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianShovel;
import io.github.muzuly.bunchostuff.common.items.ObsidianTools.ObsidianSword;
import io.github.muzuly.bunchostuff.common.items.Rings.FlightRing;
import io.github.muzuly.bunchostuff.common.items.Rings.InstantHealthRing;
import io.github.muzuly.bunchostuff.core.enums.ToolMaterialList;
import io.github.muzuly.bunchostuff.core.enums.ArmorMaterialList;


public class ItemInit {

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, 
			BunchOStuff.MOD_ID);
	
	// ITEMS
	public static final RegistryObject<Item> TEST_ITEM = ITEMS.register("test_item", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> PEACH = ITEMS.register("peach", 
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.APPLE)));
	
	public static final RegistryObject<Item> APPLE_PIE = ITEMS.register("apple_pie", 
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.COOKED_CHICKEN)));
	
	public static final RegistryObject<Item> CHOCOLATE = ITEMS.register("chocolate", 
			() -> new Item(new Item.Properties().group(ItemGroup.FOOD).food(Foods.DRIED_KELP)));
	
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> CARROT_STEW = ITEMS.register("carrot_stew",
			() -> new SoupItem((new Item.Properties()).maxStackSize(1).group(ItemGroup.FOOD).food(Foods.BEETROOT_SOUP)));
	
	public static final RegistryObject<Item> PEA_SOUP = ITEMS.register("pea_soup",
			() -> new SoupItem((new Item.Properties()).maxStackSize(1).group(ItemGroup.FOOD).food(FoodList.PEA_SOUP)));

	
	//RINGS & PENDANTS
	public static final RegistryObject<Item> IRON_RING_ITEM = ITEMS.register("iron_ring_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> GOLD_RING_ITEM = ITEMS.register("gold_ring_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> DIAMOND_RING_ITEM = ITEMS.register("diamond_ring_item",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot",
			() -> new Item(new Item.Properties().group(ItemGroup.MISC)));
	
	public static final RegistryObject<Item> INSTANT_HEALTH_PENDANT = ITEMS.register("instant_health_pendant", 
			() -> new Item(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));

	public static final RegistryObject<InstantHealthRing> IRON_INSTANT_HEALTH_RING = ITEMS.register("iron_instant_health_ring", 
			() -> new InstantHealthRing(new Item.Properties().group(ItemGroup.MISC).maxStackSize(1)));
	
	public static final RegistryObject<FlightRing> IRON_FLIGHT_RING = ITEMS.register("iron_flight_ring",
			() -> new FlightRing(new Item.Properties().group(ItemGroup.COMBAT).maxStackSize(1)));
	
	//TOOLS
	//EMERALD TOOLS
	public static final RegistryObject<Item> EMERALD_SWORD = ITEMS.register("emerald_sword", 
			() -> new EmeraldSword(ToolMaterialList.EMERALDTOOLMATERIAL, 4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> EMERALD_SHOVEL = ITEMS.register("emerald_shovel", 
			() -> new EmeraldShovel(ToolMaterialList.EMERALDTOOLMATERIAL, 3f, -3.0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> EMERALD_PICKAXE = ITEMS.register("emerald_pickaxe", 
			() -> new EmeraldPickaxe(ToolMaterialList.EMERALDTOOLMATERIAL, 2, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> EMERALD_AXE = ITEMS.register("emerald_axe", 
			() -> new EmeraldAxe(ToolMaterialList.EMERALDTOOLMATERIAL, 7f, -3f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> EMERALD_HOE = ITEMS.register("emerald_hoe", 
			() -> new EmeraldHoe(ToolMaterialList.EMERALDTOOLMATERIAL, -1, 0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	//END TOOLS
//	public static final RegistryObject<Item> END_SWORD = ITEMS.register("end_sword", 
//			() -> new EndSword(ToolMaterialList.EMERALD_MATERIAL, 4, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
	
//	public static final RegistryObject<Item> END_SHOVEL = ITEMS.register("end_shovel", 
//			() -> new EndShovel(ToolMaterialList.EMERALD_MATERIAL, 2.5f, -3.0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
//	public static final RegistryObject<Item> END_PICKAXE = ITEMS.register("end_pickaxe", 
//			() -> new EndPickaxe(ToolMaterialList.EMERALD_MATERIAL, 2, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)));
	
//	public static final RegistryObject<Item> END_AXE = ITEMS.register("end_axe", 
//			() -> new EndAxe(ToolMaterialList.EMERALD_MATERIAL, 6.5f, -3f, new Item.Properties().group(ItemGroup.TOOLS)));
	
//	public static final RegistryObject<Item> END_HOE = ITEMS.register("end_hoe", 
//			() -> new EndHoe(ToolMaterialList.EMERALD_MATERIAL, -1, -.5f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	//OBSIDIAN TOOLS
	public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", 
			() -> new ObsidianSword(ToolMaterialList.OBSIDIANTOOLMATERIAL, 5, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", 
			() -> new ObsidianShovel(ToolMaterialList.OBSIDIANTOOLMATERIAL, 3.5f, -3.0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", 
			() -> new ObsidianPickaxe(ToolMaterialList.OBSIDIANTOOLMATERIAL, 3, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", 
			() -> new ObsidianAxe(ToolMaterialList.OBSIDIANTOOLMATERIAL, 7f, -3f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", 
			() -> new ObsidianHoe(ToolMaterialList.OBSIDIANTOOLMATERIAL, -1, 0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	//RUBY TOOLS
	public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", 
			() -> new EmeraldSword(ToolMaterialList.RUBYTOOLMATERIAL, 5, -2.4f, new Item.Properties().maxStackSize(1).group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", 
			() -> new EmeraldShovel(ToolMaterialList.RUBYTOOLMATERIAL, 4f, -3.0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", 
			() -> new EmeraldPickaxe(ToolMaterialList.RUBYTOOLMATERIAL, 3, -2.8f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", 
			() -> new EmeraldAxe(ToolMaterialList.RUBYTOOLMATERIAL, 7.5f, -3f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", 
			() -> new EmeraldHoe(ToolMaterialList.RUBYTOOLMATERIAL, -1, 0f, new Item.Properties().group(ItemGroup.TOOLS)));
	
	//ARMOR
	//EMERALD ARMOR
	public static final RegistryObject<Item> EMERALD_HELMET = ITEMS.register("emerald_helmet",
			() -> new ArmorItem(ArmorMaterialList.EMERALDARMORMATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> EMERALD_CHESTPLATE = ITEMS.register("emerald_chestplate",
			() -> new ArmorItem(ArmorMaterialList.EMERALDARMORMATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> EMERALD_LEGGINGS = ITEMS.register("emerald_leggings",
			() -> new ArmorItem(ArmorMaterialList.EMERALDARMORMATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> EMERALD_BOOTS = ITEMS.register("emerald_boots",
			() -> new ArmorItem(ArmorMaterialList.EMERALDARMORMATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
	
	
	//OBSIDIAN ARMOR
	public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet",
			() -> new ArmorItem(ArmorMaterialList.OBSIDIANARMORMATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate",
			() -> new ArmorItem(ArmorMaterialList.OBSIDIANARMORMATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings",
			() -> new ArmorItem(ArmorMaterialList.OBSIDIANARMORMATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots",
			() -> new ArmorItem(ArmorMaterialList.OBSIDIANARMORMATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
			
	//RUBY ARMOR
	public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet",
			() -> new ArmorItem(ArmorMaterialList.RUBYARMORMATERIAL, EquipmentSlotType.HEAD, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate",
			() -> new ArmorItem(ArmorMaterialList.RUBYARMORMATERIAL, EquipmentSlotType.CHEST, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings",
			() -> new ArmorItem(ArmorMaterialList.RUBYARMORMATERIAL, EquipmentSlotType.LEGS, new Item.Properties().group(ItemGroup.COMBAT)));
	
	public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots",
			() -> new ArmorItem(ArmorMaterialList.RUBYARMORMATERIAL, EquipmentSlotType.FEET, new Item.Properties().group(ItemGroup.COMBAT)));
	
	
	// BLOCK ITEMS
	public static final RegistryObject<BlockItem> TEST_BLOCK = ITEMS.register("test_block", 
			() -> new BlockItem(BlockInit.TEST_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BLOODY_COBBLESTONE = ITEMS.register("bloody_cobblestone", 
			() -> new BlockItem(BlockInit.BLOODY_COBBLESTONE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> BLUE_PLANKS = ITEMS.register("blue_planks", 
			() -> new BlockItem(BlockInit.BLUE_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> RED_PLANKS = ITEMS.register("red_planks", 
			() -> new BlockItem(BlockInit.RED_PLANKS.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block",
			() -> new BlockItem(BlockInit.RUBY_BLOCK.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	public static final RegistryObject<BlockItem> SOOTY_QUARTZ = ITEMS.register("sooty_quartz",
			() -> new BlockItem(BlockInit.SOOTY_QUARTZ.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> COMPRESSED_DIRT = ITEMS.register("compressed_dirt",
			() -> new BlockItem(BlockInit.COMPRESSED_DIRT.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
	public static final RegistryObject<BlockItem> COMPRESSED_COBBLE = ITEMS.register("compressed_cobble",
			() -> new BlockItem(BlockInit.COMPRESSED_COBBLE.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));

	public static final RegistryObject<BlockItem> STARFISH = ITEMS.register("starfish",
			() -> new BlockItem(BlockInit.STARFISH.get(), new Item.Properties().group(ItemGroup.BUILDING_BLOCKS)));
	
}