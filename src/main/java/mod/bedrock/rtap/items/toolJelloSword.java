package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class toolJelloSword extends ItemSword {

	public toolJelloSword(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLJELLOSWORD.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLJELLOSWORD.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
