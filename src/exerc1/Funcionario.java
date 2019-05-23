package exerc1;

abstract class Funcionario {
	protected int matricula;
	protected String nome;
	protected double salario;
	
	public Funcionario (int matricula, String nome, double salario) {
		this.matricula = matricula;
		this.nome = nome;
		this.salario = salario;
	}
	
	public int getMatricula() {
		return this.matricula;
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public String exibeDados() {
		return "Matricula: " + this.matricula + "\nNome: " + this.nome + "\nSalario: " + this.salario;
	}
}
