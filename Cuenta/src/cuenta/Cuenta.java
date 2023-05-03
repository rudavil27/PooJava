/*
 Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad de dinero del saldo de la cuenta.
Asegúrate de que el saldo nunca sea negativo después de realizar una transacción de retiro.
 */
package cuenta;

import java.util.Scanner;

public class Cuenta {

    double cantidad;
    public int saldo;
    public String titular;

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public Cuenta() {
    }

        public void ingreseDinero(){
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese saldo");
        saldo = (int) leer.nextDouble();
        //saldo=Math.random(500,5000);
        if (saldo > 0) {
            System.out.println("Su saldo es : "+this.saldo);
        } else {
            System.out.println("No tiene saldo");
        }
    }
        public void retirarDinero(double cantidad) {
            Scanner leer = new Scanner(System.in);
        System.out.println("Dinero a retirar");
        cantidad = leer.nextDouble();
        if (saldo < cantidad) {
            System.out.println("No tenes plata pobre");
        } else {
            saldo -= cantidad;
            System.out.println("se a retirado dinero de la cuenta"+" " + cantidad);
        }
        }
   
    public void saldoRestante(){
          double restante;
           restante=(saldo-cantidad);
            System.out.println("Su saldo actual es: " + restante);
        }



}
