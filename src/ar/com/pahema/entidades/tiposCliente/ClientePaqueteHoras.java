/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.entidades.tiposCliente;

import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.observerPaquetes.HorasRestantesObserver;
import ar.com.pahema.entidades.Paquete;
import ar.com.pahema.observerPaquetes.AlarmaHorasPaquete;
import ar.com.pahema.utils.MailSender;
import ar.com.pahema.ventanas.DatosComunesClientes;
import java.beans.Transient;
import java.io.Serializable;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.CascadeType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.apache.commons.mail.EmailException;

/**
 *
 * @author Dante
 */
@Entity
@Table(name = "Clientes")
@DiscriminatorValue("PAHS")
public class ClientePaqueteHoras extends Cliente implements HorasRestantesObserver {
    
    @OneToOne(cascade = CascadeType.ALL)
    private Paquete paquete;

    public ClientePaqueteHoras() {
    }

    public ClientePaqueteHoras(DatosComunesClientes datos) {
        super(datos);
    }

    public ClientePaqueteHoras(DatosComunesClientes datos, Paquete paquete) {
        super(datos);
        setPaquete(paquete);
    }

    public void enviar() {
        if (this.paquete.getHorasRestantes() <= this.paquete.getAvisoALaHora()) {
            try {
                if (this.getEmail().trim().equals("")) {
                    throw new RuntimeException("No hay una direccion de mail");
                }
                MailSender.enviar(this.getEmail(),this.paquete);
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
