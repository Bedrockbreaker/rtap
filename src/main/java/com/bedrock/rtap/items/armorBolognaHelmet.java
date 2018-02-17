package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.init.ModSoundHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class armorBolognaHelmet extends ItemArmor {

	public armorBolognaHelmet(ArmorMaterial materialIn) {
		
		super(materialIn, 1, EntityEquipmentSlot.HEAD);
		
		setUnlocalizedName(Reference.RTAPItems.ARMORBOLOGNAHELMET.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ARMORBOLOGNAHELMET.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, EntityPlayer playerIn, EnumHand handIn) {

		if (playerIn.getItemStackFromSlot(EntityEquipmentSlot.HEAD) == ItemStack.EMPTY) {
			
			System.out.println("successfully equipped!");
			
			worldIn.playSound(playerIn, playerIn.getPosition(), ModSoundHandler.BOLOGNAARMOREQIUP, SoundCategory.PLAYERS, 1F, 1F);
			
		}
		
		return super.onItemRightClick(worldIn, playerIn, handIn);
		
	}

}
