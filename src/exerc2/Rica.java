package exerc2;

public class Rica extends Pessoa{
	private double dinheiro;
	
	public void fazCompras() {
		System.out.println("fazendo compras");
	}

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
}
