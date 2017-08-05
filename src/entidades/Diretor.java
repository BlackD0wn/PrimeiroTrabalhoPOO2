package entidades;

public class Diretor extends Funcionario {

	private String setorGerencia;
	
	public Diretor(String nome, String dataAdmissao, String setorGerencia, float salario) {
		super(nome, dataAdmissao, salario);
		this.setorGerencia = setorGerencia;
	}

	@Override
	public float getBonificacao() {
		return (float) (this.getSalario() * 0.10);
	}

	public String getSetorGerencia(){
		return this.setorGerencia;
	}
	
}
