/* portions copyright */

package com.astroquant;

import java.util.Random;

public class SelectAsteroid {

    //////////////////////////
    /// Input data member ///
    ////////////////////////
    int numAsteroids;               // number of asteroids
    int maxAvailableBudget;         // maximum available budget to mine asteroids
    MyAsteroid[] arrayOfAsteroids;  // container holds the Asteroids of interest

    ///////////////////////////////
    /// transient data members ///
    /////////////////////////////
    int[] profit;
    int[] weight;
    int[][] opt;
    boolean[][] sol;

    ////////////////////////////
    /// output data members ///
    //////////////////////////
    boolean[] selectFlag;           // indicates if the corresponding asteroid has been selected
    int  totalValue = 0;            // Total value across all the selected asteroids


    //////////////////////////
    ///////  Methods /////////
    //////////////////////////


    public void setArrayOfAsteroids(MyAsteroid[] arrayOfAsteroids) {
        this.arrayOfAsteroids = arrayOfAsteroids;
    }


    public SelectAsteroid(int numAsteroids, int maxAvailableBudget) {
        this.numAsteroids = numAsteroids;
        this.maxAvailableBudget = maxAvailableBudget;

        profit = new int[numAsteroids+1];
        weight = new int[numAsteroids+1];

        arrayOfAsteroids = new MyAsteroid[numAsteroids];

     }


    public void printTheKnownAsteroids() {
        for (MyAsteroid asteroid : arrayOfAsteroids) {
            System.out.println(asteroid.getAsteroidName() + " " +
                            "valued at: $" + asteroid.getValueOnAsteroid() + " billion" +
                            " cost to retrieve: $" + asteroid.getCostToRetrieveFromAsteroid() + " billion" );
        }
    }


    public void calcOptionsAndSolutions() {

        // opt[n][w] = max profit of packing items 1..n with weight limit w
        // sol[n][w] = does opt solution to pack items 1..n with weight limit w include item n?
        opt = new int[numAsteroids+1][maxAvailableBudget+1];
        sol = new boolean[numAsteroids+1][maxAvailableBudget+1];

        for (int n = 1; n <= numAsteroids; n++) {
            for (int w = 1; w <= maxAvailableBudget; w++) {

                // don't take item n
                int option1 = opt[n-1][w];

                // take item n
                int option2 = Integer.MIN_VALUE;
                if (weight[n] <= w) option2 = profit[n] + opt[n-1][w-weight[n]];

                // select better of two options
                opt[n][w] = Math.max(option1, option2);
                sol[n][w] = (option2 > option1);
            }
        }
    }


    public void determineAsteroidsToSelect() {

        totalValue = 0;

        // determine which items to take
        selectFlag = new boolean[numAsteroids+1];
        for (int n = numAsteroids, w = maxAvailableBudget; n > 0; n--) {
            if (sol[n][w]) {
                selectFlag[n] = true;
                w = w - weight[n];
                totalValue += profit[n];
            }
            else {
                selectFlag[n] = false;
            }
        }
    }


    public void printSelectedAsteroids() {
        for (int i = 1; i <= numAsteroids; i++) {
            if (selectFlag[i] == true) {
                System.out.println(arrayOfAsteroids[i-1].getAsteroidName() + " " +
                        "valued at: $" + arrayOfAsteroids[i-1].getValueOnAsteroid() + " billion" +
                        " cost to retrieve: $" + arrayOfAsteroids[i-1].getCostToRetrieveFromAsteroid() + " billion" );

            }
        }
    }


    public void prepareForSelection() {
        int i = 1;
        for (MyAsteroid asteroid : arrayOfAsteroids) {
            profit[i] = asteroid.getValueOnAsteroid();
            weight[i] = asteroid.getCostToRetrieveFromAsteroid();
            i++;
        }
    }


    public void updateWithRandomValuesAndCost(int maxAvailableBudget) {
        // create instance of Random class
        Random rand = new Random();

        for (MyAsteroid asteroid : arrayOfAsteroids) {
            asteroid.setValueOnAsteroid(rand.nextInt(1200));
            asteroid.setCostToRetrieveFromAsteroid(rand.nextInt(maxAvailableBudget));
        }
    }


    public int getSelectedTotalValue() {
        return totalValue;
    }


    public int getSelectedTotalCostSpend() {
        int costSpend = 0;
        for (int i = 1; i <= numAsteroids; i++) {
            if (selectFlag[i]) {
                costSpend += arrayOfAsteroids[i-1].getCostToRetrieveFromAsteroid();
            }
        }
        return costSpend;
    }
}
