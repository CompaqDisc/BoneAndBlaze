package io.github.herobrine2nether.boneandblaze.items.tools;

import io.github.herobrine2nether.boneandblaze.Constants;
import io.github.herobrine2nether.boneandblaze.materials.BBToolMaterial;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.effect.EntityLightningBolt;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;
import net.minecraft.util.BlockPos;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.World;

public class FlamingPickaxe extends ItemPickaxe {
	public static String name = "flaming_pickaxe";
	public FlamingPickaxe() {
		super(BBToolMaterial.toolMaterial);
		this.setCreativeTab(CreativeTabs.tabTools);
		this.setUnlocalizedName(Constants.MODID + "." + name);
		this.setMaxStackSize(1);
	}
}
