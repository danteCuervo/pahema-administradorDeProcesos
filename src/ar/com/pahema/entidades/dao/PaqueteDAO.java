/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ar.com.pahema.entidades.dao;

import ar.com.pahema.entidades.Cliente;
import ar.com.pahema.entidades.Paquete;
import ar.com.pahema.hibernate.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Dante
 */
public class PaqueteDAO {
    private static Session sesionCRM;
    private static Transaction tx;
    
    public PaqueteDAO(){
        
    }
    
    public void guardarPaquete(Paquete p) throws Exception {
        try {
            iniciaOperacion();
            tx = sesionCRM.beginTransaction();
            sesionCRM.saveOrUpdate(p);
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
    }
}
