/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Compañeros;

/**
 * @author Ruben
 */
public class G5E3CaroVenosta {

   
    public static void main(String[] args) {
       import java.util.Scanner;

public class ejercicio03 {

    public static void main(String[] args) {
        /* Recorrer un vector de N enteros contabilizando 
cuántos números son de 1 dígito, cuántos de 2 dígitos, 
etcétera (hasta 5 dígitos). */
        Scanner leer = new Scanner(System.in);
        int num = 10;
        int[] vector = new int[num];
        int cont = 0, cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0;

        //rellenar por la longitud del vector
        for (int i = 0; i < vector.length; i++) {
            vector[i] = (int) (Math.random() * 50000);
        }
        //mostrar
        for (int i = 0; i < vector.length; i++) {
            System.out.println(vector[i]);
        }
        //recorrer
        for (int i = 0; i < vector.length; i++) {
            if (vector[i] >= 0 && vector[i] < 10) {
                cont++;
            } else if (vector[i] >= 10 && vector[i] < 100) {
                cont1++;
                
            } else if (vector[i] >= 100 && vector[i] < 1000) {
                cont2++;

            } else if (vector[i] >= 1000 && vector[i] < 10000) {
                cont3++;
            } else if (vector[i] >= 10000 && vector[i] < 100000) {
                cont4++;
            }
        }
            System.out.println(cont + " son de un digito " + "\n"
                    + cont1 + " son de dos digitos \n"
                    + cont2 + " son de tres digitos \n"
                    + cont3 + " son de cuatro digitos \n"
                    + cont4 + " son de cinco digitos ");

    }

} // TODO code application logic here
    }

}
