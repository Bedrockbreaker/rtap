package mod.bedrock.rtap.capabilities;

import mod.bedrock.rtap.capabilities.IShave;
import net.minecraft.entity.passive.EntityOcelot;
import net.minecraftforge.common.capabilities.Capability;

public class Shave implements IShave {
	
	public int hairRegrow;

	@Override
	public void shave() {
		
		this.hairRegrow = 6000;
		
	}

	@Override
	public void unshave() {
		
		this.hairRegrow = 0;
		
	}

}
