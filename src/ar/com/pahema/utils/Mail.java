/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.utils;

import ar.com.pahema.entidades.Cliente;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

/**
 *
 * @author Dante
 */
public class Mail {

    static Email mail = new SimpleEmail();

    public Mail(){

    }

    public static void enviarA(String email, String texto) throws EmailException {
        mail.setHostName("mail.pahema.com.ar");
        mail.setSmtpPort(25);
        //En esta seccion colocar cuenta de usuario y contraseña
        mail.setAuthentication("dante@pahema.com.ar", "Pahema2014");
        //Cuenta de Email Destino
        mail.addTo(email);
        //Cuenta de Email Origen, la misma con la que nos autenticamos
        mail.setFrom("dante@pahema.com.ar", "Aviso de finalización de paquete");
        //Titulo del Email
        mail.setSubject("PAHEMA - Aviso de finalización de paquete");
        //Contenido del Email
        mail.setMsg(texto);
        mail.send();
    }
}
