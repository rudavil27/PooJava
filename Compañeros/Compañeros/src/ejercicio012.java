//Crear un programa que dado un número determine si es par o impar.
package encuentro4a6;

import java.util.Scanner;

public class ejercicio01 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      int num;
        System.out.println("ingrese un numero :  ");
        num = leer.nextInt();
        if (num% 2 ==0) {
                            
        System.out.print(num+" el numero ingresado es par ");
    } else  
        System.out.println(num+" el numero ingresado es impar");
                
            }  
    }
        
       
   
   

