package io.github.herobrine2nether.boneandblaze.materials;

import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class BBArmorMaterial {
public static ArmorMaterial armorMaterial;
	
	public static void createMaterial() {
		armorMaterial = EnumHelper.addArmorMaterial("BBArmor", "BBArmor", 17, new int[] {3, 6, 4, 2}, 10);
	}
}
