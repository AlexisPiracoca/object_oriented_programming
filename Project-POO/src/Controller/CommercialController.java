/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Controller;
import Model.Commercial;
import Model.Employees;
/**
 *
 * @author Jhon Alexis 
 */
public class CommercialController extends AbstractFacade<Commercial>{

    private final Commercial[] data;
      public CommercialController() {
          data = new Commercial[20];
    }
    
    //Own methods
    public boolean save(int commission, String name, int cc, int age, String sex, String telephone, double salary){
        try{
            if(findOne(cc) == null ){
                Employees newEmployee = new Employees(commission, name, cc, age, sex, telephone, (int) salary);
                data[cc] = (Commercial) newEmployee;
            
            }else
                System.err.println("La llave primaria (índice) especificada ya existe");
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo guardar el empleado, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo guardar el empleado, porque se permiten máximo " + data.length + " empleados");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
        
    }
    
    public boolean update(boolean hasdoublecommission, String name, int cc, int age, String sex, String telephone, double salary){
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
            data[cc].hasDoublecommission(hasdoublecommission);
            data[cc].setname(name);
            data[cc].setcc(cc);
            data[cc].setage(age);
            data[cc].setsex(sex);
            data[cc].settelephone(telephone);
            data[cc].setsalary(salary);
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo actualizar el empleado, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo actualizar el empleado, porque se permiten máximo " + data.length + " empleados");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }
    public boolean delete(boolean hasdoublecommission, String name, int cc, int age, String sex, String telephone, double salary){
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
            data[cc].hasDoublecommission(hasdoublecommission);
            data[cc].setname(name);
            data[cc].setcc(cc);
            data[cc].setage(age);
            data[cc].setsex(sex);
            data[cc].settelephone(telephone);
            data[cc].setsalary(salary);
            
            return true;
        
        }catch(NullPointerException e){
            e.printStackTrace();
            System.err.println("Lo sentimos, no se pudo borrar el empleado, porque la estructura es nula");
            return false;
        
        }catch(ArrayIndexOutOfBoundsException e){
            System.err.println("Lo sentimos, no se pudo borrar el empleado");
            return false;
        
        }catch(Exception e){
            System.err.println("Lo sentimos, se presentó un error general");
            return false;
        }
    }

}
