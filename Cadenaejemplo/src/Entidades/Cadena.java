/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author Ruben
 */
public class Cadena {

    String frase;
    int longitud;

    public Cadena(String frase) {
        this.frase = frase;
        this.longitud = frase.length();

    }

    public Cadena() {
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setFrase(String frase) {
        this.frase = frase;
        this.longitud = frase.length();
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

}
