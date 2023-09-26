package didibank;

public class CriaConta {
	
	public static void main(String[] Args) {
		String nome = "josé";
		String cpf = "555.555.555.55";
		String profissao = "operario";
		String estado = "SP";
		String enderecoF = "Rua casa de Noca";
		String complemento = "Ap 33D";
		int numero = 25;
		String cep = "09822-015";
		
		
		ContaCorrente contaC = new ContaCorrente(143, 23);
		ContaPoupanca contaP = new ContaPoupanca(144, 23);
		
		Cliente cliente = new Cliente(nome, cpf, profissao);
		Endereco endereco = new Endereco(estado, enderecoF, complemento, numero, cep);
		
		contaC.setTitular(cliente);
		contaP.setTitular(cliente);
		cliente.setEndereco(endereco);
		
		
		contaC.depositar(200);
		contaC.transferir(100, contaP);
		System.out.println("Saldo da conta corrente é: "+ contaC.getSaldo());
		contaP.sacar(30);
		System.out.println("Saldo da conta poupança é: "+ contaP.getSaldo());

		
		CalcularImposto imposto = new CalcularImposto();
		imposto.calculoImposto(contaP);
		System.out.println(imposto.getTotalImposto());
		imposto.calculoImposto(contaC);
		System.out.println(imposto.getTotalImposto());
		
	}
	
}
