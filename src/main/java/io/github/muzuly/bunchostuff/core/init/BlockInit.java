package io.github.muzuly.bunchostuff.core.init;

import io.github.muzuly.bunchostuff.BunchOStuff;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.Blocks;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, 
			BunchOStuff.MOD_ID);
	
	public static final RegistryObject<Block> TEST_BLOCK = BLOCKS.register("test_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.BLACK).hardnessAndResistance(0.1f).sound(SoundType.NETHER_BRICK)));

	public static final RegistryObject<Block> BLOODY_COBBLESTONE = BLOCKS.register("bloody_cobblestone", 
			() -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.GRAY).hardnessAndResistance(2f).sound(SoundType.STONE).harvestLevel(1)));
	
	public static final RegistryObject<Block> BLUE_PLANKS = BLOCKS.register("blue_planks", 
			() -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.BLUE).hardnessAndResistance(2f).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> RED_PLANKS = BLOCKS.register("red_planks", 
			() -> new Block(AbstractBlock.Properties.create(Material.WOOD, MaterialColor.RED).hardnessAndResistance(2f).sound(SoundType.WOOD)));
	
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", 
			() -> new Block(AbstractBlock.Properties.create(Material.IRON, MaterialColor.RED).hardnessAndResistance(5f).sound(SoundType.METAL)));
	
	public static final RegistryObject<Block> SOOTY_QUARTZ = BLOCKS.register("sooty_quartz",
			() -> new Block(AbstractBlock.Properties.from(Blocks.QUARTZ_BLOCK)));
	
	public static final RegistryObject<Block> COMPRESSED_DIRT = BLOCKS.register("compressed_dirt",
			() -> new Block(AbstractBlock.Properties.from(Blocks.DIRT)));
	
	public static final RegistryObject<Block> COMPRESSED_COBBLE = BLOCKS.register("compressed_cobble",
			() -> new Block(AbstractBlock.Properties.from(Blocks.COBBLESTONE)));
	
	public static final RegistryObject<Block> STARFISH = BLOCKS.register("starfish",
			() -> new Block(AbstractBlock.Properties.create(Material.CORAL, MaterialColor.ORANGE_TERRACOTTA).hardnessAndResistance(0.1f).sound(SoundType.CORAL)));

}
