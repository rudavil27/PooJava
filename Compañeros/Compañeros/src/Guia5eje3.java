/*
Recorrer un vector de N enteros contabilizando cuántos números son 
de 1 dígito, cuántos de 2 dígitos, etcétera (hasta 5 dígitos).
 */
package guia5eje3;

import static java.lang.Math.random;
import java.util.Scanner;

        
/**
 *
 * @author ACER
 */
public class Guia5eje3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);

        int num, digitos ;
        int dig1=0, dig2=0, dig3=0, dig4=0, dig5=0;
        System.out.println("Ingrese el tamaño del vector");
        num = leer.nextInt();

        int vector[] = new int[num];

        for (int i = 0; i < num; i++) {

            vector[i] = (int) (random() * 100000);
           

            System.out.print("[" + vector[i] + "]");
       
            digitos = (int)(Math.log10(vector[i])+1);
            System.out.print("tiene "+digitos+ " digitos  ");
           
            System.out.println("  ");
            
             switch(digitos){
            case 1:
                dig1 = dig1 + 1;
                break;
            case 2:
                dig2 = dig2 + 1;
                break;
            case 3:
                dig3 = dig3 + 1;
                break;
            case 4:
                dig4 = dig4 + 1;
                break;
            case 5:
                dig5 = dig5 + 1;
                break;
        }  
            digitos = 0;
            }
System.out.print("El vector tiene "+dig1+ " N° de 1 digito, "  +dig2+ " N° de 2 digito, "  +dig3+ " N° de 3 digito, "  +dig4+ " N° de 4 digito, "   +dig5+ " N° de 5 digito, "  );
        }
       
       

    

}

    
    

