


/**
 *
 * @author Ruben
 */
public class Mascota {
    private String nombre;
    private int edad;
    private String raza;
    private String tipo;

    public Mascota(String nombre, int edad, String raza, String tipo) {
        this.nombre = nombre;
        this.edad = edad;
        this.raza = raza;
        this.tipo = tipo;
    }
    public void mostrarInfo(){
        System.out.println("nombre:" + nombre
                + "Edad: "+ edad
                + "Raza: " + raza
                + "Tipo: " + tipo );
    
    
    }
    
   
}