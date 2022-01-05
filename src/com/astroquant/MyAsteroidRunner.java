package com.astroquant;

public class MyAsteroidRunner {

    public static void main(String args[])
    {
        MyAsteroid asteroid_A = new MyAsteroid(" Asteroid A ", "Zinc, Copper, Gold", 200.00);
        asteroid_A.print();
        MyAsteroid asteroid_B = new MyAsteroid(" Asteroid A ","Silver, Titanium, Lead", 90.50);
        asteroid_B.print();
        MyAsteroid asteroid_C = new MyAsteroid(" Asteroid A ", "Tin, Phosphorous, Uranium", 130.00);
        asteroid_C.print();

        MyAsteroid asteroid_D = new MyAsteroid(" Asteroid A ", "ZincD, Copper, Gold", 2100.00, 600500, 45000);
        asteroid_D.print();
        MyAsteroid asteroid_E = new MyAsteroid(" Asteroid E ","SilverE, Titanium, Lead", 960.50,  72800, 70000);
        asteroid_E.print();
        MyAsteroid asteroid_F = new MyAsteroid(" Asteroid F ","TinF, Phosphorous, Uranium", 13080.00,  400900, 930000);
        asteroid_F.print();
    }
}
