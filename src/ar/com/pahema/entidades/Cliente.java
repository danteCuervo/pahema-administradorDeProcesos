/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.entidades;

import ar.com.pahema.entidades.tiposCliente.TipoCliente;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 *
 * @author Dante
 */
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TIPO_CLIENTE", discriminatorType = DiscriminatorType.STRING)
@Table(name = "Clientes")
public class Cliente implements Serializable {
    
    public Cliente(){
        
    }
    
    public Cliente(String razonSocial,String domicilio,String telefono1,String telefono2,String contacto1,String localidad,String email,String cuit,String tipoSistema){
        this.setRazonSocial(razonSocial);
        this.setDomicilio(domicilio);
        this.setTelefono_1(telefono1);
        this.setTelefono_2(telefono2);
        this.setContacto_1(contacto1);
        this.setLocalidad(localidad);
        this.setEmail(email);
        this.setCuit(cuit);       
        this.setTipoDeSistema(tipoSistema);
        
    }

//    @Id
//    @GeneratedValue
//    @Column(name = "ID_CLIENTE")
//    private int idCliente;
//    
    @Id
    @Column(name = "COD_CLIENTE",length = 6,insertable = true)
    private String codCliente;

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

    @Column(name = "TIPO_DE_SISTEMA", length = 30)
    private String tipoDeSistema;

    @Column(name = "TIPO_CLIENTE",nullable = false)
//    @ManyToOne(cascade = CascadeType.ALL)
//    @JoinColumn(name = "FK_TIPO_CLIENTE",nullable = false)
    private TipoCliente tipoCliente;

    @OneToOne
    @JoinColumn(name = "ID_PAQUETE")
    private Paquete paquete;

    /**
     * @return the contacto_1
     */
    public String getContacto_1() {
        return contacto_1;
    }

    /**
     * @return the cuit
     */
    public String getCuit() {
        return cuit;
    }

    /**
     * @return the domicilio
     */
    public String getDomicilio() {
        return domicilio;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

//    /**
//     * @return the idCliente
//     */
//    public int getIdCliente() {
//        return idCliente;
//    }

    /**
     * @return the localidad
     */
    public String getLocalidad() {
        return localidad;
    }

    /**
     * @return the paquete
     */
    public Paquete getPaquete() {
        return paquete;
    }

    /**
     * @return the razonSocial
     */
    public String getRazonSocial() {
        return razonSocial;
    }

    /**
     * @return the telefono_1
     */
    public String getTelefono_1() {
        return telefono_1;
    }

    /**
     * @return the telefono_2
     */
    public String getTelefono_2() {
        return telefono_2;
    }
    /**
     * @return the tipoDeSistema
     */
    public String getTipoDeSistema() {
        return tipoDeSistema;
    }

    /**
     * @param contacto_1 the contacto_1 to set
     */
    public void setContacto_1(String contacto_1) {
        this.contacto_1 = contacto_1;
    }

    /**
     * @param cuit the cuit to set
     */
    public void setCuit(String cuit) {
        this.cuit = cuit;
    }

    /**
     * @param domicilio the domicilio to set
     */
    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @param localidad the localidad to set
     */
    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    /**
     * @param paquete the paquete to set
     */
    public void setPaquete(Paquete paquete) {
        this.paquete = paquete;
    }

    /**
     * @param razonSocial the razonSocial to set
     */
    public void setRazonSocial(String razonSocial) {
        this.razonSocial = razonSocial;
    }

    /**
     * @param telefono_1 the telefono_1 to set
     */
    public void setTelefono_1(String telefono_1) {
        this.telefono_1 = telefono_1;
    }

    /**
     * @param telefono_2 the telefono_2 to set
     */
    public void setTelefono_2(String telefono_2) {
        this.telefono_2 = telefono_2;
    }

    /**
     * @param tipoDeSistema the tipoDeSistema to set
     */
    public void setTipoDeSistema(String tipoDeSistema) {
        this.tipoDeSistema = tipoDeSistema;
    }

    /**
     * @return the tipoCliente
     */
    public TipoCliente getTipoCliente() {
        return tipoCliente;
    }

    /**
     * @param tipoCliente the tipoCliente to set
     */
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    /**
     * @return the codCliente
     */
    public String getCodCliente() {
        return codCliente;
    }

    /**
     * @param codCliente the codCliente to set
     */
    public void setCodCliente(String codCliente) {
        this.codCliente = codCliente;
    }

}
