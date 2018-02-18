package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class toolRamenShovel extends ItemSpade {

	public toolRamenShovel(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLRAMENSHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLRAMENSHOVEL.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
