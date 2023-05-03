
package estudiante;

/**
 *
 * @author Ruben
 */
public class Estudiante {
    
    private String nombre;
    private int edad;
    private double notaMedia;
    private double notaMediaGrupo;

    public Estudiante(String nombre, int edad, double notaMedia) {
        this.nombre = nombre;
        this.edad = edad;
        this.notaMedia = notaMedia;
        
    }
public double getNotaMedia(){
    return notaMedia;
}    
public String getnombre(){
return nombre;
}

public void calcularNotaMedia(Estudiante[] Estudiante) {
double sumaNota = 0 ;
int cantidadEstudiantes;
        cantidadEstudiantes = Estudiante.length;
    for (int i = 0; i < cantidadEstudiantes; i++) {
        sumaNota += Estudiante[i].getNotaMedia();
        
    }
    this.notaMediaGrupo = sumaNota/cantidadEstudiantes;

}
 
public  void mostrarEstudiantesmejornota(Estudiante[] estudiante){
    calcularNotaMedia(estudiante);
    int cantidadEstudiantes = estudiante.length;
    for (int i = 0; i < cantidadEstudiantes; i++) {
    if(estudiante[i].getNotaMedia() > this.notaMediaGrupo) {
        System.out.println(estudiante[i].nombre + "-"+ estudiante[i].getNotaMedia());
    } 
    
    }
}
}
    
