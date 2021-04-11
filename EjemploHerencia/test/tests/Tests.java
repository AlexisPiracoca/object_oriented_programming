/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import model.Car;
import model.Motorcycle;
import model.Owner;
import model.Taxes;
import model.Truck;
import model.Van;

/**
 *
 * @author andresforero
 */
public class Tests {
    public static void main(String[] args) {
        
        //Propietarios
        Owner prop1 = new Owner(1, "Carlos", "1");
        Owner prop2 = new Owner(2, "Andrés", "2");
        Owner prop3 = new Owner(3, "Martha", "4");
        
        //Automóviles
        Car auto1 = new Car("Verde", 1, "XGB-000", "Chevrolet", prop1, 2015, 200000.0);
        Car auto2 = new Car("Rojo", 2, "XGB-000", "Mazda", prop1, 2016, 500000.0);
        Car auto3 = new Car("Negro", 3, "XGB-000", "Mercedez Benz", prop2, 2019, 150000.0);
        
        System.out.println(auto1);
        System.out.println(auto2);
        System.out.println(auto3);
        
        //Camionetas
        Van van1 = new Van(true, 4, "BGX-000", "Jeep", prop3, 2015, 200000.0);
        Van van2 = new Van(false, 5, "BGX-000", "BMW", prop2, 2016, 120000.0);
        Van van3 = new Van(true, 6, "BGX-000", "Wolswaggen", prop1, 2010, 130000.0);
        
        System.out.println("\n" + van1);
        System.out.println(van2);
        System.out.println(van3);
        
        //Camiones
        Truck truck1 = new Truck(4500, 7, "GBX-000", "BMW", prop1, 2000, 200000.0);
        Truck truck2 = new Truck(5000, 8, "GBX-000", "Jeep", prop2, 1990, 125000.0);
        Truck truck3 = new Truck(2500, 9, "GBX-000", "BMW", prop3, 2020, 115000.0);
        
        System.out.println("\n" + truck1);
        System.out.println(truck2);
        System.out.println(truck3);
        
        //Camiones
        Motorcycle moto1 = new Motorcycle(4500, 7, "GBX-000", "BMW", prop1, 2000, 200000.0);
        Motorcycle moto2 = new Motorcycle(5000, 8, "GBX-000", "Jeep", prop2, 1990, 125000.0);
        Motorcycle moto3 = new Motorcycle(2500, 9, "GBX-000", "BMW", prop3, 2020, 115000.0);
        
        System.out.println("\n" + moto1);
        System.out.println(moto2);
        System.out.println(moto2);
        
    }
}
