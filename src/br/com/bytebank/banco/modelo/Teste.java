package br.com.bytebank.banco.modelo;

public class Teste {

	public static void main(String[] args) {
		
		Cliente jose = new Cliente("Jose");		
		
		try(ContaCorrente c = new ContaCorrente(10, 50, jose)) {
			
		} catch (IllegalArgumentException e) {
			
			System.out.println(e.getMessage());
			e.printStackTrace();
			
		}

	}

}
