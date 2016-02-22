package com.nocturnalcoding.mcpi-building;

import pi.Block;

	/*
	 * Under Construction
	 */

public enum VillagePlan {
	/*
	Class containing village building blueprints 
	from minecraft.gamepedia.com/Village/Blueprints
	*/

	BLACKSMITH, BUTCHER_SHOP, CHURCH, FARM, LAMP_POST, LARGE_HOUSE, LIBRARY, SMALL_HOUSE, WELL;

	public Block[][][] getBlueprint() {
		// TODO: fix ladder issue
		switch (this) {
			case SMALL_HOUSE:
				System.out.println("Small House Blueprint");

				Block[] cobblestoneRow       = {Block.COBBLESTONE, Block.COBBLESTONE, Block.COBBLESTONE,
								Block.COBBLESTONE, Block.COBBLESTONE};

								//withData(3) orients the stair towards the building (north)
				Block[] stairsRow            = {Block.AIR, Block.AIR, Block.STAIRS_COBBLESTONE.withData(3), 
								Block.AIR, Block.AIR};

				Block[] woodWallRow          = {Block.COBBLESTONE, Block.WOOD_PLANKS, Block.WOOD_PLANKS, 
								Block.WOOD_PLANKS, Block.COBBLESTONE};

				Block[] ladderRow            = {Block.WOOD_PLANKS, Block.AIR, Block.AIR, 
								Block.LADDER, Block.WOOD_PLANKS};

				Block[] interiorRow          = {Block.WOOD_PLANKS, Block.AIR, Block.AIR, 
								Block.AIR, Block.WOOD_PLANKS};

				Block[] doorWallRow          = {Block.COBBLESTONE, Block.WOOD_PLANKS, Block.AIR, 
								Block.WOOD_PLANKS, Block.COBBLESTONE};

				Block[] airRow               = {Block.AIR, Block.AIR, Block.AIR, Block.AIR, Block.AIR};

				Block[] oneWindowWallRow     = {Block.COBBLESTONE, Block.WOOD_PLANKS, Block.GLASS_PANE, 
								Block.WOOD_PLANKS, Block.COBBLESTONE};

				Block[] twoWindowWallRow     = {Block.GLASS_PANE, Block.AIR, Block.AIR,
								Block.AIR, Block.GLASS_PANE};

				Block[] roofEdgeRow          = {Block.WOOD, Block.WOOD, Block.WOOD, Block.WOOD, Block.WOOD};

				Block[] roofLadderRow        = {Block.WOOD, Block.WOOD_PLANKS, Block.WOOD_PLANKS,
								Block.LADDER, Block.WOOD};

				Block[] roofInteriorRow      = {Block.WOOD, Block.WOOD_PLANKS, Block.WOOD_PLANKS,
								Block.WOOD_PLANKS, Block.WOOD};

				Block[] roofEdgeFenceRow     = {Block.FENCE, Block.FENCE, Block.FENCE, 
								Block.FENCE, Block.FENCE};

				Block[] roofInteriorFenceRow = {Block.FENCE, Block.AIR, Block.AIR, Block.AIR, Block.FENCE};
			
				Block[][] firstLayer = {cobblestoneRow,
							cobblestoneRow,
							cobblestoneRow,
							cobblestoneRow,
							cobblestoneRow,
							stairsRow};

				Block[][] secondLayer = {woodWallRow,
							ladderRow,
							interiorRow,
							interiorRow,
							doorWallRow,
							airRow};

				Block[][] thirdLayer = {oneWindowWallRow,
							ladderRow,
							twoWindowWallRow,
							interiorRow,
							doorWallRow,
							airRow};

				Block[][] fourthLayer = {woodWallRow,
							ladderRow,
							interiorRow,
							interiorRow,
							doorWallRow,
							airRow};

				Block[][] fifthLayer = {roofEdgeRow,
							roofLadderRow,
							roofInteriorRow,
							roofInteriorRow,
							roofEdgeRow,
							airRow};

				Block[][] sixthLayer = {roofEdgeFenceRow,
							roofInteriorFenceRow,
							roofInteriorFenceRow,
							roofInteriorFenceRow,
							roofEdgeFenceRow,
							airRow};

				Block[][][] blueprint = {firstLayer, secondLayer, thirdLayer,
						fourthLayer, fifthLayer, sixthLayer};
				
				return blueprint;
			
			default: System.out.println("Invalid type: returned new Block[0][0][0]");
				 return new Block[0][0][0];
		}
	}

	public int getWidth() {
		switch (this) {
			case SMALL_HOUSE: return 5;
			default: System.out.println("Invalid type: -1 returned");
				return -1;
		}
	}

	public String toString() {
	
		switch (this) {
			// case LARGE_HOUSE: return "LARGE_HOUSE";
			// case LIBRARY: return "LIBRARY";
			case SMALL_HOUSE: return "SMALL_HOUSE";
			default: return "Invalid type";
		
		}
	
	}

}