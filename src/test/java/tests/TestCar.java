package tests;

import org.junit.Test;

import example.Car;

public class TestCar {

    @Test
    public void Test(){
        Car Nissan = new Car();
        Nissan.model = "Nissan";
        Nissan.year = 2000;
        Car.makeBeBe(Nissan.model, Nissan.year);
    }
    
    @Test
    public void TestOne(){
        Car Toyota = new Car();
        Toyota.model = "Toyota";
        Toyota.year = 2025;
        Car.makeBeBe(Toyota.model, Toyota.year);
    }

    @Test
    public void TestThree(){
        Car Porshe = new Car();
        Porshe.model = "Porshe";
        Porshe.year = 0;
        Car.makeBeBe(Porshe.model, Porshe.year);
    }

    


}
