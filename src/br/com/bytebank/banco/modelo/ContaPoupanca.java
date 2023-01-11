package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta implements AutoCloseable {

	public ContaPoupanca(int numero, int agencia, Cliente titular) {

		super(numero, agencia, titular);

	}

	@Override
	public void saca(double valor) {

		valor += 0.2;
		super.saca(valor);

	}

	@Override
	public void close() {

	}
	
	@Override	
	public String toString() {
		return "ContaPoupanca " + super.toString();
	}

}
