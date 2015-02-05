/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.entidades.tiposCliente;

import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.observerPaquetes.HorasRestantesObserver;
import ar.com.pahema.entidades.Paquete;
import ar.com.pahema.utils.MailSender;
import ar.com.pahema.ventanas.DatosComunesClientes;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.commons.mail.EmailException;

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
            try {
                if(this.getEmail().trim().equals(""))
                    throw new RuntimeException("No hay una direccion de mail");
                MailSender.enviar(this.getEmail());
            } catch (EmailException ex) {
                System.out.println(ex.getMessage());
                
            }
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
