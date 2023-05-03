/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3EjePracticos;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Guia3EjePractico2 {

    /**
     Crear un programa que pida una frase y
     * si esa frase es igual a “eureka” el programa pondrá un mensaje de Correcto,
     * sino mostrará un mensaje de Incorrecto.
     * Nota: investigar la función equals() en Java.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String frase;
        frase="eureka";
   Scanner leer = new Scanner (System.in);
   System.out.println("Ingrese la frase");
     
      if( leer.nextLine().equals(frase)){
       
       System.out.println("correcto");
       
       
   }else{
       System.out.println("incorrecto");
   }
   
    }

    private static String equalsIgnoreCase(String eureka) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
