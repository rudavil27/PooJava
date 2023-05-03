/*
 Crear una clase llamada Operacion que tenga como atributos privados numero1 y numero2.
A continuación, se deben crear los siguientes métodos:
Método constructor con todos los atributos pasados por parámetro.
Método constructor sin los atributos pasados por parámetro.
Métodos get y set.
Método para crearOperacion():
que le pide al usuario los dos números y los guarda en los atributos del objeto.
Método sumar(): calcular la suma de los números y devolver el resultado al main.
Método restar(): calcular la resta de los números y devolver el resultado al main
Método multiplicar(): primero valida que no se haga una multiplicación por cero,
si fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le informa al usuario el error
se le informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

 */
package operacion;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Operacion {

    private int numero1;
    private int numero2;

    public Operacion(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public Operacion() {

    }

    public int getNumero1() {
        return numero1;
    }

    public int getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

    public void HacerOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese los numeros: ");
       setNumero1(leer.nextInt());
       
       setNumero2(leer.nextInt());
        
       // System.out.println(this.numero1);
       // System.out.println(this.numero1);
    }
    public int sumar(){
         int suma =this.numero1+this.numero2;
         System.out.println("La suma de los Numeros es: "+suma);
         return suma;
         
    }
    public int restar(){
         int resta =this.numero1-this.numero2;
         System.out.println("La resta de los Numeros es: "+resta);
         return resta;
    }
    public int multiplicar(){
         int multiplicar =this.numero1*this.numero2;
         System.out.println("La multiplicacion de los Numeros es: "+multiplicar);
         return multiplicar;
    }
    public double dividir(){
         double dividir =this.numero1/this.numero2;
         System.out.println("La division de los Numeros es: "+dividir);
         return dividir;
                 
                 
                 
                 
                 
    }

}
