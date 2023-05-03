/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Guia3EjePracticos;
import java.util.Scanner;


/**
 * @author Ruben
 6. Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú
 */
public class Guia3EjePractico6 {

      public static void main(String[] args) {
        // TODO code application logic here
        Scanner leer = new Scanner(System.in);
        
          System.out.println("Ingrese dos numeros");   
        int num = leer.nextInt();
        int num1= leer.nextInt();
        
          System.out.println("INGRESE UNA OPCION");
          
          System.out.println("1 = SUMA");
          System.out.println("2 = RESTA");
          System.out.println("3 = MULTIPLICACION");
          System.out.println("4 = DIVISION");
          System.out.println("5 = SALIR");
          
          int opcion=leer.nextInt();
          
        switch (opcion){
            case 1:
                System.out.println("suma");
                int suma = 0;
                suma=num + num1;
                System.out.println("La suma es : "+suma);
                break;
            case 2:
                System.out.println("resta");
                int resta = 0;
                resta=num - num1;
                System.out.println("La resta es : "+ resta);
                break;
            case 3:
                System.out.println("multiplicar");
                int mult = 1;
                mult =num * num1;
                System.out.println("La Multiplicacion  es : "+ mult);
                break;
            case 4:
                 System.out.println("Division");
                int div = 1;
                div =num /num1;
                System.out.println("La Division  es : "+ div);
                break;
            case 5:
                System.out.println("SALIR");
        } 
        
      }

}
