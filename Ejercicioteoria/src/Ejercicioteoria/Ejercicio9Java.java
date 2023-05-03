package Ejercicioteoria;
import java.util.Scanner;
public class Ejercicio9Java{
    
    public static void main(String[] args) {
     int num=0,suma=0;
    Scanner leer =new Scanner (System.in);
        
    do
    { 
        System.out.println("Ingrese un numero)");
      num =leer.nextInt();
      suma = suma+ num;
      
              
    }while(num!=0);
    
       System.out.println("la suma de los numero introducidos es "+ suma );      
        
    }
}