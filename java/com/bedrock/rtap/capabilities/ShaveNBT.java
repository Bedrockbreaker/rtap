package com.bedrock.rtap.capabilities;

import com.bedrock.rtap.capabilities.Shave;

import net.minecraft.nbt.NBTBase;
import net.minecraft.nbt.NBTTagFloat;
import net.minecraft.util.EnumFacing;
import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.Capability.IStorage;

public class ShaveNBT implements IStorage<Shave> {

	@Override
	public NBTBase writeNBT(Capability<Shave> capability, Shave instance, EnumFacing side) {
		
		return new NBTTagFloat(instance.hairRegrow);
		
	}

	@Override
	public void readNBT(Capability<Shave> capability, Shave instance, EnumFacing side, NBTBase nbt) {}

}
