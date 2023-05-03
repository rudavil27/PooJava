
package estudiante;

import java.util.Scanner;


public class Estudiantemain {
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
         
        Estudiante E1 = new Estudiante ("Ezequiel", 20,8.5);
        Estudiante E2 = new Estudiante("Dani", 21,4);
        Estudiante E3 = new Estudiante("Matias",42,5);
        
        Estudiante[] Estudiante = {E1,E2,E3};
     
        
         E1.mostrarEstudiantesmejornota(Estudiante);
         
          }
    
}
