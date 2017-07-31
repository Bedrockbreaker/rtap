package com.bedrock.rtap.init;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.blocks.blockBologna;
import com.bedrock.rtap.blocks.blockCatHair;
import com.bedrock.rtap.blocks.blockFlint;
import com.bedrock.rtap.blocks.blockJello;
import com.bedrock.rtap.blocks.blockRamen;
import com.bedrock.rtap.blocks.cropPeppers;

import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModBlocks {
	
	//Misc + decor
	public static Block blockflint;
	//Cat Hair
	public static Block blockcathair;
	//Bologna
	public static Block blockbologna;
	//Ramen
	public static Block blockramen;
	//Jello
	public static Block blockjello;
	
	//Crops
	public static Block croppeppers;

	public static void init() {
		
		//Misc + decor
		blockflint = new blockFlint();
		//Cat Hair
		blockcathair = new blockCatHair();
		//Bologna
		blockbologna = new blockBologna();
		//Ramen
		blockramen = new blockRamen();
		//Jello
		blockjello = new blockJello();
		
		//Crops
		croppeppers = new cropPeppers();
		
	}
	
	public static void register() {
		
		//Misc + decor
		registerBlock(blockflint);
		//Cat Hair
		registerBlock(blockcathair);
		//Bologna
		registerBlock(blockbologna);
		//Ramen
		registerBlock(blockramen);
		//Jello
		registerBlock(blockjello);
		
		//Crops
		GameRegistry.register(croppeppers);
		
	}
	
	public static void registerRenders() {
		
		//Misc + decor
		registerRender(blockflint);
		//Cat Hair
		registerRender(blockcathair);
		//Bologna
		registerRender(blockbologna);
		//Ramen
		registerRender(blockramen);
		//Jello
		registerRender(blockjello);
		
	}
	
	
	private static void registerBlock(Block block) {
		
		GameRegistry.register(block);
		ItemBlock item = new ItemBlock(block);
		item.setRegistryName(block.getRegistryName());
		GameRegistry.register(item);
		
	}
	
	private static void registerRender(Block block) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

	}
	
}
