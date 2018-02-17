package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemSeedFood;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class foodPeppers extends ItemSeedFood {

	public foodPeppers() {
		
		super(2, 1F, ModBlocks.croppeppers, Blocks.FARMLAND);
		
		setUnlocalizedName(Reference.RTAPItems.FOODPEPPERS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODPEPPERS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		

	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		player.setFire(2);
		
	}

}
