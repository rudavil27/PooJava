/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package JuegoCarreraAutos;

/**
 *
 * @author Ruben
 */

    import java.util.Scanner;

public class JuegoCarreraAutos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("¡Bienvenido al juego de autos de carrera!");

        System.out.print("Ingrese el nombre del primer auto: ");
        String nombreAuto1 = scanner.nextLine();
        Auto auto1 = new Auto(nombreAuto1);

        System.out.print("Ingrese el nombre del segundo auto: ");
        String nombreAuto2 = scanner.nextLine();
        Auto auto2 = new Auto(nombreAuto2);

        System.out.println("Comienza la carrera!");

        while (!auto1.haLlegado() && !auto2.haLlegado()) {
            System.out.println("Turno de " + auto1.getNombre());
            System.out.print("Ingrese 'a' para acelerar o 'f' para frenar: ");
            String accionAuto1 = scanner.nextLine();

            if (accionAuto1.equalsIgnoreCase("a")) {
                auto1.acelerar();
            } else if (accionAuto1.equalsIgnoreCase("f")) {
                auto1.frenar();
            }

            System.out.println("Turno de " + auto2.getNombre());
            System.out.print("Ingrese 'a' para acelerar o 'f' para frenar: ");
            String accionAuto2 = scanner.nextLine();

            if (accionAuto2.equalsIgnoreCase("a")) {
                auto2.acelerar();
            } else if (accionAuto2.equalsIgnoreCase("f")) {
                auto2.frenar();
            }

            System.out.println("Estado de la carrera:");
            System.out.println(auto1.getNombre() + ": " + auto1.getPosicion());
            System.out.println(auto2.getNombre() + ": " + auto2.getPosicion());
        }

        if (auto1.haLlegado() && auto2.haLlegado()) {
            System.out.println("¡Es un empate!");
        } else if (auto1.haLlegado()) {
            System.out.println(auto1.getNombre() + " ha ganado la carrera!");
        } else {
            System.out.println(auto2.getNombre() + " ha ganado la carrera!");
        }
    }
}

