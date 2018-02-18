package mod.bedrock.rtap.blocks;

import mod.bedrock.rtap.Reference;
import mod.bedrock.rtap.init.ModItems;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.item.Item;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class cropPeppers extends BlockCrops {
	
	public cropPeppers() {
		
		setUnlocalizedName(Reference.RTAPBlocks.CROPPEPPERS.getUnlocalizedName());
		setRegistryName(Reference.RTAPBlocks.CROPPEPPERS.getRegistryName());
		
	}
	
	@Override
	protected Item getSeed() {
		
		return ModItems.foodpeppers;
		
	}
	
	@Override
	protected Item getCrop() {
		
		return ModItems.foodpeppers;
		
	}
	
	//Taken directly from BlockCrops class.
	
	public boolean canBlockStay(World worldIn, BlockPos pos, IBlockState state) {
		
        IBlockState soil = worldIn.getBlockState(pos.down());
        return (worldIn.getLight(pos) >= 8 || worldIn.canSeeSky(pos)) && soil.getBlock().canSustainPlant(soil, worldIn, pos.down(), net.minecraft.util.EnumFacing.UP, this);
        
    }
	
}
