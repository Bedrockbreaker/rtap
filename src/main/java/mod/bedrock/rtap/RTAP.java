package mod.bedrock.rtap;

import com.google.gson.JsonObject;

import mod.bedrock.rtap.init.ModArmor;
import mod.bedrock.rtap.init.ModBlocks;
import mod.bedrock.rtap.init.ModCapabilities;
import mod.bedrock.rtap.init.ModDeath;
import mod.bedrock.rtap.init.ModEvents;
import mod.bedrock.rtap.init.ModItems;
import mod.bedrock.rtap.init.ModLootTables;
import mod.bedrock.rtap.init.ModNonCrafting;
import mod.bedrock.rtap.init.ModSoundHandler;
import mod.bedrock.rtap.init.ModTools;
import mod.bedrock.rtap.irecipes.sulfur;
import mod.bedrock.rtap.proxy.CommonProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.util.DamageSource;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.common.crafting.CraftingHelper;
import net.minecraftforge.common.crafting.IRecipeFactory;
import net.minecraftforge.common.crafting.JsonContext;
import net.minecraftforge.event.LootTableLoadEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.Mod.Instance;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERISON, acceptedMinecraftVersions = Reference.ACCEPTED_VERSIONS)
public class RTAP {
	
	@Instance
	public static RTAP instance;
	
	@SidedProxy(clientSide = Reference.CLIENT_PROXY, serverSide = Reference.SERVER_PROXY)
	public static CommonProxy proxy;
	
	@EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		
		ModCapabilities.init();
		
	}
	
	@EventHandler //Proxies, Sounds, NonCrafting, LootTables
	public void init(FMLInitializationEvent event) {
		
		proxy.init();
		
		ModNonCrafting.init();
		//ModSoundHandler.init();
		ModLootTables.init();
		
	}
	
	@EventHandler //Cross-Mod Interaction, Event registry (I guess, I just put it here, not knowing which init to put it in)
	public void postInit(FMLPostInitializationEvent event) {
		
		MinecraftForge.EVENT_BUS.register(ModEvents.class);
		
	}
	
	/**
	 * TODO:
	 * 
	 * Key:
	 * - Just a Todo.
	 * * Important
	 * ! Heavily important
	 * = Not important
	 * ~ Maybe really hard to do/impossible, but still wanted
	 * 
	 * * Fix Crop Peppers
	 * * Fix Ramen Textures
	 * ! FIX SOUNDS!!
	 * - Make itemliquidmeat use sulfur instead of gunpowder. filter + gunpowder?
	 * * FIX LOOT TABLES AGHHHHHH!
	 * ! Create jello freezer. Make sure it can be automated with pipes/hoppers. Make it use rf. Internal fuel (Ice XVIII?) can be used if no other rf producing mod exists. Config option available.
	 * * Add crafting recipe for wet gelatine. Make sure to decrement the durability on the filter.
	 * = Make the filter not take damage when hitting / mining
	 * * Add NBT Color crafting to the gelatine to get custom colors, like fireworks/leather armor. Use IRecipe? use getColorFromItemStack?
	 * * Any variation of jello after the dyeing should affect the recipe from then on. Like blocks should be colored, armor, tools, etc..
	 * * Add dimensions for the 4 main tech trees
	 * * Add dimensions for tech trees
	 * - Add guide. Make it like thaumcraft's. Sort of. not really. Could also be like embers. I just really like the small quips on stuff. Add those to everything.
	 * ~= Make ramen armor/tools use nbt crafting to use the potion effect applied when the original ramen is eaten. More of the same ramen used on multiple armor pieces, the better the effect. Will also take texture of original ramen. Idea: add number id nbt to ramen, and copy it to each when crafting. Then, when applying the potion effect, get the id of the potion by the number in the nbt.
	 * ~= Make ramen block use texture connecting to make it look like a giant square bowl. Also make it able to swim in. Potion effect should be applied while in the bowl, but use up the ramen.
	 * ! NEVER ADD PICKLES. MUAHAHAHA
	 * ~* Make Ocelots when right clicked with shears drop cat hair. Fortune increases chances. Perhaps only when it is tamed. And add a cooldown. ~5 mins. Killing them, tamed or not, will drop cat hair. To add nbt to cats, use something about capabilities.
	 * - Make ALL Cat Hair Items burnable as fuel. hehehe.
	 * * Make all recipes use ore dictionary.
	 *
	 */
	
}
