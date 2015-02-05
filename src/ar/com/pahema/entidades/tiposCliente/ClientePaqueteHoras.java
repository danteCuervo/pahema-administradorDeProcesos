/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.entidades.tiposCliente;

import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.observerPaquetes.HorasRestantesObserver;
import ar.com.pahema.entidades.Llave;
import ar.com.pahema.observerPaquetes.Observado;
import ar.com.pahema.entidades.Paquete;
import ar.com.pahema.ventanas.DatosComunesClientes;
import javax.persistence.Entity;

/**
 *
 * @author Dante
 */
public class ClientePaqueteHoras extends Cliente implements HorasRestantesObserver {

    private Paquete paquete;

    public ClientePaqueteHoras(DatosComunesClientes datos) {
        super(datos);
    }

    public void enviar() {
        if (this.paquete.getHorasRestantes() <= 2) {
            System.out.println("funciona bien el observer de cantidad de horaa");
            //MailSender.enviarMail(c.getPaquete().getHorasRestantes(),c.getPaquete().getCantidadHoras(),c.getEmail());
        }
        
    }

    /**
     * @return the paquete
     */
    public Paquete getPaquete() {
        return paquete;
    }

    /**
     * @param paquete the paquete to set
     */
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }   
    

}
