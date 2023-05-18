/*
Realizar una clase llamada CuentaBancariaMain en el paquete Entidades con los siguientes atributos:
numeroCuenta(entero), dniCliente(entero largo), saldoActual. Agregar constructor vacío,
con parámetros, getters y setters.
Agregar la clase CuentaBancariaServicio en el paquete Servicios que contenga:
Método para crear cuenta pidiéndole los datos al usuario.
Método ingresar(double): recibe una cantidad de dinero a ingresar y se le sumará al saldo actual.
Método retirar(double): recibe una cantidad de dinero a retirar y se le restara al saldo actual.
Si la cuenta no tiene la cantidad de dinero a retirar se retirará el máximo posible hasta dejar la cuenta en 0.
Método extraccionRapida: le permitirá sacar solo un 20% de su saldo. Validar que el usuario no saque más del 20%.
Método consultarSaldo: permitirá consultar el saldo disponible en la cuenta.
Método consultarDatos: permitirá mostrar todos los datos de la cuenta.



 */
package Servicios;

import Entidad.CuentaBancaria;
import java.util.Scanner;

/*private Scanner leer=new Scanner(System.in)useDelimiter("\n");*
 *
 * @author Ruben
 */
public class CuentaBancariaServicio {

    Scanner leer = new Scanner(System.in);
    CuentaBancaria CB = new CuentaBancaria();


    /*
    public CuentaBancaria crearCuenta(){
        System.out.println("Ingrese su nombre"); CB.setNombre(leer.next());
        System.out.println("Ingrese su DNI"); CB.setDniCliente(leer.nextLong());
        System.out.println("Su numero de cuenta es: " + CB.getNumeroCuenta());
        return CB;
    }
     */
    public CuentaBancaria CrearCuenta() {

        System.out.println(" Ingrese el numero de su cuenta: ");
        CB.setNumeroCuenta(leer.nextInt());
        System.out.println(" Ingrese el numero de su DNI : ");
        CB.setDniCliente(leer.nextLong());
        System.out.println(" Tenes en su cuenta un saldo actual de :");
        CB.setSaldoActual(Math.random() * 200);

        System.out.println(CB.getSaldoActual());
        return CB;
    }

    public CuentaBancaria ingresar() {
        System.out.println(" Ingrese el valor que vas a depositar en su cuenta: ");
        double ingresar = leer.nextDouble();

        CB.setSaldoActual(CB.getSaldoActual() + ingresar);

        //System.out.println("Su saldo es de : "+ CB.getSaldoActual());
        return CB;
    }

    public CuentaBancaria retirar() {
        System.out.println(" Ingrese el valor que vas a retirar en su cuenta: ");
        double retiro = leer.nextDouble();

        if (CB.getSaldoActual() <= retiro) {

            System.out.println("Su saldo para retirar es : " + CB.getSaldoActual());

        } else {
            CB.setSaldoActual(CB.getSaldoActual());
            retiro = leer.nextDouble();
            CB.setSaldoActual(CB.getSaldoActual() - retiro);

            System.out.println("usted retiro" + retiro);

        }
        return CB;
     }    

    public CuentaBancaria ExtRapida() {

        double eRapida = CB.getSaldoActual() * 0.2;
        if (CB.getSaldoActual() <= eRapida) {
            System.out.println("No tiene fondos para Suficientes");

        } else {
            CB.setSaldoActual(CB.getSaldoActual() - eRapida);

        }
        return CB;

    }

    public CuentaBancaria consutaSaldo() {

        System.out.println(" Su saldo actual es de : " + CB.getSaldoActual());

        return CB;
    }
public CuentaBancaria consultarDatos(){
    System.out.println("Numero de cuenta es: "+ CB.getNumeroCuenta());
    System.out.println("Numero de dni es: "+ CB.getDniCliente());
    System.out.println("Le quedo un saldo de: "+ CB.getSaldoActual());
    
return null;
        }
}

/*public void saldoRestante(){
        double restante;
        
          restante = CB.getSaldoActual(retirar);
            System.out.println("Su saldo actual es: " + restante);
        }
 */
  

/*public CrearCuenta(){
        System.out.println("Ingrese su nombre"); CB.setNombre(leer.next());
        System.out.println("Ingrese su DNI"); CB.setDniCliente(leer.nextLong());
        System.out.println("Su numero de cuenta es: " + CB.getNumeroCuenta());
        return CB;
    

    public CuentaBancariaMain ingresar(){
        double ingreso;
        System.out.println("Dinero que desea ingresar: "); ingreso = leer.nextDouble();
        CB.setSaldoActual(CB.getSaldoActual() + ingreso);
        return CB;
 */
