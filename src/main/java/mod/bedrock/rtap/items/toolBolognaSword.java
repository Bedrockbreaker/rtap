package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class toolBolognaSword extends ItemSword {

	public toolBolognaSword(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLBOLOGNASWORD.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLBOLOGNASWORD.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
