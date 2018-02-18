package mod.bedrock.rtap.items;

import java.util.List;

import mod.bedrock.rtap.Reference;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class itemLiquidMeat extends Item {
	
	public itemLiquidMeat() {
		
		setUnlocalizedName(Reference.RTAPItems.ITEMLIQUIDMEAT.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ITEMLIQUIDMEAT.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}
	
	@Override
	public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) {
		
		tooltip.add("\u00A76\u00A7oStart of the jello tree");
		tooltip.add("You will never look at jello the same way ever again.");
		
	}

}
