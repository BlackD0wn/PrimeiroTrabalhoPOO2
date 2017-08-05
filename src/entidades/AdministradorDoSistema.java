package entidades;

public class AdministradorDoSistema extends Funcionario {

	private String especializacao;
	
	public AdministradorDoSistema(String nome, String dataAdmissao, float salario, String especializacao) {
		super(nome, dataAdmissao, salario);
		// TODO Auto-generated constructor stub
		this.especializacao = especializacao;
	}

	@Override
	public float getBonificacao() {
		
		return (float) (this.getSalario() * 0.20);
	}

	public String getEspecializacao() {
		return especializacao;
	}

	public void setEspecializacao(String especializacao) {
		this.especializacao = especializacao;
	}
}
