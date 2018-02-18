package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemStack;

public class toolRamenPickaxe extends ItemPickaxe {

	public toolRamenPickaxe(ToolMaterial material) {
		
		super(material);
		
		setUnlocalizedName(Reference.RTAPItems.TOOLRAMENPICKAXE.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLRAMENPICKAXE.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
