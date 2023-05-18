/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números.
 */
package Entidad;

/**
 *
 * @author Ruben
 */
public class ParDeNumeros {
   double numero1;
    double numero2;

    public ParDeNumeros(){
    this.numero1 =Math.random()*100;
    this.numero2 =Math.random()*100;
}

    public ParDeNumeros(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
    }

    public double getNumero1() {
        return numero1;
    }

    public double getNumero2() {
        return numero2;
    }

    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }

    public void setNumero2(int numero2) {
        this.numero2 = numero2;
    }

}
