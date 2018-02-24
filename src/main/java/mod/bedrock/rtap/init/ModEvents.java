package mod.bedrock.rtap.init;

import mod.bedrock.rtap.RTAP;
import mod.bedrock.rtap.Reference;
import mod.bedrock.rtap.misc.deathByShears;
import mod.bedrock.rtap.misc.deathByUnbreakableShears;
import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemStack;
import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.DamageSource;
import net.minecraft.world.World;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.event.AttachCapabilitiesEvent;
import net.minecraftforge.event.entity.player.PlayerInteractEvent.EntityInteract;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.util.Random;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModEvents {
	
	//Event for shearing ocelots. Hopefully.
	
	@SubscribeEvent
	public static void interact(EntityInteract event) {
		
		ItemStack itemstack = event.getItemStack();
		EntityPlayer player = event.getEntityPlayer();
		Entity entity = event.getTarget();
		World world = event.getWorld();
		
		DamageSource killedByShears = new deathByShears("killedByShears", player);
		DamageSource killedByUnbreakableShears = new deathByUnbreakableShears("killedByUnbreakableShears", player);
			
		if (world.isRemote || itemstack.equals(ItemStack.EMPTY)) {
			
			return;
			
		}

		if ( entity instanceof EntityOcelot && ((EntityOcelot) entity).isTamed() && !entity.isDead && itemstack.getItem() instanceof ItemShears) {
			
			itemstack.damageItem(1, player);
			
			if (Math.random() > .9) {
				
				world.spawnEntity(new EntityItem(world, entity.posX, entity.posY, entity.lastTickPosZ, new ItemStack(ModItems.itemcathair)));
					
			}
			
			if (itemstack.getMaxDamage() <= -1) {
				
				entity.attackEntityFrom(killedByUnbreakableShears, 999999);
				
			} else {
			
				if (((float) itemstack.getItemDamage() / (float) itemstack.getMaxDamage()) >= Math.random()) {
					
					entity.attackEntityFrom(killedByShears, 1);
				
				}
				
			}
			
		}
		
	}

}
