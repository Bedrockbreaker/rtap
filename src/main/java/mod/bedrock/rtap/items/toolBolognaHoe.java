package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class toolBolognaHoe extends ItemHoe {

	public toolBolognaHoe(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLBOLOGNAHOE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLBOLOGNAHOE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
