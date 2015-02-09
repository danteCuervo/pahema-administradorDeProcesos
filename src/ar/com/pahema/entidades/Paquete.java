/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades;

import ar.com.pahema.observerPaquetes.AlarmaHorasPaquete;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dante
 */
@Entity
@Table(name = "Paquetes")
public class Paquete {
    
    @Id
    @GeneratedValue
    @Column(name = "ID_Paquete")
    private int id;
    @Transient
    private double cantidadHoras;
    @Transient
    private double horasRestantes;
    @Transient
    private double avisoALaHora;
    
    public Paquete(double cantidadHoras,double aviso){
        this.avisoALaHora = aviso;
        this.cantidadHoras = cantidadHoras;
        this.horasRestantes = cantidadHoras;
    }

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the cantidadHoras
     */
    public double getCantidadHoras() {
        return cantidadHoras;
    }

    /**
     * @param cantidadHoras the cantidadHoras to set
     */
    public void setCantidadHoras(double cantidadHoras) {
        this.cantidadHoras = cantidadHoras;
    }

    /**
     * @return the horasRestantes
     */
    public double getHorasRestantes() {
        return horasRestantes;
    }

    /**
     * @param horasRestantes the horasRestantes to set
     */
    public void setHorasRestantes(double horasRestantes) {
        this.horasRestantes = horasRestantes;
    }

    
    public void consumir(double horasAConsumir) {
        this.setHorasRestantes(horasRestantes - horasAConsumir);
        if(this.horasRestantes <= this.getAvisoALaHora()){
            AlarmaHorasPaquete alarma = new AlarmaHorasPaquete();
            alarma.notificarATodos();
        }
    }

    /**
     * @return the avisoALaHora
     */
    public double getAvisoALaHora() {
        return avisoALaHora;
    }

    /**
     * @param avisoALaHora the avisoALaHora to set
     */
    public void setAvisoALaHora(double avisoALaHora) {
        this.avisoALaHora = avisoALaHora;
    }
      
}
