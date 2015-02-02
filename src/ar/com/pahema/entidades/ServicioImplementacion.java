/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades;

/**
 *
 * @author Dante
 */
public class ServicioImplementacion implements TipoServicio{
    private String nombre;

    /**
     * @return the nombre
     */
    public String getNombre() {
        return "Implementacion";
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
