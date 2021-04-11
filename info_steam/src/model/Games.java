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
public class Games {
    
    //Attributes
    private int id;
    private String nombre;
    private String desarrollador;
    private String genero;
    private int precio;
       
    //Constructors
    public Games() {
    }

    public Games(int id, String nombre, String desarrollador, String genero, int precio) {
        this.id = id;
        this.nombre = nombre;
        this.desarrollador = desarrollador;
        this.genero = genero;
        this.precio = precio;
        }

   //Setter and Getters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDesarrollador() {
        return desarrollador;
    }

    public void setDesarrollador(String desarrollador) {
        this.desarrollador = desarrollador;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }
        
     @Override
    public String toString(){
        return "Id: " +id+ "Nombre: " + nombre  + "Desarrollador: " + desarrollador + "Genero: " + genero + "Precio: " + precio;
    }    

       
}
