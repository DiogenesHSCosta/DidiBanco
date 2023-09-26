package didibank;

public class Endereco {
	private String estado;
	private String endereco;
	private String complemento;
	private String cep;
	private int numero;
	
	public Endereco(String estado, String endereco, String complemento, int numero, String cep) {
		this.estado = estado;
		this.endereco = endereco;
		this.complemento = complemento;
		this.numero = numero;
		this.cep = cep;
		
	}
	
	public void consultarEndereco(){
		System.out.println(this.estado + this.endereco + this.complemento +this.numero + this.cep);
	}
}
