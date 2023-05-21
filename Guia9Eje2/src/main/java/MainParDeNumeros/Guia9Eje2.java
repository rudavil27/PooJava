/*
 Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
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
package MainParDeNumeros;

import Servicios.ParDeNumerosServicios;

/**
 *
 * @author Ruben
 */
public class Guia9Eje2 {

    public static void main(String[] args) {
        ParDeNumerosServicios num1 = new ParDeNumerosServicios();

        num1.mostrarValores();
        num1.devolverMayor();
        int calcularPotencia = num1.calcularPotencia();
        num1.calculaRaiz();
    }
}
