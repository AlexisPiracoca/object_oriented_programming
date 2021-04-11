/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GeneralTests;

import model.Department;
import model.Employee;
import model.Enterprise;
import model.PayService;
import model.Role;

/**
 *
 * @author andresforero
 */
public class Tests {
    public static void main(String[] args) {
        //Empresas & Departamentos
        Enterprise empresaA = new Enterprise(1, "Universidad Santo Tomás");
        Department departamento1 = new Department(1, "Departamento financiero", "FI", empresaA);

        //Empleados
        Role administrador = new Role(1, "Administrador", "Gestionar a los demás empleados", 500000.0, departamento1);
        Employee emp = new Employee(1, "Andrés", "311", "Calle falsa 123", administrador);
        Employee em2 = new Employee(2, "Carlos", "321", "Av falsa 123", administrador);
        Employee em3 = new Employee(3, "Alberto", "453", "Calle 15", administrador);
        
        //Pruebas de ejecución
        emp.setId(10);
        System.out.println(emp.toString());
        System.out.println(em2.toString());
        System.out.println(em3.toString());
        
        Department department2 = new Department();
        department2.setId(2);
        department2.setName("Departamento Administrativo");
        department2.setDepartmentType("AD");
        
        Enterprise empresaB = new Enterprise(2, "UPTC");
        department2.setEnterprise(empresaB);
        
        //Tipos de pago
        PayService payService1 = new PayService(1, "Efectivo", "EF");
        PayService payService2 = new PayService(2, "Tarjeta de crédito", "TC");
        PayService payService3 = new PayService(3, "Tarjeta débito", "TD");
        
        //Pruebas de ejecución
        //Pago de mayo
        System.out.println("Pago de mayo: " + departamento1.salaryPay(payService3, 500000.0));
        //Pago de Junio
        System.out.println("Pago de Junio: " + departamento1.salaryPay(payService2, 450000.0));
        //Pago de Agosto
        System.out.println("Pago de Agosto: " + departamento1.salaryPay(payService3, 550000.0));
        //Pago de Septiembre
        System.out.println("Pago de Septiembre: " + departamento1.salaryPay(payService1, 500000.0));

    }
}
