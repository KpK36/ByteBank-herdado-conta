package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel, AutoCloseable{
	
	public ContaCorrente(int numero, int agencia, Cliente titular) {
		
		super(numero, agencia, titular);		
		
	}

	@Override
	public double getValorImposto() {		
		return super.getSaldo() * 0.02;
	}

	@Override
	public void close() {		
		
	}
	
	@Override	
	public String toString() {
		return "ContaCorrente " + super.toString();
	}


}
