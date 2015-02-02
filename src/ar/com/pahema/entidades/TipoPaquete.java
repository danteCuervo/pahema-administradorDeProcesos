/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades;

import com.sun.jndi.toolkit.dir.SearchFilter;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dante
 */
@Entity
@Table(name = "Tipo_Paquete")
public class TipoPaquete implements Serializable{
    
    final double MINIMO_HORAS_PAQUETE5HORAS = 3;
    
    @Id
    @Column(name = "ID_TIPO_PAQUETE")
    @GeneratedValue
    private Integer idTipoPaquete;
            
    protected void enviarAlertaHorasRestantes(Cliente cliente){
        
    }

}
