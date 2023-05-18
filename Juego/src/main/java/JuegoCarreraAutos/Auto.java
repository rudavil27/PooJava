/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package JuegoCarreraAutos;

/**
 *
 * @author Ruben
 */
 class Auto {
    private String nombre;
    private int posicion;

    public Auto(String nombre) {
        this.nombre = nombre;
        this.posicion = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPosicion() {
        return posicion;
    }

    public void acelerar() {
        posicion += (int) (Math.random() * 3) + 1;
    }

    public void frenar() {
        posicion -= (int) (Math.random() * 2) + 1;
        if (posicion < 0) {
            posicion = 0;
        }
    }

    public boolean haLlegado() {
        return posicion >= 100;
    }
}
    
