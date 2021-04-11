/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import controller.CarController;
import controller.OwnerController;
import controller.VanController;
import java.util.Arrays;

/**
 *
 * @author andresforero
 */
public class ControllerDataTests {
    public static void main(String[] args) {
        //Owner tests
        System.out.println("OWNER:");
        OwnerController oc = new OwnerController();
        
        //Insertando el dato
        oc.save(0, "Andrés Forero", "1122");
        System.out.println(Arrays.toString(oc.list()));
        
        //Actualizando el dato
        oc.update(0, "Andrés Fernando", "2211");
        System.out.println(Arrays.toString(oc.list()));
        
        //Eliminando el dato
        oc.delete(0);
        System.out.println(Arrays.toString(oc.list()));
        
        /*if(oc.save(1, "Andrés Forero")){
            //System.out.println("Bien, funcionó :)");
            oc.list();
        
        }else
            System.out.println("Mal, no funcionó :(");*/
        
        //System.out.println("BUSCAR por ID: " + oc.findOne(0));
        
        //Car tests
        System.out.println("\n CAR:");
        CarController cc = new CarController();
        
        //Insertando el dato
        cc.save("Rojo", 1, "XGR", "Chevrolet", 2000, 500000.0, null);
        System.out.println(Arrays.toString(cc.list()));
        
        //Actualizando el dato
        cc.update("Verde", 1, "XGR", "Mercedez Benz", 2020, 500000.0);
        System.out.println(Arrays.toString(cc.list()));
        
        //Eliminando el dato
        cc.delete(1);
        System.out.println(Arrays.toString(cc.list()));
        
        //Van tests
        System.out.println("\n VAN:");
        VanController vc = new VanController();
        
        //Insertando el dato
        vc.save(true, 1, "XGR", "Chevrolet", 2000, 500000.0);
        System.out.println(Arrays.toString(vc.list()));
        
        //Actualizando el dato
        vc.update(false, 1, "XGR", "Mercedez Benz", 2020, 500000.0);
        System.out.println(Arrays.toString(vc.list()));
        
        //Eliminando el dato
        vc.delete(1);
        System.out.println(Arrays.toString(vc.list()));
    }
}
