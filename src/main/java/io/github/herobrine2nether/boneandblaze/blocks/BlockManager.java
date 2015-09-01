package io.github.herobrine2nether.boneandblaze.blocks;

import io.github.herobrine2nether.boneandblaze.RenderManager;
import net.minecraftforge.fml.common.registry.GameRegistry;


public class BlockManager {
	public static BlazeBlock blazeBlock;
	public static BlazeOre blazeOre;
	
    public static void mainRegistry() {
        initializeBlocks();
        registerBlocks();
    }
 
    public static void initializeBlocks() {
    	blazeBlock = new BlazeBlock();
    	blazeOre = new BlazeOre();
    }
 
    public static void registerBlocks() {
    	GameRegistry.registerBlock(blazeBlock, blazeBlock.name);
    	GameRegistry.registerBlock(blazeOre, blazeOre.name);
    }
 
    public static void renderBlocks() {
    	RenderManager.renderBlock(blazeBlock, blazeBlock.name);
    	RenderManager.renderBlock(blazeOre, blazeOre.name);
    }
}