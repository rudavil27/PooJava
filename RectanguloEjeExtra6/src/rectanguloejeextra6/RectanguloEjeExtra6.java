/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" 
y un método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados de 4 y 6 y imprime el área del rectángulo
 */
package rectanguloejeextra6;

/**
 *
 * @author Ruben
 */
public class RectanguloEjeExtra6 {
    public int lado1;
    public int lado2;

    public int getLado1() {
        return lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }
 
 
    public void Rectangulo1(){
          
     lado1=4;
     lado2=6;
        int area = (int) (lado1 * lado2);

        System.out.println("El Area es: " + area);
       
    }
    
}

