/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemalegado.dao;

import br.com.sistemalegado.model.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson Mendes
 */
public interface FuncionarioDao {

    public ArrayList<Funcionario> listarEntregadores();

    public Funcionario logarVendedor(String cpf, String senha);
}
