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
public class Commercial extends Employees implements Taxes{
    
    //Attributes 
    private double commission;
    
    //Constructors
    public Commercial() {
    }

    public Commercial(boolean hasdoublecommission, String name, int cc, int age, String sex, String telephone, int salary) {
        super(name, cc, age, sex, telephone, salary);
        this.commission = commission;
    }
    
    //Setters and Getters
    public double getCommission() {
        return commission;
    }

    public void setCommission(double commission) {
        this.commission = commission;
    }

    @Override
    public String toString() {
        return "hasdoublecommission: " + commission + ", (" + super.toString() + ")" + ", salary: " + getSalary();  
    }

    @Override
    public double getSalary() {
        return getSalary() * (5 / 100);
    }

    @Override
    public double getTax() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setsalary(double salary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void settelephone(String telephone) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setsex(String sex) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setage(int age) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void setname(String name) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public void hasDoublecommission(boolean hasdoublecommission) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
