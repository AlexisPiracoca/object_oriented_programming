/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Vehicle;

/**
 *
 * @author andresforero
 */
public class ComposeTests {
    public static void main(String[] args) {
        Vehicle auto1 = new Vehicle(1, "Chevrolet corsa", "Chevrolet", 2000, "Andrés", 1, "Michelin", 1, "1800CC", 1, "Bidrio templado");
        Vehicle auto2 = new Vehicle(2, "Toyota corolla", "Toyota", 2015, "Andrés", 2, "Goodyear", 2, "2000CC", 1, "Vidrio teplado");
        Vehicle auto3 = new Vehicle(3, "Audi A5", "Audi", 2019, "Andrés", 1, "Michelyn", 2, "2600CC", 1, "Vidrio templado");
        
        System.out.println(auto1.toString());
        System.out.println("");
        System.out.println(auto2.toString());
        System.out.println("");
        System.out.println(auto3.toString());
    }
}
