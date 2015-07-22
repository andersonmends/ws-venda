/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemalegado.dao.jdbc;

import br.com.sistemalegado.dao.FuncionarioDao;
import br.com.sistemalegado.dao.factory.ConnectionFactory;
import br.com.sistemalegado.model.Funcionario;
import br.com.sistemalegado.model.Venda;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Anderson Mendes
 */
public class JDBCFuncionarioDao implements FuncionarioDao {

    private Connection con;

    public JDBCFuncionarioDao() {
        this.con = ConnectionFactory.getConnection();
    }

    @Override
    public ArrayList<Funcionario> listarEntregadores() {

        ArrayList<Funcionario> entregadores = new ArrayList<Funcionario>();
        try {
            PreparedStatement prst = con.prepareStatement("SELECT * FROM funcionario WHERE FUNCIONARIO_ST_Cargo = 'entregador' ORDER BY FUNCIONARIO_NM_Nome ASC");
            ResultSet rs = prst.executeQuery();

            while (rs.next()) {
                Funcionario entregador = new Funcionario();
                entregador.setCpf(rs.getString("PK_FUNCIONARIO_CPF"));
                entregador.setNome(rs.getString("FUNCIONARIO_NM_Nome"));
                entregador.setCargo(rs.getString("FUNCIONARIO_ST_Cargo"));
                entregador.setTelefone(rs.getString("FUNCIONARIO_DS_Telefone"));
                entregador.setTelefone(rs.getString("FUNCIONARIO_DS_Endereco"));
                entregador.setEndereco(rs.getString("FUNCIONARIO_DS_Senha"));
                entregadores.add(entregador);
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return entregadores;
    }

    @Override
    public Funcionario logarVendedor(String cpf, String senha) {
        Funcionario funcionario = new Funcionario();
        System.out.println(cpf);
        System.out.println(senha);
        
        try {
            PreparedStatement prst = con.prepareStatement("SELECT * FROM funcionario WHERE PK_FUNCIONARIO_CPF = ? AND `FUNCIONARIO_ST_Cargo` = 'vendedor' AND FUNCIONARIO_DS_Senha = ?");
            prst.setString(1, cpf);
            prst.setString(2, senha);
            ResultSet rs = prst.executeQuery();

            while (rs.next()) {
                Funcionario entregador = new Funcionario();
                funcionario.setCpf(rs.getString("PK_FUNCIONARIO_CPF"));
                funcionario.setNome(rs.getString("FUNCIONARIO_NM_Nome"));
                funcionario.setCargo(rs.getString("FUNCIONARIO_ST_Cargo"));
                funcionario.setTelefone(rs.getString("FUNCIONARIO_DS_Telefone"));
                funcionario.setTelefone(rs.getString("FUNCIONARIO_DS_Endereco"));
                funcionario.setEndereco(rs.getString("FUNCIONARIO_DS_Senha"));

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return funcionario;
    }
}
