package mod.bedrock.rtap.misc;

import net.minecraft.entity.Entity;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.util.EntityDamageSource;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TextComponentTranslation;
import net.minecraft.util.text.translation.I18n;

public class deathByShears extends EntityDamageSource {

	public deathByShears(String damageTypeIn, Entity damageSourceEntityIn) {
		
		super("rtap.killedByShears", damageSourceEntityIn);

	}
	
	//Taken from DamageSource vanilla class
	
	public ITextComponent getDeathMessage(EntityLivingBase entityLivingBaseIn) {
		
        EntityLivingBase entitylivingbase = entityLivingBaseIn.getAttackingEntity();
        String s = "death.attack." + this.damageType;
        String s1 = s + ".player";
        return entitylivingbase != null && I18n.canTranslate(s1) ? new TextComponentTranslation(s1, new Object[] {entityLivingBaseIn.getDisplayName(), entitylivingbase.getDisplayName()}) : new TextComponentTranslation(s, new Object[] {entityLivingBaseIn.getDisplayName()});
   
	}

}
