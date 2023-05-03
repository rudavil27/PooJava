/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y 
muestre la traspuesta de la matriz.
La matriz traspuesta de una matriz A se denota por B y se obtiene
cambiando sus filas por columnas (o viceversa).d open the template in the editor.
 */

package Guia5EjPtractico;
/**
 * @author Ruben
 */
public class Guia5Ej4 {

   
    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
               
        for (int i = 0; i < 3; i++) {
         for (int j = 0; j <3 ; j++) {
        matriz[i][j]=(int)(Math.random()*9+1);
        System.out.print(matriz[i][j] + " "); 
        
        }         
        System.out.println();
        }
        System.out.println();
        int[][] matrizT =new int[matriz[0].length][matriz.length];
        for (int i=0; i < matriz.length; i++) {
        for (int j=0; j < matriz[i].length; j++) { 
  }
}
        for (int i=0; i < matriz.length; i++) {
        for (int j=0; j < matriz[i].length; j++) {
            
    matrizT[j][i] = matriz[i][j];
    System.out.print(matriz[j][i] + " ");
  }
        System.out.println();
  }
        }         
       

        
    }


