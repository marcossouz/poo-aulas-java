package exerc2;

public class Animal {
	private String nome;
	private String raca;
	
	public Animal() {
		this.nome = "sem nome";
	}
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	public String caminha() {
		return "Caminhando...";
	}
	
	@Override
	public String toString() {
		return "Nome: " + this.nome + "\nRaca: " + this.raca;
	}
	
	

}
