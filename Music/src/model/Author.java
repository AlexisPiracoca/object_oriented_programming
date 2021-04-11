/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author ITEDRIS
 */
public class Author {
    //Attributes
    private int id;
    private String name;
    
    //Constructors
    public Author() {}
    
    public Author(int id, String name){
        this.id = id;
        this.name = name;
    }
    
    //Getters and Setters
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
    
}
