package com.bedrock.rtap.blocks;

import com.bedrock.rtap.Reference;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.EnumPushReaction;
import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.player.EntityPlayerMP;
import net.minecraft.init.Blocks;
import net.minecraft.util.BlockRenderLayer;
import net.minecraft.util.math.AxisAlignedBB;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.Vec3d;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class blockJello extends Block {

	public blockJello() {
		
		super(Material.PORTAL);
		
		setUnlocalizedName(Reference.RTAPBlocks.BLOCKJELLO.getUnlocalizedName());
		setRegistryName(Reference.RTAPBlocks.BLOCKJELLO.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setHardness(0F);
		setResistance(0F);
		setLightOpacity(5);
		setSoundType(SoundType.SLIME);
		
	}
	
	@Override
	public void onLanded(World worldIn, Entity entityIn) {

		entityIn.motionY = 0D;
		
	}
	
	@Override
	public void onEntityCollidedWithBlock(World worldIn, BlockPos pos, IBlockState state, Entity entityIn) {
		
		if (entityIn instanceof EntityPlayer && ((EntityPlayer) entityIn).isCreative() && ((EntityPlayer) entityIn).capabilities.isFlying) {

			return;
		
		}
		
		entityIn.motionX *= 0.7D;
		entityIn.motionY *= 0.5D;
		entityIn.motionZ *= 0.7D;
		entityIn.fallDistance = 0f;
		
	}
	
	@Override
	public AxisAlignedBB getCollisionBoundingBox(IBlockState blockState, IBlockAccess worldIn, BlockPos pos) {

		return NULL_AABB;
		
	}
	
	//Allows normal piston behavior.
	@Override
	public EnumPushReaction getMobilityFlag(IBlockState state) {

		return EnumPushReaction.NORMAL;
		
	}
	
	@Override
	public boolean isOpaqueCube(IBlockState state) {
		
		return false;
		
	}
	
	@Override
	public BlockRenderLayer getBlockLayer() {

		return BlockRenderLayer.TRANSLUCENT;
		
	}

}
