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

	BLACKSMITH, BUTCHER_SHOP, CHURCH, LAMP_POST, LARGE_HOUSE, 
	LIBRARY, ROAD, SMALL_FARM, SMALL_HOUSE, WELL;

	public Block[][][] getBlueprint() {
		// TODO: Test
		// TODO: implement BLACKSMITH, BUTCHER_SHOP, LARGE_HOUSE, LIBRARY

		Block[][][] blueprint;
		switch (this) {
			/*
			case BLACKSMITH:
				System.out.println("Blacksmith Blueprint");

				blueprint = this.blacksmith();
				return blueprint;
				
			case BUTCHER_SHOP:
				System.out.println("Butcher Shop Blueprint");

				blueprint = this.butcherShop();
				return blueprint;
			*/	
			case CHURCH:
				System.out.println("Church Blueprint");

				blueprint = this.church();
				return blueprint;
			
			case LAMP_POST:
				// TODO: Test
				System.out.println("Lamp Post Blueprint");
				
				blueprint = this.lampPost();
				return blueprint;
			/*	
			case LARGE_HOUSE:
				System.out.println("Large House Blueprint");
				
				blueprint = this.largeHouse();
				return blueprint;
				
			case LIBRARY:
				System.out.println("Library Blueprint");
				
				blueprint = this.library();
				return blueprint;
			*/	
			case ROAD:
				//TODO: test
				System.out.println("Road Blueprint");
				
				blueprint = this.road();
				return blueprint;
			
			case SMALL_FARM:
				//TODO: Test
				System.out.println("Small Farm Blueprint");
				
			
				blueprint = this.smallFarm();
				return blueprint;
				
			case SMALL_HOUSE:
				System.out.println("Small House Blueprint");

				blueprint = this.smallHouse();
				return blueprint;
				
			case WELL:
				System.out.println("Well Blueprint");

				blueprint = this.well();
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
				
			case ROAD:
				return 3;
			
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

	@Override
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
				
			case ROAD:
				return "ROAD";
				
			case SMALL_FARM:
				return "SMALL_FARM";
				
			case SMALL_HOUSE: 
				return "SMALL_HOUSE";
				
			default:
				return "Invalid type";
		}
	
	}
	
	private Block[][][] church() {
		//TODO: Test
		
		Block[] backWall = {null, Block.COBBLESTONE, Block.COBBLESTONE, Block.COBBLESTONE, null};
		
		Block[] cobblestoneRow = this.genBlockRow(Block.COBBLESTONE);
		Block[] nullRow = this.genNullRow();
		
		// Block.STAIRS_COBBLESTONE.withData(3) orients the stair towards the building (north)
		Block[] entryStairsRow = {null, null, Block.STAIRS_COBBLESTONE.withData(3), null, null};
		
		Block[] oneStairRow = {Block.COBBLESTONE, Block.COBBLESTONE, 
				Block.STAIRS_COBBLESTONE.withData(3), Block.COBBLESTONE, Block.COBBLESTONE};
		
		Block[] twoStairRow = {Block.COBBLESTONE, Block.STAIRS_COBBLESTONE.withData(3), 
			Block.AIR, Block.STAIRS_COBBLESTONE.withData(3), Block.COBBLESTONE};
			
		Block[] interiorRow = this.genInteriorRow(Block.COBBLESTONE);
		
		Block[] ladderRow = {Block.COBBLESTONE, Block.LADDER, Block.AIR, Block.AIR,
				Block.COBBLESTONE};
		
		Block[] ladderFloorRow = {Block.COBBLESTONE, Block.LADDER, Block.COBBLESTONE,
				Block.COBBLESTONE, Block.COBBLESTONE};
		
		Block[] windowsRow = this.genInteriorRow(Block.GLASS_PANE);
		Block[] singleWindowRow = {null, Block.COBBLESTONE, Block.GLASS_PANE, Block.COBBLESTONE,
				null};
		
		Block[] torchRow = {Block.COBBLESTONE, Block.AIR, Block.TORCH, Block.AIR,
				Block.COBBLESTONE};
		
		Block[] twoTorchRow = {Block.COBBLESTONE, Block.TORCH, Block.AIR, Block.TORCH,
				Block.COBBLESTONE};
		
		Block[] doorRow = {null, Block.COBBLESTONE, Block.DOOR_WOOD, Block.COBBLESTONE, null};
		Block[] doorwayRow = {null, Block.COBBLESTONE, null, Block.COBBLESTONE, null};
		
		Block[] singleBlockRow = {null, null, Block.COBBLESTONE, null, null};
		
		Block[][] firstLayer = {backWall,
								cobblestoneRow,
								cobblestoneRow,
								cobblestoneRow,
								cobblestoneRow,
								backWall,
								backWall,
								backWall,
								backWall,
								entryStairsRow};
		
		Block[][] secondLayer = {backWall,
								cobblestoneRow,
								oneStairRow,
								twoStairRow,
								interiorRow,
								ladderRow,
								interiorRow,
								interiorRow,
								doorRow,
								nullRow};
		
		Block[][] thirdLayer = {backWall,
								twoStairRow,
								interiorRow,
								interiorRow,
								interiorRow,
								ladderRow,
								windowsRow,
								interiorRow,
								doorwayRow,
								nullRow};
		
		Block[][] forthLayer = {singleWindowRow,
								interiorRow,
								windowsRow,
								interiorRow,
								interiorRow,
								ladderRow,
								windowsRow,
								interiorRow,
								backWall,
								nullRow};
		
		Block[][] fifthLayer = {backWall, 
								torchRow, 
								twoTorchRow, 
								torchRow, 
								cobblestoneRow,
								ladderFloorRow, 
								cobblestoneRow, 
								cobblestoneRow, 
								cobblestoneRow, 
								nullRow};
		
		Block[][] sixthLayer = {nullRow, 
								backWall, 
								backWall,
								backWall, 
								backWall,
								ladderRow,
								interiorRow,
								interiorRow,
								backWall,
								nullRow};
		
		Block[][] seventhEighthLayer = {nullRow, nullRow, nullRow, nullRow,
										singleWindowRow,
										ladderRow,
										windowsRow,
										interiorRow,
										singleWindowRow,
										nullRow};
		
		Block[][] ninthLayer = {nullRow, nullRow, nullRow, nullRow,
								backWall,
								ladderRow,
								interiorRow, interiorRow,
								backWall,
								nullRow};
		
		Block[][] tenthLayer = {nullRow, nullRow, nullRow, nullRow,
								cobblestoneRow,
								ladderRow,
								cobblestoneRow, cobblestoneRow, cobblestoneRow,
								nullRow};
		
		Block[][] eleventhLayer = {nullRow, nullRow, nullRow, nullRow,
									backWall,
									interiorRow, interiorRow, interiorRow,
									nullRow};
		
		Block[][] twelthLayer = {nullRow, nullRow, nullRow, nullRow,
								singleBlockRow,
								nullRow,
								interiorRow,
								nullRow,
								singleBlockRow,
								nullRow};
		
		Block[][][] churchBlueprint = {firstLayer,
										secondLayer,
										thirdLayer,
										forthLayer,
										fifthLayer,
										sixthLayer,
										seventhEighthLayer,
										ninthLayer,
										tenthLayer,
										eleventhLayer,
										twelthLayer};
		return churchBlueprint;
	}
	
	private Block[][][] lampPost() {
		Block[] nullRow   = {null, null, null};
		Block[] postRow  = {null, Block.FENCE, null};
		Block[] lampRow  = {Block.TORCH, Block.OBSIDIAN, Block.TORCH};
		Block[] torchRow = {null, Block.TORCH, null};
				
		Block[][] postLayer = {nullRow, postRow, nullRow};
		Block[][] lampLayer = {torchRow, lampRow, torchRow};
				
		Block[][][] lampBlueprint = {postLayer,	postLayer, postLayer, lampLayer};
				
		return lampBlueprint;
	}

	private Block[][][] road() {
		// returns blueprints for a 3x3 square of gravel road
		Block[] gravelRow = this.genBlockRow(Block.GRAVEL);
		
		Block[][] roadLayer = {gravelRow, gravelRow, gravelRow};
		
		Block[][][] roadBlueprint = {roadLayer};
		return roadBlueprint;
	}
	
	private Block[][][] smallFarm() {
		Block[] woodRow = this.genBlockRow(Block.WOOD);
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

	private Block[][][] smallHouse() {
		Block[] cobblestoneRow       = this.genBlockRow(Block.COBBLESTONE);

		// Block.STAIRS_COBBLESTONE.withData(3) orients the stair towards the building (north)
		Block[] stairsRow            = {null, null, Block.STAIRS_COBBLESTONE.withData(3), 
						null, null};

		Block[] woodWallRow          = {Block.COBBLESTONE, Block.WOOD_PLANKS, Block.WOOD_PLANKS, 
						Block.WOOD_PLANKS, Block.COBBLESTONE};

		Block[] ladderRow            = {Block.WOOD_PLANKS, Block.AIR, Block.AIR, 
						Block.LADDER.withData(3), Block.WOOD_PLANKS};

		Block[] interiorRow          = this.genInteriorRow(Block.WOOD_PLANKS);

		Block[] doorWallRow          = {Block.COBBLESTONE, Block.WOOD_PLANKS, Block.AIR, 
						Block.WOOD_PLANKS, Block.COBBLESTONE};

		Block[] nullRow               = this.genNullRow();

		Block[] oneWindowWallRow     = {Block.COBBLESTONE, Block.WOOD_PLANKS, Block.GLASS_PANE, 
						Block.WOOD_PLANKS, Block.COBBLESTONE};

		Block[] twoWindowWallRow     =  this.genInteriorRow(Block.GLASS_PANE);

		Block[] roofEdgeRow          = this.genBlockRow(Block.WOOD);

		Block[] roofLadderRow        = {Block.WOOD, Block.WOOD_PLANKS, Block.WOOD_PLANKS,
						Block.LADDER.withData(3), Block.WOOD};

		Block[] roofInteriorRow      = {Block.WOOD, Block.WOOD_PLANKS, Block.WOOD_PLANKS,
						Block.WOOD_PLANKS, Block.WOOD};

		Block[] roofEdgeFenceRow     = this.genBlockRow(Block.FENCE);

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

	private Block[][][] well() {
		Block[] nullRow = {null, null, null, null, null, null};

		Block[] baseRow = {null, Block.COBBLESTONE, Block.COBBLESTONE, Block.COBBLESTONE,
						Block.COBBLESTONE, null};

		Block[] shaftRow = {null, Block.COBBLESTONE, Block.WATER, Block.WATER,
						Block.COBBLESTONE, null};

		Block[] gravelRow = this.genBlockRow(Block.GRAVEL);

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

	private Block[] genBlockRow(Block block) {
		int width = this.getWidth();
		Block[] row = new Block[width];
		for (Block cell : row) {
			cell = block;
		}
		return row;
	}
	
	private Block[] genNullRow() {
		int width = this.getWidth();
		Block[] row = new Block[width];
		for (Block cell : row) {
			cell = null;
		}
		return row;
	}
	
	private Block[] genInteriorRow(Block wallBlock) {
		int width = this.getWidth();
		int lastCell = width - 1;
		Block[] row = new Block[width];
		for (Block cell : row) {
			cell = Block.AIR;
		}
		row[0] = wallBlock;
		row[lastCell] = wallBlock;
		
		return row;
	}
	
}