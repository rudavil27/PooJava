//Crear un programa que pida una frase y si esa frase es igual a “eureka” el 
//programa pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
//Nota: investigar la función equals() en Java.
package encuentro4a6;

import java.util.Scanner;

public class ejercicio02 {
  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String frase1;
        System.out.println("ingrese una frase : ");
        frase1 = leer.nextLine();
        if (frase1.equalsIgnoreCase("eureka")) {
            System.out.println("correcto");
        } else {
            System.out.println("incorrecto");
            
        }
    }
    
}
