/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CuentaBancaria;

import Entidad.CuentaBancaria;
import Servicios.CuentaBancariaServicio;

/**
 *
 * @author Ruben
 */
public class CuentaBancariaMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      CuentaBancariaServicio CBS = new CuentaBancariaServicio();
      
      CuentaBancaria CB = CBS.CrearCuenta();
      
      CBS.ingresar();
      CBS.retirar();
      CBS.ExtRapida();
      CBS.consutaSaldo();
      CBS.consultarDatos();
    }
}

  