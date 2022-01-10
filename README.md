# AstroQuant

## Source code for the ScienceFair 2021-22

All of the files located in AstroQuant repository can be used to help further Asteroid Mining overall. 

Attributes such as name, value and materials located on certain asteroids are implemented into this code through several files. In the current source code they were picked from asterrank.com

## Listed below are source code used in this project.

The following two were early source code.

* KnapsackForAM.java - This is the base code that I used for the Main code in my Science Fair Project. This code was developed by instructors at Princeton University. I modified the code to make it suitable for Asteroid Mining and help me evaluate my hypothesis.

* MainStarter.java - This file limited relation to the MyAsteroid code, I created this code as a skeletal version of what the MyAsteroidRunner code should look like.

The following files were used to verify my hypothesis

My hypothessis: Optimization techniques such as Knapsack Problem can be used for Asteroid Mining

Conclusion:  The following code helped me cofirm that Application of Optimization techniques such as Knapsack problem can be used in a meaningful way to address the challenges fo Asteroid Mining.

* MyAsteroid.java - This is the first important body of code that I used to confirm my hypothesis that the Knapsack theory can further Asteroid Mining in space. This class 'MyAsteroid' stores information all about the Asteroid. 

* MyAsteroidRunner.java - This file is the runner / test for MyAsteroid. This section of code isn't used to assist me in my project. This file contains fake simple objects with only name, materals, and value.

* SelectAsteroid.java - This is the secodn important body of code that makes everything happen. Here we see the class SelectAsteroid which runs the Knapsack code. T

* SelectAsteroidRunner.java - This runner file contains all of the print statements, constructors, and key statements required to understand what wil most likely print when the code is exectued.  It builds an array of asteroids using actual data from asterrank.com.

## To Run the code

### Inputs:
(All in SelectAsteroidRunner.java)
* Number of Asteroids: 8
* Specify the maximum budget available: 345 (the unit is $Millions)
* Array is Constructed with 8 asteroids ( data from Asterrank.com)
* For each asteroid the estimated mineral value and cost to retireve them is given

### Output:
* Given the maximum budget - select the most profitable set of asteroids to mine
* Identify the total value of these  selected asteroids.
* Identify the toal spent on these asteroids (this is usually less than the max budget)


Please find attached two screenshots based on arXiv.org search results -
* the first one indicates that knapsack problem solving is NOT being used for asteroid mining
* the second one indicates that optimization techniques are also not yet being used to select asteroids for mining planning.

arXiv.org is an open access archive of 2 Million+ scholarly articles in the fields of science, physics and so on.




