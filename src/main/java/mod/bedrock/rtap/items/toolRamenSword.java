package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;

public class toolRamenSword extends ItemSword {

	public toolRamenSword(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLRAMENSWORD.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLRAMENSWORD.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
