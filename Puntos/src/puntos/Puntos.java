/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos puntos,
sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos()
que le pide al usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular
y devolver la distancia que existe entre los dos puntos que existen en la clase Puntos.
Para conocer como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
d(P_1,P_2)=\sqrt{(x_2-x_1)^2+ (y_2-y_1)^2 }
 */
package puntos;

import java.util.Scanner;

public class Puntos {

    private int x1, x2, y1, y2;

    public int getX1() {
        return x1;
    }

    public int getX2() {
        return x2;
    }

    public int getY1() {
        return y1;
    }

    public int getY2() {
        return y2;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public void crearPunto() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Igrese numeros para x1 e x2");
        this.x1 = leer.nextInt();
        this.x2 = leer.nextInt();
        System.out.println("Igrese numeros para y1 e y2");
        this.y1 = leer.nextInt();
        this.y2 = leer.nextInt();

    }

    public void calcular() {
        //int distancia = (int) Math.sqrt(Math.pow(this.x2-this.x1,2)+Math.pow(this.y2-this.y1,2);

        int d;
        d = (int) Math.sqrt(Math.pow(this.x2 - this.x1, 2) + Math.pow(this.y2 - this.y1, 2));

        System.out.println("La distansia  de los puntos es: "+d);
        
    }
}
