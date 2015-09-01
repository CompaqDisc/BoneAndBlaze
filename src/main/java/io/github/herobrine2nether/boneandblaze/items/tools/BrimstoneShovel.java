package io.github.herobrine2nether.boneandblaze.items.tools;

import io.github.herobrine2nether.boneandblaze.Constants;
import io.github.herobrine2nether.boneandblaze.materials.BBToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemSpade;

public class BrimstoneShovel extends ItemSpade{
	public static String name = "brimstone_shovel";
	public BrimstoneShovel() {
		super(BBToolMaterial.toolMaterial);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName(Constants.MODID + "." + name);
		this.setMaxStackSize(1);
	}
}
