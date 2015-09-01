package io.github.herobrine2nether.boneandblaze.items.combat;

import io.github.herobrine2nether.boneandblaze.Constants;
import io.github.herobrine2nether.boneandblaze.materials.BBToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemSword;

public class FierySword extends ItemSword {
	public static String name = "fiery_sword";
	public FierySword() {
		super(BBToolMaterial.toolMaterial);
		this.setCreativeTab(CreativeTabs.tabCombat);
		this.setUnlocalizedName(Constants.MODID + "." + name);
		this.setMaxStackSize(1);
	}
}