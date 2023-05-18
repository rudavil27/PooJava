/*
 Realizar una clase llamada Cadena, en el paquete de entidades,
que tenga como atributos una frase (String) y su longitud.
Agregar constructor vacío y con atributo frase solamente.
Agregar getters y setters. El constructor con frase como atributo debe setear
la longitud de la frase de manera automática. 
Crear una clase CadenaServicio en el paquete servicios que implemente los siguientes métodos:

 */
package cadena;

import Servicios.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Cadena {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         System.out.print("Ingrese una frase: ");
         String frase = scanner.nextLine();
         Cadena cadena = new Cadena(frase);
         CadenaServicio cadenaServicio = new CadenaServicio();
         cadenaServicio.setFrase(cadena.getFrase());
         System.out.println("La frase ingresada es: " + cadenaServicio.getFrase());
         System.out.println("La longitud de la frase es: " + cadenaServicio.getLongitud());
         System.out.println("Frase invertida: " + cadenaServicio.invertirFrase());
         System.out.println("Cantidad de vocales en la frase: " + cadenaServicio.mostrarVocales(cadena));
         System.out.print("Ingrese una letra para contar repeticiones: ");  
         String letra = scanner.nextLine();  
         System.out.println("La letra '" + letra + "' se repite " + cadenaServicio.vecesRepetido(letra) + " veces.");
         System.out.print("Ingrese una frase para comparar su longitud: ");
         String otraFrase = scanner.nextLine();
         System.out.println("La diferencia en longitud entre la frase ingresada y la frase comparada es: " + cadenaServicio.compararLongitud(otraFrase)); 
         System.out.print("Ingrese una frase para unir: ");
         String fraseUnida = scanner.nextLine();
         System.out.println("Frase resultante: " + cadenaServicio.unirFrases(fraseUnida));
         System.out.print("Ingrese una letra para reemplazar en la frase: " + cadenaServicio.getFrase() + ":");
         String letraReemplazo = scanner.nextLine();
         System.out.print("Ingrese el carácter por el que desea reemplazar '" + letraReemplazo + "': ");
         String reemplazo = scanner.nextLine();
         

    }
    
}
