/*
Programa Nespresso. Desarrolle una clase Cafetera en el paquete Entidades con los atributos
capacidadMáxima (la cantidad máxima de café que puede contener la cafetera) y
cantidadActual (la cantidad actual de café que hay en la cafetera). 
Agregar constructor vacío y con parámetros así como setters y getters.
Crear clase CafeteraServicio en el paquete Servicios con los siguiente:
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad máxima. 
Método servirTaza(int): se pide el tamaño de una taza vacía,
el método recibe el tamaño de la taza y simula la acción de servir la taza con la capacidad indicada.
Si la cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede.
El método le informará al usuario si se llenó o no la taza, y de no haberse llenado en cuanto quedó la taza.
Método vaciarCafetera(): pone la cantidad de café actual en cero. 
Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo recibe 
y se añade a la cafetera la cantidad de café indicada.
 and open the template in the editor.
 */
package Servicios;

import Entidades.Cafetera;
import java.util.Scanner;

public class CafeteraDeServicios {
Scanner leer= new Scanner(System.in);
    Cafetera c = new Cafetera();

    public Cafetera llenarCafetera() {
        c.setCantidadActual((int) (Math.random()*1000));
        
        do {
            c.setCantidadActual(c.getCantidadActual()+1);
        } while (c.getCapacidadMaxima()!= c.getCantidadActual());
        System.out.println("Se lleno la cafetera\n");
        return c;
    }

    public Cafetera servirTaza() {
        System.out.println("Ingrese el tamaño de la taza en ml");
        int taza = leer.nextInt();
        int cont = 0;
        if (taza <= c.getCantidadActual()) {
            c.setCantidadActual(c.getCantidadActual() - taza);
            System.out.println("Se lleno la taza\n");
        } else {
            do {
                cont++;
                c.setCantidadActual(c.getCantidadActual()- 1);
            } while (c.getCantidadActual()!= 0);
            System.out.println("No habia cafe suficiente y se lleno "
                    + cont + " Ml de cafe\n");
        }
        return c;
    }

    public Cafetera vaciarCafetera() {
        do {
            c.setCantidadActual(c.getCantidadActual() - 1);
        } while (c.getCantidadActual() != 0);
        System.out.println("Se vacio la cafetera\n");
        return c;
    }

    public Cafetera agregarCafe() {
        System.out.println("Ingrese la cantidad de cafe que desea agregar (en ml)");
        int aux = leer.nextInt();
        int cont = 0;
        c.setCantidadActual(c.getCantidadActual() + aux);
        if (c.getCantidadActual() <= c.getCapacidadMaxima()) {
            System.out.println("Se lleno la cafetera! \n");
        } else {
            do {
                cont++;
                c.setCantidadActual(c.getCantidadActual() - 1);
            } while (c.getCantidadActual() != c.getCapacidadMaxima());
            System.out.println("Llego al limite de la cafetera, le sobro " + cont + " Ml de cafe\n");
        }
        return c;
    }
}

/*   Cafetera Kfe = new Cafetera();
    
public void llenarCafetera(){
  Kfe.setCapacidadMaxima(30);
  Kfe.setCantidadActual(Kfe.getCapacidadMaxima());
      
}
public void servirTaza(){
  double taza = 1.5;
   
    for (int i = 0; i <Kfe.getCantidadActual(); i++) {
        System.out.println(""+i);
           
       }
 
       
   }*/
