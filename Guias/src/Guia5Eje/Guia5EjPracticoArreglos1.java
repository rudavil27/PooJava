/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Arreglos;
import java.util.Scanner;
/**
 *
 * @author Ruben
 */
public class Guia5EjPracticoArreglos1 {



public static void main(String[] args) {
        int vector []=new int[100];
        for(int i=0; i<100; i++){
            vector[i]=i+1;
            //vector[i]=(int) (Math.random() * 100);
        }
        for(int i=0; i<100;i++){
            System.out.println(vector[99-i]);
        }
        /*con for mejorado
          int aux; 
          for (int elemento: vector) {
            aux=elemento;
            System.out.println(aux);*/
    
  } 
}