package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;

public class toolBolognaShovel extends ItemSpade {

	public toolBolognaShovel(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLBOLOGNASHOVEL.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLBOLOGNASHOVEL.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
