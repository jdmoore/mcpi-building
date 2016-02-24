package com.nocturnalcoding.mcpi_building;

import pi.Block;
import com.nocturnalcoding.mcpi_building.Building;
import com.nocturnalcoding.mcpi_building.VillagePlan;

	/*
	 * Under Construction
	 */

public class VillageBuilding extends Building {
	

	VillageBuilding(VillagePlan plan) {
		super(plan.getBlueprint(), plan.getWidth());
		System.out.println("Constructor: " + plan.toString());
	}	
}
