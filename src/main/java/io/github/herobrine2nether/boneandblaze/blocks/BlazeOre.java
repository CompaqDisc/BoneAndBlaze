package io.github.herobrine2nether.boneandblaze.blocks;

import java.util.Random;

import io.github.herobrine2nether.boneandblaze.Constants;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.init.Items;
import net.minecraft.item.Item;

public class BlazeOre extends Block {
	public static final String name = "blaze_ore";
	public BlazeOre() {
		super(Material.iron);
		this.setUnlocalizedName(Constants.MODID + "." + name);
        this.setCreativeTab(CreativeTabs.tabBlock);
        this.setLightLevel(0.4f);
        this.setHardness(3.3f);
        this.setResistance(7.0f);
        this.setHarvestLevel("pickaxe", 2);
	}
	
	@Override
	public int quantityDropped(Random random)
    {
        return 2 + random.nextInt(1);
    }
	
	@Override
    public Item getItemDropped(IBlockState state, Random rand, int fortune)
    {
        return Items.blaze_powder;
    }
}
