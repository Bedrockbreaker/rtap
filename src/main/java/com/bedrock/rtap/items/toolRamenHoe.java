package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;

import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class toolRamenHoe extends ItemHoe {

	public toolRamenHoe(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLRAMENHOE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLRAMENHOE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
