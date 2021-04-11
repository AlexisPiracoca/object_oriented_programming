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
public class Truck extends Vehicle implements Taxes{
    //Attributes
    private double chargeAmount;
    
    //Constructors
    public Truck() {
        super();
    }

    public Truck(double chargeAmount, int id, String licensePlate, String brand, Owner owner, int model, double price) {
        super(id, licensePlate, brand, owner, model, price);
        this.chargeAmount = chargeAmount;
    }
    
    //Setters & Getters
    public double getChargeAmount() {
        return chargeAmount;
    }

    public void setChargeAmount(double chargeAmount) {
        this.chargeAmount = chargeAmount;
    }

    @Override
    public String toString() {
        return "chargeAmount: " + chargeAmount + ", (" + super.toString() + ")" + ", impuesto: " + getTax() + ", soat: " + getSoat(); 
    }

    @Override
    public double getTax() {
        return price * (5.5 / 100);   
    }

    @Override
    public double getSoat() {
        return getTax() * (10 / 100);   
    }
    
    
}
