/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades.tiposCliente;

//import javax.persistence.DiscriminatorValue;

import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.ventanas.DatosComunesClientes;



//import javax.persistence.Entity;
//
///**
// *
// * @author Dante
// */
//@Entity
//@DiscriminatorValue("MOU")
public class ClienteMouse extends Cliente{

    public ClienteMouse(DatosComunesClientes datos){
        super(datos);
    }
    
    
    
    
}
