package io.github.herobrine2nether.boneandblaze.items.combat.armor;

import io.github.herobrine2nether.boneandblaze.Constants;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;

public class BlazeArmor extends ItemArmor {
	public String name;
	public BlazeArmor(ArmorMaterial material, int renderIndex, int armorType, String name) {
		super(material, renderIndex, armorType);
		this.name = name;
		this.setUnlocalizedName(Constants.MODID + "." + name);
        this.setCreativeTab(CreativeTabs.tabCombat);
	}

	@Override
	public String getArmorTexture(ItemStack stack, Entity entity, int slot,
			String type) {
		
		if(slot == 2) {
			return "boneandblaze:textures/models/armor/blaze_armor_layer_2.png";
		}
		return "boneandblaze:textures/models/armor/blaze_armor_layer_1.png";
	}
}
