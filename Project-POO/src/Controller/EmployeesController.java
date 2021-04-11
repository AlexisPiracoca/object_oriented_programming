/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;
import Model.Employees;

/**
 *
 * @author Jhon Alexis
 */
public class EmployeesController extends AbstractFacade<Employees> {

    private final Employees[] data;
     public EmployeesController() {
        data = new Employees[20];
    }
    
    //Own methods
    public boolean save(String name, int cc, int age, String sex, String telephone, double salary){
        try{
            if(findOne(cc) == null ){
                Employees newEmployee = new Employees(name, cc, age, sex, telephone, salary);
                data[cc] = newEmployee;
            
            }else
                System.err.println("La llave primaria (índice) especificada ya existe");
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el empleado, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el empleado, porque se permiten máximo " + data.length + " propietarios");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
        
    }
    
    public boolean update(String name, int cc, int age, String sex, String telephone, double salary){
        try {
            if(findOne(cc) == null){
                //No longer necesary because is being shwowing on findOne method System.err.println("La llave primaria (índice) especificada no existe o no tiene ningún objeto asociado");
                
                return false;
            }
            
            //Another option
            /*Owner currentOwner = findOne(id);
            currentOwner.setName(name);
            currentOwner.setNit(nit);
            owners[id] = currentOwner;*/
            
            //Optimal option 
            data[cc].setName(name);
            data[cc].setcc(cc);
            data[cc].setAge(age);
            data[cc].setSex(sex);
            data[cc].setTelephone(telephone);
            data[cc].setSalary((int) salary);
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el empleado, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo actualizar el empleado, porque se permiten máximo " + data.length + " propietarios");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }

}
   
