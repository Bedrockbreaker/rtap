package mod.bedrock.rtap.items;

import java.util.List;

import mod.bedrock.rtap.Reference;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemFood;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraft.world.World;

public class foodRamenHairy extends ItemFood {

	public foodRamenHairy() {
		
		super(6, 1.5F, false);
		
		setUnlocalizedName(Reference.RTAPItems.FOODRAMENHAIRY.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODRAMENHAIRY.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		player.addPotionEffect(new PotionEffect(Potion.getPotionById(11), 60, 127));
		
	}

}
