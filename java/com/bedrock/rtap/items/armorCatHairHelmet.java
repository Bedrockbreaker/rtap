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

public class armorCatHairHelmet extends ItemArmor {

	public armorCatHairHelmet(ArmorMaterial materialIn) {
		
		super(materialIn, 1, EntityEquipmentSlot.HEAD);
		
		setUnlocalizedName(Reference.RTAPItems.ARMORCATHAIRHELMET.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ARMORCATHAIRHELMET.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setMaxDamage(4);
		
	}

}
