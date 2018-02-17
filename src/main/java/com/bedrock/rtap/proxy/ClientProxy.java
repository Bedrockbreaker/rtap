package com.bedrock.rtap.proxy;

import com.bedrock.rtap.init.ModArmor;
import com.bedrock.rtap.init.ModBlocks;
import com.bedrock.rtap.init.ModItems;
import com.bedrock.rtap.init.ModTools;

public class ClientProxy implements CommonProxy {

	@Override
	public void init() {
		
		ModItems.registerRenders();
		ModBlocks.registerRenders();
		ModTools.registerRenders();
		ModArmor.registerRenders();
		
	}

}
