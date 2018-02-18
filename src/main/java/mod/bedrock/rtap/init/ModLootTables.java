package mod.bedrock.rtap.init;

import mod.bedrock.rtap.Reference;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;

public class ModLootTables {
	
	public static void init() {
			
		LootTableList.register(new ResourceLocation(Reference.MOD_ID,"ocelot"));
		LootTableList.register(new ResourceLocation(Reference.MOD_ID, "desert_pyramid"));

	}

}
