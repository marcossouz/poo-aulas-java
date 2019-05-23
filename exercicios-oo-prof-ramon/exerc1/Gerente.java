package exerc1;

public class Gerente extends Funcionario {
	protected double ramal;
	protected String senha;
	
	public Gerente(double ramal, String senha, int matricula, String nome, double salario) {
		super(matricula, nome, salario);
		this.ramal = ramal;
		this.senha = senha;
	}
}
