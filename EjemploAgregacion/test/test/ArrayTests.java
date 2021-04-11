/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import model.Contact;
import model.ContactLibrary;

/**
 *
 * @author andresforero
 */
public class ArrayTests {
    public static void main(String[] args) {
        //Contactos
        Contact contacto1 = new Contact(1, "Andrés", "432", "Calle falsa 123", "Tunja", "a@a.com");
        Contact contacto2 = new Contact(2, "Carlos", "432", "Calle falsa 123", "Tunja", "a@a.com");
        Contact contacto3 = new Contact(3, "Camila", "432", "Calle falsa 123", "Tunja", "a@a.com");
        Contact contacto4 = new Contact(4, "Carla", "432", "Calle falsa 123", "Tunja", "a@a.com");
        Contact contacto5 = new Contact(5, "Luis", "432", "Calle falsa 123", "Tunja", "a@a.com");
        Contact contacto6 = new Contact(6, "Ednilson", "432", "Calle falsa 123", "Tunja", "a@a.com");
        
        //Libretas de contacto
        ContactLibrary libreta1 = new ContactLibrary(1, "Amigos");
        Contact[] contactosLibreta1 = {contacto1, contacto3, contacto5};
        libreta1.setContacts(contactosLibreta1);
        
        ContactLibrary libreta2 = new ContactLibrary(2, "Compañeros de trabajo");
        Contact[] contactosLibreta2 = {contacto1, contacto2, contacto3, contacto4, contacto5, contacto6};
        libreta2.setContacts(contactosLibreta2);
        
        ContactLibrary libreta3 = new ContactLibrary(3, "Familia");
        
        //Tests
        System.out.println(libreta3.toString());
    }
}
