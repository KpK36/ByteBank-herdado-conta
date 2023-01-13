package br.com.bytebank.banco.teste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteOrdenacaoComparator {

	public static void main(String[] args) {

		Cliente lucas = new Cliente("Lucas");
		Conta cc1 = new ContaCorrente(1000, 2000, lucas);
		cc1.deposita(100);

		Cliente joao = new Cliente("Joao");
		Conta cc2 = new ContaCorrente(1400, 2000, joao);
		cc2.deposita(304);

		Cliente alfredo = new Cliente("Alfredo");
		Conta cc3 = new ContaCorrente(1200, 2000, alfredo);
		cc3.deposita(300);

		Cliente maria = new Cliente("Maria");
		Conta cc4 = new ContaCorrente(1700, 2000, maria);
		cc4.deposita(400);

		List<Conta> lista = new ArrayList<>();

		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);	

		lista.sort(new NumeroDaContaComparator());

		for (Conta conta : lista) {

			System.out.println(conta);

		}

		TitularContaComparator titularContaComparator;
		
		
		System.out.println("---------");

		lista.sort(new TitularContaComparator());
		//Collections.sort(lista);
		
		
//		Como podemos inverter a ordem de uma lista?
//		Como podemos embaralhar todos os elementos de uma lista?
//		Como podemos rotacionar os elementos de uma lista?
		
		//Collections.reverse(lista);
		//Collections.shuffle(lista);
		Collections.rotate(lista, 1);
		

		for (Conta conta : lista) {
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}		
		

	}

}

class TitularContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		String nomec1 = c1.getTitular().getNome();
		String nomec2 = c2.getTitular().getNome();
		return nomec1.compareToIgnoreCase(nomec2);
	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		return Integer.compare(c1.getNumero(), c2.getNumero());
	}
}
