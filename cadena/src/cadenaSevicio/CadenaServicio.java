/*
Método mostrarVocales(),
deberá contabilizar la cantidad de vocales que tiene la frase ingresada.
Método invertirFrase(),
deberá invertir la frase ingresada y mostrarla por pantalla.
Por ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
Método vecesRepetido(String letra),
recibirá un carácter ingresado por el usuario y contabilizar
cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
Método compararLongitud(String frase),
deberá comparar la longitud de la frase que compone la clase con otra nueva frase ingresada por el usuario.
Método unirFrases(String frase),
deberá unir la frase contenida en la clase Cadena con una nueva frase ingresada por el usuario y mostrar la frase resultante.
Método reemplazar(String letra),
deberá reemplazar todas las letras “a” que se encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.
Método contiene(String letra),
deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
verdadero si la contiene y falso si no.

 */
package cadenaSevicio;

import Entidades.Cadena;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class CadenaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    Cadena frase = new Cadena();

    public Cadena CrearFrase() {
        System.out.println("Ingrese una frase");
        frase.setFrase(leer.nextLine().toLowerCase());

        return this.frase;
    }
//Método mostrarVocales(),
//deberá contabilizar la cantidad de vocales que tiene la frase ingresada.

    public int mostrarVocales() {
        int contVocales = 0;
        for (int i = 0; i < this.frase.getFrase().length(); i++) {
            char letra = this.frase.toString().charAt(i);
            if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                contVocales++;

            }
            // System.out.println("La frase tiene " + contVocales + " vocales.");
        }
        return contVocales;
    }
//Método invertirFrase(),
//deberá invertir la frase ingresada y mostrarla por pantalla.

    public void invertirFrase() {
        String frase2 = this.frase.getFrase();
        StringBuilder fraseInvertida = new StringBuilder();
        for (int i = frase2.length() - 1; i >= 0; i--) {
            fraseInvertida.append(frase2.charAt(i));
        }
        System.out.println("Frase invertida: " + fraseInvertida);
    }

    /*Método vecesRepetido(String letra),
recibirá un carácter ingresado por el usuario y contabilizar
cuántas veces se repite el carácter en la frase, por ejemplo:
Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
     */
    public void vecesRepetido() {
        String otra = this.frase.getFrase().toLowerCase();
        System.out.println("Ingrese la letra a buscar");
        char charLetra = leer.next().toLowerCase().charAt(0);
        int contador = 0;
        //int vueltas=0;

        for (int i = 0; i < otra.length(); i++) {
            char c = otra.charAt(i);
            if (c == charLetra) {
                contador++;

                //vueltas = contador;
            }

        }
        System.out.println("La letra " + charLetra + " se repitio " + contador);
    }

    //Método compararLongitud(String frase),
    //deberá comparar la longitud de la frase que compone la clase
    //con otra nueva frase ingresada por el usuario.
    public void comparaFrase(String frase) {
        frase = this.frase.getFrase();
        //int  = this.frase.getLongitud();

        System.out.println("Ingrese la Nueva frase");
        int cadena1 = leer.next().toLowerCase().length();

        if (frase.length() > cadena1) {
            System.out.println("La longitud de Frase es MAYOR que la nueva Frase");
        } else if (frase.length() < cadena1) {
            System.out.println("La longitud de Frase es MENOR que la nueva Frase");
        } else {
            System.out.println("La longitud de Frase es IGUAL a la nueva Frase");
        }

    }

//Método reemplazar(String letra),
//deberá reemplazar todas las letras “a” que se encuentren en la frase,
//por algún otro carácter seleccionado por el usuario y mostrar la frase resultante.

    public void reemplazar() {
        String f;
        System.out.println("Ingres el  caracter");
        f = leer.next();

        System.out.println(this.frase.getFrase().replace("a", f));

    }
//Método contiene(String letra),
//deberá comprobar si la frase contiene una letra que ingresa el usuario y devuelve
//verdadero si la contiene y falso si no.

    public void contiene(String letra) {
        String f;
        System.out.println("Ingres una LETRA");
        f = leer.next();
        System.out.println(this.frase.getFrase().toLowerCase().startsWith(f));

    }

    //Método unirFrases(String frase),
    //deberá unir la frase contenida en la clase Cadena con una nueva frase
    //ingresada por el usuario y mostrar la frase resultante.
    
    public void unirFrase(String frase) {
        String cadena1;
        System.out.println("Ingrese frase a unir");cadena1=leer.next().toLowerCase();
        //System.out.println("Ingrese la Nueva frase a unir");cadena1 = leer.nextLine();
        System.out.println(this.frase.getFrase().concat(" " + cadena1));
    }
}
