package Ejercicioteoria;
import java.util.Scanner;
public class Ejercicio5Java {        
public static void main(String[] args)  {
    Scanner leer = new Scanner(System.in);
    System.out.println("Ingrese un numero");
    int num = leer.nextInt();
    System.out.println("El doble de " + num + " es " + (num*2));
    System.out.println("el triple es: " + (num*3));
    System.out.println("la raiz es:  " + Math.sqrt(num));
    
  
    
    
  }
}
