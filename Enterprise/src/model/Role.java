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
public class Role {
    //Attributes
    private int id;
    private String name;
    private String roleDescription;
    private Double salary;
    private Department department;
    
    //Constructors
    public Role() {}

    public Role(int id, String name, String roleDescription, Double salary, Department department) {
        this.id = id;
        this.name = name;
        this.roleDescription = roleDescription;
        this.salary = salary;
        this.department = department;
    }
    
    //Setters and getters
    public void setId(int id){
        this.id = id;
    }
    
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getRoleDescription(){
        return this.roleDescription;
    }
    
    public void setRoleDescription(String roleDescription){
        this.roleDescription = roleDescription;
    }
    
    public Double getSalary(){
        return this.salary;
    }
    
    public void setSlary(Double salary){
        this.salary = salary;
    }
    
    public Department getDepartment(){
        return this.department;
    }
    
    public void setDepartment(Department department){
        this.department = department;
    }

    @Override
    public String toString() {
        return "Role{" + "id=" + id + ", name=" + name + ", roleDescription=" + roleDescription + ", salary=" + salary + '}';
    }
    
    
}
