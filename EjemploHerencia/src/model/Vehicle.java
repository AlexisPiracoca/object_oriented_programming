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
public class Vehicle {
    //Attributes
    int id;
    private String licensePlate;
    private String brand;
    private Owner owner;
    protected double price;
    private int model;
    
    //Constructors
    public Vehicle() {}

    public Vehicle(int id, String licensePlate, String brand, Owner owner, int model, double price) {
        this.id = id;
        this.licensePlate = licensePlate;
        this.brand = brand;
        this.owner = owner;
        this.model = model;
        this.price = price;
    }
    
    //Setter & Getters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "id: " + id + ", licensePlate: " + licensePlate + ", brand: " + brand + ", owner: (" + owner + "), model: " + model + ", usedYears: " + getUsedYears();
    }
    
    //Own methods
    public int getUsedYears(){
        //TODO: method's logic
        return 2020 - model;
    }

    @Override
    public int hashCode() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Vehicle other = (Vehicle) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
}
