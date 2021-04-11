/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.Arrays;
import model.Owner;

/**
 *
 * @author andresforero
 */
public class OwnerController extends AbstractFacade<Owner>{
    
//Constructors
    public OwnerController() {
        data = new Owner[10];
    }
    
    //Own methods
    public boolean save(int id, String name, String nit){
        try{
            if(findOne(id) == null ){
                Owner newOwner = new Owner(id, name, nit);
                data[id] = newOwner;
            
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
    
    public boolean update(int id, String name, String nit){
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
            data[id].setName(name);
            data[id].setNit(nit);
            
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
