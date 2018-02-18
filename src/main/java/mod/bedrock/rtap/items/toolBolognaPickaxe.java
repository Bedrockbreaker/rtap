package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class toolBolognaPickaxe extends ItemPickaxe {

	public toolBolognaPickaxe(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLBOLOGNAPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLBOLOGNAPICKAXE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
