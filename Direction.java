    /* Copyright (C) 2016 Joshua Moore
     *

     * Licensed under the Apache License, Version 2.0 (the "License");
     * you may not use this file except in compliance with the License.
     * You may obtain a copy of the License at
     * 
     *     http://www.apache.org/licenses/LICENSE-2.0

     * Unless required by applicable law or agreed to in writing, software
     * distributed under the License is distributed on an "AS IS" BASIS,
     * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
     * See the License for the specific language governing permissions and
     * limitations under the License.
     */

package com.nocturnalcoding.mcpi_building;

import pi.Block;

public enum Direction {
	NORTH, SOUTH, EAST, WEST;
	
	protected Block orient(Block block) {
		int directionData = -1;
		Block newBlock = block;
		
		// Stairs
		if ((block == Block.STAIRS_COBBLESTONE)|| (block == Block.STAIRS_WOOD)) {
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
			if ((block == Block.LADDER)|| (block == Block.CHEST) || 
					(block == Block.FURNACE_ACTIVE) || 
					(block == Block.FURNACE_INACTIVE) ||
					(block == Block.FENCE_GATE)) {
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
			} else {
				// Doors
				if ((block == Block.DOOR_WOOD)|| (block == Block.DOOR_IRON)) {
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
		}
		
		if (directionData == -1) {
			System.out.println("Unable to Orient");
			return block;
		}
		
		newBlock = block.withData(directionData);
		
		return newBlock;
	}
}
