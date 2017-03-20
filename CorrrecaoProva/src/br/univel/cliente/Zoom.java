package br.univel.cliente;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import br.univel.comum.Plact;

public class Zoom {
	
	private Integer vlr = null;
	
	public Zoom() throws Exception {
		Registry registry = LocateRegistry.getRegistry("127.0.0.1", 1818);
		Plact servico = (Plact) registry.lookup(Plact.NOME);
		Integer retorno = servico.calcule(43);
	}
	public static void main(String[] args) throws Exception {
		new Zoom();
	}
}
