package io.github.herobrine2nether.boneandblaze.items.tools;

import io.github.herobrine2nether.boneandblaze.Constants;
import io.github.herobrine2nether.boneandblaze.materials.BBToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemHoe;

public class BurnedHoe extends ItemHoe {
	public static String name = "burned_hoe";
	public BurnedHoe() {
		super(BBToolMaterial.toolMaterial);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName(Constants.MODID + "." + name);
		this.setMaxStackSize(1);
	}
}
