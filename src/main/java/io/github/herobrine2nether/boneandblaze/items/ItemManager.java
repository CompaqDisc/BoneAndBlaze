package io.github.herobrine2nether.boneandblaze.items;

import io.github.herobrine2nether.boneandblaze.RenderManager;
import io.github.herobrine2nether.boneandblaze.items.combat.FierySword;
import io.github.herobrine2nether.boneandblaze.items.combat.armor.BlazeArmor;
import io.github.herobrine2nether.boneandblaze.items.tools.BlazingAxe;
import io.github.herobrine2nether.boneandblaze.items.tools.BrimstoneShovel;
import io.github.herobrine2nether.boneandblaze.items.tools.BurnedHoe;
import io.github.herobrine2nether.boneandblaze.items.tools.FlamingPickaxe;
import io.github.herobrine2nether.boneandblaze.materials.BBArmorMaterial;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ItemManager {
	public static FierySword fierySword;

	public static BrimstoneShovel brimstoneShovel;
	public static FlamingPickaxe flamingPickaxe;
	public static BlazingAxe blazingAxe;
	public static BurnedHoe burnedHoe;
	
	public static BlazeArmor blazeHelmet;
	public static BlazeArmor blazeChestplate;
	public static BlazeArmor blazeLeggings;
	public static BlazeArmor blazeBoots;
	
	public static BlazeIngot blazeIngot;
	
	public static void mainRegistry() {
        initializeItems();
        registerItems();
    }
	
    public static void initializeItems() {
    	fierySword = new FierySword();
    	
	 	brimstoneShovel = new BrimstoneShovel();
    	flamingPickaxe = new FlamingPickaxe();
    	blazingAxe = new BlazingAxe();
    	burnedHoe = new BurnedHoe();
    	
    	blazeHelmet = new BlazeArmor(BBArmorMaterial.armorMaterial, 0, 0, "blaze_helmet");
    	blazeChestplate = new BlazeArmor(BBArmorMaterial.armorMaterial, 0, 1, "blaze_chestplate");
    	blazeLeggings = new BlazeArmor(BBArmorMaterial.armorMaterial, 0, 2, "blaze_leggings");
    	blazeBoots = new BlazeArmor(BBArmorMaterial.armorMaterial, 0, 3, "blaze_boots");
    	
    	blazeIngot = new BlazeIngot();
    }
 
    public static void registerItems() {
    	GameRegistry.registerItem(fierySword, fierySword.name);
    	
    	GameRegistry.registerItem(brimstoneShovel, brimstoneShovel.name);
    	GameRegistry.registerItem(flamingPickaxe, flamingPickaxe.name);
    	GameRegistry.registerItem(blazingAxe, blazingAxe.name);
    	GameRegistry.registerItem(burnedHoe, burnedHoe.name);
    	
    	GameRegistry.registerItem(blazeHelmet, blazeHelmet.name);
    	GameRegistry.registerItem(blazeChestplate, blazeChestplate.name);
    	GameRegistry.registerItem(blazeLeggings, blazeLeggings.name);
    	GameRegistry.registerItem(blazeBoots, blazeBoots.name);
    	
    	GameRegistry.registerItem(blazeIngot, blazeIngot.name);
    }
    
    public static void renderItems() {
    	RenderManager.renderItem(fierySword, fierySword.name);
    	
    	RenderManager.renderItem(brimstoneShovel, brimstoneShovel.name);
    	RenderManager.renderItem(flamingPickaxe, flamingPickaxe.name);
    	RenderManager.renderItem(blazingAxe, blazingAxe.name);
    	RenderManager.renderItem(burnedHoe, burnedHoe.name);
    	
    	RenderManager.renderItem(blazeHelmet, blazeHelmet.name);
    	RenderManager.renderItem(blazeChestplate, blazeChestplate.name);
    	RenderManager.renderItem(blazeLeggings, blazeLeggings.name);
    	RenderManager.renderItem(blazeBoots, blazeBoots.name);
    	
    	RenderManager.renderItem(blazeIngot, blazeIngot.name);
    }
}
