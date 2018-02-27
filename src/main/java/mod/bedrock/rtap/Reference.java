package mod.bedrock.rtap;

import java.util.List;
import java.util.Random;

import com.google.common.collect.Range;

import io.netty.util.internal.ThreadLocalRandom;
import mod.bedrock.rtap.init.ModItems;
import mod.bedrock.rtap.init.ModVillageRegister;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.registry.VillagerRegistry.IVillageCreationHandler;

public class Reference {
	
	public static final String MOD_ID = "rtap";
	public static final String NAME = "Randomer Than a Pickle";
	public static final String VERISON = "0.0.1";
	public static final String ACCEPTED_VERSIONS = "[1.12.2]";
	
	public static final String CLIENT_PROXY = "mod.bedrock.rtap.proxy.ClientProxy";
	public static final String SERVER_PROXY = "mod.bedrock.rtap.proxy.ServerProxy";
	
	public final static IVillageCreationHandler MODVILLAGEREGISTER = new ModVillageRegister();
	
	public static enum RTAPItems {
		
		//Misc + Crafting
		//Jello
		ITEMLIQUIDMEAT("itemliquidmeat", "itemLiquidMeat"),
		ITEMFILTERPART("itemfilterpart", "itemFilterPart"),
		ITEMFILTER("itemfilter", "itemFilter"),
		ITEMGELATINEWET("itemgelatinewet", "itemGelatineWet"),
		ITEMGELATINE("itemgelatine", "itemGelatine"),
		ITEMJELLOMIX("itemjellomix", "itemJelloMix"),
		ITEMJELLOHOT("itemjellohot", "itemJelloHot"),
		//Cat Hair
		ITEMCATHAIR("itemcathair", "itemCatHair"),
		
		//Foods
		//Ramen
		FOODPEPPERS("foodpeppers", "foodPeppers"),
		FOODRAMENCOLD("foodramencold", "foodRamenCold"),
		FOODRAMENCOOKED("foodramencooked", "foodRamenCooked"),
		FOODRAMENSPICY("foodramenspicy", "foodRamenSpicy"),
		FOODRAMENSWEET("foodramensweet", "foodRamenSweet"),
		FOODRAMENJELLO("foodramenjello", "foodRamenJello"),
		FOODRAMENHAIRY("foodramenhairy", "foodRamenHairy"),
		FOODRAMENMEATY("foodramenmeaty", "foodRamenMeaty"),
		FOODRAMENRAMEN("foodramenramen", "foodRamenRamen"),
		FOODRAMENPRIMAL("foodramenprimal", "foodRamenPrimal"),
		FOODRAMENELECTRONIC("foodramenelectronic", "foodRamenElectronic"),
		FOODRAMENMYSTERIOUS("foodramenmysterious", "foodRamenMysterious"),
		FOODRAMENBALANCED("foodramenbalanced", "foodRamenBalanced"),
		//Bologna
		FOODBOLOGNA("foodbologna", "foodBologna"),
		//Jello
		FOODJELLO("foodjello", "foodJello"),
		
		//Tools
		//Bologna
		TOOLBOLOGNAPICKAXE("toolbolognapickaxe", "toolBolognaPickaxe"),
		TOOLBOLOGNAAXE("toolbolognaaxe", "toolBolognaAxe"),
		TOOLBOLOGNASHOVEL("toolbolognashovel", "toolBolognaShovel"),
		TOOLBOLOGNASWORD("toolbolognasword", "toolBolognaSword"),
		TOOLBOLOGNAHOE("toolbolognahoe", "toolBolognaHoe"),
		TOOLBOLOGNASHEARS("toolbolognashears", "toolBolognaShears"),
		//Ramen
		TOOLRAMENPICKAXE("toolramenpickaxe", "toolRamenPickaxe"),
		TOOLRAMENAXE("toolramenaxe", "toolRamenAxe"),
		TOOLRAMENSHOVEL("toolramenshovel", "toolRamenShovel"),
		TOOLRAMENSWORD("toolramensword", "toolRamenSword"),
		TOOLRAMENHOE("toolramenhoe", "toolRamenHoe"),
		TOOLRAMENSHEARS("toolramenshears", "toolRamenShears"),
		//Jello
		TOOLJELLOPICKAXE("tooljellopickaxe", "toolJelloPickaxe"),
		TOOLJELLOAXE("tooljelloaxe", "toolJelloAxe"),
		TOOLJELLOSHOVEL("tooljelloshovel", "toolJelloShovel"),
		TOOLJELLOSWORD("tooljellosword", "toolJelloSword"),
		TOOLJELLOHOE("tooljellohoe", "toolJelloHoe"),
		TOOLJELLOSHEARS("tooljelloshears", "toolJelloShears"),
		//Cat Hair
		TOOLCATHAIRPICKAXE("toolcathairpickaxe", "toolCatHairPickaxe"),
		TOOLCATHAIRAXE("toolcathairaxe", "toolCatHairAxe"),
		TOOLCATHAIRSHOVEL("toolcathairshovel", "toolCatHairShovel"),
		TOOLCATHAIRSWORD("toolcathairsword", "toolCatHairSword"),
		TOOLCATHAIRHOE("toolcathairhoe", "toolCatHairHoe"),
		TOOLCATHAIRSHEARS("toolcathairshears", "toolCatHairShears"),
		
