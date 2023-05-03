/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operacion;

/**
 *
 * @author Ruben
 */
public class OperacionMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Operacion op = new Operacion();
        
        
        op.HacerOperacion();
        op.sumar();
        op.restar();
        op.multiplicar();
        op.dividir();
    }
    
}
