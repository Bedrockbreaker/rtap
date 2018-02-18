package mod.bedrock.rtap.init;

import java.util.HashSet;
import java.util.Set;

import mod.bedrock.rtap.Reference;
import mod.bedrock.rtap.items.armorBolognaBoots;
import mod.bedrock.rtap.items.armorBolognaChestplate;
import mod.bedrock.rtap.items.armorBolognaHelmet;
import mod.bedrock.rtap.items.armorBolognaLeggings;
import mod.bedrock.rtap.items.armorCatHairBoots;
import mod.bedrock.rtap.items.armorCatHairChestplate;
import mod.bedrock.rtap.items.armorCatHairHelmet;
import mod.bedrock.rtap.items.armorCatHairLeggings;
import mod.bedrock.rtap.items.armorJelloBoots;
import mod.bedrock.rtap.items.armorJelloChestplate;
import mod.bedrock.rtap.items.armorJelloHelmet;
import mod.bedrock.rtap.items.armorJelloLeggings;
import mod.bedrock.rtap.items.armorRamenBoots;
import mod.bedrock.rtap.items.armorRamenChestplate;
import mod.bedrock.rtap.items.armorRamenHelmet;
import mod.bedrock.rtap.items.armorRamenLeggings;
import net.minecraft.block.BlockWeb;
import net.minecraft.client.Minecraft;
import net.minecraft.client.audio.SoundHandler;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemArmor.ArmorMaterial;
import net.minecraft.util.SoundEvent;
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
public class ModArmor {
	
	public static ArmorMaterial materialBologna = EnumHelper.addArmorMaterial("bologna", Reference.MOD_ID + ":bologna", -1, new int[]{1,1,2,1}, 0, null, 0F);
	public static ArmorMaterial materialCatHair = EnumHelper.addArmorMaterial("cathair", Reference.MOD_ID + ":cathair", -40, new int[]{5,5,5,5}, 0, SoundEvents.BLOCK_CLOTH_PLACE, 0F);
	public static ArmorMaterial materialJello = EnumHelper.addArmorMaterial("jello", Reference.MOD_ID + ":jello", 200, new int[]{2,2,3,2}, 0, SoundEvents.BLOCK_SLIME_PLACE, 0F);
	public static ArmorMaterial materialRamen = EnumHelper.addArmorMaterial("ramen", Reference.MOD_ID  + ":ramen", 15, new int[] {2,1,3,2}, 0, null, 0F);
	
	//Bologna
	public final static ItemArmor armorbolognahelmet = null;
	public final static ItemArmor armorbolognachestplate = null;
	public final static ItemArmor armorbolognaleggings= null;
	public final static ItemArmor armorbolognaboots = null;
	//Cat Hair
	public final static ItemArmor armorcathairhelmet = null;
	public final static ItemArmor armorcathairchestplate = null;
	public final static ItemArmor armorcathairleggings = null;
	public final static ItemArmor armorcathairboots = null;
	//Jello
	public final static ItemArmor armorjellohelmet = null;
	public final static ItemArmor armorjellochestplate = null;
	public final static ItemArmor armorjelloleggings = null;
	public final static ItemArmor armorjelloboots = null;
	//Ramen
	public final static ItemArmor armorramenhelmet = null;
	public final static ItemArmor armorramenchestplate = null;
	public final static ItemArmor armorramenleggings = null;
	public final static ItemArmor armorramenboots = null;

	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class registerItems {
	
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<Item> event) {
			
			final IForgeRegistry<Item> registry = event.getRegistry();
			
			registry.register(new armorBolognaHelmet(materialBologna));
			registry.register(new armorBolognaChestplate(materialBologna));
			registry.register(new armorBolognaLeggings(materialBologna));
			registry.register(new armorBolognaBoots(materialBologna));
			
			registry.register(new armorCatHairHelmet(materialCatHair));
			registry.register(new armorCatHairChestplate(materialCatHair));
			registry.register(new armorCatHairLeggings(materialCatHair));
			registry.register(new armorCatHairBoots(materialCatHair));
			
			registry.register(new armorJelloHelmet(materialJello));
			registry.register(new armorJelloChestplate(materialJello));
			registry.register(new armorJelloLeggings(materialJello));
			registry.register(new armorJelloBoots(materialJello));
			
			registry.register(new armorRamenHelmet(materialRamen));
			registry.register(new armorRamenChestplate(materialRamen));
			registry.register(new armorRamenLeggings(materialRamen));
			registry.register(new armorRamenBoots(materialRamen));
			
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
		registerRender(armorbolognahelmet);
		registerRender(armorbolognachestplate);
		registerRender(armorbolognaleggings);
		registerRender(armorbolognaboots);
		//Cat Hair
		registerRender(armorcathairhelmet);
		registerRender(armorcathairchestplate);
		registerRender(armorcathairleggings);
		registerRender(armorcathairboots);
		//Jello
		registerRender(armorjellohelmet);
		registerRender(armorjellochestplate);
		registerRender(armorjelloleggings);
		registerRender(armorjelloboots);
		//Ramen
		registerRender(armorramenhelmet);
		registerRender(armorramenchestplate);
		registerRender(armorramenleggings);
		registerRender(armorramenboots);
		
	}
	
	@SideOnly(Side.CLIENT)
	private static void registerRender(Item item) {
		
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
}
