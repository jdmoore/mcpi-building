package com.nocturnalcoding.mcpi_building;

import pi.Block;

public enum Direction {
	NORTH, SOUTH, EAST, WEST;
	
	protected Block orient(Block block) {
		int directionData;
		Block newBlock;
		
		// Stairs
		if ((block == COBBLESTONE_STAIRS)|| (block == WOOD_STAIRS)) {
			switch (this) {
				case NORTH:
					directionData = 3;
					break;
				case SOUTH:
					directionData = 2;
					break;
				case EAST:
					directionData = 0;
					break;
				case WEST:
					directionData = 1;
					break;
			}
		} else {
			// Ladders, et cetera
			if ((block == LADDER)|| (block == CHEST) || 
					(block == FURNACE) || (block == FENCE_GATE)) {
				switch (this) {
					case NORTH:
						directionData = 2;
						break;
					case SOUTH:
						directionData = 3;
						break;
					case EAST:
						directionData = 5;
						break;
					case WEST:
						directionData = 4;
						break;
				}
			}
		} else {
			// Doors
			if ((block == DOOR_WOOD)|| (block == DOOR_IRON)) {
				switch (this) {
					case NORTH:
						directionData = 1;
						break;
					case SOUTH:
						directionData = 3;
						break;
					case EAST:
						directionData = 2;
						break;
					case WEST:
						directionData = 0;
						break;
				}
			}
		}
		
		newBlock = block.withData(directionData);
		
		return newblock;
	}
}
