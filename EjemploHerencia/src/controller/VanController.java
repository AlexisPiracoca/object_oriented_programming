/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import model.Car;
import model.Van;

/**
 *
 * @author andresforero
 */
public class VanController extends AbstractFacade<Van>{

    public VanController() {
        data = new Van[20];
    }
    
    //Own methods
    public boolean save(boolean hasDoubleTrasnmission, int id, String licensePlate, String brand, int model, double price){
        try{
            if(findOne(id) == null ){
                data[id] = new Van(hasDoubleTrasnmission, id, licensePlate, brand, null, model, price);;
            
            }else
                System.err.println("La llave primaria (índice) especificada ya existe");
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el rol, porque se permiten máximo " + data.length + " propietarios");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }   
    }
    
    public boolean update(boolean hasDoubleTrasnmission, int id, String licensePlate, String brand, int model, double price){
        try {
            if(findOne(id) == null)    
                return false;
            
            
            //Optimal option 
            data[id].setHasDoubleTrasnmission(hasDoubleTrasnmission);
            data[id].setLicensePlate(licensePlate);
            data[id].setBrand(brand);
            data[id].setModel(model);
            data[id].setPrice(price);
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo actualizar el rol, porque se permiten máximo " + data.length + " propietarios");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }
}
