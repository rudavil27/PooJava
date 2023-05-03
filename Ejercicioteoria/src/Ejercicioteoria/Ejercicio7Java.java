package Ejercicioteoria;
import java.util.Scanner;
public class Ejercicio7Java {
        
        
public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    int opcion;
    System.out.println("Ingrese una opcion");
    opcion = leer.nextInt();
    
    switch(opcion){
        case 1:
            System.out.println(" Es una bomba de agua ");
            break;
        case 2:
            System.out.println("Es una bomba de Gasolina");
            break;
        case 3:
            System.out.println("Es una bomba de Hormigon");
            break;
        case 4:
            System.out.println("Es una bomba de Pasta Alimenticia");
            break;
        default:
            System.out.println("No exite un valor valido para el tipo de bomba");
            
        
    }
    
    
       
                


}}
