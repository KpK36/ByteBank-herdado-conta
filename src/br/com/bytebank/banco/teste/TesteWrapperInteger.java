package br.com.bytebank.banco.teste;

import java.util.ArrayList;
import java.util.List;

public class TesteWrapperInteger {

	public static void main(String[] args) {

		int idade = 30;	
		
		Integer idadeRef = Integer.valueOf(30);
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		
		int valor = idadeRef.intValue(); // unboxing
		String s = "10";
		
//		Integer numero = Integer.valueOf(s);
//		System.out.println(numero);
		
		int numero = Integer.parseInt(s);
		System.out.println(numero);
		
		List<Integer> numeros = new ArrayList<Integer>();
		
		numeros.add(30); // Autoboxing
		
		
		
	}

}
