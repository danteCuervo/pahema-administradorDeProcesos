/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades.tiposCliente;

import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.entidades.Llave;
import ar.com.pahema.ventanas.DatosComunesClientes;
import java.io.Serializable;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author Dante
 */

@Entity
@Table(name="Clientes")
@DiscriminatorValue("ABOO")
public class ClienteAbonado extends Cliente{
    
    public ClienteAbonado(){
        
    }
    
    public ClienteAbonado(DatosComunesClientes datos){
        super(datos);
    }    
    
}
