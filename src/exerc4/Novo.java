
package exerc4;

public class Novo extends Imovel{
	public Novo(double preco) {
		super(preco);
	}



	private double adicionalPreco;

	public double getAdicionalPreco() {
		return adicionalPreco;
	}

	public void setAdicionalPreco(double adicionalPreco) {
		this.adicionalPreco = adicionalPreco;
	}
	
	
	
	public double valorImovelNovo() {
		return this.preco + this.adicionalPreco;
	}
}
