/*
Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
package Servicios;

import Entidad.ParDeNumeros;
import static java.lang.Math.abs;
import static java.lang.Math.sqrt;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class ParDeNumerosServicios {

    Scanner leer = new Scanner(System.in);

    ParDeNumeros numeros = new ParDeNumeros();
    //ParDeNumeros n2=new ParDeNumeros();

    public void mostrarValores() {
        System.out.println("El numero 1  es  " + this.numeros.getNumero1());
        System.out.println("El numero 2  es  " + this.numeros.getNumero2());
    }
//b) Método devolverMayor para retornar cuál de los dos atributos tiene
//el mayor valor  

    public void devolverMayor() {
        if (this.numeros.getNumero1() > this.numeros.getNumero2()) {
            System.out.println("el Numero Mayor  es " + this.numeros.getNumero1());
        } else if (this.numeros.getNumero1() < this.numeros.getNumero2()) {
            System.out.println("el Numero Mayor  es " + this.numeros.getNumero2());
        }
    }
//c) Método calcularPotencia para calcular la potencia del mayor valor de
//la clase elevado al menor número. Previamente se deben redondear
//ambos valores.

    public int calcularPotencia() {
        int c;
        int a = (int) Math.round(this.numeros.getNumero1());
        int b = (int) Math.round(this.numeros.getNumero2());

        System.out.println("Numero1 redondeado" + a + "Numero2 redondeado " + b);

        int d = Math.max(a, b);
        int e = Math.min(a, b);

        if (d > e) {
            c = (int) Math.pow(d, e);
        } else {
            c = (int) Math.pow(e, d);
        }

        System.out.println("El resultado de la potencia es " + c);
        return c;

    }
    // d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
    //dos valores. Antes de calcular la raíz cuadrada se debe obtener el 
    //valor absoluto del número.

    public void calculaRaiz() {
        double a = abs(this.numeros.getNumero1());
        double b = abs(this.numeros.getNumero2());
        //int c =Math.min(a,b);

        if (a < b) {
            double d = Math.sqrt(a);
            System.out.println("La Raiz del Numero Menor es " + d);
        } else if (a > b) {
            double e = Math.sqrt(b);
            System.out.println("La Raiz del Numero Menor es " + e);

        }

    }

}
