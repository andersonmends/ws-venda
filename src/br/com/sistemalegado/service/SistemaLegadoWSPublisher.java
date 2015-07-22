package br.com.sistemalegado.service;

import javax.xml.ws.Endpoint;

public class SistemaLegadoWSPublisher {
	
	 public static void main(String[] args) {  
		  Endpoint.publish("http://localhost:8080/WS/SistemaLegadoWS",new SistemaLegadoImp());  
		 }  

}
