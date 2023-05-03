package Guia3EjePracticos;
import java.util.Scanner;
/**
 * @author Ruben
 */
/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de largo.
Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir un mensaje
por pantalla que diga “CORRECTO”, en caso contrario, se deberá imprimir “INCORRECTO”.
Nota: investigar la funcion Lenght() en Java.
*/
public class Guia3EjePractico3 {

    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese una frase de 8 caracteres");
     
        String P = leer.nextLine();
                
   
         
        if(P.length()==8){     

        System.out.println("Correcto");
    
        }else{
          
                System.out.println("Incorrecto");
}}}
