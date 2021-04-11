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
public class Employees {
    
    //Attributes
    private int id;
    private String name;
    private int cc;
    private int age;
    private String sex;
    private String telephone;
    private double salary;
    
    //Constructors
    public Employees() {
    }

    public Employees(String name, int cc, int age, String sex, String telephone, double salary) {
        this.name = name;
        this.cc = cc;
        this.age = age;
        this.sex = sex;
        this.telephone = telephone;
        this.salary = salary;
    }

    public Employees(boolean hasdoublecommission, String name, int cc, int age, String sex, String telephone, int salary) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public Employees(int commission, String name, int cc, int age, String sex, String telephone, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public int getId() {
        return id;
    }

    //Setter and Getters
    public void setId(int id) {    
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    
     @Override
    public String toString(){
        return "Id: "+ id + "Name: " + name  + "CC: " + cc + "Age: " + age + "Sex: " + sex + "Telphone " + telephone + "Salary " + salary;
    }    

    public void setcc(int cc) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
