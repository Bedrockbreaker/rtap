package com.bedrock.rtap.init;

import java.util.concurrent.Callable;

import com.bedrock.rtap.capabilities.IShave;
import com.bedrock.rtap.capabilities.Shave;
import com.bedrock.rtap.capabilities.ShaveNBT;

import net.minecraftforge.common.capabilities.Capability;
import net.minecraftforge.common.capabilities.CapabilityInject;
import net.minecraftforge.common.capabilities.CapabilityManager;

public class ModCapabilities {
	
	@CapabilityInject(value = null)
	CapabilityManager shave = CapabilityManager.INSTANCE.register(IShave.class, new ShaveNBT(), Shave.class);

}
