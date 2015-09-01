package io.github.herobrine2nether.boneandblaze;

import io.github.herobrine2nether.boneandblaze.blocks.BlockManager;
import io.github.herobrine2nether.boneandblaze.items.ItemManager;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class Crafting {
	public static void craftAll() {
		craftTools();
		craftCombat();
		craftBlocks();
	}
	
	public static void craftTools() {
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blazingAxe),
				" xx", " yx", " y ", 'x', ItemManager.blazeIngot, 'y', Items.bone);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blazingAxe),
				"xx ", "xy ", " y ", 'x', ItemManager.blazeIngot, 'y', Items.bone);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.brimstoneShovel),
				" x ", " y ", " y ", 'x', ItemManager.blazeIngot, 'y', Items.bone);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.burnedHoe),
				"xx ", " y ", " y ", 'x', ItemManager.blazeIngot, 'y', Items.bone);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.burnedHoe),
				" xx", " y ", " y ", 'x', ItemManager.blazeIngot, 'y', Items.bone);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.flamingPickaxe),
				"xxx", " y ", " y ", 'x', ItemManager.blazeIngot, 'y', Items.bone);
	}
	
	public static void craftCombat() {
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.fierySword),
				" x ", " x ", " y ", 'x', ItemManager.blazeIngot, 'y', Items.bone);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blazeBoots),
				"   ", "x x", "x x", 'x', ItemManager.blazeIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blazeBoots),
				"x x", "x x", "  ", 'x', ItemManager.blazeIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blazeLeggings),
				"xxx", "x x", "x x", 'x', ItemManager.blazeIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blazeChestplate),
				"x x", "xxx", "xxx", 'x', ItemManager.blazeIngot);
		
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blazeHelmet),
				"xxx", "x x", "   ", 'x', ItemManager.blazeIngot);
		GameRegistry.addShapedRecipe(new ItemStack(ItemManager.blazeHelmet),
				"   ", "xxx", "x x", 'x', ItemManager.blazeIngot);
	}
	
	public static void craftBlocks() {
		GameRegistry.addShapedRecipe(new ItemStack(BlockManager.blazeBlock),
				"xxx", "xxx", "xxx", 'x', ItemManager.blazeIngot);
		
		GameRegistry.addShapelessRecipe(new ItemStack(ItemManager.blazeIngot, 9), BlockManager.blazeBlock);
	}
}
