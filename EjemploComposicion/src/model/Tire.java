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
public class Tire {
    //Attributos
    private int tireId;
    private String tireName;
    
    //Constructor
    public Tire(int tireId, String tireName) {
        this.tireId = tireId;
        this.tireName = tireName;
    }

    @Override
    public String toString() {
        return "(" + tireId + ", " + tireName + ')';
    }
    
    
    
}
