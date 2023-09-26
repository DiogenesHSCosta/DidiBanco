package didibank;

public class ContaCorrente extends Conta implements Tributavel {
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}


	@Override
	public double valorImposto() {
		return super.getSaldo()*0.01;
	}
}
