package exerc3;

public class CamaroteSuperior extends VIP{
	
	public CamaroteSuperior(double valor) {
		super(valor);
	}

	public double valorIngressoCamSup() {
		return  this.valorIngressoVIP() + this.valorAdicional;
	}
}
