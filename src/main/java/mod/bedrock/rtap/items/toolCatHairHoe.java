package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemStack;

public class toolCatHairHoe extends ItemHoe {

	public toolCatHairHoe(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLCATHAIRHOE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLCATHAIRHOE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
