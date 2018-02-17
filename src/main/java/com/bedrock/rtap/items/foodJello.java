package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;
import net.minecraftforge.common.crafting.CraftingHelper;

public class foodJello extends ItemFood {

	public foodJello() {
		
		super(1, .1F, false);
		
		setUnlocalizedName(Reference.RTAPItems.FOODJELLO.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODJELLO.getRegistryName());
		setCreativeTab(Reference.tabRTAP);

	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 60, 0));
		
	}
	
}
