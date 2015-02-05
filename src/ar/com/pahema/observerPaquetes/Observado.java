/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.observerPaquetes;

/**
 *
 * @author Dante
 */
public interface Observado {
    public void agregarObservador(HorasRestantesObserver p);
    public void eliminarObservador(HorasRestantesObserver p);
    public void notificarATodos();
}
