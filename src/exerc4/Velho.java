package exerc4;

public class Velho extends Imovel{
	public Velho(double preco) {
		super(preco);
	}

	private double desconto;

	public double getDesconto() {
		return desconto;
	}

	public void setDesconto(double desconto) {
		this.desconto = desconto;
	}
	
	public void ImprimeDesconto() {
		System.out.println("Desconto: " + this.desconto);
	}
	
	public double valorImovelVelho() {
		return this.preco + this.desconto;
	}
}
