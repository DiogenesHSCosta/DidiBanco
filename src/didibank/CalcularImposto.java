package didibank;

public class CalcularImposto {
	
	private double totalImposto;
	
	public double calculoImposto(Tributavel tributo){
		return totalImposto += tributo.valorImposto();
	}
	
	public double getTotalImposto() {
		return totalImposto;
	}
}
