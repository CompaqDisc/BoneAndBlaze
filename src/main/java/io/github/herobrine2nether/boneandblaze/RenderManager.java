package io.github.herobrine2nether.boneandblaze;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.entity.RenderItem;
import net.minecraft.client.resources.model.ModelResourceLocation;
import net.minecraft.item.Item;

public class RenderManager {
	public static void renderItem(Item item, String name) {
		RenderItem ri = Minecraft.getMinecraft().getRenderItem();
		ri.getItemModelMesher().register(item, 0, new ModelResourceLocation(Constants.MODID + ":" + name, "inventory"));
	}
	
	public static void renderBlock(Block block, String name) {
		RenderItem ri = Minecraft.getMinecraft().getRenderItem();
		ri.getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Constants.MODID + ":" + name, "inventory"));
	}
}
