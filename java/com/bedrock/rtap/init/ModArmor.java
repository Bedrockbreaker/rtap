package com.bedrock.rtap.init;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.items.armorBolognaBoots;
import com.bedrock.rtap.items.armorBolognaChestplate;
import com.bedrock.rtap.items.armorBolognaHelmet;
import com.bedrock.rtap.items.armorBolognaLeggings;
import com.bedrock.rtap.items.armorCatHairBoots;
import com.bedrock.rtap.items.armorCatHairChestplate;
import com.bedrock.rtap.items.armorCatHairHelmet;
import com.bedrock.rtap.items.armorCatHairLeggings;
import com.bedrock.rtap.items.armorJelloBoots;
import com.bedrock.rtap.items.armorJelloChestplate;
import com.bedrock.rtap.items.armorJelloHelmet;
import com.bedrock.rtap.items.armorJelloLeggings;
import com.bedrock.rtap.items.armorRamenBoots;
import com.bedrock.rtap.items.armorRamenChestplate;
import com.bedrock.rtap.items.armorRamenHelmet;
import com.bedrock.rtap.items.armorRamenLeggings;

import net.minecraft.block.BlockWeb;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class ModArmor {
	
	public static ArmorMaterial materialBologna = EnumHelper.addArmorMaterial("bologna", Reference.MOD_ID + ":bologna", -1, new int[]{1,1,2,1}, 0, null, 0F);
	public static ArmorMaterial materialCatHair = EnumHelper.addArmorMaterial("cathair", Reference.MOD_ID + ":cathair", -40, new int[]{5,5,5,5}, 0, SoundEvents.BLOCK_CLOTH_PLACE, 0F);
	public static ArmorMaterial materialJello = EnumHelper.addArmorMaterial("jello", Reference.MOD_ID + ":jello", 200, new int[]{2,2,3,2}, 0, SoundEvents.BLOCK_SLIME_PLACE, 0F);
	public static ArmorMaterial materialRamen = EnumHelper.addArmorMaterial("ramen", Reference.MOD_ID  + ":ramen", 15, new int[] {2,1,3,2}, 0, null, 0F);
	
	//Bologna
	public static ItemArmor armorbolognahelmet;
	public static ItemArmor armorbolognachestplate;
	public static ItemArmor armorbolognaleggings;
	public static ItemArmor armorbolognaboots;
	//Cat Hair
	public static ItemArmor armorcathairhelmet;
	public static ItemArmor armorcathairchestplate;
	public static ItemArmor armorcathairleggings;
	public static ItemArmor armorcathairboots;
	//Jello
	public static ItemArmor armorjellohelmet;
	public static ItemArmor armorjellochestplate;
	public static ItemArmor armorjelloleggings;
	public static ItemArmor armorjelloboots;
	//Ramen
	public static ItemArmor armorramenhelmet;
	public static ItemArmor armorramenchestplate;
	public static ItemArmor armorramenleggings;
	public static ItemArmor armorramenboots;
	
	public static void init() {
		
		//Bologna
		armorbolognahelmet = new armorBolognaHelmet(materialBologna);
		armorbolognachestplate = new armorBolognaChestplate(materialBologna);
		armorbolognaleggings = new armorBolognaLeggings(materialBologna);
		armorbolognaboots = new armorBolognaBoots(materialBologna);
		//Cat Hair
		armorcathairhelmet = new armorCatHairHelmet(materialCatHair);
		armorcathairchestplate = new armorCatHairChestplate(materialCatHair);
		armorcathairleggings = new armorCatHairLeggings(materialCatHair);
		armorcathairboots = new armorCatHairBoots(materialCatHair);
		//Jello
		armorjellohelmet = new armorJelloHelmet(materialJello);
		armorjellochestplate = new armorJelloChestplate(materialJello);
		armorjelloleggings = new armorJelloLeggings(materialJello);
		armorjelloboots = new armorJelloBoots(materialJello);
		//Ramen
		armorramenhelmet = new armorRamenHelmet(materialRamen);
		armorramenchestplate = new armorRamenChestplate(materialRamen);
		armorramenleggings = new armorRamenLeggings(materialRamen);
		armorramenboots = new armorRamenBoots(materialRamen);
		
	}
	
	public static void register() {
		
		//Bologna
		GameRegistry.register(armorbolognahelmet);
		GameRegistry.register(armorbolognachestplate);
		GameRegistry.register(armorbolognaleggings);
		GameRegistry.register(armorbolognaboots);
		//Cat Hair
		GameRegistry.register(armorcathairhelmet);
		GameRegistry.register(armorcathairchestplate);
		GameRegistry.register(armorcathairleggings);
		GameRegistry.register(armorcathairboots);
		//Jello
		GameRegistry.register(armorjellohelmet);
		GameRegistry.register(armorjellochestplate);
		GameRegistry.register(armorjelloleggings);
		GameRegistry.register(armorjelloboots);
		//Ramen
		GameRegistry.register(armorramenhelmet);
		GameRegistry.register(armorramenchestplate);
		GameRegistry.register(armorramenleggings);
		GameRegistry.register(armorramenboots);
		
	}
	
	public static void registerRenders() {
		
		//Bologna
		registerRender(armorbolognahelmet);
		registerRender(armorbolognachestplate);
		registerRender(armorbolognaleggings);
		registerRender(armorbolognaboots);
		//Cat Hair
		registerRender(armorcathairhelmet);
		registerRender(armorcathairchestplate);
		registerRender(armorcathairleggings);
		registerRender(armorcathairboots);
		//Jello
		registerRender(armorjellohelmet);
		registerRender(armorjellochestplate);
		registerRender(armorjelloleggings);
		registerRender(armorjelloboots);
		//Ramen
		registerRender(armorramenhelmet);
		registerRender(armorramenchestplate);
		registerRender(armorramenleggings);
		registerRender(armorramenboots);
		
	}
	
	private static void registerRender(Item item) {
		
		Minecraft.getMinecraft().getRenderItem().getItemModelMesher().register(item, 0, new ModelResourceLocation(item.getRegistryName(), "inventory"));
		
	}
	
}
