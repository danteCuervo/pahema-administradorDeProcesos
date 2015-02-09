/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.utils;

import ar.com.pahema.entidades.Cliente;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dante
 */
public class ModeloTablaClientes extends DefaultTableModel {

    public ModeloTablaClientes() {
        this.addColumn("Razon Social");
        this.addColumn("Domicilio");
        this.addColumn("Telefono 1");
        this.addColumn("Telefono 2");
        this.addColumn("Contacto 1");
        this.addColumn("CUIT");
        this.addColumn("Tipo Cliente");
        this.addColumn("Tipo Sistema");
    }

    public void llenarTabla(List<Cliente> clientes) {
        for (Cliente c : clientes) {
            Vector<Object> fila = new Vector<Object>();
            cargarDatos(fila, c);

        }
    }

    public void cargarCliente(Cliente c) {
        Vector<Object> fila = new Vector<Object>();
        cargarDatos(fila, c);
    }

    private void cargarDatos(Vector<Object> fila, Cliente c) {
        fila.add(c.getRazonSocial());
        fila.add(c.getDomicilio());
        fila.add(c.getTelefono_1());
        fila.add(c.getTelefono_2());
        fila.add(c.getContacto_1());
        fila.add(c.getCuit());
        //fila.add(c.getTipoCliente());
        //fila.add(c.getTipoDeSistema());
        this.addRow(fila);
    }
}
