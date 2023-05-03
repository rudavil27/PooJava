/*

Un cuadrado mágico 3 x 3 es una matriz 3 x 3 formada por números del 1 al 9 donde la suma de sus filas,
sus columnas y sus diagonales son idénticas.
Crear un programa que permita introducir un cuadrado por teclado y determine si
este cuadrado es mágico o no. El programa deberá comprobar que los números introducidos
son correctos, es decir, están entre el 1 y el 9.

 */
package Guia5EjPtractico;
import java.util.Scanner;
import java.util.Random;
/**
 * @author Ruben
 */
public class Guia5Ej6 {
   
    public static void main(String[] args) {
    int [][] matriz= new int [3][3];
    
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j]=(int)(Math.random()*8+1);
                System.out.print(matriz[i][j] + " ");
            
            }
            
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                
                System.out.print(matriz[j][i]);     
                
            }
 
            
        }
        
    }

}
