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
public class PayService {
    //Attributes
    private int id;
    private String name;
    private String payServiceType;

    public PayService() {}

    public PayService(int id, String name, String payServiceType) {
        this.id = id;
        this.name = name;
        this.payServiceType = payServiceType;
    }

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

    public String getPayServiceType() {
        return payServiceType;
    }

    public void setPayServiceType(String payServiceType) {
        this.payServiceType = payServiceType;
    }
    
    @Override
    public String toString(){
        return id + ", " + name + ", $" + payServiceType;
    }
    
}
