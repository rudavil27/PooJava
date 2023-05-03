/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicioteoria;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Ejercicio8Java {
    public static void main(String[] args) {
       
    Scanner leer = new Scanner(System.in);
    String respuesta="s";
    while(respuesta.equalsIgnoreCase("s")){
        
    System.out.println("Desea continuar");
    
    respuesta= leer.nextLine();
        
    System.out.println("Ingres una nota del 0 al 10 ");  
     int num = leer.nextInt();
     if (num > 0 || num < 10){
         System.out.println("Perfecto  Nota correcta");
         
     }else if (num <0 || num > 10) {
         System.out.println("La nota no es correcta ");
           num = leer.nextInt();
     }
        
    }
     
            
    
            
            
        }
        
        
        
    }
    

