package mod.bedrock.rtap.items;

import mod.bedrock.rtap.Reference;
import mod.bedrock.rtap.init.ModSoundHandler;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.world.World;

public class armorJelloHelmet extends ItemArmor {

	public armorJelloHelmet(ArmorMaterial materialIn) {
		
		super(materialIn, 1, EntityEquipmentSlot.HEAD);
		
		setUnlocalizedName(Reference.RTAPItems.ARMORJELLOHELMET.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ARMORJELLOHELMET.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
