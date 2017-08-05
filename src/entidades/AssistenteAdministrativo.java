package entidades;

public class AssistenteAdministrativo extends Funcionario {

	private Diretor assistente;
	
	public AssistenteAdministrativo(String nome, String dataAdmissao, float salario) {
		super(nome, dataAdmissao, salario);
		
	}
	
	public AssistenteAdministrativo(String nome, String dataAdmissao, float salario, Diretor assistente) {
		super(nome, dataAdmissao, salario);
		this.assistente = assistente;
	}	

	public Diretor getAssistente() {
		return assistente;
	}

	public void setAssistente(Diretor assistente) {
		this.assistente = assistente;
	}

	@Override
	public float getBonificacao() {
		// TODO Auto-generated method stub
		return (float) (this.getSalario() * 0.15);
	}

}
