package entidades;

public abstract class Funcionario extends Pessoa{

	private String dataAdmissao;
	
	public Funcionario(String nome, String dataAdmissao) {
		super(nome);
		this.dataAdmissao = dataAdmissao;
	}
	
	public String getDataAdmissao(){
		return this.dataAdmissao;
	}

}
