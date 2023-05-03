
package empleado;

import java.util.Scanner;

/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y "salario".
Luego, crea un método "calcular_aumento" que calcule el aumento salarial de un
empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30 años o del 5% si tiene menos de 30 años.

*/


public class Empleado {
    
    public String nombre;
    public int edad;
    public double salario;
    double salarioActual;
    
    public void IngresarDatos(){
        Scanner leer =new Scanner(System.in);
        System.out.println("Igrese un Nombre");
        nombre=leer.next();
        System.out.println("Ingrese la Edad");
        edad=leer.nextInt();
        System.out.println("Ingrese el salario Actual");
        salario=leer.nextDouble();
           
    }
    
    
    public void CalcularAumento(){
        
        if (edad>=30){
            salarioActual= salario*0.1 +salario;
            
            
        }if (edad<30){
            salarioActual= salario*0.05 +salario ;
            
        }
            
        System.out.println("El salario actual es de : " + salarioActual);
    }
}
