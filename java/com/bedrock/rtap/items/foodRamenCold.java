package com.bedrock.rtap.items;

import java.util.List;

import com.bedrock.rtap.RTAP;
import com.bedrock.rtap.Reference;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.crafting.CraftingHelper;

public class foodRamenCold extends ItemFood {

	public foodRamenCold() {
		
		super(2, .3F, false);
		
		setUnlocalizedName(Reference.RTAPItems.FOODRAMENCOLD.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODRAMENCOLD.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}
	
	//Slowness 1 for 10s
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(2), 200, 0));
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add("\u00A76\u00A7oStart of the ramen tree");
		tooltip.add("Part of every college student's diet");
		
	}
	
}
