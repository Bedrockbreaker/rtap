package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class toolCatHairPickaxe extends ItemPickaxe {

	public toolCatHairPickaxe(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLCATHAIRPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLCATHAIRPICKAXE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
