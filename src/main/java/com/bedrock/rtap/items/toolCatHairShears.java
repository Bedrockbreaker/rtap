package com.bedrock.rtap.items;

import java.util.List;

import com.bedrock.rtap.Reference;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.world.World;

public class toolCatHairShears extends ItemShears {

	public toolCatHairShears(ToolMaterial material) {

		setUnlocalizedName(Reference.RTAPItems.TOOLCATHAIRSHEARS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLCATHAIRSHEARS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setMaxDamage(4);

	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
	
		tooltip.add("Not too useful eh?");
	
	}

}
