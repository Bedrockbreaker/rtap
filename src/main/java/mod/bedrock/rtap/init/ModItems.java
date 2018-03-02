package mod.bedrock.rtap.init;

import java.util.HashSet;
import java.util.Set;

import javax.swing.text.Utilities;

import mod.bedrock.rtap.Reference;
import mod.bedrock.rtap.items.foodBologna;
import mod.bedrock.rtap.items.foodJello;
import mod.bedrock.rtap.items.foodPeppers;
import mod.bedrock.rtap.items.foodRamenBalanced;
import mod.bedrock.rtap.items.foodRamenCold;
import mod.bedrock.rtap.items.foodRamenCooked;
import mod.bedrock.rtap.items.foodRamenElectronic;
import mod.bedrock.rtap.items.foodRamenHairy;
import mod.bedrock.rtap.items.foodRamenJello;
import mod.bedrock.rtap.items.foodRamenMeaty;
import mod.bedrock.rtap.items.foodRamenMysterious;
import mod.bedrock.rtap.items.foodRamenPrimal;
import mod.bedrock.rtap.items.foodRamenRamen;
import mod.bedrock.rtap.items.foodRamenSpicy;
import mod.bedrock.rtap.items.foodRamenSweet;
import mod.bedrock.rtap.items.itemCatHair;
import mod.bedrock.rtap.items.itemFilter;
import mod.bedrock.rtap.items.itemFilterPart;
import mod.bedrock.rtap.items.itemGelatine;
import mod.bedrock.rtap.items.itemGelatineWet;
import mod.bedrock.rtap.items.itemJelloHot;
import mod.bedrock.rtap.items.itemJelloMix;
import mod.bedrock.rtap.items.itemLiquidMeat;
import mod.bedrock.rtap.items.itemSulfur;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.item.ItemSeeds;
import net.minecraft.item.ItemStack;
import net.minecraft.potion.Potion;
import net.minecraft.potion.PotionEffect;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import net.minecraftforge.registries.IForgeRegistry;

@ObjectHolder(Reference.MOD_ID)
public class ModItems {

	//Misc + crafting
	public final static itemLiquidMeat itemliquidmeat = null;
	public final static itemFilterPart itemfilterpart = null;
	public final static itemFilter itemfilter = null;
	public final static itemGelatineWet itemgelatinewet = null;
	public final static itemGelatine itemgelatine = null;
	public final static itemJelloMix itemjellomix = null;
	public final static itemJelloHot itemjellohot = null;
	public final static itemCatHair itemcathair = null;
	public final static itemSulfur itemsulfur = null;
	
	//Foods
	public final static foodPeppers foodpeppers = null;
	public final static foodRamenCold foodramencold = null;
	public final static foodRamenCooked foodramencooked = null;
	public final static foodRamenSpicy foodramenspicy = null;
	public final static foodRamenSweet foodramensweet = null;
	public final static foodRamenJello foodramenjello = null;
	public final static foodRamenHairy foodramenhairy = null;
	public final static foodRamenMeaty foodramenmeaty = null;
	public final static foodRamenRamen foodramenramen = null;
	public final static foodRamenPrimal foodramenprimal = null;
	public final static foodRamenElectronic foodramenelectronic = null;
	public final static foodRamenMysterious foodramenmysterious = null;
	public final static foodRamenBalanced foodramenbalanced = null;
	public final static foodBologna foodbologna = null;
	public final static foodJello foodjello = null;
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class registerItems {
		
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<Item> event) {
			
			final IForgeRegistry<Item> registry = event.getRegistry();
			
			registry.register(new itemLiquidMeat());
			registry.register(new itemFilterPart());
			registry.register(new itemFilter());
			registry.register(new itemGelatineWet());
			registry.register(new itemGelatine());
			registry.register(new itemJelloMix());
			registry.register(new itemJelloHot());
			registry.register(new itemCatHair());
			registry.register(new itemSulfur());
			registry.register(new foodPeppers());
			registry.register(new foodRamenCold());
			registry.register(new foodRamenCooked());
			registry.register(new foodRamenSpicy());
			registry.register(new foodRamenSweet());
			registry.register(new foodRamenJello());
			registry.register(new foodRamenHairy());
			registry.register(new foodRamenMeaty());
			registry.register(new foodRamenRamen());
			registry.register(new foodRamenPrimal());
			registry.register(new foodRamenElectronic());
			registry.register(new foodRamenMysterious());
			registry.register(new foodRamenBalanced());
			registry.register(new foodBologna());
			registry.register(new foodJello());
			
		}
		
		@SubscribeEvent
		@SideOnly(Side.CLIENT)
		public static void onModelEvent(final ModelRegistryEvent event) {
			
			registerRenders();
			
		}
	
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		
		//Misc + crafting
		registerRender(itemliquidmeat);
		registerRender(itemfilterpart);
		registerRender(itemfilter);
		registerRender(itemgelatinewet);
		registerRender(itemgelatine);
		registerRender(itemjellomix);
		registerRender(itemjellohot);
		registerRender(itemcathair);
		registerRender(itemsulfur);
		
		//Foods
		registerRender(foodpeppers);
		registerRender(foodramencold);
		registerRender(foodramencooked);
		registerRender(foodramenspicy);
		registerRender(foodramensweet);
		registerRender(foodramenjello);
		registerRender(foodramenhairy);
		registerRender(foodramenmeaty);
		registerRender(foodramenramen);
		registerRender(foodramenprimal);
		registerRender(foodramenelectronic);
		registerRender(foodramenmysterious);
		registerRender(foodramenbalanced);
		registerRender(foodbologna);
		registerRender(foodjello);
	}
	
	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
}
