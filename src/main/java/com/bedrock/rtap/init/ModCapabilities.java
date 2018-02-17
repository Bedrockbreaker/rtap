package com.bedrock.rtap.init;

import java.util.concurrent.Callable;

import com.bedrock.rtap.capabilities.IShave;
import com.bedrock.rtap.capabilities.Shave;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class ModCapabilities {
	
	@CapabilityInject(IShave.class)
	public static final Capability<IShave> SHAVE = null;
	
	public static void init() {
		
		CapabilityManager.INSTANCE.register(IShave.class, new Capability.IStorage<IShave>() {

			@Override
			public NBTBase writeNBT(Capability<IShave> capability, IShave instance, EnumFacing side) {

				final NBTTagCompound nbtTag = new NBTTagCompound();
				
				return nbtTag;
				
			}

			@Override
			public void readNBT(Capability<IShave> capability, IShave instance, EnumFacing side, NBTBase nbt) {
				
				final Shave hairRegrow = (Shave) instance;
				final NBTTagCompound nbtTag = (NBTTagCompound) nbt;
				
			}
			
		},() -> new Shave());
			
	}
		
}


