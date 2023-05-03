/*
 * Realizar un algoritmo que llene un vector de tamaño N con valores aleatorios
y le pida al usuario un número a buscar en el vector. El programa mostrará dónde se encuentra el numero y
si se encuentra repetido

 */

package Arreglos;
import java.util.Scanner;
import java.util.Random;

public class Guia5EjPracticoArreglos2 {



/*public static void main(String[] args) {
 Scanner leer=new Scanner(System.in); 
    int n;
    n =5;
    int[] vector = new int[n];
   vector[i]= (int)(Math.random() * 20);
      for (int i=0; i <5; i++) {
         
      }
 */

	
	public static void main(String[] args){
             int n;
            Scanner leer = new Scanner (System .in);
            
            System.out.println("Ingrase el tamaño del vector");
                n = leer.nextInt();
           
	    int[] vector = new int[n];
                      
                for(int i=0;i<vector.length;i++){
			vector[i] = (int) (Math.random()*20)+1;
                        System.out.println(vector[i]);
                    }
                 System.out.println("Ingrese numero a buscar");
                    String  num1 =leer.nextLine();           
                    
                for(int i=0;i<vector.length;i++){
		                           
              
                }
        }
}
