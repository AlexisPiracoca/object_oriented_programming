/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Tests;

import Controller.CommercialController;
import Controller.EmployeesController;
import java.util.Arrays;
/**
 *
 * @author Jhon Alexis
 */
public class ControllerTest {   
    public static void main(String[] args) {
    
        //Employees tests
        System.out.println("\n EMPLOYEE:");
        EmployeesController ec = new EmployeesController();
        
        //Insertando el dato
        ec.save("Jhon", 123134, 23, "M", "31254466", 500000.0);
        System.out.println(Arrays.toString(ec.list()));
        
        //Actualizando el dato
        ec.update("Alexis", 7893134, 25, "M", "12", 770000.0);
        System.out.println(Arrays.toString(ec.list()));
        
        //Eliminando el dato
        ec.delete(1);
        System.out.println(Arrays.toString(ec.list()));

    }   
}

