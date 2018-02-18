package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Item.ToolMaterial;

public class toolJelloShears extends ItemShears {

	public toolJelloShears(ToolMaterial material) {

		setUnlocalizedName(Reference.RTAPItems.TOOLJELLOSHEARS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.TOOLJELLOSHEARS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		setMaxDamage(237);

	}

}
