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
package Entidades;

/**
 *
 * @author Ruben
 */
public class Cafetera {
   int CapacidadMaxima;
   int CantidadActual;
    

public Cafetera(){

}
public Cafetera(int CapacidadMaxima,int CantidadActual ){

    this.CapacidadMaxima= CapacidadMaxima;
    this.CantidadActual= CantidadActual;
    
    
}

    public void setCapacidadMaxima(int CapacidadMaxima) {
        this.CapacidadMaxima = CapacidadMaxima;
    }

    public void setCantidadActual(int CantidadActual) {
        this.CantidadActual = CantidadActual;
    }

    public int getCapacidadMaxima() {
        return CapacidadMaxima;
    }

    public int getCantidadActual() {
        return CantidadActual;
    }

}