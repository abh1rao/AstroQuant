package com.astroquant;

public class SelectAsteroidRunner {

    public static void main(String[] args) {

        // 1.0 Accept inputs to the program
        int numAsteroids;       // number of asteroids
        int maxAvailableBudget; // maximum available budget to mine asteroids

        numAsteroids = 8;       // for SciFair restricting to 6 asteroids
                                // since assigning the knownAsteroids details is 'manual process'

        maxAvailableBudget = 345;

        // if (args.length != 0) {  // check if commandline parameters are given
        //      maxAvailableBudget = Integer.parseInt(args[0]);
        //      numAsteroids = Integer.parseInt(args[1]);
        // }

        SelectAsteroid pickAsteroid = new SelectAsteroid(numAsteroids, maxAvailableBudget);

        MyAsteroid[] knownAsteroids;
        knownAsteroids = new MyAsteroid[numAsteroids];
        knownAsteroids[0] = new MyAsteroid(" Ryugu","Nickel, Iron, Cobalt, Water, Hydrogen, Nitrogen, Ammonia", 1.19,  83, 52);
        knownAsteroids[1] = new MyAsteroid(" Doris","Nickel, Iron, Cobalt, Water, Hydrogen, Nitrogen, Ammonia", 3.11,  58, 54);
        knownAsteroids[2] = new MyAsteroid(" Thisbe","Iron, Hydrogen, Ammonia, Nitrogen", 2.8,  117, 108);
        knownAsteroids[3] = new MyAsteroid(" Nereus","Nickel, Iron, Cobalt", 1.489,  5, 3);
        knownAsteroids[4] = new MyAsteroid(" Didymos","Nickel, Iron, Cobalt", 1.644,  62, 46);
        knownAsteroids[5] = new MyAsteroid(" Vishnu","Platinum, Nickel-Iron", 1.06,  242, 219);
        knownAsteroids[6] = new MyAsteroid(" Aneas ","Water", 5.22,  342, 322);
        knownAsteroids[7] = new MyAsteroid(" Dubiago","Water", 3.41,  52, 48);


        pickAsteroid.setArrayOfAsteroids(knownAsteroids);
        pickAsteroid.printTheKnownAsteroids();


        //pickAsteroid.updateWithRandomValuesAndCost(maxAvailableBudget);
        // pickAsteroid.printTheKnownAsteroids();


        // 2.0 Now for the given budget select the most valuable Asteroid(s)
        pickAsteroid.prepareForSelection();
        pickAsteroid.calcOptionsAndSolutions();
        pickAsteroid.determineAsteroidsToSelect();


        // 3.0 Print the findings
        System.out.println("For a given budget of $" + maxAvailableBudget + " billion, the following asteroids are recommended for mining");
        pickAsteroid.printSelectedAsteroids();
        System.out.println(" total value of these asteroids is $" + pickAsteroid.getSelectedTotalValue() + " billion");
        System.out.println(" total cost spent on these asteroids is $" + pickAsteroid.getSelectedTotalCostSpend() + " billion");
    }
}
