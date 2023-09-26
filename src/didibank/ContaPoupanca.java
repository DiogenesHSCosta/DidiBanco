package didibank;

public class ContaPoupanca extends Conta implements Tributavel {
	
	Double valorTaxa = 0.2;
	
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}
	
	@Override
	public boolean sacar(double valor) {
		
		valor +=valorTaxa;
		return super.sacar(valor);
		
	}

	@Override
	public double valorImposto() {
		return super.getSaldo()*0.01;
	}
}
