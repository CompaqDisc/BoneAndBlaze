package io.github.herobrine2nether.boneandblaze.materials;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.common.util.EnumHelper;

public class BBToolMaterial {
	public static ToolMaterial toolMaterial;
	
	public static void createMaterial() {
		toolMaterial = EnumHelper.addToolMaterial("BBTool", 2, 325, 7.0f, 2.5f, 10);
	}
}
