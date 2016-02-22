package com.nocturnalcoding.mcpi-building;

import com.nocturnalcoding.mcpi-building.VillageBuilding;

	/*
	 * Under Construction
	 */

public class VillageBuildingTest {

	public static void main(String[] args) {
		System.out.println("Main function");
		VillageBuilding house = new VillageBuilding(VillagePlan.SMALL_HOUSE);
		System.out.println("house object created. Class = " + house.getClass());
		System.out.println("Height = " + house.getHeight());
		System.out.println("Width = " + house.getWidth());
		house.build(0, 10, 0);


	}
}