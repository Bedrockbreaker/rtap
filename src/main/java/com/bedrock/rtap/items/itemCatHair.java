package com.bedrock.rtap.items;

import java.util.List;

import com.bedrock.rtap.Reference;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemCatHair extends Item {
	
	public itemCatHair() {
		
		setUnlocalizedName(Reference.RTAPItems.ITEMCATHAIR.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ITEMCATHAIR.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
	
		tooltip.add("\u00A76\u00A7oStart of the cat hair tree");
		tooltip.add("Obtained by killing ocelots/cats");
	
	}

}
