/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemalegado.dao.factory;

import br.com.sistemalegado.dao.VendaDao;
import br.com.sistemalegado.dao.jdbc.JDBCVendaDao;

/**
 *
 * @author Anderson Mendes
 */
public class VendaDaoFactory {

    public static VendaDao createVendaDao() {

        VendaDao vendaDao = new JDBCVendaDao();

        return vendaDao;
    }
}
