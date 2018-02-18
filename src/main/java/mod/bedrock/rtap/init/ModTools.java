package mod.bedrock.rtap.init;

import java.util.HashSet;
import java.util.Set;

import mod.bedrock.rtap.Reference;
import mod.bedrock.rtap.items.toolBolognaAxe;
import mod.bedrock.rtap.items.toolBolognaHoe;
import mod.bedrock.rtap.items.toolBolognaPickaxe;
import mod.bedrock.rtap.items.toolBolognaShears;
import mod.bedrock.rtap.items.toolBolognaShovel;
import mod.bedrock.rtap.items.toolBolognaSword;
import mod.bedrock.rtap.items.toolCatHairAxe;
import mod.bedrock.rtap.items.toolCatHairHoe;
import mod.bedrock.rtap.items.toolCatHairPickaxe;
import mod.bedrock.rtap.items.toolCatHairShears;
import mod.bedrock.rtap.items.toolCatHairShovel;
import mod.bedrock.rtap.items.toolCatHairSword;
import mod.bedrock.rtap.items.toolJelloAxe;
import mod.bedrock.rtap.items.toolJelloHoe;
import mod.bedrock.rtap.items.toolJelloPickaxe;
import mod.bedrock.rtap.items.toolJelloShears;
import mod.bedrock.rtap.items.toolJelloShovel;
import mod.bedrock.rtap.items.toolJelloSword;
import mod.bedrock.rtap.items.toolRamenAxe;
import mod.bedrock.rtap.items.toolRamenHoe;
import mod.bedrock.rtap.items.toolRamenPickaxe;
import mod.bedrock.rtap.items.toolRamenShears;
import mod.bedrock.rtap.items.toolRamenShovel;
import mod.bedrock.rtap.items.toolRamenSword;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.Item.ToolMaterial;
import net.minecraft.item.ItemAxe;
import net.minecraft.item.ItemFishingRod;
import net.minecraft.item.ItemHoe;
import net.minecraft.item.ItemPickaxe;
import net.minecraft.item.ItemShears;
import net.minecraft.item.ItemSpade;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Reference.MOD_ID)
public class ModTools {
	
	public static ToolMaterial materialBologna = EnumHelper.addToolMaterial(Reference.MOD_ID + ":bologna", 1, -1, 2F, 1F, 10);
	public static ToolMaterial materialRamen = EnumHelper.addToolMaterial(Reference.MOD_ID + ":ramen", 2, 74, 4F, 2F, 3);
	public static ToolMaterial materialJello = EnumHelper.addToolMaterial(Reference.MOD_ID + ":jello", 0, 249, 1F, -1F, 15);
	public static ToolMaterial materialCatHair = EnumHelper.addToolMaterial(Reference.MOD_ID + ":cathair", 666, 4, 99999F, 99999F, 0);
	
	//Bologna
	public final static ItemPickaxe toolbolognapickaxe = null;
	public final static toolBolognaAxe toolbolognaaxe = null;
	public final static ItemSpade toolbolognashovel = null;
	public final static ItemSword toolbolognasword = null;
	public final static ItemHoe toolbolognahoe = null;
	public final static ItemShears toolbolognashears = null;
	//Ramen
	public final static ItemPickaxe toolramenpickaxe = null;
	public final static toolRamenAxe toolramenaxe = null;
	public final static ItemSpade toolramenshovel = null;
	public final static ItemSword toolramensword = null;
	public final static ItemHoe toolramenhoe = null;
	public final static ItemShears toolramenshears = null;
	//Jello
	public final static ItemPickaxe tooljellopickaxe = null;
	public final static toolJelloAxe tooljelloaxe = null;
	public final static ItemSpade tooljelloshovel = null;
	public final static ItemSword tooljellosword = null;
	public final static ItemHoe tooljellohoe = null;
	public final static ItemShears tooljelloshears = null;
	//Cat Hair
	public final static ItemPickaxe toolcathairpickaxe = null;
	public final static toolCatHairAxe toolcathairaxe = null;
	public final static ItemSpade toolcathairshovel = null;
	public final static ItemSword toolcathairsword = null;
	public final static ItemHoe toolcathairhoe = null;
	public final static ItemShears toolcathairshears = null;
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class registerItems {
	
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<Item> event) {
	
			final IForgeRegistry<Item> registry = event.getRegistry();
			
			registry.register(new toolBolognaPickaxe(materialBologna));
			registry.register(new toolBolognaAxe(materialBologna));
			registry.register(new toolBolognaShovel(materialBologna));
			registry.register(new toolBolognaSword(materialBologna));
			registry.register(new toolBolognaHoe(materialBologna));
			registry.register(new toolBolognaShears(materialBologna));
			
			registry.register(new toolRamenPickaxe(materialRamen));
			registry.register(new toolRamenAxe(materialRamen));
			registry.register(new toolRamenShovel(materialRamen));
			registry.register(new toolRamenSword(materialRamen));
			registry.register(new toolRamenHoe(materialRamen));
			registry.register(new toolRamenShears(materialRamen));
			
			registry.register(new toolJelloPickaxe(materialJello));
			registry.register(new toolJelloAxe(materialJello));
			registry.register(new toolJelloShovel(materialJello));
			registry.register(new toolJelloSword(materialJello));
			registry.register(new toolJelloHoe(materialJello));
			registry.register(new toolJelloShears(materialJello));
			
			registry.register(new toolCatHairPickaxe(materialCatHair));
			registry.register(new toolCatHairAxe(materialCatHair));
			registry.register(new toolCatHairShovel(materialCatHair));
			registry.register(new toolCatHairSword(materialCatHair));
			registry.register(new toolCatHairHoe(materialCatHair));
			registry.register(new toolCatHairShears(materialCatHair));
			
		}
		
		@SubscribeEvent
		@SideOnly(Side.CLIENT)
		public static void onModelEvent(final ModelRegistryEvent event) {
			
			registerRenders();
			
		}
	
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		
		//Bologna
		registerRender(toolbolognapickaxe);
		registerRender(toolbolognaaxe);
		registerRender(toolbolognashovel);
		registerRender(toolbolognasword);
		registerRender(toolbolognahoe);
		registerRender(toolbolognashears);
		//Ramen
		registerRender(toolramenpickaxe);
		registerRender(toolramenaxe);
		registerRender(toolramenshovel);
		registerRender(toolramensword);
		registerRender(toolramenhoe);
		registerRender(toolramenshears);
		//Jello
		registerRender(tooljellopickaxe);
		registerRender(tooljelloaxe);
		registerRender(tooljelloshovel);
		registerRender(tooljellosword);
		registerRender(tooljellohoe);
		registerRender(tooljelloshears);
		//Cat Hair
		registerRender(toolcathairpickaxe);
		registerRender(toolcathairaxe);
		registerRender(toolcathairshovel);
		registerRender(toolcathairsword);
		registerRender(toolcathairhoe);
		registerRender(toolcathairshears);
		
	}
	
	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}

}
