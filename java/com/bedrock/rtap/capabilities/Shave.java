package com.bedrock.rtap.capabilities;

import com.bedrock.rtap.capabilities.IShave;

import net.minecraft.entity.passive.EntityOcelot;
import net.minecraftforge.common.capabilities.Capability;

public class Shave implements IShave {
	
	public float hairRegrow;

	@Override
	public void shave() {
		
		this.hairRegrow = 6000;
		
	}

	@Override
	public void unshave() {
		
		this.hairRegrow = 0;
		
	}

}
