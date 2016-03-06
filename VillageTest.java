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

import com.nocturnalcoding.mcpi_building.VillageBuilding;

	/*
	 * Under Construction
	 */

public class VillageTest {

	public static void main(String[] args) {
		System.out.println("Main function");
		
		String[] arguments = args;
		
		VillagePlan plan;
		int x;
		int y;
		int z;
		
		/*if (arguments.length < 4) {
			System.out.println("Improper argument number");
			
		} */
		
		String planArg = arguments[0];
		planArg = planArg.toLowerCase();
		switch (planArg) {
		    case "church":
		    	plan = VillagePlan.CHURCH;
		    	break;
		    case "lamp_post":
		    	plan = VillagePlan.LAMP_POST;
		    	break;
		    case "road":
		    	plan = VillagePlan.ROAD;
		    	break;
		    case "small_farm":
		    	plan = VillagePlan.SMALL_FARM;
		    	break;
		    case "small_house":
		    	plan = VillagePlan.SMALL_HOUSE;
		    	break;
		    case "well":
		    	plan = VillagePlan.WELL;
		    	break;
		}
		x = (int) arguments[1];
		y = (int) arguments[2];
		z = (int) arguments[3];
		
		VillageBuilding building = new VillageBuilding(plan);
		
		building.build(Direction.NORTH, x, y, z);
		
		
		/*
		VillageBuilding lamp = new VillageBuilding(VillagePlan.LAMP_POST);
		System.out.println("Height = " + lamp.getHeight());
		System.out.println("Width = " + lamp.getWidth());
		lamp.build(Direction.NORTH, 0, 0, 0);
		
		VillageBuilding church = new VillageBuilding(VillagePlan.CHURCH);
		System.out.println("Height = " + church.getHeight());
		System.out.println("Width = " + church.getWidth());
		church.build(Direction.NORTH, 30, 15, 0);
		
		VillageBuilding road = new VillageBuilding(VillagePlan.ROAD);
		System.out.println("Height = " + road.getHeight());
		System.out.println("Width = " + road.getWidth());
		road.build(Direction.NORTH, 0, 15, 20);

		VillageBuilding farm = new VillageBuilding(VillagePlan.SMALL_FARM);
		System.out.println("Height = " + farm.getHeight());
		System.out.println("Width = " + farm.getWidth());
		farm.build(Direction.NORTH, 10, 15, 0);
		
		VillageBuilding house = new VillageBuilding(VillagePlan.SMALL_HOUSE);
		System.out.println("Height = " + house.getHeight());
		System.out.println("Width = " + house.getWidth());
		house.build(Direction.NORTH, 10, 15, 0);

		VillageBuilding well = new VillageBuilding(VillagePlan.WELL);
		System.out.println("Height = " + well.getHeight());
		System.out.println("Width = " + well.getWidth());
		well.build(Direction.NORTH, 0, -11, 10);
		*/
	}
}