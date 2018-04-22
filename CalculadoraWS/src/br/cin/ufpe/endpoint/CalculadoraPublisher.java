package br.cin.ufpe.endpoint;

import javax.xml.ws.Endpoint;
import br.cin.ufpe.Calculadora;

public class CalculadoraPublisher {
	
	public static void main(String[] args) {
		Endpoint.publish("http://localhost:8080/MeuWS/Calculadora",
				new Calculadora());
	}
}
