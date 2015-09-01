package io.github.herobrine2nether.boneandblaze.items;

import io.github.herobrine2nether.boneandblaze.Constants;
import io.github.herobrine2nether.boneandblaze.materials.BBToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlazeIngot extends Item {
	public static String name = "blaze_ingot";
	public BlazeIngot() {
		this.setCreativeTab(CreativeTabs.tabMaterials);
		this.setUnlocalizedName(Constants.MODID + "." + name);
		this.setMaxStackSize(64);
	}
}
