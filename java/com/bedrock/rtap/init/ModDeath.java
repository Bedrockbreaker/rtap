package com.bedrock.rtap.init;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.text.ITextComponent;

public class ModDeath extends EntityDamageSource {

	public ModDeath(String damageTypeIn, Entity damageSourceEntityIn) {
		
		super("rtap.killedByShears", damageSourceEntityIn);

	}

}
