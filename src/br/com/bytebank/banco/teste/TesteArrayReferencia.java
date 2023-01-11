package br.com.bytebank.banco.teste;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.Conta;

public class TesteArrayReferencia {

	public static void main(String[] args) {

				
		Cliente joao = new Cliente("Joao");
//		ContaCorrente[] contas = new ContaCorrente[2];
//		
//		
//		ContaCorrente cc1 = new ContaCorrente(1000, 2000, joao);
//		
//		
//		contas[0] = cc1;
//		
//		
//		
		Cliente maria = new Cliente("Maria");
//		ContaCorrente cc2 = new ContaCorrente(1000, 1888, maria);
//		contas[1] = cc2;
//		
//		
//		for (int i = 0; i < contas.length; i++) {
//			
//			System.out.println("Nome: " + contas[i].getTitular().getNome());
//			
//		}
		

        Conta[] contas = new Conta[5];
        ContaPoupanca cc1 = new ContaPoupanca(1999, 1001, joao);
        contas[0] = cc1;

        ContaCorrente cc2 = new ContaCorrente(2000, 1000, maria);
        contas[1] = cc2;    

        System.out.println( contas[1].getNumero()  );

        ContaPoupanca ref = (ContaPoupanca)contas[0];
        System.out.println(cc2.getNumero());
        System.out.println(ref.getNumero());
		
		
		
		
		
		
		
		
	}

}
