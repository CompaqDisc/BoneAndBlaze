package io.github.herobrine2nether.boneandblaze;

import io.github.herobrine2nether.boneandblaze.blocks.BlockManager;
import io.github.herobrine2nether.boneandblaze.items.ItemManager;
import io.github.herobrine2nether.boneandblaze.materials.MaterialManager;
import io.github.herobrine2nether.boneandblaze.oreGen.GeneratorManager;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = Constants.MODID, version = Constants.VERSION)
public class BoneAndBlaze {
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(Constants.MODNAME + " version " + Constants.VERSION + " will start soon.");
		MaterialManager.manage();
		ItemManager.mainRegistry(); 
		BlockManager.mainRegistry();
	}
	
	@EventHandler
    public void init(FMLInitializationEvent event)
    {
		System.out.println(Constants.MODNAME + " version " + Constants.VERSION + " is starting.");
		if(event.getSide() == Side.CLIENT)
        {
			ItemManager.renderItems();
			BlockManager.renderBlocks();
        }
		Crafting.craftAll();
		Smelting.smeltAll();
		GeneratorManager.manage();
    }
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		System.out.println(Constants.MODNAME + " version " + Constants.VERSION + " has started.");
	}
}
