package com.bedrock.rtap.init;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.irecipes.sulfur;

import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModNonCrafting {
	
	//Use for everything that isn't normal crafting! yay!
	
	public static void init() {
		
		GameRegistry.addSmelting(ModItems.foodramencold, new ItemStack(ModItems.foodramencooked), .1F);
		GameRegistry.addSmelting(ModItems.itemgelatinewet, new ItemStack(ModItems.itemgelatine), .2F);
		
	}

}
