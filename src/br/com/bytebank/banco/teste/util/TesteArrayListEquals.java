package br.com.bytebank.banco.teste.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {

		ArrayList<Conta> contas = new ArrayList<>();

		Cliente joao = new Cliente("Joao");
		Cliente marina = new Cliente("Marina");

		Conta cc = new ContaCorrente(1000, 2000, joao);
		ContaPoupanca cp = new ContaPoupanca(1001, 1988, marina);
		Conta cc1 = new ContaCorrente(1000, 2000, joao);

		contas.add(cp);
		contas.add(cc);

		if (contas.contains(cc1)) {

			System.out.println("Contas iguais");

		}

		else {

			System.out.println("Contas diferentes");

		}

	}

}
