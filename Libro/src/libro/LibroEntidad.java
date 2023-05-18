package libro;

import java.util.Scanner;

public class LibroEntidad {

    public int ISBN;
    public String Titulo;
    public String Autor;
    public int NumPaginas;

    public LibroEntidad(int ISBN, String Titulo, String Autor, int NumPaginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.NumPaginas = NumPaginas;
    }

    public LibroEntidad() {
    }

    public static void LibroEntidad() {
        Scanner leer = new Scanner(System.in);
        LibroEntidad libro1 = new LibroEntidad();
        System.out.println("Ingrese isbn");
        libro1.ISBN = leer.nextInt();
        System.out.println("Ingrese Titulo");
        libro1.Titulo = leer.next();
        System.out.println("Ingrese Autor");
        libro1.Autor = leer.next();
        System.out.println("Ingrese Numero de Pagina");
        libro1.NumPaginas = leer.nextInt();

        System.out.println("El ISBN es: " + libro1.ISBN);
        System.out.println("El Titulo es: " + libro1.Titulo);
        System.out.println("El Autor es: " + libro1.Autor);
        System.out.println("La pagina es: " + libro1.NumPaginas);

    }

}
