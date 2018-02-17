package com.bedrock.rtap.blocks;

import java.util.List;

import com.bedrock.rtap.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.init.Blocks;
import net.minecraft.item.ItemStack;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class blockRamen extends Block {
	
	public blockRamen() {
		
		super(Material.PORTAL);
		
		setUnlocalizedName(Reference.RTAPBlocks.BLOCKRAMEN.getUnlocalizedName());
		setRegistryName(Reference.RTAPBlocks.BLOCKRAMEN.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setHardness(1F);
		setResistance(1.5F);
		setSoundType(SoundType.SLIME);
		
	}
	
	//Allows normal piston behavior.
	@Override
	public EnumPushReaction getMobilityFlag(IBlockState state) {

		return EnumPushReaction.NORMAL;
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add("How is this even possible!?");
		
	}
	
	@Override
	public boolean isPassable(IBlockAccess worldIn, BlockPos pos) {

		return false;
		
	}
	
}
