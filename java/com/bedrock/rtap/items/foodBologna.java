package com.bedrock.rtap.items;

import java.util.List;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.init.ModSoundHandler;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class foodBologna extends ItemFood {

	public foodBologna() {
		
		super(44, 63F, true);
		
		setUnlocalizedName(Reference.RTAPItems.FOODBOLOGNA.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODBOLOGNA.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add("\u00A76\u00A7oStart of the bologna tree");
		tooltip.add("It's pronounced \"BALONEY\"");
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(21), 1, 0));
		
	}
	
}
