package mod.bedrock.rtap.items;

import io.netty.handler.codec.sctp.SctpOutboundByteStreamHandler;
import mod.bedrock.rtap.Reference;
import mod.bedrock.rtap.init.ModSoundHandler;
import net.minecraft.block.SoundType;
import net.minecraft.client.audio.Sound;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.init.Items;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.EnumHand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvent;
import net.minecraft.world.World;
import net.minecraftforge.client.event.sound.SoundSetupEvent;

public class armorJelloBoots extends ItemArmor {

	public armorJelloBoots(ArmorMaterial materialIn) {
		
		super(materialIn, 1, EntityEquipmentSlot.FEET);
		
		setUnlocalizedName(Reference.RTAPItems.ARMORJELLOBOOTS.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.ARMORJELLOBOOTS.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
		
	}

}
