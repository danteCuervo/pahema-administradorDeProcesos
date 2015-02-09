/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades;

import ar.com.pahema.entidades.dao.PaqueteDAO;
import ar.com.pahema.entidades.tiposCliente.ClientePaqueteHoras;
import ar.com.pahema.observerPaquetes.AlarmaHorasPaquete;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.transaction.Transactional;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Parameter;

/**
 *
 * @author Dante
 */
@Entity
@Table(name = "Paquetes")
public class Paquete{
    private static PaqueteDAO pDAO;
    @Id
    @Column(name = "ID_Paquete",unique = true,nullable = false)
    @GeneratedValue
    private int idPaquete;
    @Column(name = "Cant_Horas",length = 2)
    private double cantidadHoras;
    @Column(name = "Horas_Restantes",length = 2)
    private double horasRestantes;
    @Column(name = "Aviso",length = 2)
    private double avisoALaHora;
    
    @OneToOne
    @PrimaryKeyJoinColumn
    private ClientePaqueteHoras cliente;
    
    public Paquete(){
        pDAO = new PaqueteDAO();
    }
    
    public Paquete(double cantidadHoras,double aviso){
        this.avisoALaHora = aviso;
        this.cantidadHoras = cantidadHoras;
        this.horasRestantes = cantidadHoras;
        pDAO = new PaqueteDAO();
    }
    
    public void consumir(double horasAConsumir) {
        this.setHorasRestantes(horasRestantes - horasAConsumir);
        pDAO.actualizarPaquete(this);
        if(this.horasRestantes <= this.getAvisoALaHora()){
            AlarmaHorasPaquete alarma = new AlarmaHorasPaquete();
            alarma.agregarObservador(cliente);
            alarma.notificarATodos();
        }
    }
    

    /**
     * @return the id
     */
    public int getId() {
        return idPaquete;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.idPaquete = id;
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
    @Transactional
    public void setHorasRestantes(double horasRestantes) {
        this.horasRestantes = horasRestantes;
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
