package com.bedrock.rtap.items;

import java.util.List;

import com.bedrock.rtap.Reference;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class foodRamenSweet extends ItemFood {

	public foodRamenSweet() {
		
		super(6, 1.5F, false);
		
		setUnlocalizedName(Reference.RTAPItems.FOODRAMENSWEET.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODRAMENSWEET.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 60, 0));
		
	}

}
