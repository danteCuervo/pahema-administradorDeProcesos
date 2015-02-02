/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Dante
 */
public abstract class Servicio {
    private ArrayList<Paquete> paquetes;
    private Tecnico tecnico;
    private double cantidadHoras;
    private Date fechaInicio;
    private Date fechaFin;
    private TipoServicio tipo;
    private ArrayList<Tecnico> tecnicos;
    
    
    /**
     * @return the cantidadHoras
     */
    public double getCantidadHoras() {
        return cantidadHoras;
    }

    /**
     * @return the fechaFin
     */
    public Date getFechaFin() {
        return fechaFin;
    }

    /**
     * @return the fechaInicio
     */
    public Date getFechaInicio() {
        return fechaInicio;
    }

    /**
     * @return the paquetes
     */
    public ArrayList<Paquete> getPaquetes() {
        return paquetes;
    }

    /**
     * @return the tecnico
     */
    public Tecnico getTecnico() {
        return tecnico;
    }

    /**
     * @return the tecnicos
     */
    public ArrayList<Tecnico> getTecnicos() {
        return tecnicos;
    }

    /**
     * @return the tipo
     */
    public TipoServicio getTipo() {
        return tipo;
    }

    /**
     * @param cantidadHoras the cantidadHoras to set
     */
    public void setCantidadHoras(double cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    /**
     * @param fechaFin the fechaFin to set
     */
    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    /**
     * @param fechaInicio the fechaInicio to set
     */
    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    /**
     * @param paquetes the paquetes to set
     */
    public void setPaquetes(ArrayList<Paquete> paquetes) {
        this.paquetes = paquetes;
    }

    /**
     * @param tecnico the tecnico to set
     */
    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    /**
     * @param tecnicos the tecnicos to set
     */
    public void setTecnicos(ArrayList<Tecnico> tecnicos) {
        this.tecnicos = tecnicos;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoServicio tipo) {
        this.tipo = tipo;
    }
    
    
}
