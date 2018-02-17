package com.bedrock.rtap.items;

import java.util.List;

import com.bedrock.rtap.Reference;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.util.DamageSource;
import net.minecraft.util.EnumHand;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class foodRamenMysterious extends ItemFood {

	public foodRamenMysterious() {
		
		super(6, 1.5F, false);
		
		setUnlocalizedName(Reference.RTAPItems.FOODRAMENMYSTERIOUS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODRAMENMYSTERIOUS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}
	
	/*
	 * does many not potion-related things:
	 * 
	 * - change motion yee
	 * - change camera angle
	 * - set visual arrows in player hehe
	 * - set glowing
	 * - give any ghost item. Quality addition.
	 */
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		//Yeah, I know there is probably a way better way to do this, but I was lazy. shut up.
		
		double negRand = (Math.random() - Math.random()) * -Math.random() * 5;
		int casey = (int) Math.round((Math.random() * 5));
		
		switch (casey) {
		
		case  1: player.setVelocity(negRand, negRand, negRand); break;
		case  2: player.setPositionAndRotation(player.posX, player.posY, player.posZ, (float) negRand * 50, (float) negRand * 50); break;
		case  3: player.setArrowCountInEntity((int) Math.abs((float) negRand * 5)); break;
		case  4: player.setGlowing(!player.isGlowing()); break;
		default: 
			
			if (worldIn.isRemote) { 
				
				List<Item> fakeItems = ForgeRegistries.ITEMS.getValues();
				int randi = (int) Math.round(Math.random() * (fakeItems.size() - 1));
				Item fakeItem = fakeItems.get(randi);
				player.addItemStackToInventory(new ItemStack(fakeItem, 1, 0));
			
			}
			
			break;
		
		}
		
	}

}
