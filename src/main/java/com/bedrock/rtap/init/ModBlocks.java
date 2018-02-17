package com.bedrock.rtap.init;

import java.util.HashSet;
import java.util.Set;

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
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

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

	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Block> event) {

		final Block[] items = {
				
				blockflint,
				blockcathair,
				blockbologna,
				blockramen,
				blockjello,
				
				croppeppers,
				
		};
		
		final IForgeRegistry<Block> registry = event.getRegistry();
		
		for (final Block item : items) {
			
			registry.register(item);
			
		}
		
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
	
	private static void registerRender(Block block) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(Item.getItemFromBlock(block), 0, new ModelResourceLocation(block.getRegistryName(), "inventory"));

	}
	
}
