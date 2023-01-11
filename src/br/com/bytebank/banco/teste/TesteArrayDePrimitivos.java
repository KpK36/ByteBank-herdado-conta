package br.com.bytebank.banco.teste;

public class TesteArrayDePrimitivos {

	public static void main(String[] args) {

		
		// int[] numeros = {1,2,3,4,5}
		// para caso tenha um valor definido
		int[] numeros = new int[5];

		for (int i = 0; numeros.length < 5; i++) {

			numeros[i] = i+1;

		}

		for (int i = 0; i < numeros.length; i++) {

			System.out.println(numeros[i]);

		}

	}

}
