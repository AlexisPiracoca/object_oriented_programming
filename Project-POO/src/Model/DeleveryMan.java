/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author Jhon Alexis Piracoca Arcos
 */
public class DeleveryMan extends Employees implements Taxes {
    
    //Attributes
    private String zone;
    
    //Constructors
    public DeleveryMan() {
    }

    public DeleveryMan(String zone) {
        this.zone = zone;
    }
    
    //Setters and Getters
    public String getZone() {
        return zone;
    }

    public void setZone(String zone) {
        this.zone = zone;
    }

    @Override
    public String toString() {
        return "zone: " + zone + ", (" + super.toString() + ")" + ", salary: " + getSalary();
    }
    
    @Override
    public double getSalary(){
        return getSalary();
    }

    @Override
    public double getTax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
