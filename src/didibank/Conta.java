package didibank;

public abstract class Conta {
	private double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	public Conta(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
		Conta.total++;
	}
	
	
	
	public void depositar(double valor) {
		this.saldo += valor;
	}
	
	public boolean sacar(double valor) {
		if(valor <= this.saldo) {
			this.saldo -= valor;
			return true;
		}
		else {
			return false;
		}
	}
	
	
	public boolean transferir(double valor, Conta destino) {
		if(this.sacar(valor)) {
			destino.depositar(valor);
			return true;
		}
		else {
			return false;
		}
	}
	
	//////////////////////////////////
	public double getSaldo(){
		return saldo;
	}
	
	//////////////////////////////////
	public int getAgencia() {
		return agencia;
	}
	//////////////////////////////////
	
	public int getNumero() {
		return numero;
	}
	
	
	/////////////////////////////////////
	public Cliente getTitular() {
		return titular;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	public static int getTotal() {
		return total;
		
 	}
}
