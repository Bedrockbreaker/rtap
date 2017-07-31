package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;

import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class toolJelloShovel extends ItemSpade {

	public toolJelloShovel(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLJELLOSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLJELLOSHOVEL.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
