/*
 Escriba un programa que averigüe si dos vectores de N enteros son iguales
(la comparación deberá detenerse en cuanto se detecte alguna diferencia entre los elementos).
 */

package Guia5EjExtra;
/**
 * @author Ruben
 */
public class Guia5EjExtra2 {
    
    public static void main(String[] args) {
        int[] vec = new int[3];
    int[] vec1= new int[3];
     
        for (int i = 0; i < 3; i++) {
            vec[i]= (int) Math.round((Math.random()*0));
           System.out.println("["+vec[i]+"]" );                  
            }
        
              System.out.println("");
              
        for (int i = 0; i < 3; i++) {
            vec1[i]= (int) Math.round((Math.random()*0));    
            System.out.println("["+vec1[i]+"]" );
            }
    
              if (vec==vec1){
                  
                 System.out.println("SON IGUALES");
            }else{
                  System.out.println("Ni se parecen");
             }
    }
}


   
    
    
        
 
            
