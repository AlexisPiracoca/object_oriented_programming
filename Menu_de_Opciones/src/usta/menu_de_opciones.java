package usta;

import java.util.Scanner;

public class menu_de_opciones {
    //DATE: 18/08/2020
    //CREATOR: JHON ALEXIS PIRACOCA ARCOS
    //DESCRIPTION: THIS PROGRAM SHOWS A MENU OF OPTIONS
      
    public static void main(String[] args) {
     boolean exit = false;
     
     while(!exit){
           System.out.println("Welcome select a option");
           System.out.println("1. Option 1 text");
           System.out.println("2. Option 2 names");
           System.out.println("3. Option 3 multiplicate table (1)");
           System.out.println("4. Exit");
           System.out.println("Write one of the options: ");
           
           Scanner keyboard = new Scanner(System.in);
           int opcion; 
           opcion = keyboard.nextInt();
          
           switch(opcion){
               case 1:
                   System.out.println("You have selected the option 1 text");
                   System.out.println("Hola");
                   break;
               case 2:
                   System.out.println("You have selected the option 2, NAMES");
                   System.out.println("Albeto");
                   System.out.println("Diomedez");
                   System.out.println("Hernando");
                   System.out.println("Carlos");
                   break;
                case 3:
                   System.out.println("You have selected the option 3, MULTIPLICATE TABLE (1)");
                   System.out.println("1 x 1 = 1");
                   System.out.println("1 x 2 = 2");
                   System.out.println("1 x 3 = 3");
                   System.out.println("1 x 4 = 4");
                   System.out.println("1 x 5 = 5");
                   System.out.println("1 x 6 = 6");
                   System.out.println("1 x 7 = 7");
                   System.out.println("1 x 8 = 8");
                   System.out.println("1 x 9 = 9");
                   System.out.println("1 x 10 = 10");
                   break;
                case 4:
                   exit = true;
                   break;
                default:
                   System.err.println("ERROR: the options are between 1 and 4");
           }
       }    
   }
}

