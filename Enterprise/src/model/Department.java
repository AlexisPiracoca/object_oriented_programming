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
public class Department {
    //Attributes
    private int id;
    private String name;
    private String departmentType;
    private Enterprise enterprise;
    
    //Constructors
    public Department() {}
    
    public Department(int id, String name, String departmentType, Enterprise enterprise) {
        this.id = id;
        this.name = name;
        this.departmentType = departmentType;
        this.enterprise = enterprise;
    }
    
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
    
    public String getDepartmentType(){
        return this.departmentType;
    }
    
    public void setDepartmentType(String departmentType){
        this.departmentType = departmentType;
    }
    
    public Enterprise getEnterprise(){
        return this.enterprise;
    }
    
    public void setEnterprise(Enterprise enterprise){
        this.enterprise = enterprise;
    }
    
    public String salaryPay(PayService payService, Double total){
        //TODO: Method's logic
        return "Total pagado: $" + total + ". Pagado con: " + payService.getName();
    }
    
}
