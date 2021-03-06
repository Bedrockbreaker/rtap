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

public class armorRamenHelmet extends ItemArmor {

	public armorRamenHelmet(ArmorMaterial materialIn) {
		
		super(materialIn, 1, EntityEquipmentSlot.HEAD);
		
		setUnlocalizedName(Reference.RTAPItems.ARMORRAMENHELMET.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ARMORRAMENHELMET.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}

}
