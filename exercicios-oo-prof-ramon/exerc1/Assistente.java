package exerc1;

abstract class Assistente extends Funcionario{
	protected String senha;
	
	public Assistente(int matricula, String nome, double salario, String senha) {
		super(matricula, nome, salario);
		this.senha = senha;
	}
	
	public abstract String exibeDados(); 
}
