package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;

import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class toolJelloPickaxe extends ItemPickaxe {

	public toolJelloPickaxe(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLJELLOPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLJELLOPICKAXE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
