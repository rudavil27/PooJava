/*
 
 */
package Entidad;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Persona {
        Scanner leer= new Scanner(System.in);
    
    private String nombre;
    private Date nacimiento;

    public Persona() {
    }

    public Persona(String nombre, Date nacimiento) {
        this.nombre = nombre;
        this.nacimiento = nacimiento;
    }

    

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(Date nacimiento) {
        this.nacimiento = nacimiento;
    }
    
    public Date fechaNacimiento() {
        int anio, mes, dia;
        //Date fecha = new Date();
        System.out.println("Ingrese fecha de nacimiento dia , mes, anio");
        dia = leer.nextInt();
        mes = leer.nextInt()-1;
        anio = leer.nextInt()-1900;
        
        return new Date (anio, mes,dia);
    }

    
}  

