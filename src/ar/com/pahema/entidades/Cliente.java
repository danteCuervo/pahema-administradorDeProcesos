/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.entidades;

import ar.com.pahema.observerPaquetes.AlarmaHorasPaquete;
import ar.com.pahema.ventanas.DatosComunesClientes;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 *
 * @author Dante
 */
@Entity
@Table(name = "Clientes")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(
    name="DISC_TipoCliente",
    discriminatorType=DiscriminatorType.STRING
)
public abstract class Cliente{
    @Transient
    private Set<Llave> llaves = new HashSet<Llave>();
    
    public void agregarLlave(Llave llave){
        this.getLlaves().add(llave);
    }
    
    public void eliminarLlave(Llave llave){
        this.getLlaves().remove(llave);
    }
    
    public Cliente(){
    }
   
    public Cliente(DatosComunesClientes d){
        this.setRazonSocial(d.getRazonSocial());
        this.setDomicilio(d.getDomicilio());
        this.setTelefono_1(d.getTelefono1());
        this.setTelefono_2(d.getTelefono2());
        this.setContacto_1(d.getContacto1());
        this.setLocalidad(d.getLocalidad());
        this.setEmail(d.getEmail());
        this.setCuit(d.getCuit());
        agregarLlave(d.getLlave());
    }

    @Id
    @GeneratedValue
    @Column(name = "ID_CLIENTE")
    private Integer idCliente;

    @Column(name = "RAZON_SOCIAL", length = 60, nullable = false)
    private String razonSocial;

    @Column(name = "DIR_COM", length = 60)
    private String domicilio;

    @Column(name = "TELEFONO_1", length = 30)
    private String telefono_1;

    @Column(name = "TELEFONO_2", length = 30)
    private String telefono_2;

    @Column(name = "WEB", length = 60)
    private String contacto_1;

    @Column(name = "LOCALIDAD", length = 20)
    private String localidad;

    @Column(name = "CUIT", length = 20)
    private String cuit;

    @Column(name = "E_MAIL", length = 255)
    private String email;

    /**
     * @return the llaves
     */
    public Set<Llave> getLlaves() {
        return llaves;
    }

    /**
     * @param llaves the llaves to set
     */
    public void setLlaves(Set<Llave> llaves) {
        this.llaves = llaves;
    }

    /**
     * @return the idCliente
     */
    public Integer getIdCliente() {
        return idCliente;
    }

    /**
     * @param idCliente the idCliente to set
     */
    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @return the telefono_1
     */
    public String getTelefono_1() {
        return telefono_1;
    }

    /**
     * @param telefono_1 the telefono_1 to set
     */
    public void setTelefono_1(String telefono_1) {
        this.telefono_1 = telefono_1;
    }

    /**
     * @return the telefono_2
     */
    public String getTelefono_2() {
        return telefono_2;
    }

    /**
     * @param telefono_2 the telefono_2 to set
     */
    public void setTelefono_2(String telefono_2) {
        this.telefono_2 = telefono_2;
    }

    /**
     * @return the contacto_1
     */
    public String getContacto_1() {
        return contacto_1;
    }

    /**
     * @param contacto_1 the contacto_1 to set
     */
    public void setContacto_1(String contacto_1) {
        this.contacto_1 = contacto_1;
    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @return the cuit
     */
    public String getCuit() {
        return cuit;
    }

    /**
     * @param cuit the cuit to set
     */
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    
}
