/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class FechaService {

    private Scanner leer = new Scanner(System.in);

    public Date fechaNacimiento() {
        int anio, mes, dia;
        //Date fecha = new Date();
        System.out.println("Ingrese fecha de nacimiento dia , mes, anio");
        dia = leer.nextInt();
        mes = leer.nextInt()-1;
        anio = leer.nextInt()-1900;
        
        return new Date (anio, mes,dia);
    }

    
//    Método fechaActual que cree un objeto fecha con el día actual. Para
//esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
//fechaActual = new Date();
    
    public Date fechaActual(){
        
        
     Date fechaActual = new Date();
        
        return fechaActual;
    }
    
//    Método diferencia que reciba las dos fechas por parámetro y retorna
//la diferencia de años entre una y otra (edad del usuario).
    
    public int diferencia(Date fecha1,Date fecha2){
//        
//        System.out.println(fecha1.getYear());
//        System.out.println();
        
        
        return fecha1.getYear() - fecha2.getYear();
        
    }
    
    
}
