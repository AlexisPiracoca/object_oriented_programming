/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import model.Students;
/**
 *
 * @author Jhon Alexis
 */
public class StudentsController extends AbstractFacade<Students> {
    
    public StudentsController() {
        data = new Students[40];
    }
    
    //Own methods
    public boolean save(int id, String code, String name, String lastname, String faculty){
        try{
            if(findOne(id) == null ){
                Students newStudent = new Students(id, code, name, lastname, faculty);
                data[id] = newStudent;
            
            }else
                System.err.println("La llave primaria (índice) especificada ya existe");
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el estudiante, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el estudiante, porque se permiten máximo " + data.length + " estudiantes");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
        
    }
    
    public boolean update(int id, String code, String name, String lastname, String faculty){
        try {
            if(findOne(id) == null){
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");
                
                return false;
            }
     
            //Optimal option 
            data[id].setCode(code);
            data[id].setName(name);
            data[id].setLastname(lastname);
            data[id].setFaculty(faculty);
                     
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el estudiante, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo actualizar el estudiante, porque se permiten máximo " + data.length + " estudiantes");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }
      
}
