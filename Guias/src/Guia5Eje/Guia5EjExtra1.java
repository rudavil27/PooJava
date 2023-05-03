/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de tamaño N,
con los valores ingresados por el usuario.

 */

package Guia5EjExtra;
import java.util.Scanner;
/**
 * @author Ruben
 */
public class Guia5EjExtra1 {

   
    public static void main(String[] args) {
       Scanner leer= new Scanner (System.in);
        int[] vector = new int[5];
        
        
        for (int i = 0; i < 5; i++) {
    	       System.out.println("Ingrese datos al vector");
               int nu= leer.nextInt();
        	vector[i] = nu;
       	  
    	}
        for (int i = 0; i < 5; i++) {
    	        System.out.println("["+vector[i]+"]" );
       	  
    	}
        int suma=0;
                for (int i = 0; i < 5; i++) {
        suma += vector[i];
                       
           System.out.println("La suma del Vector es: "+ suma); 
    	}
        System.out.println("");
    }
           
}
