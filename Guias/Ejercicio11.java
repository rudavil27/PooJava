/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Subprogramas;
import java.util.Scanner;
/**
 * Ejercicio 11
Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada en punto,
* y luego codifique la palabra o frase ingresada de la siguiente manera:
* cada vocal se reemplaza por el carácter que se indica en la tabla y el resto de los caracteres
* (incluyendo a las vocales acentuadas) se mantienen sin cambios.
aeiou
@#$%*

Realice un subprograma que reciba una secuencia de caracteres y retorne la codificación correspondiente.
* Utilice la estructura “según” para la transformación. 
Por ejemplo, si el usuario ingresa:     Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser:  @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.

 *
 * @author Ruben
 */
public class Ejercicio11 {



public static void main(String[] args) {
 Scanner leer =new Scanner(System.in);  
 System.out.println("Ingrese una frase");
    String frase = leer.nextLine();
    System.out.println("Su frase de  reemplazo es:"+ codigo ( frase) );
 
    }


public static String codigo (String frase){

String reemplazo;
        reemplazo = "" ;
        for (int i = 0; i < frase.length(); i++) {


          switch (frase.substring(i, i+1).toUpperCase()) {
           
                    case "A":
                    reemplazo = reemplazo.concat("@");
                    break;

                    case "E":
                    reemplazo = reemplazo.concat("#");
                    break;
                    case "I":
                    reemplazo = reemplazo.concat("$");
                    break;
                    case "O":
                    reemplazo = reemplazo.concat("%");
                    break;
                    case "U":
                    reemplazo = reemplazo.concat("*");
                    break;
                    default:
                    reemplazo = reemplazo.concat(frase.substring(i, i+1));
            }
        }
        return reemplazo;

    }


}

