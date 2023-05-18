/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persona;

import Entidades.Persona;
import PersonaService.PersonaServicio;

/**
 *
 * @author Ruben
 */
public class PersonaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio persona1 = new PersonaServicio();
        persona1.crearPersona();
        persona1.esMayorDeEdad();
        
        
        
        
       
    }

}
