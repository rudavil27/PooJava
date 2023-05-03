/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y 
se obtiene cambiando sus filas por columnas (o viceversa).

En este caso la matriz es antisimétrica.

 */

package Arreglos;
import java.util.Scanner;
/**
 *
 * @author Ruben
 */
public class Guia5EjPracticoArreglos5 {



public static void main(String[] args) {
 Scanner leer=new Scanner(System.in);  
 int matriz[][] = new int[3][3];
  
    
    
    for (int i = 0; i < 3; i++) {
        for (int j = 0; j < 3; j++) {
            
            System.out.println("Ingrese numeros para rellenar matriz");
            int num=leer.nextInt();
            matriz[i][j]=num;
        }
        System.out.println("");
    }
       System.out.println("Imprimiendo matriz");
       for (int i = 0; i < 3; i++) {
           System.out.println("\n");
           for (int j = 0; j < 3; j++) {
               
               System.out.print("" + matriz[i][j]+"\t");
               
           }
        
    }
 
}
    }


