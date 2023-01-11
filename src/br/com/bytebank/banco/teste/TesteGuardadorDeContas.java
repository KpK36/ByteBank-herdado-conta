package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.GuardadorDeContas;

public class TesteGuardadorDeContas {

	public static void main(String[] args) {

		GuardadorDeContas guardador = new GuardadorDeContas();
		
		Cliente joao = new Cliente("Joao");
		Conta cc = new ContaCorrente(1000, 2000, joao);
		ContaPoupanca cp = new ContaPoupanca(1001, 1988, joao);
				
		guardador.adiciona(cc);		
		guardador.adiciona(cp);
		
		int tamanho = guardador.getQuantidadeDeElementos();		
		System.out.println("Quantidade de posicoes ocupadas: " + tamanho);
		
		cc.deposita(1000);
		cp.deposita(600);
		
		for (int i = 0; i < tamanho; i++) {
			
			System.out.println(guardador.getReferencia(i));
			
		}
		
		
		
	}

}
