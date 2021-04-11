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
public class Engine {
    //Attributos
    private int engineId;
    private String engineName;

    public Engine(int engineId, String engineName) {
        this.engineId = engineId;
        this.engineName = engineName;
    }

    @Override
    public String toString() {
        return "(" + engineId + ", " + engineName + ')';
    }
}
