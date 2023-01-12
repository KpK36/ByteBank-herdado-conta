package br.com.bytebank.banco.teste;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {

		Integer idadeRef = Integer.valueOf(30); //autoboxing		
		System.out.println(idadeRef.intValue()); //unboxing
		
		
		Double doubleRef = Double.valueOf(3.3);
		
		System.out.println("Valor guardado no objeto Double: " + doubleRef.doubleValue());
		
		
		
		Boolean bRef = Boolean.TRUE;
		
		
		System.out.println("Valor guardado no objeto Boolean: " + bRef.booleanValue());
		
		Number numeroRef = Double.valueOf(5.7); // referencia generica
		
		System.out.println(numeroRef.doubleValue());
		
		List<Number> numeros = new ArrayList<>();
		
		numeros.add(5.1);
		numeros.add(3);
		numeros.add(5.1f);
		
		
		
		
	}

}
