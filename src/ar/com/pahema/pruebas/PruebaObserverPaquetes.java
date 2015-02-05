/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.pruebas;

import ar.com.pahema.entidades.Llave;
import ar.com.pahema.entidades.tiposCliente.ClientePaqueteHoras;
import ar.com.pahema.observerPaquetes.AlarmaHorasPaquete;

/**
 *
 * @author Dante
 */
public class PruebaObserverPaquetes {

    public static void main(String[] args) {
        Llave llave = new Llave();
        llave.setTipo("virtual");
        AlarmaHorasPaquete a = new AlarmaHorasPaquete();
        ClientePaqueteHoras c = new ClientePaqueteHoras("razon soci", null, null, null, null, null, null, null, null, llave, 10);
        a.agregarObservador(c);
        
        System.out.println(c.getPaquete().getHorasRestantes());
        c.getPaquete().consumir(1);
        c.getPaquete().consumir(1);
        c.getPaquete().consumir(1);
        c.getPaquete().consumir(1);
        c.getPaquete().consumir(1);
        c.getPaquete().consumir(1);
        c.getPaquete().consumir(1);
        c.getPaquete().consumir(1);

      
        
    }

}
