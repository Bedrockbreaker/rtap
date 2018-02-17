package com.bedrock.rtap.blocks;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.init.ModSoundHandler;

import net.minecraft.block.Block;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.init.Blocks;
import net.minecraft.util.SoundEvent;
import net.minecraftforge.common.util.EnumHelper;

public class blockBologna extends Block {
	
	public blockBologna() {

		super(Material.SPONGE);
		
		setUnlocalizedName(Reference.RTAPBlocks.BLOCKBOLOGNA.getUnlocalizedName());
		setRegistryName(Reference.RTAPBlocks.BLOCKBOLOGNA.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setHardness(1F);
		setResistance(1F);
		setSoundType(SoundType.SLIME);
		
	}

}
