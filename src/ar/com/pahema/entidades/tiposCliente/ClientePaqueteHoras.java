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
import javax.persistence.Entity;

/**
 *
 * @author Dante
 */
public class ClientePaqueteHoras extends Cliente implements TipoCliente, HorasRestantesObserver {

    private final Paquete paquete;
    private final double horasParaAvisar = 2;

    public ClientePaqueteHoras(String razonSocial, String domicilio, String telefono1, String telefono2, String contacto1, String localidad, String email, String cuit, String tipoSistema, Llave llave, double cantidadHoras) {
        super(razonSocial, domicilio, telefono1, telefono2, contacto1, localidad, email, cuit, tipoSistema, llave);
        paquete = new Paquete(cantidadHoras);
    }

    /**
     * @return the paquete
     */
    public Paquete getPaquete() {
        return paquete;
    }

    public void enviar() {
        if (this.paquete.getHorasRestantes() <= 2) {
            System.out.println("funciona bien el observer de cantidad de horaa");
        }
        //MailSender.enviarMail(c.getPaquete().getHorasRestantes(),c.getPaquete().getCantidadHoras(),c.getEmail());
    }

}
