/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author andresforero
 */
public class Car extends Vehicle implements Taxes{
    //Attributes
    private String color;
    
    //Constructors
    public Car() {
        super();
    }

    public Car(String color, int id, String licensePlate, String brand, Owner owner, int model, double price) {
        super(id, licensePlate, brand, owner, model, price);
        this.color = color;
    }
    
    //Setters & getters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Color: " + color + ", (" + super.toString() + ")" + ", impuesto: " + getTax()+ ", soat: " + getSoat(); 
    }

    @Override
    public double getTax() {
        return price * (3.5 / 100);   
    }

    @Override
    public double getSoat() {
        return getTax() * (5 / 100);   
    }
    
}
