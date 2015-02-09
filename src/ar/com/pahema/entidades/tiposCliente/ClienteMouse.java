package ar.com.pahema.entidades.tiposCliente;


import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.ventanas.DatosComunesClientes;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="Clientes")
@DiscriminatorValue("MOUE")
public class ClienteMouse extends Cliente{
    
    public ClienteMouse(){
        
    }
    public ClienteMouse(DatosComunesClientes datos){
        super(datos);
    }
    
    
    
    
}
