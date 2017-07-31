package com.bedrock.rtap.init;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.items.toolBolognaAxe;
import com.bedrock.rtap.items.toolBolognaHoe;
import com.bedrock.rtap.items.toolBolognaPickaxe;
import com.bedrock.rtap.items.toolBolognaShears;
import com.bedrock.rtap.items.toolBolognaShovel;
import com.bedrock.rtap.items.toolBolognaSword;
import com.bedrock.rtap.items.toolCatHairAxe;
import com.bedrock.rtap.items.toolCatHairHoe;
import com.bedrock.rtap.items.toolCatHairPickaxe;
import com.bedrock.rtap.items.toolCatHairShears;
import com.bedrock.rtap.items.toolCatHairShovel;
import com.bedrock.rtap.items.toolCatHairSword;
import com.bedrock.rtap.items.toolJelloAxe;
import com.bedrock.rtap.items.toolJelloHoe;
import com.bedrock.rtap.items.toolJelloPickaxe;
import com.bedrock.rtap.items.toolJelloShears;
import com.bedrock.rtap.items.toolJelloShovel;
import com.bedrock.rtap.items.toolJelloSword;
import com.bedrock.rtap.items.toolRamenAxe;
import com.bedrock.rtap.items.toolRamenHoe;
import com.bedrock.rtap.items.toolRamenPickaxe;
import com.bedrock.rtap.items.toolRamenShears;
import com.bedrock.rtap.items.toolRamenShovel;
import com.bedrock.rtap.items.toolRamenSword;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModTools {
	
	public static final ToolMaterial materialBologna = EnumHelper.addToolMaterial(Reference.MOD_ID + ":bologna", 1, -1, 2F, 1F, 10);
	public static final ToolMaterial materialRamen = EnumHelper.addToolMaterial(Reference.MOD_ID + ":ramen", 2, 74, 4F, 2F, 3);
	public static final ToolMaterial materialJello = EnumHelper.addToolMaterial(Reference.MOD_ID + ":jello", 0, 249, 1F, -1F, 15);
	public static final ToolMaterial materialCatHair = EnumHelper.addToolMaterial(Reference.MOD_ID + ":cathair", 666, 4, 99999F, 99999F, 0);
	
	//Bologna
	public static ItemPickaxe toolbolognapickaxe;
	public static toolBolognaAxe toolbolognaaxe;
	public static ItemSpade toolbolognashovel;
	public static ItemSword toolbolognasword;
	public static ItemHoe toolbolognahoe;
	public static ItemShears toolbolognashears;
	//Ramen
	public static ItemPickaxe toolramenpickaxe;
	public static toolRamenAxe toolramenaxe;
	public static ItemSpade toolramenshovel;
	public static ItemSword toolramensword;
	public static ItemHoe toolramenhoe;
	public static ItemShears toolramenshears;
	//Jello
	public static ItemPickaxe tooljellopickaxe;
	public static toolJelloAxe tooljelloaxe;
	public static ItemSpade tooljelloshovel;
	public static ItemSword tooljellosword;
	public static ItemHoe tooljellohoe;
	public static ItemShears tooljelloshears;
	//Cat Hair
	public static ItemPickaxe toolcathairpickaxe;
	public static toolCatHairAxe toolcathairaxe;
	public static ItemSpade toolcathairshovel;
	public static ItemSword toolcathairsword;
	public static ItemHoe toolcathairhoe;
	public static ItemShears toolcathairshears;
	
	public static void init() {
		
		//Bologna
		toolbolognapickaxe = new toolBolognaPickaxe(materialBologna);
		toolbolognaaxe = new toolBolognaAxe(materialBologna);
		toolbolognashovel = new toolBolognaShovel(materialBologna);
		toolbolognasword = new toolBolognaSword(materialBologna);
		toolbolognahoe = new toolBolognaHoe(materialBologna);
		toolbolognashears = new toolBolognaShears(materialBologna);
		//Ramen
		toolramenpickaxe = new toolRamenPickaxe(materialRamen);
		toolramenaxe = new toolRamenAxe(materialRamen);
		toolramenshovel = new toolRamenShovel(materialRamen);
		toolramensword = new toolRamenSword(materialRamen);
		toolramenhoe = new toolRamenHoe(materialRamen);
		toolramenshears = new toolRamenShears(materialRamen);
		//Jello
		tooljellopickaxe = new toolJelloPickaxe(materialJello);
		tooljelloaxe = new toolJelloAxe(materialJello);
		tooljelloshovel = new toolJelloShovel(materialJello);
		tooljellosword = new toolJelloSword(materialJello);
		tooljellohoe = new toolJelloHoe(materialJello);
		tooljelloshears = new toolJelloShears(materialJello);
		//Cat Hair
		toolcathairpickaxe = new toolCatHairPickaxe(materialCatHair);
		toolcathairaxe = new toolCatHairAxe(materialCatHair);
		toolcathairshovel = new toolCatHairShovel(materialCatHair);
		toolcathairsword = new toolCatHairSword(materialCatHair);
		toolcathairhoe = new toolCatHairHoe(materialCatHair);
		toolcathairshears = new toolCatHairShears(materialCatHair);

	}
	
	public static void register() {
		
		//Bologna
		GameRegistry.register(toolbolognapickaxe);
		GameRegistry.register(toolbolognaaxe);
		GameRegistry.register(toolbolognashovel);
		GameRegistry.register(toolbolognasword);
		GameRegistry.register(toolbolognahoe);
		GameRegistry.register(toolbolognashears);
		//Ramen
		GameRegistry.register(toolramenpickaxe);
		GameRegistry.register(toolramenaxe);
		GameRegistry.register(toolramenshovel);
		GameRegistry.register(toolramensword);
		GameRegistry.register(toolramenhoe);
		GameRegistry.register(toolramenshears);
		//Jello
		GameRegistry.register(tooljellopickaxe);
		GameRegistry.register(tooljelloaxe);
		GameRegistry.register(tooljelloshovel);
		GameRegistry.register(tooljellosword);
		GameRegistry.register(tooljellohoe);
		GameRegistry.register(tooljelloshears);
		//Cat Hair
		GameRegistry.register(toolcathairpickaxe);
		GameRegistry.register(toolcathairaxe);
		GameRegistry.register(toolcathairshovel);
		GameRegistry.register(toolcathairsword);
		GameRegistry.register(toolcathairhoe);
		GameRegistry.register(toolcathairshears);
		
	}
	
	public static void registerRenders() {
		
		//Bologna
		registerRender(toolbolognapickaxe);
		registerRender(toolbolognaaxe);
		registerRender(toolbolognashovel);
		registerRender(toolbolognasword);
		registerRender(toolbolognahoe);
		registerRender(toolbolognashears);
		//Ramen
		registerRender(toolramenpickaxe);
		registerRender(toolramenaxe);
		registerRender(toolramenshovel);
		registerRender(toolramensword);
		registerRender(toolramenhoe);
		registerRender(toolramenshears);
		//Jello
		registerRender(tooljellopickaxe);
		registerRender(tooljelloaxe);
		registerRender(tooljelloshovel);
		registerRender(tooljellosword);
		registerRender(tooljellohoe);
		registerRender(tooljelloshears);
		//Cat Hair
		registerRender(toolcathairpickaxe);
		registerRender(toolcathairaxe);
		registerRender(toolcathairshovel);
		registerRender(toolcathairsword);
		registerRender(toolcathairhoe);
		registerRender(toolcathairshears);
		
	}
	
	private static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}

}
