/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Guia3EjePracticos;
import java.util.Scanner;
/**Crear un programa que dado un número determine si es par o impar.
 *
 * @author Ruben
 */
public class Guia3EjePractico1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
    
        Scanner leer = new Scanner(System.in);
        int num;
        System.out.println("Ingrese un numero: ");
        num = leer.nextInt();
        
        if (num % 2 == 0) {
            System.out.println("El numero " + num + " es par.");
        } else {
            System.out.println("El numero " + num + " es impar.");
        }
    }
    }
    

