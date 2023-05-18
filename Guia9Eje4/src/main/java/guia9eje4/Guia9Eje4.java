/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package guia9eje4;

import Servicio.FechaService;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Guia9Eje4 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
    
        
    Scanner leer = new Scanner(System.in);
         Date fe = new Date();

        FechaService fecha = new FechaService();
        
        fe = fecha.fechaNacimiento();
        
        System.out.println( fe);
        System.out.println("");
        
        System.out.println(fecha.fechaActual());
        System.out.println("La edad es de:");
        
        
        
        System.out.println(fecha.diferencia(fecha.fechaActual(), fe));
        
    }

}
    
    
