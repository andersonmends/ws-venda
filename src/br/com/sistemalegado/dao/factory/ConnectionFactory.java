/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sistemalegado.dao.factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Anderson Mendes
 */
public class ConnectionFactory {
    
    public static Connection getConnection(){
		
		
		try {
			DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                        System.out.println("SUCESSO");
			return DriverManager.getConnection("jdbc:mysql://localhost/db_sistemalegado","root","admin");
		} catch (SQLException e) {
			System.out.println("ERRO");
			throw new RuntimeException(e);
		}
    }
    
}
