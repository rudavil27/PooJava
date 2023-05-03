/*
 * Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package Compañeros;

import java.util.Scanner;

/**
 * @author Ruben
 */
public class Guia5EjPtractico3 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double[] vector = new double[10]; int aux;
        for (int i = 0; i < 9; i++) {
            do {
                aux = 0;
                System.out.println("Ingrese un numero");
                vector[i] = leer.nextInt();
            } while (vector[i] > 99999);
            while (vector[i] > 1) {
                vector[i] /= 10;
                aux++;
            }
            switch (aux) {
                case 1: System.out.println("El numero ingresado tiene 1 digito");break;
                case 2: System.out.println("El numero ingresado tiene 2 digitos");break;
                case 3: System.out.println("El numero ingresado tiene 3 digitos");break;
                case 4: System.out.println("El numero ingresado tiene 4 digitos");break;
                case 5: System.out.println("El numero ingresado tiene 5 digitos");break;
            }
        }
    }

}
        
        
        
        
        /*  int[] vector = {0, 10, 100, 1000, 10000};
        int[] contador = new int[5];
        String aux = " ";
        Scanner entrada = new Scanner(System.in);
        
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                aux = String.valueOf(vector[j]);
                if (aux.length() == 1) {
                    contador[0]++;
                    if (aux.length() == 2) {
                        contador[1]++;
                    } else {
                        if (aux.length() == 3) {
                            contador[2]++;
                        } else {
                            if (aux.length() == 4) {
                                contador[3]++;
                            } else {
                                if (aux.length() == 5) {
                                    contador[4]++;
                                }
                            }
                        }
                    }
                }

            }
            System.out.println(contador[i]);
        }

// TODO code application logic here
    }

}
           /* int vector[] = {1, 10, 100, 1000, 10000};
        vector = new int[5];
        for (int i = 0; i < 5; i++) {
            String aux = String.valueOf(vector[i]);
            for (int j = 0; j < aux.length(); j++) {
*/
            


    
