
import java.util.Scanner;
public class Rectangulo {

    private int base;
    private int altura;
    private int superficie, perimetro;

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    public Rectangulo() {
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getSuperficie() {
        return superficie;
    }

    public void setSuperficie(int superficie) {
        this.superficie = superficie;
    }

    public int getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(int perimetro) {
        this.perimetro = perimetro;
    }

    public void CrearRectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base: ");
        this.base = leer.nextInt();
        System.out.println("Ingrese la altura: ");
        this.altura = leer.nextInt();
    }

    public void CalcularSuperficie() {
        superficie = this.base * this.altura;
    }

    public void CalcularPerimetro() {
        perimetro = (this.base + this.altura) * 2;
    }

    public void DibujarRectangulo() {
        for (int i = 0; i <= this.altura; i++) {
            for (int j = 0; j <= this.base; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }

}
    

