/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import model.Car;
import model.Owner;

/**
 *
 * @author andresforero
 */
public class CarController extends AbstractFacade<Car>{
    
    public CarController() {
        data = new Car[20];
    }
    
    //Own methods
    public boolean save(String color, int id, String licensePlate, String brand, int model, double price, Owner owner){
        try{
            if(findOne(id) == null ){
                Car newCar = new Car(color, id, licensePlate, brand, owner, model, price);
                data[id] = newCar;
            
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
    
    public boolean update(String color, int id, String licensePlate, String brand, int model, double price){
        try {
            if(findOne(id) == null){
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");
                
                return false;
            }
            
            //Another option
            /*Owner currentOwner = findOne(id);
            currentOwner.setName(name);
            currentOwner.setNit(nit);
            owners[id] = currentOwner;*/
            
            //Optimal option 
            data[id].setColor(color);
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
