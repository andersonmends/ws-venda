/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemalegado.dao;

import br.com.sistemalegado.model.Venda;

/**
 *
 * @author Anderson Mendes
 */
public interface VendaDao {
    
    public Venda buscarVenda(long id, String cpf);
    
}
