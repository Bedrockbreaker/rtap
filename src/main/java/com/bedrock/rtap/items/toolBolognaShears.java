package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;

import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.block.BlockCrops;
import net.minecraft.item.Item.ToolMaterial;

public class toolBolognaShears extends ItemShears {

	public toolBolognaShears(ToolMaterial material) {

		setUnlocalizedName(Reference.RTAPItems.TOOLBOLOGNASHEARS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLBOLOGNASHEARS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setMaxDamage(-1);

	}

}
