package mod.bedrock.rtap.init;

import mod.bedrock.rtap.Reference;
import net.minecraft.entity.EntityLiving;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.storage.loot.LootEntry;
import net.minecraft.world.storage.loot.LootEntryTable;
import net.minecraft.world.storage.loot.LootPool;
import net.minecraft.world.storage.loot.LootTable;
import net.minecraft.world.storage.loot.LootTableList;
import net.minecraft.world.storage.loot.RandomValueRange;
import net.minecraft.world.storage.loot.conditions.LootCondition;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
public class ModLootTables {
	
	public static void registerTables() {
		
		registerTable("ocelot"); //Average seems to be 4.9225 cat hair per ocelot with looting 3. Killed 400 ocelots for data.
		registerTable("desert_pyramid");
		
	}
	
	@SubscribeEvent
	public static void onEvent(LootTableLoadEvent event) {
		
		LootTable table = event.getTable();
		String tableName = event.getName().toString();
		
		if (tableName.equals("minecraft:entities/ocelot")) { table.addPool(newPoolEntry("ocelot")); }
		if (tableName.equals("minecraft:chests/desert_pyramid")) { table.addPool(newPoolEntry("desert_pyramid")); }
		
	}
	
	public static void registerTable(String name) {
		
		LootTableList.register(new ResourceLocation(Reference.MOD_ID, "inject/" + name));
		
	}
	
	public static LootPool newPoolEntry(String name) {
		
		return new LootPool(new LootEntry[] {new LootEntryTable(new ResourceLocation(Reference.MOD_ID, "inject/" + name), 1, 0, new LootCondition[0], "rtapentry")}, new LootCondition[0], new RandomValueRange(1), new RandomValueRange(0, 1), "rtapentry");
		
	}

}
