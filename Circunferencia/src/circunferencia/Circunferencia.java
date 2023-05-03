/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de tipo real.
A continuación, se deben crear los siguientes métodos:
Método constructor que inicialice el radio pasado como parámetro.
Métodos get y set para el atributo radio de la clase Circunferencia.
Método para crearCircunferencia(): que le pide el radio y lo guarda  en el atributo del objeto.
Método area(): para calcular el área de la circunferencia (Area=〖π*radio〗^2).
Método perimetro(): para calcular el perímetro (Perimetro=2*π*radio).

*/
package circunferencia;

import java.util.Scanner;


public class Circunferencia {
   public Circunferencia() {
    } 
    private double radio;

      
    public Circunferencia(double radio) {//Contructor Privado
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }
    
   
    public void HacerCircunferencia(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el radio: ");
        this.setRadio(leer.nextDouble());
    } 
    public void areacirculo(){
       double area = Math.PI*(Math.pow(this.radio, 2));
        System.out.println("El área del círculo es: " + area);
    }
     public void perimetrocirculo(){
        double Perimetro = (2*Math.PI*this.radio);
        System.out.println("El perimetro del círculo es: " + Perimetro);
    }
    
    
}
  


