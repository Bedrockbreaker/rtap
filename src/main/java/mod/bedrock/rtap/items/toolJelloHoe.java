package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class toolJelloHoe extends ItemHoe {

	public toolJelloHoe(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLJELLOHOE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLJELLOHOE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
