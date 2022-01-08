package com.astroquant;

/*
All asteroid data is legit and was taken from asterank.com
Source for all Asteroid data: asterank.com
*/
public class MainStarter {
    private String resources;
    private double distance; // unit is miles in millions
    private String name;
    private double value; // unit is dollars in billions
    private int cost_to_retrieve_materials; // unit is dollars in billions

    public MainStarter(String initResources, double initDistance, String initName, double initValue, int initCost_to_retrieve_materials) {
        resources = initResources;
        distance = initDistance;
        name = initName;
        value = initValue;
        cost_to_retrieve_materials = initCost_to_retrieve_materials;
    }

    public void print() {
        System.out.println("The resources available on " + name + "is: " + resources);
        System.out.println("The distance of the satellite from " + name + "is: " + distance + " meters." + "The value of asteroid " + name + " is " + value + ", and the cost to retrieve materials from " + name + "is " + cost_to_retrieve_materials);
    }
    public static void main(String args[]) {
        MainStarter asteroid_A = new MainStarter("Nickel, Iron, Cobalt, Water, Hydrogen, Nitrogen, Ammonia", 9.0, " Ryugu ", 82.76, 4500);
        asteroid_A.print();
        MainStarter asteroid_B = new MainStarter("Nickel, Iron, Cobalt", 2.4, " Nereus ", 4.71, 7000);
        asteroid_B.print();
        MainStarter asteroid_C = new MainStarter("Nickel, Iron, Cobalt", 6.8, " Didymos ", 62.25, 93000);
    }
}
