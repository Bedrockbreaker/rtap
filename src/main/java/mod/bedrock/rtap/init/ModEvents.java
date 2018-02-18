package mod.bedrock.rtap.init;

import mod.bedrock.rtap.RTAP;
import mod.bedrock.rtap.capabilities.IShave;
import mod.bedrock.rtap.capabilities.Shave;
import net.minecraft.entity.Entity;
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
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import scala.util.Random;

public class ModEvents {
	
	//Event for shearing ocelots. Hopefully.
	
	@CapabilityInject(IShave.class)
	public static final Capability<IShave> SHAVE = null;
	
	@SubscribeEvent
	public static void interact(EntityInteract event) {
		
		ItemStack itemstack = event.getItemStack();
		EntityPlayer player = event.getEntityPlayer();
		Entity entity = event.getTarget();
		World world = event.getWorld();
		
		if (world.isRemote || itemstack.equals(ItemStack.EMPTY)) {
			
			return;
			
		}

		if ( entity instanceof EntityOcelot && ((EntityOcelot) entity).isSitting() && !entity.isDead && itemstack.getItem() instanceof ItemShears) {
			
			/*
			
			if (entity.hasCapability(SHAVE, null)) {
				
				hairRegrow = SHAVE.readNBT(IShave.class, null, );
				
			} else {
				
				
				
			}
			
			*/
			
			if (itemstack.getItemDamage() >= 1) {
				
				itemstack.damageItem(2, player);
				world.spawnEntity(new EntityItem(world, entity.posX, entity.posY, entity.lastTickPosZ, new ItemStack(ModItems.itemcathair)));
				
			} else {
				
				itemstack.damageItem(1, player);
				if (Math.random() > .5) {
					
					world.spawnEntity(new EntityItem(world, entity.posX, entity.posY, entity.lastTickPosZ, new ItemStack(ModItems.itemcathair)));
					
				}
				
			}
			
			if (itemstack.getMaxDamage() <= -1) {
				
				entity.onKillCommand();
				
			} else {
			
				if (100 / (((itemstack.getMaxDamage() + 1) / (itemstack.getItemDamage() + 1))) * Math.random() * 2 >= Math.random() * 50) {
					
					DamageSource killedByShears = new ModDeath("killedByShears", player);
					
					entity.attackEntityFrom(killedByShears, 1);
				
				}
				
			}
			
			event.setCanceled(true);
			
		}
		
	}

}
