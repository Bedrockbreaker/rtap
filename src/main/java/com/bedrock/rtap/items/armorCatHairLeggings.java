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

public class armorCatHairLeggings extends ItemArmor {

	public armorCatHairLeggings(ArmorMaterial materialIn) {
		
		super(materialIn, 2, EntityEquipmentSlot.LEGS);
		
		setUnlocalizedName(Reference.RTAPItems.ARMORCATHAIRLEGGINGS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ARMORCATHAIRLEGGINGS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setMaxDamage(4);
		
	}

}
