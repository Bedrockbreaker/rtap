package com.bedrock.rtap.blocks;

import java.util.List;

import com.bedrock.rtap.Reference;
import com.bedrock.rtap.init.ModBlocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraftforge.common.IShearable;

public class blockCatHair extends Block {
	
	public blockCatHair() {
		
		super(Material.CLOTH);
		
		setUnlocalizedName(Reference.RTAPBlocks.BLOCKCATHAIR.getUnlocalizedName());
		setRegistryName(Reference.RTAPBlocks.BLOCKCATHAIR.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setSoundType(SoundType.CLOTH);
		setHardness(.8F);
		setResistance(4F);
		
	}
	
	@Override
	public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face) {

		return 200;
		
	}

}
