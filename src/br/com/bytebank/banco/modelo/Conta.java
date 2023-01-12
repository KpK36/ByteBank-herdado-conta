package br.com.bytebank.banco.modelo;

import java.util.Comparator;

public abstract class Conta implements Comparable<Conta>{

	// por padrao os valores default sao zeros, caso não seja definido nenhum outro,
	// em caso de objeto e string é null
	// forcando a usar seus metodos para ver seus atributos
	
	private double saldo;
	private int numero;
	private int agencia;
	private Cliente titular;

	private static int totalContas; // static é para definir uma variavel da classe e nao do objeto. 
									// global da classe, que pode ser vista por todas as instancia de seus objetos

	/**
	 * Inicializa uma conta a partir de um numero e uma agencia
	 * 
	 * @author Kayo Patryck
	 * @version 0.1
	 * 
	 */
	public Conta(int numero, int agencia, Cliente titular) {

		// o construtor é uma rotina de inicialização
		// os construtores servem para inicializar atributos		

		if (numero < 1000 || numero > 2000) {

			throw new IllegalArgumentException("O numero da conta deve ser maior que 1000 e menor que 2000");

		}

		else if (agencia < 1) {

			throw new IllegalArgumentException("O numero da agencia nao pode ser negativo");
		}

		this.numero = numero;
		this.agencia = agencia;
		this.titular = titular;
		Conta.totalContas++;

		System.out.println("Conta criada!" + "\n Agencia: " + this.agencia + "\n Numero: " + this.numero);
		System.out.println("Total de contas criadas: " + Conta.totalContas);

	}

	/**
	 * Metodo para depositar um valor em uma conta
	 * 
	 * @param valor
	 * @return String
	 */

	public String deposita(double valor) {

		if (valor > 0) {

			this.saldo += valor;

			return "Voce depositou a quantia de: " + valor;

		}

		return "Valor de deposito negativo ou zero";

	}

	/**
	 * Metodo para sacar valor de uma conta
	 * 
	 * @param valor
	 */

	public void saca(double valor) {

		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo Insuficiente: " + this.saldo + ", Valor do Saque: " + valor);

		}

		this.saldo -= valor;

	}

	/**
	 * Metodo para transferir valores entre uma conta e outra
	 * 
	 * @param valor
	 * @param destino
	 */

	public void tranfere(double valor, Conta destino) {

		this.saca(valor);
		destino.deposita(valor);
	}
	
	/** Metodo para retornar o saldo da conta
	 * 
	 * @return double
	 */

	public double getSaldo() {

		return this.saldo;

	}
	
	/** Metodo para retornar o numero da conta
	 * 
	 * @return int
	 */

	public int getNumero() {

		return this.numero;

	}
	
	/** Define o numero da conta
	 * 
	 * @param numero
	 */

	public void setNumero(int numero) {

		if (numero > 1000 && numero < 2000) {

			this.numero = numero;
			System.out.println("Numero da agencia: " + numero);

		}

	}
	
	/** Metoto para capturar a referencia para o titular da conta
	 * 
	 * @return Cliente
	 */

	public Cliente getTitular() {
		return this.titular;
	}
	
	/** Metodo para definir o titular da conta
	 * Obs.: deve ter sido criado um objeto do tipo titular
	 * @param titular
	 */

	public void setTitular(Cliente titular) {
		this.titular = titular;
		System.out.println("Titular definido com sucesso: " + getTitular().getNome());
	}
	
	@Override
	public int compareTo(Conta conta) {		 
		return Double.compare(this.saldo, conta.saldo);
	}

	@Override
	public String toString() {
		return "\n Saldo: " + this.saldo + "\n Agencia: " + this.agencia + "\n Numero: " + this.numero;
	}

	@Override
	public boolean equals(Object obj) {

		Conta ref = (Conta) obj;

		if (this.agencia == ref.agencia) {

			return false;

		}

		if (this.numero == ref.numero) {

			return false;

		}

		return true;

	}
	
	

}