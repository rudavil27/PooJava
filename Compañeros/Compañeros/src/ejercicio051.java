//Escriba un programa en el cual se ingrese un valor límite positivo, y a
//continuación// solicite números al usuario hasta que la suma de los números introducidos 
//        supere el límite inicial.
package encuentro4a6;

import java.util.Scanner;
public class ejercicio05 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in); 
      int numlimit,num,suma;
        System.out.println("ingrese un valor limite positivo: ");
        numlimit = leer.nextInt();
        suma = 0;
                do { 
            System.out.println("ingrese un numero: ");
            num = leer.nextInt();
          suma = suma+num;                                          
                                     
        } while (suma<numlimit);{
                System.out.println("la suma de los numeros es: " + suma + "y supera el limite ingresado");
                
            
        }
    }

}

