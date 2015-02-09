/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades.tiposCliente;


import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.ventanas.DatosComunesClientes;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 *
 * @author Dante
 */
@Entity
@Table(name="PERSON")
@DiscriminatorValue("POTL")
public class ClientePotencial extends Cliente{
    
    public ClientePotencial(){
        
    }
    
    public ClientePotencial(DatosComunesClientes d) {
        super(d);
    }
}
