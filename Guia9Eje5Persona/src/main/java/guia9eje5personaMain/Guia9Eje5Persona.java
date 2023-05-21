/*
Implemente la clase Persona en el paquete entidades. Una persona tiene
un nombre y una fecha de nacimiento (Tipo Date), constructor vacío,
constructor parametrizado, get y set. Crear una clase PersonaService,
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

package guia9eje5personaMain;

import Entidad.Persona;
import PersonaServicio.PersonaService;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Guia9Eje5Persona {

    public static void main(String[] args) {
         Scanner leer = new Scanner(System.in);
        
        
        PersonaService ps = new PersonaService();
        Persona persona = ps.crearPersona();
        System.out.println("La edad es: " + ps.calcularEdad(persona));
        ps.menorque(persona, 0);
        ps.mostrarPersona(persona);
       
    }

}
    