		//Armor
		//Bologna
		ARMORBOLOGNAHELMET("armorbolognahelmet", "armorBolognaHelmet"),
		ARMORBOLOGNACHESTPLATE("armorbolognachestplate", "armorBolognaChestplate"),
		ARMORBOLOGNALEGGINGS("armorbolognaleggings", "armorBolognaLeggings"),
		ARMORBOLOGNABOOTS("armorbolognaboots", "armorBolognaBoots"),
		//CatHair
		ARMORCATHAIRHELMET("armorcathairhelmet", "armorCatHairHelmet"),
		ARMORCATHAIRCHESTPLATE("armorcathairchestplate", "armorCatHairChestplate"),
		ARMORCATHAIRLEGGINGS("armorcathairleggings", "armorCatHairLeggings"),
		ARMORCATHAIRBOOTS("armorcathairboots", "armorCatHairBoots"),
		//Jello
		ARMORJELLOHELMET("armorjellohelmet", "armorJelloHelmet"),
		ARMORJELLOCHESTPLATE("armorjellochestplate", "armorJelloChestplate"),
		ARMORJELLOLEGGINGS("armorjelloleggings", "armorJelloLeggings"),
		ARMORJELLOBOOTS("armorjelloboots", "armorJelloBoots"),
		//Ramen
		ARMORRAMENHELMET("armorramenhelmet", "armorRamenHelmet"),
		ARMORRAMENCHESTPLATE("armorramenchestplate", "armorRamenChestplate"),
		ARMORRAMENLEGGINGS("armorramenleggings", "armorRamenLeggings"),
		ARMORRAMENBOOTS("armorramenboots", "armorRamenBoots");
		
		private String unlocalizedName;
		private String registryName;
		
		RTAPItems(String unlocalizedName, String registryName) {
			
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		
		}
		
		public String getUnlocalizedName() {
			
			return unlocalizedName;
			
		}
		
		public String getRegistryName() {
			
			return registryName;
			
		}
		
	}
	
	public static enum RTAPBlocks {
		
		//Misc + Decor
		BLOCKFLINT("blockflint", "blockFlint"),
		//Cat Hair
		BLOCKCATHAIR("blockcathair", "blockCatHair"),
		//Bologna
		BLOCKBOLOGNA("blockbologna", "blockBologna"),
		//Ramen
		BLOCKRAMEN("blockramen", "blockRamen"),
		//Jello
		BLOCKJELLO("blockjello", "blockJello"),
		
		//Crops
		CROPPEPPERS("croppeppers", "cropPeppers");
		
		private String unlocalizedName;
		private String registryName;
		
		RTAPBlocks(String unlocalizedName, String registryName) {
			
			this.unlocalizedName = unlocalizedName;
			this.registryName = registryName;
		
		}
		
		public String getUnlocalizedName() {
			
			return unlocalizedName;
			
		}
		
		public String getRegistryName() {
			
			return registryName;
			
		}
		
	}
	
	public static CreativeTabs tabRTAP = new CreativeTabs("tab_rtap") {
		
		@Override
		public ItemStack getTabIconItem() {
			
			return new ItemStack(ModItems.foodramencooked);
			
		}
		
	};
	
}
