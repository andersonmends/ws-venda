/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemalegado.service;

import java.util.ArrayList;

import br.com.sistemalegado.dao.FuncionarioDao;
import br.com.sistemalegado.dao.VendaDao;
import br.com.sistemalegado.dao.factory.FuncionarioDaoFactory;
import br.com.sistemalegado.dao.factory.VendaDaoFactory;
import br.com.sistemalegado.model.Funcionario;
import br.com.sistemalegado.model.Venda;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

/**
 *
 * @author Anderson Mendes
 */
@WebService(endpointInterface = "br.com.sistemalegado.service.SistemaLegadoWS")
public class SistemaLegadoImp implements SistemaLegadoWS {

	@Override
	public Venda vendaService(int ID, String CPFCliente) {
		
		System.out.println(ID);
		System.out.println(CPFCliente);
		
		VendaDao vendaDao = VendaDaoFactory.createVendaDao();
		Venda venda = vendaDao.buscarVenda(ID, CPFCliente);
		return venda;
	}

	@Override
	public ArrayList<Funcionario> listarEntregadores() {
		FuncionarioDao funcionarioDao = FuncionarioDaoFactory.createFuncionarioDao();
		ArrayList<Funcionario> listaEntregadores = funcionarioDao.listarEntregadores();
		return listaEntregadores;
	}

	@Override
	
	public Funcionario logarVendedor(String cpf, String senha) {
		System.out.println(cpf);
		System.out.println(senha);
		FuncionarioDao funcionarioDao = FuncionarioDaoFactory.createFuncionarioDao();
		Funcionario funcionario = funcionarioDao.logarVendedor(cpf, senha);
		return funcionario;
	}

}
