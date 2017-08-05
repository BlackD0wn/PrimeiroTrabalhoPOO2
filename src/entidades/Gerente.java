package entidades;

public class Gerente extends Funcionario {
	
	//falta atributo
	
	public Gerente(String nome, String dataAdmissao, float salario) {
		super(nome, dataAdmissao, salario);
	}

	@Override
	public float getBonificacao() {
		return (float) (this.getSalario() * 0.1);
	}

	
	
	
}
