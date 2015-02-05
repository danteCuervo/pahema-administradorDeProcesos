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
public class MailSender {

    public MailSender(){

    }

    public static void enviar(String destino) throws EmailException {
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
            mail.addTo("dante.gs@hotmail.com");
            mail.addTo(destino);
            //Cuenta de Email Origen, la misma con la que nos autenticamos
            mail.setFrom("dante@pahema.com.ar", "Aplicación de prueba de Dante");
            //Titulo del Email
            mail.setSubject("Prueba de aplicacion");
            //Contenido del Email
            mail.setMsg("PRUEBA DESDE CRM");
            mail.send();
        }catch(EmailException e){
            System.out.println(e.getMessage());
            throw new RuntimeException("Ocurrio un error en el envio del mail");
        }
    }
}
