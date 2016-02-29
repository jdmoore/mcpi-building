package com.nocturnalcoding.mcpi_building;

import com.nocturnalcoding.mcpi_building.VillageBuilding;

	/*
	 * Under Construction
	 */

public class VillageTest {

	public static void main(String[] args) {
		System.out.println("Main function");
		
		VillageBuilding lamp = new VillageBuilding(VillagePlan.LAMP_POST);
		System.out.println("Height = " + lamp.getHeight());
		System.out.println("Width = " + lamp.getWidth());
		lamp.build(0, 0, 0);
		
		VillageBuilding church = new VillageBuilding(VillagePlan.CHURCH);
		System.out.println("Height = " + church.getHeight());
		System.out.println("Width = " + church.getWidth());
		church.build(30, 15, 0);
		
		VillageBuilding road = new VillageBuilding(VillagePlan.ROAD);
		System.out.println("Height = " + road.getHeight());
		System.out.println("Width = " + road.getWidth());
		road.build(0, 15, 20);

		VillageBuilding farm = new VillageBuilding(VillagePlan.SMALL_FARM);
		System.out.println("Height = " + farm.getHeight());
		System.out.println("Width = " + farm.getWidth());
		farm.build(10, 15, 0);
		
		VillageBuilding house = new VillageBuilding(VillagePlan.SMALL_HOUSE);
		System.out.println("Height = " + house.getHeight());
		System.out.println("Width = " + house.getWidth());
		house.build(10, 15, 0);

		VillageBuilding well = new VillageBuilding(VillagePlan.WELL);
		System.out.println("Height = " + well.getHeight());
		System.out.println("Width = " + well.getWidth());
		well.build(0, -11, 10);

	}
}