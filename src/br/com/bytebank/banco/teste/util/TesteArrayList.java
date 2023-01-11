package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;
import java.util.Collection; // não possui indicies
import java.util.List; // possui indice e é sequencial

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {

		ArrayList<Conta> contas = new ArrayList<Conta>();
		ArrayList<Cliente> clientes = new ArrayList<Cliente>();

		Cliente joao = new Cliente("Joao");
		Cliente marina = new Cliente("Marina");
		Conta cc = new ContaCorrente(1000, 2000, joao);
		ContaPoupanca cp = new ContaPoupanca(1001, 1988, marina);

		contas.add(cp);
		contas.add(cc);

		clientes.add(joao);
		clientes.add(marina);

		System.out.println(contas.get(0));

		System.out.println("Tamanho: " + contas.size());

		contas.remove(0);

		System.out.println("Tamanho" + contas.size());
		System.out.println(contas.get(0));

		contas.add(cp);

		for (Conta conta : contas) {
			System.out.println("**************");
			System.out.println(conta);

		}

		for (Cliente cliente : clientes) {

			System.out.println(cliente);

		}

	}

}
