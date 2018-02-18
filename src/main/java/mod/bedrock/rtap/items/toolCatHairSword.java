package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class toolCatHairSword extends ItemSword {

	public toolCatHairSword(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLCATHAIRSWORD.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLCATHAIRSWORD.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
