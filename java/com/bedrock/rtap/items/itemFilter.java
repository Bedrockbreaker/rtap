package com.bedrock.rtap.items;

import java.util.List;
import java.util.Set;

import com.bedrock.rtap.Reference;
import com.google.common.collect.Sets;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.util.EnumHelper;

public class itemFilter extends ItemTool {
	
	private static ToolMaterial materialFilter = EnumHelper.addToolMaterial("filter", -1, 15, 1, 0F, 0);

	public itemFilter() {
		
		super(materialFilter, Sets.newHashSet(new Block[] {Blocks.AIR}));
		
		setUnlocalizedName(Reference.RTAPItems.ITEMFILTER.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ITEMFILTER.getRegistryName());
		setNoRepair();
		setCreativeTab(Reference.tabRTAP);
		
	}
	
	@Override
	public boolean hasContainerItem() {

		return true;
		
	}
	
	@Override
	public ItemStack getContainerItem(ItemStack itemStack) {

		ItemStack itemstack = new ItemStack(itemStack.getItem(), 1, itemStack.getItemDamage()+1);
		
		if (itemStack.hasTagCompound()) {
			
			NBTTagCompound nbt = itemStack.getTagCompound();
			itemstack.setTagCompound(nbt);
			
		}
		
		return itemstack;
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add("Has 16 uses. Doesn't stack.");
		tooltip.add("Be careful to not break blocks or hit entites with this.");
		
	}

}
