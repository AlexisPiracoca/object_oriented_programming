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
public class Glass {
    //Attributos
    private int glassId;
    private String glassName;

    public Glass(int glassId, String glassName) {
        this.glassId = glassId;
        this.glassName = glassName;
    }
    
    @Override
    public String toString() {
        return "(" + glassId + ", " + glassName + ')';
    }
}
