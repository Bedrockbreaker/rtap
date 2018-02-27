package mod.bedrock.rtap.misc;

import java.util.List;
import java.util.Random;

import mod.bedrock.rtap.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.BlockCrops;
import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.nbt.NBTTagCompound;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.minecraft.world.biome.Biome;
import net.minecraft.world.gen.structure.StructureBoundingBox;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import net.minecraft.world.gen.structure.template.TemplateManager;

public class villageCropPeppers extends StructureVillagePieces.House1 {
	
	public villageCropPeppers() { }
	
	public villageCropPeppers(StructureVillagePieces.Start pStart, int pType, Random r, StructureBoundingBox boundingBox, EnumFacing p5) {
		
		super(pStart, pType, r, boundingBox, p5);
		this.setCoordBaseMode(p5);
		this.boundingBox = boundingBox;
		
	}
	
	public static villageCropPeppers buildComponent(Start startPiece, List<StructureComponent> pieces, int p1, int p2, int p3, EnumFacing p4, Random r, int p5) {
		
		StructureBoundingBox boundingBox = StructureBoundingBox.getComponentToAddBoundingBox(p1, p2, p3, 0, 0, 0, 13, 4, 9, p4);
		
		if ((canVillageGoDeeper(boundingBox)) && (StructureComponent.findIntersecting(pieces, boundingBox) == null)) {
			
			return new villageCropPeppers(startPiece, p5, r, boundingBox, p4);
			
		} else {
			
			return null;
			
		}
		
	}
	
	public boolean addComponentParts(World world, Random r, StructureBoundingBox sBoundingBox) {
		
		if (this.averageGroundLvl < 0) {
			
			this.averageGroundLvl = this.getAverageGroundLevel(world, sBoundingBox);
			
			if (this.averageGroundLvl < 0) {
				
				return true;
				
			}
			
			this.boundingBox.offset(0, this.averageGroundLvl - this.boundingBox.maxY + 3, 0);
			
		}
		
		this.fillWithBlocks(world, sBoundingBox, 0, 0, 0, 12, 3, 8, Blocks.AIR);
		this.buildStructure(world, r, sBoundingBox);
		
		for (int i = 0; i < 13; i++) {
			
			for (int j = 0; i < 9; j++) {
				
				this.clearCurrentPositionBlocksUpwards(world, i, 4, j, sBoundingBox);
				this.replaceAirAndLiquidDownwards(world, Blocks.DIRT.getDefaultState(), i, -1, j, sBoundingBox);
				
			}
			
		}
		
		return true;
		
	}
	
	public void buildStructure(World world, Random r, StructureBoundingBox sBoundingBox) {
		
		this.fillWithBlocks(world, sBoundingBox, 1, 0, 1, 2, 0, 7, Blocks.FARMLAND);
        this.fillWithBlocks(world, sBoundingBox, 4, 0, 1, 5, 0, 7, Blocks.FARMLAND);
        this.fillWithBlocks(world, sBoundingBox, 7, 0, 1, 8, 0, 7, Blocks.FARMLAND);
        this.fillWithBlocks(world, sBoundingBox, 10, 0, 1, 11, 0, 7, Blocks.FARMLAND);
        this.fillWithBlocks(world, sBoundingBox, 0, 0, 0, 0, 0, 8, Blocks.LOG);
        this.fillWithBlocks(world, sBoundingBox, 6, 0, 0, 6, 0, 8, Blocks.LOG);
        this.fillWithBlocks(world, sBoundingBox, 12, 0, 0, 12, 0, 8, Blocks.LOG);
        this.fillWithBlocks(world, sBoundingBox, 1, 0, 0, 11, 0, 0, Blocks.LOG);
        this.fillWithBlocks(world, sBoundingBox, 1, 0, 8, 11, 0, 8, Blocks.LOG);
        this.fillWithBlocks(world, sBoundingBox, 3, 0, 1, 3, 0, 7, Blocks.WATER);
        this.fillWithBlocks(world, sBoundingBox, 9, 0, 1, 9, 0, 7, Blocks.WATER);
        
        for (int i = 1; i < 8; i = i + 2) {
        	
        	IBlockState newCrop = getRandomCrop();
        	while ((newCrop == ModBlocks.croppeppers.getDefaultState()) && (world.getBiome(new BlockPos(sBoundingBox.minX, sBoundingBox.minY, sBoundingBox.minZ))) != Biome.getBiome(2)) {
        		
        		System.out.println(newCrop + " <= Crop --- Biome => " + world.getBiome(new BlockPos(sBoundingBox.minX, sBoundingBox.minY, sBoundingBox.minZ)));
        		newCrop = getRandomCrop();
        		
        	}
        	
        	this.setBlockState(world, newCrop, i, 1, 1, sBoundingBox);
        	this.setBlockState(world, newCrop, i, 1, 2, sBoundingBox);
        	this.setBlockState(world, newCrop, i, 1, 3, sBoundingBox);
        	this.setBlockState(world, newCrop, i, 1, 4, sBoundingBox);
        	this.setBlockState(world, newCrop, i, 1, 5, sBoundingBox);
        	this.setBlockState(world, newCrop, i, 1, 6, sBoundingBox);
        	this.setBlockState(world, newCrop, i, 1, 7, sBoundingBox);
        	this.setBlockState(world, newCrop, i, 1, 8, sBoundingBox);
        	this.setBlockState(world, newCrop, i + 1, 1, 1, sBoundingBox);
        	this.setBlockState(world, newCrop, i + 1, 1, 2, sBoundingBox);
        	this.setBlockState(world, newCrop, i + 1, 1, 3, sBoundingBox);
        	this.setBlockState(world, newCrop, i + 1, 1, 4, sBoundingBox);
        	this.setBlockState(world, newCrop, i + 1, 1, 5, sBoundingBox);
        	this.setBlockState(world, newCrop, i + 1, 1, 6, sBoundingBox);
        	this.setBlockState(world, newCrop, i + 1, 1, 7, sBoundingBox);
        	this.setBlockState(world, newCrop, i + 1, 1, 8, sBoundingBox);
        	
        }
		
	}
	
	public IBlockState getRandomCrop() {
		
		int r = (int) Math.round(Math.random() * 5);
		int age = (int) Math.round(Math.random() * 7);
		
		System.out.println("crop: " + r);
		System.out.println("age: " + age);
		
		switch (r) {
		
		case (1): return Blocks.WHEAT.getDefaultState().withProperty(BlockCrops.AGE, age);
		case (2): return Blocks.POTATOES.getDefaultState().withProperty(BlockCrops.AGE, age);
		case (3): return Blocks.CARROTS.getDefaultState().withProperty(BlockCrops.AGE, age);
		case (4): return Blocks.BEETROOTS.getDefaultState().withProperty(BlockCrops.AGE, age);
		default : return ModBlocks.croppeppers.getDefaultState().withProperty(BlockCrops.AGE, age);
		
		}
		
	}
	
	public void fillWithBlocks(World world, StructureBoundingBox sBoundingBox, int minX, int minY, int minZ, int maxX, int maxY, int maxZ, Block block) {
		
		this.fillWithBlocks(world, sBoundingBox, minX, minY, minZ, maxX, maxY, maxZ, block.getDefaultState(), block.getDefaultState(), false);
		
	}

}
