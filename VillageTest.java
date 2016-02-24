package com.nocturnalcoding.mcpi_building;

import com.nocturnalcoding.mcpi_building.VillageBuilding;

	/*
	 * Under Construction
	 */

public class VillageTest {

	public static void main(String[] args) {
		System.out.println("Main function");
		VillageBuilding house = new VillageBuilding(VillagePlan.SMALL_HOUSE);
		System.out.println("Height = " + house.getHeight());
		System.out.println("Width = " + house.getWidth());
		house.build(0, 0, 0);

		VillageBuilding lamp = new VillageBuilding(VillagePlan.LAMP_POST);
		System.out.println("Height = " + house.getHeight());
		System.out.println("Width = " + house.getWidth());
		lamp.build(10, 0, 0);


	}
}