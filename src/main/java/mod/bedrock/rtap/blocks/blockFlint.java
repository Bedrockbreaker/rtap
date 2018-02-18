package mod.bedrock.rtap.blocks;

import mod.bedrock.rtap.RTAP;
import mod.bedrock.rtap.Reference;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;

public class blockFlint extends Block {

	public blockFlint() {

		super(Material.ROCK);

		setUnlocalizedName(Reference.RTAPBlocks.BLOCKFLINT.getUnlocalizedName());
		setRegistryName(Reference.RTAPBlocks.BLOCKFLINT.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setHardness(3F);
		setHarvestLevel("pickaxe", 0);
		setResistance(2F);

	}

}
