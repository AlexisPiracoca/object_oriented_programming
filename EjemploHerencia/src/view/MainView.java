/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import controller.CarController;
import controller.OwnerController;
import java.util.Arrays;
import model.Owner;
import util.Constants;
import util.IOManager;

/**
 *
 * @author andresforero
 */
public class MainView {
    private static OwnerController oc;
    private static CarController cc;
    
    public static void main(String[] args) {
        oc = new OwnerController();
        cc = new CarController();
        
        int menuOption;
        
        do{
            menuOption = IOManager.showCustomMenu(Constants.MAIN_MENU_TITLE, Constants.MAIN_MENU_INFO);
            
            //Main menu
            switch(menuOption){
                case 0:
                    break;

                case 1:
                    menuOption = ownerModule();
                    break;
                    
                case 2:
                    menuOption = carModule();
                    break;
                    
                default:
                    break;
            }
            
        }while(menuOption != 0);
        
    }
    
    //Owner module
    private static int ownerModule(){
        int ownerOption;
        do{
            ownerOption = IOManager.showCustomMenu(Constants.OWNER_MENU_TITLE, Constants.ONWER_MENU_INFO);
            switch(ownerOption){
                case 1: 
                    oc.save(IOManager.getInt("Ingresa el ID"), 
                            IOManager.getString("Ingresa el nombre"), 
                            IOManager.getString("Ingresa el NIT")
                    );
                    break;
                
                case 2:
                    IOManager.showMessage(Arrays.toString(oc.list()));
            }
        }while(ownerOption != 0);
        
        return -1;
    } 
    
    
    //Owner car
    private static int carModule(){
        int ownerOption;
        do{
            ownerOption = IOManager.showCustomMenu(Constants.CAR_MENU_TITLE, Constants.CAR_MENU_INFO);
            switch(ownerOption){
                case 1: 
                    cc.save(IOManager.getString("Indica el color"), 
                            IOManager.getInt("Indica el ID"), 
                            IOManager.getString("Especifica la placa"), 
                            IOManager.getString("Especifica la marca"), 
                            IOManager.getInt("Indica el modelo"), 
                            //No es óptimo
                            new Double(IOManager.getString("Indica el precio")), 
                            (Owner) IOManager.getObjectFromArray("Propietarios", "Selecciona alguno de los propietarios", oc.list())
                    );
                    break;
                
                case 2:
                    IOManager.showMessage(Arrays.toString(cc.list()));
            }
        }while(ownerOption != 0);
        
        return -1;
    } 
          
}
