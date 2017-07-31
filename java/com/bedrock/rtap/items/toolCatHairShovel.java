package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class toolCatHairShovel extends ItemSpade {

	public toolCatHairShovel(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLCATHAIRSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLCATHAIRSHOVEL.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
