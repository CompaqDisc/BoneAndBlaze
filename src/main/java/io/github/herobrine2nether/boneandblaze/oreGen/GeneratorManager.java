package io.github.herobrine2nether.boneandblaze.oreGen;

import net.minecraftforge.fml.common.registry.GameRegistry;

public class GeneratorManager {
	public static void manage() {
		BlazeOre blazeOreGenerator;
		blazeOreGenerator = new BlazeOre();
		GameRegistry.registerWorldGenerator(blazeOreGenerator, 100);
	}
}
