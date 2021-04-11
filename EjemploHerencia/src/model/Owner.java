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
public class Owner {
    
    //Attributes
    private int id;
    private String nit;
    private String name;
    
    //Constructor
    public Owner() {}

    public Owner(int id, String name, String nit) {
        this.id = id;
        this.name = name;
        this.nit = nit;
    }
    
    //Setters & Getters
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

    public String getNit() {
        return nit;
    }

    public void setNit(String nit) {
        this.nit = nit;
    }

    @Override
    public String toString() {
        return "id: " + id + ", nit: " + nit + ", name: " + name + "\n";
    }
    
}
