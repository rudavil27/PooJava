//Realizar un programa que solo permita introducir solo frases o palabras de 
//8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de
//imprimir un mensaje por pantalla que diga “CORRECTO”, en caso contrario, 
//se deberá imprimir “INCORRECTO”. Nota: investigar la función Lenght() en Java.


package encuentro4a6;

import java.util.Scanner;

public class ejercicio03 {

       public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
       String frase ;
        System.out.println("escriba una frase o palabra: ");
        frase = leer.nextLine();
           if (frase.length()==8) {
               System.out.println("correcto");
           } else {
               System.out.println("incorrecto");
               
           }
        
    }
    
}
