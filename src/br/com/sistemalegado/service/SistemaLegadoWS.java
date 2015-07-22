package br.com.sistemalegado.service;

import java.util.ArrayList;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import br.com.sistemalegado.model.Venda;
import br.com.sistemalegado.model.Funcionario;;

@WebService
public interface SistemaLegadoWS {

	@WebMethod
	public Venda vendaService(int ID, String CPFCliente);
	
	@WebMethod
	public ArrayList<Funcionario> listarEntregadores();

	@WebMethod
	public Funcionario logarVendedor(String cpf, String senha);
	
}
