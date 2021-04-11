/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;
import Controller.GamesController;
import java.util.Arrays;
import util.constants;
import util.IOManager;

/**
 *
 * @author Jhon Alexis
 */
public class MainView {
     private static GamesController gc;
                  
    public static void main(String[] args) {
        gc = new GamesController();
                      
        int menuOption;
        
        do{
            menuOption = IOManager.showCustomMenu(constants.MAIN_MENU_TITLE, constants.MAIN_MENU_INFO);
            
            //Main menu
            switch(menuOption){
                case 0:
                    break;

                case 1:
                    menuOption = GamesModule();
                    break;
                                               
                default:
                    break;
            }
            
        }while(menuOption != 0);
        
    }
    
    //Employees module
    private static int GamesModule(){
        int GamesOption;
        do{
            GamesOption = IOManager.showCustomMenu(constants.GAMES_MENU_TITLE, constants.GAMES_MENU_INFO);
            switch(GamesOption){
                case 1: 
                    gc.save(IOManager.getInt("Ingresa un id"),  
                            IOManager.getString("Ingresa el nombre del juego"), 
                            IOManager.getString("Ingresa el desarrollador"), 
                            IOManager.getString("Ingresa el genero"),
                            IOManager.getInt("Ingresa el precio")
                    );
                                                       
                    break;
                
                case 2:
                    IOManager.showMessage(Arrays.toString(gc.list()));
            }
        }while(GamesOption != 0);
        
        return -1;
    } 
    
  } 
    
