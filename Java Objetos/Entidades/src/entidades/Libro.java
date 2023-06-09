/*
 Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los atributos
pasados por parámetro y un constructor vacío. Crear un método para cargar un libro
pidiendo los datos al usuario y luego informar mediante otro método el número de ISBN,
el título, el autor del libro y el número de páginas.
and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Ruben
 */
public class Libro {
   public String isbn;
   public String titulo;
   public String autor;
   public int numPagina;

    public Libro(String isbn, String titulo, String autor, int numPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
    }
}
