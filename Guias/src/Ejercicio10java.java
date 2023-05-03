/*
 * Ejercicio 10
Realizar un programa que lea 4 números (comprendidos entre 1 y 20)
e imprima el número ingresado seguido de tantos asteriscos como indique su valor.
Por ejemplo:
5 *****
3 ***
11 ***********
2 **

 */
package Ejercicioteoria;
import java.util.Scanner;
import javax.swing.JOptionPane;
        
/**
 *
 * @author Ruben
 */
public class Ejercicio10java {
@SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        Scanner leer =new Scanner (System.in);
    int contador;
        contador = 1;
    do{
         System.out.println("Ingrese un numero de 1 a 20");
    
       int num =leer.nextInt();
       if(num >= 1 && num <= 20){  
       contador++;
       
       }else{
           JOptionPane.showMessageDialog(null, "El numero ingresado en invalido");
        // System.out.print("El numero ingresado en invalido");
          
        }while (contador<=5);{ 
           System.out.print(num);
        
                for (int i = 0; i < num; i++) {
                System.out.print("*");
            
                System.out.println("");
                 }
                  }
                   }
   } 
}
    