/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;
import Model.Games;

/**
 *
 * @author Jhon Alexis
 */
public class GamesController extends AbstractFacade<Games> {

    private final Games[] data;
     public GamesController() {
        data = new Games[20];
    }
    
    //Own methods
    public boolean save(int id, String nombre, String desarrollador, String genero, int precio){
        try{
            int gc = 0;
            if(findOne(gc) == null ){
                Games newGame = new Games(id, nombre, desarrollador, genero, precio);
                data[gc] = newGame;
            
            }else
                System.err.println("La llave primaria (índice) especificada ya existe");
            
            return false;
        
        }catch(NullPointerException e){
            System.err.println("Lo sentimos, no se pudo guardar el juego, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el juego ");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
        
    }
    
    public boolean update(int id, String nombre, String desarrollador, String genero, int precio){
        try {
            int gc = 0;
            if(findOne(gc) == null){
                System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");
                
                return false;
            }
            
            //Optimal option 
            data[gc].setid(id);
            data[gc].setnombre(nombre);
            data[gc].setdesarrollador(desarrollador);
            data[gc].setgenero(genero);
            data[gc].setprecio(precio);
           
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el juego, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo actualizar el juego ");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }
}
   
