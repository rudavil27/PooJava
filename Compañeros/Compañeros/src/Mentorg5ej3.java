/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compañeros;

import java.util.Scanner;

/**
 * @author Ruben
 */
public class Mentorg5ej3 {

   
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el tamaño del vector: ");
        int n = sc.nextInt();
        
        int[] numeros = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Ingrese el valor para la posición " + i + ": ");
            numeros[i] = sc.nextInt();
        }
        
        int[] contadores = new int[5];
        for (int i = 0; i < n; i++) {
            int digitos = (int) (Math.log10(numeros[i]) + 1);
            if (digitos == 1) {
                contadores[0]++;
            } else if (digitos == 2) {
                contadores[1]++;
            } else if (digitos == 3) {
                contadores[2]++;
            } else if (digitos == 4) {
                contadores[3]++;
            } else {
                contadores[4]++;
            }
        }
        
        for (int i = 0; i < 5; i++) {
            System.out.println("Cantidad de numeros con " + (i+1) + " digitos: " + contadores[i]);
        }
    }
}   // TODO code application logic here
    

