/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CadenaMain;

import Entidades.Cadena;
import cadenaSevicio.CadenaServicio;

/**
 *
 * @author Ruben
 */
public class CadenaMaines {
    
    private static String frase;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CadenaServicio frase1 = new CadenaServicio();
        Cadena otra = frase1.CrearFrase();
        frase1.mostrarVocales();
        frase1.invertirFrase();
        frase1.vecesRepetido();
        frase1.comparaFrase(frase);
        frase1.reemplazar();
        frase1.contiene(frase);
        frase1.unirFrase(frase);        
    }
    
}
