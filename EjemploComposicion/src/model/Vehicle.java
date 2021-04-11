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
    //Attributos
    private int id;
    private String name;
    private String brand;
    private int model;
    private String owner;
    
    //Composición
    private Tire tire;
    private Engine engine;
    private Glass glass;
    
    //Constructor
    public Vehicle(int id, String name, String brand, int model, String owner, int tireId, String tireName, int engineId, String engineName, int glassId, String glassName) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.model = model;
        this.owner = owner;
        this.tire = new Tire(tireId, tireName);
        this.engine = new Engine(engineId, engineName);
        this.glass = new Glass(glassId, glassName);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public Tire getTire() {
        return tire;
    }

    public void setTire(Tire tire) {
        this.tire = tire;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Glass getGlass() {
        return glass;
    }

    public void setGlass(Glass glass) {
        this.glass = glass;
    }

    @Override
    public String toString() {
        return "id: " + id + ", name: " + name + ", brand: " + brand + ", model: " + model + ", owner: " + owner + ", tire: " + tire + ", engine: " + engine + ", glass: " + glass;
    }
    
    
    
}
