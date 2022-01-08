package com.astroquant;

public class MyAsteroid {
    private String asteroidName;
    private String resourcesOnAsteroid;
    private double emoid;


    public String getResourcesOnAsteroid() {
        return resourcesOnAsteroid;
    }

    public void setResourcesOnAsteroid(String resourcesOnAsteroid) {
        this.resourcesOnAsteroid = resourcesOnAsteroid;
    }

    public double getEmoid() {
        return emoid;
    }

    public void setEmoid(double emoid) {
        this.emoid = emoid;
    }

    public String getAsteroidName() {
        return asteroidName;
    }

    public void setAsteroidName(String asteroidName) {
        this.asteroidName = asteroidName;
    }

    public int getValueOnAsteroid() {
        return valueOnAsteroid;
    }

    public void setValueOnAsteroid(int valueOnAsteroid) {
        this.valueOnAsteroid = valueOnAsteroid;
    }

    public int getCostToRetrieveFromAsteroid() {
        return costToRetrieveFromAsteroid;
    }

    public void setCostToRetrieveFromAsteroid(int costToRetrieveFromAsteroid) {
        this.costToRetrieveFromAsteroid = costToRetrieveFromAsteroid;
    }

    private int valueOnAsteroid;
    private int costToRetrieveFromAsteroid;
    public MyAsteroid(String name, String resources, double EMOID_inAU, int value_in$Bs, int cost_to_retrieve_in$Bs)
    {
        resourcesOnAsteroid = resources;
        emoid = EMOID_inAU;
        asteroidName = name;
        valueOnAsteroid = value_in$Bs;
        costToRetrieveFromAsteroid = cost_to_retrieve_in$Bs;
    }
    public void print()
    {
        System.out.println("The resources available on " + asteroidName + "is: " + resourcesOnAsteroid) ;
        System.out.println("The distance of the satellite from " + asteroidName + "is: " + emoid + " meters." + "The value of asteroid " + asteroidName + " is " + valueOnAsteroid + ", and the cost to retrieve materials from " + asteroidName + "is " + costToRetrieveFromAsteroid);
    }

    public MyAsteroid(String initName, String initResources, double initDistance)
    {
        resourcesOnAsteroid = initResources;
        emoid = initDistance;
        asteroidName = initName;
        valueOnAsteroid = 0;
        costToRetrieveFromAsteroid = 0;
    }


}
