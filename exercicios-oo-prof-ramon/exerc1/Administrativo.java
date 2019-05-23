package exerc1;

public class Administrativo extends Assistente{
	String turno;
	double adicionalNoturno;

	public Administrativo(int matricula, String nome, double salario, String senha, String turno, double adicionalNoturno) {
		super(matricula, nome, salario, senha);
		this.adicionalNoturno = adicionalNoturno;
		this.turno = turno;
	}
	
	@Override
	public String exibeDados() {
		return "Matricula: " + this.matricula + "\nNome: " + this.nome +
				"\nSalario: " + this.salario + "\nSenha: " + this.senha +
				"Turno: " + this.turno + "\nAdicionalNoturno: " + adicionalNoturno;
	};
}
