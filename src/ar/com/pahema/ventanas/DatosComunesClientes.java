/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.ventanas;

import ar.com.pahema.entidades.Llave;

/**
 *
 * @author Dante
 */
public class DatosComunesClientes {
    private String razonSocial;
    private String domicilio;
    private String telefono1;
    private String telefono2;
    private String contacto1;
    private String localidad;
    private String email;
    private String cuit;
    private Llave llave;
    
    public DatosComunesClientes(String razonSocial, String domicilio, String telefono1, String telefono2, String contacto1, String localidad, String email, String cuit) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.contacto1 = contacto1;
        this.localidad = localidad;
        this.email = email;
        this.cuit = cuit;
    }
    
    public DatosComunesClientes(String razonSocial, String domicilio, String telefono1, String telefono2, String contacto1, String localidad, String email, String cuit, Llave llave) {
        this.razonSocial = razonSocial;
        this.domicilio = domicilio;
        this.telefono1 = telefono1;
        this.telefono2 = telefono2;
        this.contacto1 = contacto1;
        this.localidad = localidad;
        this.email = email;
        this.cuit = cuit;
        this.llave = llave;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the telefono1
     */
    public String getTelefono1() {
        return telefono1;
    }

    /**
     * @param telefono1 the telefono1 to set
     */
    public void setTelefono1(String telefono1) {
        this.telefono1 = telefono1;
    }

    /**
     * @return the telefono2
     */
    public String getTelefono2() {
        return telefono2;
    }

    /**
     * @param telefono2 the telefono2 to set
     */
    public void setTelefono2(String telefono2) {
        this.telefono2 = telefono2;
    }

    /**
     * @return the contacto1
     */
    public String getContacto1() {
        return contacto1;
    }

    /**
     * @param contacto1 the contacto1 to set
     */
    public void setContacto1(String contacto1) {
        this.contacto1 = contacto1;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the cuit
     */
    public String getCuit() {
        return cuit;
    }

    /**
     * @param cuit the cuit to set
     */
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }
    /**
     * @return the llave
     */
    public Llave getLlave() {
        return llave;
    }

    /**
     * @param llave the llave to set
     */
    public void setLlave(Llave llave) {
        this.llave = llave;
    }
    
    
    
}
