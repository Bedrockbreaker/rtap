package mod.bedrock.rtap.items;

import java.util.List;

import mod.bedrock.rtap.RTAP;
import mod.bedrock.rtap.Reference;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemGelatine extends Item {
	
	public itemGelatine() {
		
		setUnlocalizedName(Reference.RTAPItems.ITEMGELATINE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ITEMGELATINE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add("The one thing that is spelled the British way");
		
	}

}
