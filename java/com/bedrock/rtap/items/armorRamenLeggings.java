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

public class armorRamenLeggings extends ItemArmor {

	public armorRamenLeggings(ArmorMaterial materialIn) {
		
		super(materialIn, 2, EntityEquipmentSlot.LEGS);
		
		setUnlocalizedName(Reference.RTAPItems.ARMORRAMENLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ARMORRAMENLEGGINGS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}

}
