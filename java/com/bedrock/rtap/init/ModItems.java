package com.bedrock.rtap.init;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.items.foodBologna;
import com.bedrock.rtap.items.foodJello;
import com.bedrock.rtap.items.foodRamenCold;
import com.bedrock.rtap.items.foodRamenCooked;
import com.bedrock.rtap.items.foodPeppers;
import com.bedrock.rtap.items.itemCatHair;
import com.bedrock.rtap.items.itemFilter;
import com.bedrock.rtap.items.itemFilterPart;
import com.bedrock.rtap.items.itemGelatine;
import com.bedrock.rtap.items.itemGelatineWet;
import com.bedrock.rtap.items.itemJelloHot;
import com.bedrock.rtap.items.itemJelloMix;
import com.bedrock.rtap.items.itemLiquidMeat;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModItems {

	//Misc + crafting
	//Jello
	public static Item itemliquidmeat;
	public static Item itemfilterpart;
	public static Item itemfilter;
	public static Item itemgelatinewet;
	public static Item itemgelatine;
	public static Item itemjellomix;
	public static Item itemjellohot;
	//Cat Hair
	public static Item itemcathair;
	
	//Foods
	//Ramen
	public static Item foodpeppers;
	public static Item foodramencold;
	public static Item foodramencooked;
	//Bologna
	public static Item foodbologna;
	//Jello
	public static Item foodjello;
	
	public static void init() {
		
		//Misc + crafting
		//Jello
		itemliquidmeat = new itemLiquidMeat();
		itemfilterpart = new itemFilterPart();
		itemfilter = new itemFilter();
		itemgelatinewet = new itemGelatineWet();
		itemgelatine = new itemGelatine();
		itemjellomix = new itemJelloMix();
		itemjellohot = new itemJelloHot();
		//Cat Hair
		itemcathair = new itemCatHair();
		
		//Foods
		//Ramen
		foodpeppers = new foodPeppers();
		foodramencold = new foodRamenCold();
		foodramencooked = new foodRamenCooked();
		//Bologna
		foodbologna = new foodBologna();
		//Jello
		foodjello = new foodJello();
		
	}
	
	public static void register() {
		
		//Misc + crafting
		//Jello
		GameRegistry.register(itemliquidmeat);
		GameRegistry.register(itemfilterpart);
		GameRegistry.register(itemfilter);
		GameRegistry.register(itemgelatinewet);
		GameRegistry.register(itemgelatine);
		GameRegistry.register(itemjellomix);
		GameRegistry.register(itemjellohot);
		//Cat Hair
		GameRegistry.register(itemcathair);
		
		//Foods
		//Ramen
		GameRegistry.register(foodpeppers);
		GameRegistry.register(foodramencold);
		GameRegistry.register(foodramencooked);
		//Bologna
		GameRegistry.register(foodbologna);
		//Jello
		GameRegistry.register(foodjello);
		
	}
	
	public static void registerRenders() {
		
		//Misc + crafting
		//Jello
		registerRender(itemliquidmeat);
		registerRender(itemfilterpart);
		registerRender(itemfilter);
		registerRender(itemgelatinewet);
		registerRender(itemgelatine);
		registerRender(itemjellomix);
		registerRender(itemjellohot);
		//Cat Hair
		registerRender(itemcathair);
		
		//Foods
		//Ramen
		registerRender(foodpeppers);
		registerRender(foodramencold);
		registerRender(foodramencooked);
		//Bologna
		registerRender(foodbologna);
		//Jello
		registerRender(foodjello);
		
	}
	
	private static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	
}
