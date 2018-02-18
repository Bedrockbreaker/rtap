package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.Item;

public class itemFilterPart extends Item {
	
	public itemFilterPart() {
		
		setUnlocalizedName(Reference.RTAPItems.ITEMFILTERPART.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ITEMFILTERPART.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}

}
