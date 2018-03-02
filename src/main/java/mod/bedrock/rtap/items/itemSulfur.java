package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.Item;

public class itemSulfur extends Item {
	
	public itemSulfur() {
		
		setUnlocalizedName(Reference.RTAPItems.ITEMSULFUR.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ITEMSULFUR.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}

}
