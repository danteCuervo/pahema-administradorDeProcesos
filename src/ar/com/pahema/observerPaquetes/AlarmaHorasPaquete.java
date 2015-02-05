/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.observerPaquetes;

import java.util.ArrayList;

/**
 *
 * @author Dante
 */
public class AlarmaHorasPaquete implements Observado{
    private static ArrayList<HorasRestantesObserver> observadores = new ArrayList<HorasRestantesObserver>();

    @Override
    public void agregarObservador(HorasRestantesObserver p) {
        observadores.add(p);
    }

    @Override
    public void eliminarObservador(HorasRestantesObserver p) {
        observadores.remove(p);
    }

    @Override
    public void notificarATodos() {
        for (HorasRestantesObserver observador : observadores) {
           observador.enviar();
        }
    }
    
}
