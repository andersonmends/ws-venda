/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemalegado.dao.jdbc;

import br.com.sistemalegado.dao.VendaDao;
import br.com.sistemalegado.dao.factory.ConnectionFactory;
import br.com.sistemalegado.model.Venda;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Mendes
 */
public class JDBCVendaDao implements VendaDao {

    private Connection con;

    public JDBCVendaDao() {
        this.con = ConnectionFactory.getConnection();
    }

    @Override
    public Venda buscarVenda(long id, String cpf) {
        Venda venda = new Venda();
        try {
            PreparedStatement prst = con.prepareStatement("SELECT * FROM VENDA WHERE PK_VENDA_ID = ? AND VENDA_ID_CPFCliente = ?");
            prst.setLong(1, id);
            prst.setString(2, cpf);
            ResultSet rs = prst.executeQuery();

            while (rs.next()) {
                venda.setId(rs.getLong("PK_VENDA_ID"));
                venda.setCPFCliente(rs.getString("VENDA_ID_CPFCliente"));
                venda.setCPFVendedor(rs.getString("VENDA_ID_CPFVendedor"));
                venda.setValor(rs.getInt("VENDA_VL_Valor"));
                venda.setProduto(rs.getString("VENDA_DS_Produto"));
                venda.setNome(rs.getString("VENDA_NM_Nome"));
            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return venda;
    }
}
