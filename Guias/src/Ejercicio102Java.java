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
package EjerciciosdeCompañeros;
import java.util.Scanner;
    
public class Ejercicio102Java {  
    public static void main(String[] args){
    Scanner leer =new Scanner (System.in);
        int contador=1;
      
    do
       {//System.out.println("Ingrese un numero)");
       System.out.println("Ingrese un numero entre 1 y 20)");
        int num =leer.nextInt(); 
       
       if(num >= 1 && num <= 20){
        contador++;
     
        }else{
         System.out.print("El numero ingresado en invalido");
                            
    
          }while(contador >= 4){
    
    
           System.out.print(num);
          }
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            
            System.out.println("");
    
            
            }
                
       }

    
    
         
    
    }
    

}                     
    
    
        
          
