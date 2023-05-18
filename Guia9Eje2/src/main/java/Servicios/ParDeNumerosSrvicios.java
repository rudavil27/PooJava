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
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class ParDeNumerosSrvicios {
    Scanner leer = new Scanner(System.in);
    
    ParDeNumeros numeros = new ParDeNumeros();
    //ParDeNumeros n2=new ParDeNumeros();
    
    
    public void mostrarValores(){
        System.out.println("El numero 1  es  " + this.numeros.getNumero1());
        System.out.println("El numero 2  es  " + this.numeros.getNumero2());
    }
}
