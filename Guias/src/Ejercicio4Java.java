/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicioteoria;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Ejercicio4Java {
            
     public static void main(String[] args)  {
       Scanner leer = new Scanner (System.in);   
       System.out.println("Ingrese los grados celcius");
       int celcius = leer.nextInt();
       int fahrenheit =32+(9*celcius/5);
       System.out.println(fahrenheit);
       
       
            
  }  
}
