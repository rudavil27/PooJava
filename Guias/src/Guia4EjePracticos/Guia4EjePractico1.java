
package Guia4EjePractico;
import java.util.Scanner;
/**
 * @author Ruben
 */
public class Guia4EjePractico1 {
/*
 Crea una aplicación que le pida dos números al usuario y este pueda elegir entre sumar, restar, 
multiplicar y dividir. La aplicación debe tener una función para cada operación 
matemática y deben devolver sus resultados para imprimirlos en el main
 */
    public static void main (String[] args){
       Scanner leer = new Scanner(System.in);
        
        String tecla,opcion;
        Double valor1, valor2;
        System.out.println("Ingrese dos numeros");
        valor1= leer.nextDouble();
        valor2= leer.nextDouble();
       
        do {
        System.out.println("MENU: \n"
                + "A. Sumar\n"
                + "B. Restar \n"
                + "C. Multiplicar \n"
                + "D. Dividir \n"
                + "S. Salir \n"
                + "==================\n"
                + "Elija una Opcion: ");
                opcion= leer.next();  
        
              switch (opcion.toUpperCase()){
            case "A": 
                System.out.println("La suma de los dos numeros es: "+ sumar(valor1, valor2));
                
                break;
            case "B": 
                System.out.println("La resta de los dos numeros es: "+ restar(valor1, valor2));
                break;
            case "C": 
               System.out.println("La resta de los dos numeros es: "+ multiplicar(valor1, valor2));
               
                break;
            case "D": 
                 System.out.println("La resta de los dos numeros es: "+ dividir(valor1, valor2));
               
                break;

            default:
               System.out.println("Gracias por usar el sistema ");
        }  
         } while (!opcion.equalsIgnoreCase("s"));        
    }
    
    public static double sumar (double valor1, double valor2){
       double resultadoSumar = valor1 + valor2;    
       
        return resultadoSumar;      
    }
    
    public static double restar (double valor1, double valor2){
       double resultadoRestar = valor1 + valor2;    
        
        return resultadoRestar;
    }
        
        public static double multiplicar (double valor1, double valor2){
       double resultadoMulti = valor1 * valor2;    
      
        return resultadoMulti;
        }
        
        public static double dividir (double valor1, double valor2){
       double resultadoDiv = valor1 / valor2;    
      
        return resultadoDiv;
        }
}
