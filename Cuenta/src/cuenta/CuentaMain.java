/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuenta;

/**
 *
 * @author Ruben
 */
public class CuentaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cuenta c1= new Cuenta();
        
        
        c1.ingreseDinero();
        c1.retirarDinero(0);
        c1.saldoRestante();
    }
   
    
}
