/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.utils;

import ar.com.pahema.entidades.Cliente;
import java.util.ArrayList;
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
        this.addColumn("Contacto 2");
    }

    public void llenarTabla(ArrayList<Cliente> clientes) {
        for (Cliente cliente : clientes) {
            Vector v = new Vector();
            v.addAll(clientes);
            this.addRow(v);
        }
    }
}
