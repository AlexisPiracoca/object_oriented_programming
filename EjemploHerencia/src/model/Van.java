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
public class Van extends Vehicle implements Taxes{
    //Attributes
    private boolean hasDoubleTrasnmission;

    //Constructors
    public Van() {
        super();
    }

    public Van(boolean hasDoubleTrasnmission, int id, String licensePlate, String brand, Owner owner, int model, double price) {
        super(id, licensePlate, brand, owner, model, price);
        this.hasDoubleTrasnmission = hasDoubleTrasnmission;
    }
    
    //Setters & Getters
    public boolean isHasDoubleTrasnmission() {
        return hasDoubleTrasnmission;
    }

    public void setHasDoubleTrasnmission(boolean hasDoubleTrasnmission) {
        this.hasDoubleTrasnmission = hasDoubleTrasnmission;
    }

    @Override
    public String toString() {
        return "hasDoubleTransmission: " + hasDoubleTrasnmission + ", (" + super.toString() + ")" + ", impuesto: " + getTax()+ ", soat: " + getSoat(); 
    }

    @Override
    public double getTax() {
        return price * (4.5 / 100);   
    }

    @Override
    public double getSoat() {
        return getTax() * (7 / 100);   
    }
    
   
    
}
