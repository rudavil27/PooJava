package Ejercicioteoria;

import java.util.Scanner;


/**
 *
 * @author Ruben
 */
public class Ejercicio1java {
    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese un numeros");
        int num=leer.nextInt();
         System.out.println("Ingrese otro numeros");
        int num2=leer.nextInt();
        int suma =num+num2;
        System.out.println("el resultado es "+ suma);
    }
  
}
