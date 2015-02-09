/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.com.pahema.entidades.dao;

import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.entidades.Paquete;
import ar.com.pahema.hibernate.HibernateUtil;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.ResultTransformer;
import org.hibernate.transform.RootEntityResultTransformer;

/**
 *
 * @author Dante
 */
public class ClienteDAO {
    
    private static Session sesionCRM;
    private static Transaction tx;
    private static final String BASE_CRM = "CRM_PAHEMA_DESARROLLO";
    private static final String BASE_TANGO = "Empresa_Ejemplo";

    public ClienteDAO() {

    }

    public List<Cliente> obtenerClientes() throws Exception {
        List<Cliente> clientes = new ArrayList<Cliente>();
        try {
            iniciaOperacion();
            clientes
                    = sesionCRM.createQuery("from Cliente c").list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            sesionCRM.close();
        }
        return clientes;
    }

    public List<Cliente> obtenerClientesTango() throws Exception {
        List<Cliente> clientesTango = new ArrayList<Cliente>();
        try {
            iniciaOperacion();
            clientesTango = sesionCRM.createSQLQuery("select \n"
                    + "g.COD_CLIENT"
                    + ",g.WEB"
                    + ",g.CUIT"
                    + ",g.DIR_COM"
                    + ",g.E_MAIL"
                    + ",g.LOCALIDAD"
                    + ",g.RAZON_SOCI"
                    + ",g.TELEFONO_1"
                    + ",g.TELEFONO_2\n"
                    + "from "+BASE_TANGO+"..GVA14 g").addEntity(Cliente.class).list();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw e;
        } finally {
            sesionCRM.close();
        }
        return clientesTango;
    }

    public void sincronizarClientesTangoConClientesCRM(List<Cliente> clientesTango) throws Exception {
        try {
            iniciaOperacion();
            tx = sesionCRM.beginTransaction();

            for (Cliente c : clientesTango) {
                sesionCRM.saveOrUpdate(c);
            }
            tx.commit();
        } catch (Exception e) {
            System.out.println(e.getMessage());
            tx.rollback();
            throw e;
        } finally {
            sesionCRM.close();
        }
    }

    public void guardarCliente(Cliente c) throws Exception {
        try {
            iniciaOperacion();
            tx = sesionCRM.beginTransaction();
            sesionCRM.saveOrUpdate(c);
            tx.commit();
        } catch (Exception e) {
            tx.rollback();
            System.out.println(e.getMessage());
            throw e;
        } finally {
            sesionCRM.close();
        }
    }

    private static void iniciaOperacion() {
        sesionCRM = HibernateUtil.currentSession();
        //sesionCRM = HibernateUtil.currentSession("Tango");
    }
}
