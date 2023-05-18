/*
Crear una clase Rectángulo que modele rectángulos por medio
de un atributo privado base y un atributo privado altura.
La clase incluirá un método para crear el rectángulo con los datos del Rectángulo dados por el usuario.
También incluirá un método para calcular la superficie del rectángulo y 
un método para calcular el perímetro del rectángulo.
Por último, tendremos un método que dibujará el rectángulo mediante asteriscos usando la base y la altura.
Se deberán además definir los métodos getters, setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.

 */
package rectangulo;

import java.util.Scanner;

/**
 *
 * @author Ruben
 */
public class Rectangulo {

    private double base;
    private double altura;

    public Rectangulo() {
    }

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void CreaRactangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valores : ");
        base = leer.nextDouble();
        System.out.println("");
        altura = leer.nextDouble();

        System.out.println("El rectangulo tendra estos valores: " + "Base: " + base + "" + "Altura: " + altura);

    }

    public double SerficieRect() {

        int superficie = (int) (base * altura);

        System.out.println("La superficie es: " + superficie);
        return superficie;
    }

    public double PerimRect() {

        int perimetro = (int) (base + altura) * 2;

        System.out.println("El Perimetro es: " + perimetro);
        return perimetro;
    }

    public void DibuRectangulo() {
        //int i=0;
        //int j=0;
        //double b = this.base;
        //double a = this.altura;

        //while(i<b) {
        //while (j < a) {
        for (int i = 0; i <= this.altura; i++) {
            for (int j = 0; j <= this.base; j++){
               System.out.println("*");
            }  
                System.out.println(" ");
                
            }

        }
    }

