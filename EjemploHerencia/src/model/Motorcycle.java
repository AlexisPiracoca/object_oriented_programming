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
public class Motorcycle extends Vehicle implements Taxes{
    
    //Attributes
    private double cc;
    
    //Constructors 
    public Motorcycle() {
        super();
    }

    public Motorcycle(double cc, int id, String licensePlate, String brand, Owner owner, int model, double price) {
        super(id, licensePlate, brand, owner, model, price);
        this.cc = cc;
    }
    
    //Setters & Getters
    public double getCc() {
        return cc;
    }

    public void setCc(double cc) {
        this.cc = cc;
    }
    
    @Override
    public String toString() {
        return "cc: " + cc + ", (" + super.toString() + ")" + ", impuesto: " + getTax() + ", soat: " + getSoat(); 
    }

    @Override
    public double getTax() {
        return price * (1.5 / 100);   
    }

    @Override
    public double getSoat() {
        return getTax() * (2 / 100);   
    }
    
}
