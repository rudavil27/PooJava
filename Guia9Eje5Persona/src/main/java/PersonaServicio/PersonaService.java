/*
 Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
package PersonaServicio;

import Entidad.Persona;
import java.awt.BorderLayout;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class PersonaService {

    Scanner leer = new Scanner(System.in);
// a) Método crearPersona que pida al usuario Nombre y fecha de
// nacimiento de la persona a crear. Retornar el objeto Persona creado.

    public Persona crearPersona() {

        Persona pers = new Persona();
        System.out.println("Ingrese el nombre");
        pers.setNombre(leer.next());
        pers.setNacimiento(pers.fechaNacimiento());

        return pers;
    }
//b) Método calcularEdad que calcule la edad del usuario utilizando el
//   atributo de fecha de nacimiento y la fecha actual.

    public int calcularEdad(Persona pers) {

        Date fechaActual = new Date();

        return fechaActual.getYear() - pers.getNacimiento().getYear();

    }
    // c) Método menorQue recibe como parámetro una Persona y una edad.
    //Retorna true si la persona es menor que la edad consultada o false 

    public boolean menorque(Persona pers, int edad) {

        System.out.println("Ingrese la edad limite");
        int edadT = leer.nextInt();
       
        
        return (edad<edadT);

    }
// d) Método mostrarPersona que muestra la información de la persona
//    deseada

    public void mostrarPersona(Persona pers) {
        System.out.println("La persona se Llama "  +  pers.getNombre() + "\n" + "Su fecha de naciemiento es " +  pers.getNacimiento() + "\n");
        }
}
