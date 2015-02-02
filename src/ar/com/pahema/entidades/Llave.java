/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades;

import java.util.Date;

/**
 *
 * @author Dante
 */
public class Llave {
    private String numero;
    private String tipo;
    private Date fechaAlta;
    private Date fechaVencimiento;
    private String version;
    private String distribuidor;
    private String tipoFacturacion;
    private String claveZonaCliente;
    private int cantidadDePuestos;
    private String tipoTango;

    /**
     * @return the cantidadDePuestos
     */
    public int getCantidadDePuestos() {
        return cantidadDePuestos;
    }

    /**
     * @return the claveZonaCliente
     */
    public String getClaveZonaCliente() {
        return claveZonaCliente;
    }

    /**
     * @return the distribuidor
     */
    public String getDistribuidor() {
        return distribuidor;
    }

    /**
     * @return the fechaAlta
     */
    public Date getFechaAlta() {
        return fechaAlta;
    }

    /**
     * @return the fechaVencimiento
     */
    public Date getFechaVencimiento() {
        return fechaVencimiento;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @return the tipoFacturacion
     */
    public String getTipoFacturacion() {
        return tipoFacturacion;
    }

    /**
     * @return the tipoTango
     */
    public String getTipoTango() {
        return tipoTango;
    }

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param cantidadDePuestos the cantidadDePuestos to set
     */
    public void setCantidadDePuestos(int cantidadDePuestos) {
        this.cantidadDePuestos = cantidadDePuestos;
    }

    /**
     * @param claveZonaCliente the claveZonaCliente to set
     */
    public void setClaveZonaCliente(String claveZonaCliente) {
        this.claveZonaCliente = claveZonaCliente;
    }

    /**
     * @param distribuidor the distribuidor to set
     */
    public void setDistribuidor(String distribuidor) {
        this.distribuidor = distribuidor;
    }

    /**
     * @param fechaAlta the fechaAlta to set
     */
    public void setFechaAlta(Date fechaAlta) {
        this.fechaAlta = fechaAlta;
    }

    /**
     * @param fechaVencimiento the fechaVencimiento to set
     */
    public void setFechaVencimiento(Date fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @param tipoFacturacion the tipoFacturacion to set
     */
    public void setTipoFacturacion(String tipoFacturacion) {
        this.tipoFacturacion = tipoFacturacion;
    }

    /**
     * @param tipoTango the tipoTango to set
     */
    public void setTipoTango(String tipoTango) {
        this.tipoTango = tipoTango;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }
    
    
}
