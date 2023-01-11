package br.com.bytebank.banco.teste;

import java.util.Iterator;

public class TesteStrings {

	public static void main(String[] args) {

		String nome = "Ma-ri-o";

		String outro = nome.replace("o", "a");
//		String outro = nome.toLowerCase();
//		String outro = nome.toUpperCase();

		System.out.println(outro);

		char position = nome.charAt(4);

		System.out.println(position);

		int pos = nome.indexOf("ar");

		System.out.println(pos);

		String sub = nome.substring(2);

		System.out.println(sub);

		for (int i = 0; i < outro.length(); i++) {

			System.out.println(outro.charAt(i));

		}

		// verificar os metodos empty, contains e split

		// nome = " kayo ";

		// outro = nome.trim();

		// nome = "";
		System.out.println(nome.isBlank());

		// metodo isBlank verifica se há espaços em branco
		// meoto isEmpty nao verifica se há espacos em branco

		System.out.println(outro);

		System.out.println(nome.contains("ar"));

		String teste[] = nome.split("-");

		for (int k = 0; k < teste.length; k++) {

			System.err.println(teste[k]);

		}

	}

}
