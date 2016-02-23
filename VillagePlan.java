package com.nocturnalcoding.mcpi-building;

import pi.Block;

	/*
	 * Under Construction
	 * 
	 * Class containing village building blueprints 
	 * from minecraft.gamepedia.com/Village/Blueprints
	 */
	 

public enum VillagePlan {
	
	/*
	 * SMALL_FARM does not generate a crop layer
	 * LARGE_FARM is omitted because it can be formed from two overlapping SMALL_FARMs.
	 * 
	 * (Not Implemented) WELL should be called with at y = -11. given that y is the desired "ground level."
	 */

	BLACKSMITH, BUTCHER_SHOP, CHURCH, LAMP_POST, LARGE_HOUSE, LIBRARY, SMALL_FARM, SMALL_HOUSE, WELL;

	public Block[][][] getBlueprint() {
		// TODO: Test
		// TODO: fix ladder issue
		// TODO: fix torch issue
		// TODO: implement BLACKSMITH, BUTCHER_SHOP, CHURCH, FARM, LAMP_POST, LARGE_HOUSE, LIBRARY, and, WELL
		switch (this) {
			/*
			case BLACKSMITH:
				break;
				
			case BUTCHER_SHOP:
				break;
				
			case CHURCH:
				break;
			*/	
			case LAMP_POST:
				// TODO: Test
				System.out.println("Lamp Post Blueprint");
				
				Block[] airRow   = {Block.AIR, Block.AIR, Block.AIR};
				Block[] postRow  = {Block.AIR, Block.FENCE, Block.AIR};
				Block[] lampRow  = {Block.TORCH, Block.OBSIDIAN, Block.TORCH};
				Block[] torchRow = {Block.AIR, Block.TORCH, Block.AIR};
				
				Block[][] postLayer = { airRow,
										postRow,
										airRow};
				Block[][] lampLayer = { torchRow,
										lampRow,
										torchRow};
				
				Block[][][] blueprint = {postLayer,
										postLayer,
										postLayer,
										lampLayer};
				
				return blueprint;
			/*	
			case LARGE_HOUSE:
				break;
				
			case LIBRARY:
				break;
			*/	
			case SMALL_FARM:
				//TODO: Test
				System.out.println("Small Farm Blueprint")
				
				Block[] woodRow = {Block.WOOD, Block.WOOD, Block.WOOD, Block.WOOD, Block.WOOD, Block.WOOD, Block.WOOD};
				Block[] soilRow = {Block.WOOD, Block.DIRT, Block.DIRT, Block.WATER, Block.DIRT, Block.DIRT, Block.WOOD};
				
				Block[][] firstLayer = {woodRow,
										soilRow,
										soilRow,
										soilRow,
										soilRow,
										soilRow,
										soilRow,
										soilRow,
										woodRow};
				
				Block [][][] blueprint = {firstLayer};
				
				return blueprint;
				
			case SMALL_HOUSE:
				System.out.println("Small House Blueprint");

				Block[] cobblestoneRow       = {Block.COBBLESTONE, Block.COBBLESTONE, Block.COBBLESTONE,
								Block.COBBLESTONE, Block.COBBLESTONE};

				// Block.STAIRS_COBBLESTONE.withData(3) orients the stair towards the building (north)
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
				
			/*case WELL:
			 *	break;
			 */
			default: System.out.println("Invalid type: returned new Block[0][0][0]");
				 return new Block[0][0][0];
		}
	}

	public int getWidth() {
		switch (this) {
			case: BLACKSMITH:
				return 10;
			
			case BUTCHER_SHOP:
				return 9;
			
			case CHURCH:
				return 5;
			
			case LAMP_POST:
				return 3;
				
			case LARGE_HOUSE:
				return 9;
				
			case LIBRARY:
				return 9;
				
			case SMALL_FARM:
				return 7;
				
			case SMALL_HOUSE: 
				return 5;
				
			case WELL:
				return 6;
				
			default: System.out.println("Invalid type: -1 returned");
				return -1;
		}
	}

	public String toString() {
	
		switch (this) {
			case BLACKSMITH:
				return "BLACKSMITH";
			
			case BUTCHER_SHOP:
				return "BUTCHER_SHOP";
			
			case CHURCH:
				return "CHURCH";
			
			case LAMP_POST:
				return "LAMP_POST";
				
			case LARGE_FARM:
				return "LARGE_FARM";
			
			case LARGE_HOUSE:
				return "LARGE_HOUSE";
				
			case LIBRARY:
				return "LIBRARY";
				
			case SMALL_FARM:
				return "SMALL_FARM";
				
			case SMALL_HOUSE: 
				return "SMALL_HOUSE";
				
			default:
				return "Invalid type";
		}
	
	}

}