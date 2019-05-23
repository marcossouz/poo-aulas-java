package exerc1;

public class Tecnico extends Assistente{
	private double bonus;

	public Tecnico(int matricula, String nome, double salario, String senha, double bonus) {
		super(matricula, nome, salario, senha);
		this.setBonus(bonus);
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double bonus) {
		this.bonus = bonus;
	}
	
	@Override
	public String exibeDados() {
		return "Matricula: " + this.matricula + "\nNome: " + this.nome +
				"\nSalario: " + this.salario + "\nSenha: " + this.senha + "\nBonus: " + this.bonus;
	}
}
