package exerc3;

public class VIP extends Ingresso{
	public VIP(double valor) {
		super(valor);
	}

	protected double valorAdicional;
	
	public double valorIngressoVIP() {
		return this.valor + this.valorAdicional;
	}
}
