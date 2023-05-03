
package encuentro4a6;

import java.util.Scanner;
public class ejextra06 {

    
    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      double estatura,promedioG,aux,aux1,promedioM6;
      aux =0; aux1 = 0;
      for (int i=0; i< 5; i++) {
          System.out.println("ingrese su estatura:  ");
          estatura = leer.nextDouble();
          if (estatura<1.60) {
              aux++;
              
          }
          aux1 = aux1 + estatura;
      }
      promedioM6 = (aux/5);
      promedioG = (aux1/5);
        System.out.println("el promedio de estaturas que se encuentran por debajo de 1.60mts es :  ");
        
    }

}
