/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades;

import ar.com.pahema.utils.Mail;
import java.util.ArrayList;
import org.apache.commons.mail.EmailException;

/**
 *
 * @author Dante
 */
public class Paquete5horas{
    private String descripcion;
    private double valorHora;
    private double precio;
    private String estado;
    private double horasConsumidas;
    private String facturaAsociada;
    private ArrayList<Servicio> servicios;
    private double horasRestantes;
    private TipoPaquete tipo;
    private String mail;
    
    public void enviarAlertaHorasRestantes(Cliente cliente) {
        if(getHorasRestantes() <= getTipo().MINIMO_HORAS_PAQUETE5HORAS){
            try{
                Mail.enviarA(cliente.getEmail(),getMail());
            }catch(EmailException e){
                System.out.println(e.getMessage());
            }
        }
            
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return "Paquete de 5 horas";
    }

    /**
     * @return the estado
     */
    public String getEstado() {
        return estado;
    }

    /**
     * @return the facturaAsociada
     */
    public String getFacturaAsociada() {
        return facturaAsociada;
    }

    /**
     * @return the horasConsumidas
     */
    public double getHorasConsumidas() {
        return horasConsumidas;
    }

    /**
     * @return the horasRestantes
     */
    public double getHorasRestantes() {
        return (5 - this.getHorasConsumidas());
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @return the servicios
     */
    public ArrayList<Servicio> getServicios() {
        return servicios;
    }

    /**
     * @return the tipo
     */
    public TipoPaquete getTipo() {
        return tipo;
    }

    /**
     * @return the valorHora
     */
    public double getValorHora() {
        return valorHora;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    /**
     * @param facturaAsociada the facturaAsociada to set
     */
    public void setFacturaAsociada(String facturaAsociada) {
        this.facturaAsociada = facturaAsociada;
    }

    /**
     * @param horasConsumidas the horasConsumidas to set
     */
    public void setHorasConsumidas(double horasConsumidas) {
        this.horasConsumidas = horasConsumidas;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    /**
     * @param servicios the servicios to set
     */
    public void setServicios(ArrayList<Servicio> servicios) {
        this.servicios = servicios;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(TipoPaquete tipo) {
        this.tipo = tipo;
    }

    /**
     * @param valorHora the valorHora to set
     */
    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    /**
     * @return the mail
     */
    public String getMail() {
        return "Estimado cliente: \n"
                + "Se le informa que su paquete de 5 horas está por finalizar."
                + "Le quedan: "+this.getHorasRestantes()+" horas.\n"
                + "Se consumieron: "+this.getHorasConsumidas()+" horas en los siguientes servicios: \n";
                //+ this.getServicios().toString();
    }
    
    
}
