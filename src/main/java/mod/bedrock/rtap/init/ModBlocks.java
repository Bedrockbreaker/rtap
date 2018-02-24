package mod.bedrock.rtap.init;

import java.util.HashSet;
import java.util.Set;

import mod.bedrock.rtap.Reference;
import mod.bedrock.rtap.blocks.blockBologna;
import mod.bedrock.rtap.blocks.blockCatHair;
import mod.bedrock.rtap.blocks.blockFlint;
import mod.bedrock.rtap.blocks.blockJello;
import mod.bedrock.rtap.blocks.blockRamen;
import mod.bedrock.rtap.blocks.cropPeppers;
import net.minecraft.block.Block;
import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
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
public class ModBlocks {
	
	public final static blockFlint blockflint = null;
	public final static blockCatHair blockcathair = null;
	public final static blockBologna blockbologna = null;
	public final static blockRamen blockramen = null;
	public final static blockJello blockjello = null;
	public final static cropPeppers croppeppers = null;
	
	@ObjectHolder("blockFlint")
	public final static ItemBlock blockFlint = null;
	@ObjectHolder("blockCatHair")
	public final static ItemBlock blockCatHair = null;
	@ObjectHolder("blockBologna")
	public final static ItemBlock blockBologna = null;
	@ObjectHolder("blockRamen")
	public final static ItemBlock blockRamen = null;
	@ObjectHolder("blockJello")
	public final static ItemBlock blockJello = null;
	
	@Mod.EventBusSubscriber(modid = Reference.MOD_ID)
	public static class registerBlocks {
	
		@SubscribeEvent
		public static void onEvent(final RegistryEvent.Register<Block> event) {
			
			final IForgeRegistry<Block> registry = event.getRegistry();
			
			registry.register(new blockFlint());
			registry.register(new blockCatHair());
			registry.register(new blockBologna());
			registry.register(new blockRamen());
			registry.register(new blockJello());
			registry.register(new cropPeppers());
			
		}
		
		@SubscribeEvent
		public static void registerItems(final RegistryEvent.Register<Item> event) {
			
			final IForgeRegistry<Item> registry = event.getRegistry();
			
			registry.register(setName(new ItemBlock(blockflint), blockflint.getRegistryName().getResourcePath()));
			registry.register(setName(new ItemBlock(blockcathair), blockcathair.getRegistryName().getResourcePath()));
			registry.register(setName(new ItemBlock(blockbologna), blockbologna.getRegistryName().getResourcePath()));
			registry.register(setName(new ItemBlock(blockramen), blockramen.getRegistryName().getResourcePath()));
			registry.register(setName(new ItemBlock(blockjello), blockjello.getRegistryName().getResourcePath()));
			
		}
		
		@SubscribeEvent
		@SideOnly(Side.CLIENT)
		public static void onModelEvent(final ModelRegistryEvent event) {
			
			registerRenders();
			
		}
		
	}
	
	public static ItemBlock setName(ItemBlock itemBlockIn, String name) {
		
		itemBlockIn.setRegistryName(name).setUnlocalizedName(name);
		return itemBlockIn;
		
	}
	
	@SideOnly(Side.CLIENT)
	public static void registerRenders() {
		
		registerRender(blockflint, blockFlint);
		registerRender(blockcathair, blockCatHair);
		registerRender(blockbologna, blockBologna);
		registerRender(blockramen, blockRamen);
		registerRender(blockjello, blockJello);
		registerBlockRenderOnly(croppeppers);
		
		
	}
	
	@SideOnly(Side.CLIENT)
	private static void registerRender(Block block, ItemBlock item) {
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
		ModelLoader.setCustomModelResourceLocation(item, 0, new ModelResourceLocation(Reference.MOD_ID + ":" + item.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
	@SideOnly(Side.CLIENT)
	private static void registerBlockRenderOnly(Block block) {
		
		ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(block), 0, new ModelResourceLocation(Reference.MOD_ID + ":" + block.getUnlocalizedName().substring(5), "inventory"));
		
	}
	
}
