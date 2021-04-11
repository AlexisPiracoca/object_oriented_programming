/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import controllers.StudentsController;
import java.util.Arrays;
/**
 *
 * @author Jhon Alexis
 */
public class ControllerTests {
     public static void main(String[] args) {
        //Students tests
        System.out.println("Student:");
        StudentsController sc = new StudentsController();
        
        //Insertando el dato
        sc.save(0, "234213", "Pepito", "Perez", "Derecho");
        System.out.println(Arrays.toString(sc.list()));
        
        //Actualizando el dato
        sc.update(0, "234213", "Pepito", "Perez", "Derecho");
        System.out.println(Arrays.toString(sc.list()));
        
        //Eliminando el dato
        sc.delete(0);
        System.out.println(Arrays.toString(sc.list()));
        
      }
}
