/*
 Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios y 
le pida al usuario un número a buscar en el vector. 
El programa mostrará dónde se encuentra el numero y si se encuentra repetido

 */
package Guia5EjPtractico;
import java.util.Scanner;
public class Guia5Ej2 {
    public static void main(String[] args) {
      Scanner leer = new Scanner (System.in);  
        int n = 0;
        int[]vector= new int[n];
        System.out.println("Ingrese el tamaño del vector");
            n = leer.nextInt();
                 
            
            
            for (int i = 0; i<vector.length; i++) {
            vector[i]=(int)(Math.random()*20)+1;
        }
        
        System.out.println("["+ vector +"]");
        
        System.out.println("Ingrese el numero a buscar");
        String aux= leer.nextLine();
        
    }

}
