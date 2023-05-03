/*
 Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
 cuántos de 2 dígitos, etcétera (hasta 5 dígitos).

 */

package Guia5EjPtractico;

import java.util.Scanner;

/**
 * @author Ruben
 */
public class Guia5Ej3 {

   
    public static void main(String[] args) {
      int[] vector = {0, 100, 1000, 1000, 10000};
        int[] contador = new int[5];
        String aux = "";
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                aux = String.valueOf(vector[j]);
                if (aux.length() == i+1) 
                    contador[i]++;
                  
            }
           
        }
        for (int i = 0; i < 5; i++) {
            System.out.printf("[%d]=%d\n",i,contador[i]);
        }
// TODO code application logic here
    }

}

