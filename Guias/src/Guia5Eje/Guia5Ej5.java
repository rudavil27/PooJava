/*
 *Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su propia traspuesta,
pero cambiada de signo. Es decir, A es antisimétrica si A = -AT.
La matriz traspuesta de una matriz A se denota por AT y se obtiene cambiando
sus filas por columnas (o viceversa).

 */
package Guia5EjPtractico;
import java.util.Scanner;
/**
 * @author Ruben
 */
public class Guia5Ej5 {

   
   
         public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de filas para la matriz:");
        int fi = leer.nextInt();
        System.out.println("Ingrese la cantidad de columnas para la matriz:");
        int co = leer.nextInt();
        int[][] matriz = new int[fi][co];
        System.out.println("Ahora rellenemos la matriz:");
        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
                System.out.println("Ingrese ["+i+"]["+j+"]:");
                matriz[i][j] = leer.nextInt();
            }
        }
        System.out.println("Matriz Original:");
        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
                System.out.print(matriz[i][j]+" ");
            }
            System.out.println("");
        }
        int[][] matrizTr = new int[fi][co];
        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
                matrizTr[j][i] = matriz[i][j];
            }
        }
        System.out.println("Matriz Transpuesta:");
        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
                System.out.print(matrizTr[i][j]+" ");
            }
            System.out.println("");
        }
        int contador = 0;
        for (int i = 0; i < fi; i++) {
            for (int j = 0; j < co; j++) {
                if ((matriz[i][j])+(matrizTr[i][j])==0 ) {
                    contador++;
                }
            }
        }
        if (((fi*co)==contador)) {
            System.out.println("La matriz es antisimétrica.");
        } else {
            System.out.println("La matriz no es antisimétrica.");
        }
    }}