/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemalegado.dao.factory;

import br.com.sistemalegado.dao.FuncionarioDao;
import br.com.sistemalegado.dao.jdbc.JDBCFuncionarioDao;

/**
 *
 * @author Anderson Mendes
 */
public class FuncionarioDaoFactory {

    public static FuncionarioDao createFuncionarioDao() {
        FuncionarioDao funcionarioDao = new JDBCFuncionarioDao();

        return funcionarioDao;


    }
}
