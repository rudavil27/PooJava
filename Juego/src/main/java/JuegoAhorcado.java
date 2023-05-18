/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author Ruben
 */


   import java.util.Scanner;

public class JuegoAhorcado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] palabras = {"programacion", "java", "computadora", "algoritmo", "desarrollo"};
        String palabraSeleccionada = palabras[(int) (Math.random() * palabras.length)];
        int intentosMaximos = 7;
        int intentos = 0;
        boolean juegoTerminado = false;
        StringBuilder palabraActual = new StringBuilder();

        for (int i = 0; i < palabraSeleccionada.length(); i++) {
            palabraActual.append("_");
        }

        System.out.println("¡Bienvenido al juego del Ahorcado!");
        System.out.println("Tienes que adivinar la palabra. ¡Suerte!");

        while (!juegoTerminado) {
            System.out.println("Palabra actual: " + palabraActual);
            System.out.print("Ingrese una letra: ");
            String letra = scanner.nextLine();

            if (letra.length() != 1) {
                System.out.println("Ingrese una sola letra.");
                continue;
            }

            boolean letraAdivinada = false;

            for (int i = 0; i < palabraSeleccionada.length(); i++) {
                if (palabraSeleccionada.charAt(i) == letra.charAt(0)) {
                    palabraActual.setCharAt(i, letra.charAt(0));
                    letraAdivinada = true;
                }
            }

            if (!letraAdivinada) {
                intentos++;
                System.out.println("¡Incorrecto! Te quedan " + (intentosMaximos - intentos) + " intentos.");
            }

            if (intentos == intentosMaximos) {
                System.out.println("¡Perdiste! La palabra era: " + palabraSeleccionada);
                juegoTerminado = true;
            }

            if (palabraActual.toString().equals(palabraSeleccionada)) {
                System.out.println("¡Felicidades! ¡Ganaste!");
                juegoTerminado = true;
            }
        }
    }
}
