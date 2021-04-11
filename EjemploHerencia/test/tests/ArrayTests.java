/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author andresforero
 */
public class ArrayTests {
    public static void main(String[] args) {
        //Definiendo un arreglo
        int[] enteros = {1,2,3,4,5,6,7,8,9,10};
        String[] nombres = new String[5];
        
        //Asociando o cambiando valores a una posición
        enteros[0] = 1;
        int j = enteros[5];
        
        nombres[0] = "Andrés";
        nombres[1] = "Camila";
        nombres[2] = "Fernanda";
        nombres[3] = "Ramiro";
        nombres[4] = "Luis";
        
        String nomnrePersona = nombres[4];
        
        //Imprimiendo por pantalla una posición específica o objetos inicializados con valores dentro de la estructura
        System.out.println(enteros[5]);
        System.out.println(j);
        
        System.out.println(nombres[4]);
        System.out.println(nomnrePersona);
        
        //Recorriendo todos los valores de la estrcutura
        for(int i = 0; i < enteros.length; i++){
            System.out.println(enteros[i]);
        }
        
        for(int i = 0; i < nombres.length; i++){
            System.out.println(nombres[i]);
        }
        
    }
}
