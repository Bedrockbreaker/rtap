package com.bedrock.rtap.init;

import com.bedrock.rtap.Reference;

import net.minecraft.util.ResourceLocation;
import net.minecraft.util.SoundEvent;

public class ModSoundHandler {
	
	private static int size = 0;
	
	public static SoundEvent BOLOGNAARMOREQIUP;
	
	public static void init() {
		
		size = SoundEvent.REGISTRY.getKeys().size();
		
		BOLOGNAARMOREQIUP = register("miscellaneous.armor.bolognaarmorequip");
		
	}
	
	public static SoundEvent register(String event) {
		
		ResourceLocation location = new ResourceLocation(Reference.MOD_ID, event);
		SoundEvent e = new SoundEvent(location);
		
		SoundEvent.REGISTRY.register(size, location, e);
		size++;
		return e;
		
	}

}
