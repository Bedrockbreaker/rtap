package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.init.ModSoundHandler;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class armorRamenChestplate extends ItemArmor {

	public armorRamenChestplate(ArmorMaterial materialIn) {
		
		super(materialIn, 1, EntityEquipmentSlot.CHEST);
		
		setUnlocalizedName(Reference.RTAPItems.ARMORRAMENCHESTPLATE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ARMORRAMENCHESTPLATE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}

}
