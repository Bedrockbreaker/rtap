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
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class foodRamenRamen extends ItemFood {
	
	private int potionID;

	public foodRamenRamen() {
		
		super(6, 1.5F, false);
		
		setUnlocalizedName(Reference.RTAPItems.FOODRAMENRAMEN.getUnlocalizedName());
		setRegistryName(Reference.RTAPItems.FOODRAMENRAMEN.getRegistryName());
		setCreativeTab(Reference.tabRTAP);
		
	}
	
	@Override
	protected void onFoodEaten(ItemStack stack, World worldIn, EntityPlayer player) {
		
		if (worldIn.isRemote) { return; }
		
		List<Potion> potions = ForgeRegistries.POTIONS.getValues();
		int rand = (int) Math.round(Math.random() * (potions.size() - 1));
		Potion potion = potions.get(rand);
		player.addPotionEffect(new PotionEffect(potion, 400, 0));
		
	}

}
