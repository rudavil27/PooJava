
import Servicio.ArregloService;



/*
Crear en el Main dos arreglos. El arreglo A de 50 números reales y el
arreglo B de 20 números reales. Crear la clase ArregloService, en el
paquete servicio, con los siguientes métodos:
1) Método inicializarA recibe un arreglo por parámetro y lo inicializa con
números aleatorios.
2) Método mostrar recibe un arreglo por parámetro y lo muestra por
pantalla.
3) Método ordenar recibe un arreglo por parámetro y lo ordena de
mayor a menor.
4) Método inicializarB copia los primeros 10 números del arreglo A en el
arreglo B. Luego llenar las últimas 10 posiciones del arreglo B con 0.5.
En el Main nuevamente: inicializar A, mostrar A, ordenar A, inicializar B,
mostrar A y B.

 */

/**
 *
 * @author Ruben
 */
public class MainGuia9Eje3Array {

    private static Double[] a;

    /**
     Crear en el Main dos arreglos.El arreglo A de 50 números reales y el
     arreglo B de 20 números reales. 
     * @param args

     */
    public static void main(String[] args ) {
        
        double ArregloA[] = new double[10];
        double ArregloB[] = new double[5];
        
        ArregloService ar1 = new  ArregloService();
        ArregloService ar2 = new  ArregloService();
        
        ar1.inicializarA(ArregloA);
        ar1.inicializarB(ArregloB);
        ar1.mostrarA(ArregloB);
        ar1.mostrarB(ArregloB);
      
       // ar1.ordenar(a);
        
        
    }
    
}
