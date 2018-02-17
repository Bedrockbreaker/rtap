package com.bedrock.rtap.items;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.init.ModSoundHandler;

import io.netty.handler.codec.sctp.SctpOutboundByteStreamHandler;
import net.minecraft.block.SoundType;
import net.minecraft.client.audio.Sound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundSetupEvent;

public class armorCatHairBoots extends ItemArmor {

	public armorCatHairBoots(ArmorMaterial materialIn) {
		
		super(materialIn, 1, EntityEquipmentSlot.FEET);
		
		setUnlocalizedName(Reference.RTAPItems.ARMORCATHAIRBOOTS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ARMORCATHAIRBOOTS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setMaxDamage(4);
		
	}
	
}
