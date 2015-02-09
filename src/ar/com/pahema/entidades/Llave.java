/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Dante
 */
//@Entity
//@Table(name = "Llaves")
public class Llave {
    @Id
    @Column(name="NUMERO",nullable = false)
    private String numero;
    
    @Transient
    private String tipo;
    @Transient
    private Date fechaAlta;
    @Transient
    @Temporal(TemporalType.DATE)
    private Date fechaVencimiento;
    @Transient
    private String version;
    @Transient
    private String distribuidor;
    @Transient
    private String tipoFacturacion;
    @Transient
    private String claveZonaCliente;
    @Transient
    private int cantidadDePuestos;
    @Transient
    private String tipoSistema;
    
    @ManyToOne
    @JoinColumn(name="ID_CLIENTE")
    private Cliente cliente;

    
    public Llave(){
        
    }
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
    public String getTipoSistema() {
        return tipoSistema;
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
    public void setTipoSistema(String tipoSistema) {
        this.tipoSistema = tipoSistema;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the cliente
     */
    public Cliente getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    
    
}
