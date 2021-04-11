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
public class Employee {
    //Attributes
    private int id;
    private String name; 
    private String phoneNumber; 
    private String address; 
    private Role role; 
    
    //Constructors
    public Employee(){}
    
    public Employee(int id, String name, String phoneNumber, String address, Role role){
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.role = role;
    }
    
    //Setters & Getters
    public int getId(){
        return this.id;
    }
    
    public void setId(int id){
        this.id = id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public Role getRole(){
        return this.role;
    }
    
    public void setRole(Role role){
        this.role = role;
    }
    
    //Own methods
    public int getAge(){
        //TODO: Perform method's logic
        return 0;
    }

    @Override
    public String toString() {
        return "Employee{" + "id=" + id + ", name=" + name + ", phoneNumber=" + phoneNumber + ", address=" + address + '}';
    }
    
    
    
}
