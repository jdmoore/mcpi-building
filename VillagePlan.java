package com.nocturnalcoding.mcpi_building;

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

		Block[][][] blueprint;
		switch (this) {
			/*
			case BLACKSMITH:
				System.out.println("Blacksmith Blueprint");

				blueprint = blacksmith();
				return blueprint;
				
			case BUTCHER_SHOP:
				System.out.println("Butcher Shop Blueprint");

				blueprint = butcherShop();
				return blueprint();
				
			case CHURCH:
				System.out.println("Church Blueprint");

				blueprint = church();
				return blueprint;
			*/	
			case LAMP_POST:
				// TODO: Test
				System.out.println("Lamp Post Blueprint");
				
				blueprint = lampPost();
				return blueprint;
			/*	
			case LARGE_HOUSE:
				System.out.println("Large House Blueprint");
				
			case LIBRARY:
				System.out.println("Library Blueprint");
			*/	
			case SMALL_FARM:
				//TODO: Test
				System.out.println("Small Farm Blueprint");
				
			
				blueprint = smallFarm();
				return blueprint;
				
			case SMALL_HOUSE:
				System.out.println("Small House Blueprint");

				blueprint = smallHouse();
				return blueprint;
				
			case WELL:
				System.out.println("Well Blueprint");

				blueprint = well();
				return blueprint;
			 
			default: System.out.println("Invalid type: returned new Block[0][0][0]");
				 return new Block[0][0][0];
		}
	}

	public int getWidth() {
		switch (this) {
			case BLACKSMITH:
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
	
	private static Block[][][] lampPost() {
		Block[] nullRow   = {null, null, null};
		Block[] postRow  = {null, Block.FENCE, null};
		Block[] lampRow  = {Block.TORCH, Block.OBSIDIAN, Block.TORCH};
		Block[] torchRow = {null, Block.TORCH, null};
				
		Block[][] postLayer = {nullRow, postRow, nullRow};
		Block[][] lampLayer = {torchRow, lampRow, torchRow};
				
		Block[][][] lampBlueprint = {postLayer,	postLayer, postLayer, lampLayer};
				
		return lampBlueprint;
	}

	private static Block[][][] smallFarm() {
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
				
		Block [][][] farmBlueprint = {firstLayer};
		return farmBlueprint;
	}

	private static Block[][][] smallHouse() {
		Block[] cobblestoneRow       = {Block.COBBLESTONE, Block.COBBLESTONE, Block.COBBLESTONE,
								Block.COBBLESTONE, Block.COBBLESTONE};

		// Block.STAIRS_COBBLESTONE.withData(3) orients the stair towards the building (north)
		Block[] stairsRow            = {null, null, Block.STAIRS_COBBLESTONE.withData(3), 
						null, null};

		Block[] woodWallRow          = {Block.COBBLESTONE, Block.WOOD_PLANKS, Block.WOOD_PLANKS, 
						Block.WOOD_PLANKS, Block.COBBLESTONE};

		Block[] ladderRow            = {Block.WOOD_PLANKS, Block.AIR, Block.AIR, 
						Block.LADDER.withData(3), Block.WOOD_PLANKS};

		Block[] interiorRow          = {Block.WOOD_PLANKS, Block.AIR, Block.AIR, 
						Block.AIR, Block.WOOD_PLANKS};

		Block[] doorWallRow          = {Block.COBBLESTONE, Block.WOOD_PLANKS, Block.AIR, 
						Block.WOOD_PLANKS, Block.COBBLESTONE};

		Block[] nullRow               = {null, null, null, null, null};

		Block[] oneWindowWallRow     = {Block.COBBLESTONE, Block.WOOD_PLANKS, Block.GLASS_PANE, 
						Block.WOOD_PLANKS, Block.COBBLESTONE};

		Block[] twoWindowWallRow     = {Block.GLASS_PANE, Block.AIR, Block.AIR,
						Block.AIR, Block.GLASS_PANE};

		Block[] roofEdgeRow          = {Block.WOOD, Block.WOOD, Block.WOOD, Block.WOOD, Block.WOOD};

		Block[] roofLadderRow        = {Block.WOOD, Block.WOOD_PLANKS, Block.WOOD_PLANKS,
						Block.LADDER.withData(3), Block.WOOD};

		Block[] roofInteriorRow      = {Block.WOOD, Block.WOOD_PLANKS, Block.WOOD_PLANKS,
						Block.WOOD_PLANKS, Block.WOOD};

		Block[] roofEdgeFenceRow     = {Block.FENCE, Block.FENCE, Block.FENCE, 
						Block.FENCE, Block.FENCE};

		Block[] roofInteriorFenceRow = {Block.FENCE, null, null, null, Block.FENCE};
			
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
					nullRow};

		Block[][] thirdLayer = {oneWindowWallRow,
					ladderRow,
					twoWindowWallRow,
					interiorRow,
					doorWallRow,
					nullRow};

		Block[][] fourthLayer = {woodWallRow,
					ladderRow,
					interiorRow,
					interiorRow,
					doorWallRow,
					nullRow};

		Block[][] fifthLayer = {roofEdgeRow,
					roofLadderRow,
					roofInteriorRow,
					roofInteriorRow,
					roofEdgeRow,
					nullRow};

		Block[][] sixthLayer = {roofEdgeFenceRow,
					roofInteriorFenceRow,
					roofInteriorFenceRow,
					roofInteriorFenceRow,
					roofEdgeFenceRow,
					nullRow};

		Block[][][] smallHouseBlueprint = {firstLayer, secondLayer, thirdLayer,
						fourthLayer, fifthLayer, sixthLayer};
		return smallHouseBlueprint;
	}

	private static Block[][][] well() {
		Block[] nullRow = {null, null, null, null, null, null};

		Block[] baseRow = {null, Block.COBBLESTONE, Block.COBBLESTONE, Block.COBBLESTONE, Block.COBBLESTONE, null};

		Block[] shaftRow = {null, Block.COBBLESTONE, Block.WATER, Block.WATER, Block.COBBLESTONE, null};

		Block[] gravelRow = {Block.GRAVEL, Block.GRAVEL, Block.GRAVEL, Block.GRAVEL, Block.GRAVEL, Block.GRAVEL};

		Block[] groundRow = {Block.GRAVEL, Block.COBBLESTONE, Block.COBBLESTONE,
					Block.COBBLESTONE, Block.COBBLESTONE, Block.GRAVEL};

		Block[] groundShaftRow = {Block.GRAVEL, Block.COBBLESTONE, Block.WATER,
					Block.WATER, Block.COBBLESTONE, Block.GRAVEL};

		Block[] rimShaftRow = {null, Block.COBBLESTONE, Block.AIR, Block.AIR, Block.COBBLESTONE, null};

		Block[] airRow = {null, Block.AIR, Block.AIR, Block.AIR, Block.AIR, null};
		Block[] postRow = {null, Block.FENCE, Block.AIR, Block.AIR, Block.FENCE, null};
		

		Block[][] baseLayer  = {nullRow,
					baseRow,
					baseRow,
					baseRow,
					baseRow,
					nullRow};

		Block[][] shaftLayer = {nullRow,
					baseRow,
					shaftRow,
					shaftRow,
					baseRow,
					nullRow};

		Block[][] groundLayer = {gravelRow,
					groundRow,
					groundShaftRow,
					groundShaftRow,
					groundRow,
					gravelRow};

		Block[][] rimLayer   = {nullRow,
					baseRow,
					rimShaftRow,
					rimShaftRow,
					baseRow,
					nullRow};

		Block[][] postLayer  = {nullRow,
					postRow,
					airRow,
					airRow,
					postRow,
					nullRow};
		
		Block[][][] wellBlueprint    = {baseLayer,
						shaftLayer,
						shaftLayer,
						shaftLayer,
						shaftLayer,
						shaftLayer,
						shaftLayer,
						shaftLayer,
						shaftLayer,
						shaftLayer,
						shaftLayer,
						groundLayer,
						rimLayer,
						postLayer,
						postLayer,
						baseLayer};
		return wellBlueprint;
	}

}