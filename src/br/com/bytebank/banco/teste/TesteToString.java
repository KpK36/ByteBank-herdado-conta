package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.Cliente;

public class TesteToString {

	public static void main(String[] args) {
		
		
		Cliente juliana = new Cliente("Juliana");

		ContaCorrente cc = new ContaCorrente(1111, 2000, juliana);

		cc.deposita(150.0);
		
		System.out.println(cc.toString());
		
		System.out.println(cc.getTitular().getNome());
		
	}

}
