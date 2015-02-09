/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.utils;

import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.entidades.Paquete;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Dante
 */
public class MailSender {

    public MailSender(){

    }

    public static void enviar(String destino,Paquete paquete) throws EmailException {
        try {
            Email mail = new SimpleEmail();
            //Configuracion necesaria para GMAIL
            mail.setHostName("mail.pahema.com.ar");
            //mail.setTLS(true);
            mail.setSmtpPort(25);
            //mail.setSSL(true);
            //En esta seccion colocar cuenta de usuario de Gmail y contraseña
            mail.setAuthentication("dante@pahema.com.ar", "Fuerza2015");

            //Cuenta de Email Destino
            // ACÁ IRIA LA DE ADMINISTRACION DE PAHEMA. mail.addTo("dante.gs@hotmail.com");
            mail.addTo(destino);
            //Cuenta de Email Origen, la misma con la que nos autenticamos
            mail.setFrom("dante@pahema.com.ar", "Pahema - Sistema Tango");
            //Titulo del Email
            mail.setSubject("Aviso de finalización de paquete de horas.");
            //Contenido del Email
            mail.setMsg("Estimado cliente,\n"
                    + "Le informamos que su paquete de "+(int) paquete.getCantidadHoras()+" horas está por finalizar.\n"
                    + "Le quedan por usar: "+(int) paquete.getHorasRestantes()+" horas.\n"
                    + "Por favor comuníquese con Pahema para el detalle de sus consumos: 4952 - 4789.\n"
                    + "Muchas gracias.\n"
                    + "Administración.");
            mail.send();
        }catch(EmailException e){
            System.out.println(e.getMessage());
            throw new RuntimeException("Ocurrio un error en el envio del mail");
        }
    }
}
