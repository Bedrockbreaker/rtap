package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;

import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class toolRamenShears extends ItemShears {

	public toolRamenShears(ToolMaterial material) {

		setUnlocalizedName(Reference.RTAPItems.TOOLRAMENSHEARS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLRAMENSHEARS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setMaxDamage(62);

	}

}
