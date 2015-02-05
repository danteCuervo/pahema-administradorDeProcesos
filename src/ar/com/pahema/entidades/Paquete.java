/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades;

import ar.com.pahema.observerPaquetes.AlarmaHorasPaquete;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Dante
 */
public class Paquete {
    
    private Cliente cliente;
    private int id;
    private double cantidadHoras;
    private double horasRestantes;
    private final double minimoHoras = 2;
    
    public Paquete(double cantidadHoras){
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
        if(this.horasRestantes <= minimoHoras){
            AlarmaHorasPaquete alarma = new AlarmaHorasPaquete();
            alarma.notificarATodos();
        }
    }
      
}
