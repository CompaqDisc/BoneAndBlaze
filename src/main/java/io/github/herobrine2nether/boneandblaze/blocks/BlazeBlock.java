package io.github.herobrine2nether.boneandblaze.blocks;

import io.github.herobrine2nether.boneandblaze.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlazeBlock extends Block {
	public static final String name = "blaze_block";
	public BlazeBlock() {
		super(Material.iron);
		this.setUnlocalizedName(Constants.MODID + "." + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightLevel(0.8f);
        this.setHardness(3.3f);
        this.setResistance(8.0f);
        this.setHarvestLevel("pickaxe", 2);
	}
}
