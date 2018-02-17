package com.bedrock.rtap.items;

import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

import com.bedrock.rtap.Reference;

import ibxm.Player;
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
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class foodRamenBalanced extends ItemFood {

	public foodRamenBalanced() {
		
		super(6, 1.5F, false);
		
		setUnlocalizedName(Reference.RTAPItems.FOODRAMENBALANCED.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODRAMENBALANCED.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}
	
	/*
	 * does many not potion-related things:
	 * 
	 * - change motion yee
	 * - change camera angle
	 * - set visual arrows in player hehe
	 * - set glowing on/off
	 * - give any ghost item. Quality addition.
	 * 
	 * does many potion-related things:
	 * 
	 * - gives all potion effects of ramens used in crafting
	 * - gives random potion effect for 20 secs.
	 * 
	 */
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		if (worldIn.isRemote) { 
			
			List<Item> fakeItems = ForgeRegistries.ITEMS.getValues();
			int randi = (int) Math.round(Math.random() * (fakeItems.size() - 1));
			Item fakeItem = fakeItems.get(randi);
			player.addItemStackToInventory(new ItemStack(fakeItem, 1));
		
		}
		
		if (!worldIn.isRemote) {
		
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(16), 600, 0)); //Night Vision
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 600, 2)); //Resistance
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(8), 600, 2)); //Jump Boost
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(23), 1, 0)); //Saturation
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(5), 600, 2)); //Strength
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(12), 600, 2)); //Fire Resistance
			player.addPotionEffect(new PotionEffect(Potion.getPotionById(1), 600, 2)); //Speed
			
			List<Potion> potions = ForgeRegistries.POTIONS.getValues();
			int rand = (int) Math.round(Math.random() * (potions.size() - 1));
			Potion potion = potions.get(rand);
			player.addPotionEffect(new PotionEffect(potion, 400, 0));
			
			double negRand = (Math.random() - Math.random()) * -Math.random() * 5;
			
			player.setVelocity(negRand, negRand, negRand);
			player.setPositionAndRotation(player.posX, player.posY, player.posZ, (float) negRand * 50, (float) negRand * 50);
			player.setArrowCountInEntity((int) Math.abs((float) negRand * 5));
			player.setGlowing(!player.isGlowing());
		
		}
	
	}

}
