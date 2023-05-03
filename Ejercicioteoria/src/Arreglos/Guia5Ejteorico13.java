/*
 Ejercicio 13
Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus nombres más adelante.
 
 */

package Arreglos;
import java.util.Scanner;
/** 
 * @author Ruben
 */
public class Guia5Ejteorico13 {
public static void main(String[] args) {
Scanner leer=new Scanner(System.in);        
        String[] Equipo = new String [7];
        for (int i=0; i <7; i++) {
            System.out.println("Ingrese nombre de su compañero " +(i+1));
            Equipo[i]=leer.nextLine();
        }
        System.out.println("Los nombres de sus compañeros de equipo son: ");
        for (int i=0; i<7;i++) {
            System.out.println(Equipo[i]);
        }
        /*String aux="";
        for (String elemento: Equipo) {
            aux=elemento;
            System.out.println(aux);*/
        }
}