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

import java.lang.Math;

import pi.Minecraft;
import pi.Block;

	/*
	 * Under Construction
	 */


public class Building {

    /*
     * A Building object is used to store an arrangement of pi.Block objects to be "printed" into an open
     * Minecraft: Pi Edition world.
     *
     * Disclaimer: This package is not tested for consistency with the RaspberryJuice plugin for Minecraft
     * Bukkit servers.
     *
     * -----
     *
     * Fields:
     *
     * A blueprint's nested arrays correspond to the coordinate system such that blueprint[y][z][x]
     * 
     * height corresponds to the y coordinate:
     *     Positive indicates distance up; negative indicates distance down.
     * 
     * depth corresponds to the z coordinate:
     *     Positive indicates distance south; negative indicates distance north.
     * 
     * width corresponds to the x coordinate:
     *     Positive indicates distance east; negative indicates distance west.
     *
     */  
    protected Block[][][] blueprint;
    protected int height;
    protected int width;
    protected int depth;

    protected Building(int height, int depth, int width) {
        /*
	 * This constructor returns an empty building object
         *
         * Disclaimer: untested work-in-progress
	 */

	// Checks to ensure arguments are positive intigers

	if ((height == 0) || (depth == 0) || (width == 0)) {
	    throw new IllegalArgumentException("Dimensions cannot equal 0.");
	} else {
	    if (height < 0) {
		height = (height * -1);
	    }
	    if (depth < 0) {
		depth = (depth *-1);
	    }
	    if (width < 0) {
		width = (width * -1);
	    }
	}

        this.height = height;
        this.width = width;
        this.depth = depth;
        this.blueprint = new Block[height][depth][width];
    }
        

    public Building(Block[][][] blueprint, int width) {
        // This constructor returns a complete building object, ready for printing
        // TODO: implement argument validation to confirm width is less than the length of the innermost array
	// TODO: implement argument validation to confirm all arrays of a given level are the same length

        this.blueprint = blueprint; 
        this.height = blueprint.length;
        this.depth = blueprint[0].length;
        this.width = width;
        

    }

    public int getHeight() {
        return this.height;
    }
    public int getWidth()    {
        return this.width;
    }

    public int getDepth() {
        return this.depth;
    }

    public Block[][][] getBlueprint() {
        return this.blueprint;
    }

    public void setBlock(int x, int y, int z, Block block) {
	this.blueprint[y][z][x] = block;
    }

    public Block getBlock(int x, int y, int z) {
	return this.blueprint[y][z][x];
    }


    public void build(int x, int y, int z) {
       /*
        * Throws IllegalArgumentException
        */

        
        // Block[][][] blueprint = this.getBlueprint();
        int height = this.getHeight();
        int width = this.getWidth();
        int depth = this.getDepth();


        Minecraft mc = Minecraft.connect();

        for (int layer = 0; layer < height; layer++) {
            // layer corresponds with the y axis
            int tempY = y + layer;
            for (int row = 0; row < depth; row++) {
                // row corresponds with the z axis
                int tempZ = z + row;
                for (int column = 0; column < width; column++) {
                    // column corresponds with the x axis
                    int tempX = x + column;
                    // System.out.println("Coordinates = " + "x:" + column + ", y:" + layer + ", z:" + row);
                    Block block = this.getBlock(column, layer, row); //blueprint[layer][row][column];
                    
		    if (block != null) {
			mc.setBlock(tempX, tempY, tempZ, block);
		    } else {
			System.out.println("Block is null. No action taken");
		    }
                
                }

            }
        }
    }

}
