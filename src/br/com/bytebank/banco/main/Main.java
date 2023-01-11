package br.com.bytebank.banco.main;

import br.com.bytebank.banco.modelo.AcaoBolsa;
import br.com.bytebank.banco.modelo.CalculadorImposto;
import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.teste.ContaEspecial;

public class Main {

	public static void main(String[] args) {
		
		Cliente alfredo = new Cliente("Alfredo");
		Cliente zeca = new Cliente("Zeca");
		Cliente joao = new Cliente("Joao");
		

		try (ContaCorrente ContaCorrente = new ContaCorrente(1000, 1000, alfredo)) {

			try (ContaPoupanca ContaPoupanca = new ContaPoupanca(1999, 1010, zeca)) {

				CalculadorImposto calculadorImposto = new CalculadorImposto();
				AcaoBolsa acaoBolsa = new AcaoBolsa();
				ContaEspecial contaEspecial = new ContaEspecial(1001, 1020, joao);

				System.out.println(ContaPoupanca.deposita(150));
				ContaPoupanca.saca(130);
				System.out.println(ContaPoupanca.getSaldo());

				System.out.println("Saldo Conta Corrente: " + ContaCorrente.getSaldo());
				System.out.println("Valor Imposto Conta Corrente: " + ContaCorrente.getValorImposto());
				System.out.println("Valor Imposto Acao Bolsa: " + acaoBolsa.getValorImposto());

				calculadorImposto.tributos(ContaCorrente);
				calculadorImposto.tributos(acaoBolsa);

				System.out.println("Total Imposto: " + calculadorImposto.getTotalImposto());
				
				System.out.println(contaEspecial.getTitular().getNome());
				System.out.println("Nome: " + ContaCorrente.getTitular().getNome());

			}

		} catch (IllegalArgumentException e) {

			System.out.println(e.getMessage());
		}

	}

}
