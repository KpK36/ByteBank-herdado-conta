package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;

public class ContaEspecial extends Conta {

	public ContaEspecial(int numero, int agencia, Cliente titular) {
		super(numero, agencia, titular);
		
	}	

}
