package exerc3;

public class Normal extends Ingresso{
	public Normal(double valor) {
		super(valor);
	}

	public void imprimeIngressoNormal() {
		System.out.println("Valor do ingresso: " + this.valor);
	}
}
