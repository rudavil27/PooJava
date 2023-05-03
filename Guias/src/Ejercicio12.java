/*
Ejercicio 12
Crea un procedimiento EsMultiplo que reciba los dos números pasados por el usuario,
validando que el primer número múltiplo del segundo e imprima si el primer número es múltiplo del segundo,
sino informe que no lo son.

 */

package Subprogramas;
import java.util.Scanner;
/**
 * @author Ruben
 */
public class Ejercicio12 {



public static void main(String[] args) {
 Scanner leer=new Scanner(System.in);  
    System.out.println("Ingrese 2 numeros ");
    int a = leer.nextInt();
    int b = leer.nextInt();

    M(a,b); 
}         
  public static void M (int a,int b){
      
        if (a % b ==0 ){
            System.out.println("El numero es MULTIPLO");
        
       }else{
            System.out.println("No es MULTIPLO");
}}}
    

    
    
    


