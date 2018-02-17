package com.bedrock.rtap.items;

import java.util.List;

import com.bedrock.rtap.Reference;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;

public class foodRamenCooked extends ItemFood {

	public foodRamenCooked() {
		
		super(4, .5F, false);
		
		setUnlocalizedName(Reference.RTAPItems.FOODRAMENCOOKED.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODRAMENCOOKED.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		

	}

}
