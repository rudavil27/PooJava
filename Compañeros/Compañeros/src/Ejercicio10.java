
import java.util.Scanner;
public class Ejercicio10 {

       /*int contador=1;
        System.out.println("Ingrese 4 numeros:");
        do {
            System.out.println("Ingrese un numero del rango 1 al 20");
            int num = leer.nextInt();

            if (num >= 1 && num <= 20) {
                contador++;
                System.out.print(num);
                for (int i = 0; i < num; i++) {
                    System.out.print("*");
                }
            } else {
                System.out.print("El numero ingresado en invalido");
            }
            System.out.println("");
        }while (contador<=4);

parte dos
*/
public static void main(String[] args) {        
           
           
         
        int contador=1;

        System.out.println("Ingrese 4 numeros:");
        do {
            System.out.println("Ingrese un numero del rango 1 al 20");
            int num = leer.nextInt();

            if (num >= 1 && num <= 20) {
                contador++;
                mostrar(num);
            } else {
                System.out.print("El numero ingresado en invalido");
            }

        }while (contador<=4);

        }
        public static void mostrar(int num){
            System.out.print(num);
            for (int i = 0; i < num; i++) {
                System.out.print("*");
            
            System.out.println("");
        }}}