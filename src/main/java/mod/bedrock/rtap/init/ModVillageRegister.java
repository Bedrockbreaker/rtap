package mod.bedrock.rtap.init;

import java.util.List;
import java.util.Random;

import mod.bedrock.rtap.misc.villageCropPeppers;
import net.minecraft.util.EnumFacing;
import net.minecraft.world.gen.structure.StructureComponent;
import net.minecraft.world.gen.structure.StructureVillagePieces;
import net.minecraft.world.gen.structure.StructureVillagePieces.PieceWeight;
import net.minecraft.world.gen.structure.StructureVillagePieces.Start;
import net.minecraft.world.gen.structure.StructureVillagePieces.Village;
import net.minecraftforge.fml.common.registry.VillagerRegistry;

public class ModVillageRegister implements VillagerRegistry.IVillageCreationHandler {
	
	@Override
	public StructureVillagePieces.PieceWeight getVillagePieceWeight(Random r, int i) {
		
		return new StructureVillagePieces.PieceWeight(villageCropPeppers.class, 5, 3);
		
	}
	
	@Override
	public Class<?> getComponentClass() {
		
		return villageCropPeppers.class;
		
	}

	@Override
	public Village buildComponent(PieceWeight villagePiece, Start startPiece, List<StructureComponent> pieces, Random random, int p1, int p2, int p3, EnumFacing facing, int p5) {
		
		return villageCropPeppers.buildComponent(startPiece, pieces, p1, p2, p3, facing, random, p5);
		
	}

}
