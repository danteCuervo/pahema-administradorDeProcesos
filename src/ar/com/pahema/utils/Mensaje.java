/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.utils;

/**
 *
 * @author Dante
 */
public interface Mensaje {
    public void lanzarMensajeAlerta(String mensaje);
    public void lanzarMensajeError(String mensaje);
    public void lanzarMensajeExitoso(String mensaje);
}
