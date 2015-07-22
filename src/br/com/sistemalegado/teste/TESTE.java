/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemalegado.teste;

import br.com.sistemalegado.dao.FuncionarioDao;
import br.com.sistemalegado.dao.VendaDao;
import br.com.sistemalegado.dao.factory.FuncionarioDaoFactory;
import br.com.sistemalegado.dao.factory.VendaDaoFactory;
import br.com.sistemalegado.model.Funcionario;
import br.com.sistemalegado.model.Venda;
import br.com.sistemalegado.service.SistemaLegadoWS;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;

import javax.xml.namespace.QName;
import javax.xml.ws.Service;

/**
 *
 * @author Anderson Mendes
 */
public class TESTE {

    public static void main(String[] args) throws MalformedURLException {

//        VendaDao dao = VendaDaoFactory.createVendaDao();
//        Venda a = dao.buscarVenda(2, "222222222");
//
//        System.out.println(a.getCPFCliente());
//
        FuncionarioDao daoFuncionario = FuncionarioDaoFactory.createFuncionarioDao();
//        List<Funcionario> listarEntregadores = daoFuncionario.listarEntregadores();
//
//        System.out.println(listarEntregadores.get(0).getNome());
//        System.out.println(listarEntregadores.get(1).getNome());
//        System.out.println(listarEntregadores.get(2).getNome());
        Funcionario logarVendedor = daoFuncionario.logarVendedor("11111111111", "11111111111");
//        Funcionario logarVendedor = daoFuncionario.logarVendedor2();
        System.out.println(logarVendedor.getNome());
        System.out.println(logarVendedor.getCpf());
    	
    	 URL url = new URL("http://localhost:8080/WS/SistemaLegadoWS?wsdl");
         QName qname = new QName("http://service.sistemalegado.com.br/","SistemaLegadoImpService");//seg parametro e o {nome da classe+Service} 
         Service ws = Service.create(url, qname);
         SistemaLegadoWS	 teste = ws.getPort(SistemaLegadoWS.class);
         
//        ArrayList<Funcionario> listarEntregadores = teste.listarEntregadores();
//        System.out.println(listarEntregadores.get(0).getNome());
//		System.out.println(listarEntregadores.get(1).getNome());
//		System.out.println(listarEntregadores.get(2).getNome());
        
        
        
    }
}
