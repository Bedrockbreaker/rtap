package com.bedrock.rtap.init;

import java.util.HashSet;
import java.util.Set;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.items.foodBologna;
import com.bedrock.rtap.items.foodJello;
import com.bedrock.rtap.items.foodRamenCold;
import com.bedrock.rtap.items.foodRamenCooked;
import com.bedrock.rtap.items.foodRamenElectronic;
import com.bedrock.rtap.items.foodRamenHairy;
import com.bedrock.rtap.items.foodRamenJello;
import com.bedrock.rtap.items.foodRamenMeaty;
import com.bedrock.rtap.items.foodRamenMysterious;
import com.bedrock.rtap.items.foodRamenPrimal;
import com.bedrock.rtap.items.foodRamenRamen;
import com.bedrock.rtap.items.foodRamenSpicy;
import com.bedrock.rtap.items.foodRamenSweet;
import com.bedrock.rtap.items.foodPeppers;
import com.bedrock.rtap.items.foodRamenBalanced;
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
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

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
	public static Item foodramenspicy;
	public static Item foodramensweet;
	public static Item foodramenjello;
	public static Item foodramenhairy;
	public static Item foodramenmeaty;
	public static Item foodramenramen;
	public static Item foodramenprimal;
	public static Item foodramenelectronic;
	public static Item foodramenmysterious;
	public static Item foodramenbalanced;
	
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
		foodramenspicy = new foodRamenSpicy();
		foodramensweet = new foodRamenSweet();
		foodramenjello = new foodRamenJello();
		foodramenhairy = new foodRamenHairy();
		foodramenmeaty = new foodRamenMeaty();
		foodramenramen = new foodRamenRamen();
		foodramenprimal = new foodRamenPrimal();
		foodramenelectronic = new foodRamenElectronic();
		foodramenmysterious = new foodRamenMysterious();
		foodramenbalanced = new foodRamenBalanced();
		//Bologna
		foodbologna = new foodBologna();
		//Jello
		foodjello = new foodJello();
		
	}
	
	@SubscribeEvent
	public static void registerItems(final RegistryEvent.Register<Item> event) {

		final Item[] items = {
				
			//Misc + crafting
			//Jello
			itemliquidmeat,
			itemfilterpart,
			itemfilter,
			itemgelatinewet,
			itemgelatine,
			itemjellomix,
			itemjellohot,
			//Cat Hair
			itemcathair,
			
			//Foods
			//Ramen
			foodpeppers,
			foodramencold,
			foodramencooked,
			foodramenspicy,
			foodramensweet,
			foodramenjello,
			foodramenhairy,
			foodramenmeaty,
			foodramenramen,
			foodramenprimal,
			foodramenelectronic,
			foodramenmysterious,
			foodramenbalanced,
			//Bologna
			foodbologna,
			//Jello
			foodjello,
		
		};
		
		final IForgeRegistry<Item> registry = event.getRegistry();
		
		for (final Item item : items) {
			
			registry.register(item);
			
		}
		
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
		registerRender(foodramenspicy);
		registerRender(foodramensweet);
		registerRender(foodramenjello);
		registerRender(foodramenhairy);
		registerRender(foodramenmeaty);
		registerRender(foodramenramen);
		registerRender(foodramenprimal);
		registerRender(foodramenelectronic);
		registerRender(foodramenmysterious);
		registerRender(foodramenbalanced);
		//Bologna
		registerRender(foodbologna);
		//Jello
		registerRender(foodjello);
		
	}
	
	private static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	
}
