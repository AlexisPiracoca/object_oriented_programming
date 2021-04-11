/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import Controller.EmployeesController;
import Controller.CommercialController;
import Model.Employees;
import java.util.Arrays;
import util.constants;
import util.IOManager;

/**
 *
 * @author Jhon Alexis
 */
public class MainView {
     private static EmployeesController ec;
     private static CommercialController cc;
             
    public static void main(String[] args) {
        ec = new EmployeesController();
        cc = new CommercialController();
               
        int menuOption;
        
        do{
            menuOption = IOManager.showCustomMenu(constants.MAIN_MENU_TITLE, constants.MAIN_MENU_INFO);
            
            //Main menu
            switch(menuOption){
                case 0:
                    break;

                case 1:
                    menuOption = EmployeesModule();
                    break;
                               
                     case 2:
                    menuOption = CommercialModule();
                    break;
                    
                default:
                    break;
            }
            
        }while(menuOption != 0);
        
    }
    
    //Employees module
    private static int EmployeesModule(){
        int EmployeesOption;
        do{
            EmployeesOption = IOManager.showCustomMenu(constants.EMPLOYEES_MENU_TITLE, constants.EMPLOYEES_MENU_INFO);
            switch(EmployeesOption){
                case 1: 
                    ec.save(IOManager.getString("Ingresa el nombre"), 
                            IOManager.getInt("Ingresa el cedula"), 
                            IOManager.getInt("Ingresa la edad"),
                            IOManager.getString("Ingresa el sexo"),
                            IOManager.getString("Ingresa el telefono"),
                            IOManager.getInt("Ingresa el salario")
                            
                            );
                    break;
                
                case 2:
                    IOManager.showMessage(Arrays.toString(ec.list()));
            }
        }while(EmployeesOption != 0);
        
        return -1;
    } 
    
    // Employees Commercial
     private static int CommercialModule(){
        int CommercialOption;
        do{
            CommercialOption = IOManager.showCustomMenu(constants.COMMERCIAL_MENU_TITLE, constants.COMMERCIAL_MENU_INFO);
            switch(CommercialOption){
                case 1: 
                    cc.save(IOManager.getInt("Ingresa la comision"), 
                            IOManager.getString("Ingresa el nombre"), 
                            IOManager.getInt("Ingresa la cedula"),
                            IOManager.getInt("Ingresa la edad"),
                            IOManager.getString("Ingresa el sexo"),
                            IOManager.getString("Ingresa el telefono"),
                            IOManager.getInt("Ingresa el salario")
                           );
                    break;
                
                case 2:
                    IOManager.showMessage(Arrays.toString(cc.list()));
            }
        }while(CommercialOption != 0);
        
        return -1;
    } 
    
}
