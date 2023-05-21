/*
 * 
 */
package Servicio;

import java.util.Arrays;
import java.util.Random;

/**
 * Crear la clase ArregloService, en el paquete servicio, con los siguientes
 * métodos: 1) Método inicializarA recibe un arreglo por parámetro y lo
 * inicializa con números aleatorios. 2) Método mostrar recibe un arreglo por
 * parámetro y lo muestra por pantalla. 3) Método ordenar recibe un arreglo por
 * parámetro y lo ordena de mayor a menor. 4) Método inicializarB copia los
 * primeros 10 números del arreglo A en el arreglo B. Luego llenar las últimas
 * 10 posiciones del arreglo B con 0. 5. En el Main nuevamente: inicializar
 * A,mostrar A, ordenar A, inicializar B, mostrar A y B.
 */
public class ArregloService {

    Random random = new Random();
    MainGuia9Eje3Array a = new MainGuia9Eje3Array();
    MainGuia9Eje3Array b = new MainGuia9Eje3Array();

    public void inicializarA(double a[]) {

        for (int i = 0; i < 10; i++) {
            a[i] = (int) Math.floor(random.nextDouble() * 100);
            //Arrays.fill(arregloA, i);

        }
        //System.out.println(Arrays.toString(a));
    }

    public void inicializarB(double[] b) {

        for (int i = 0; i < 5; i++) {
            b[i] = (int) Math.floor(random.nextDouble() * 20);
            //Arrays.fill(arregloB, i);
        }
       // System.out.println(Arrays.toString(b));
    }

    private static class MainGuia9Eje3Array {

        public MainGuia9Eje3Array() {
        }
    }
    //   2) Método mostrar recibe un arreglo por
    //      parámetro y lo muestra por pantalla.

    public void mostrarA(double a[]) {
        System.out.println("A"+ Arrays.toString(a));
    }

    public void mostrarB(double b[]) {
        System.out.println("B"+ Arrays.toString(b));
    }
    //3) Método ordenar recibe un arreglo por

    //public void ordenar(Double a[]) {
    //  Arrays.toString(Arrays.sort(double a));
    //System.out.println(Arrays.toString(a));
}
