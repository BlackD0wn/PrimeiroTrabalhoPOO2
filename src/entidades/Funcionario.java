package entidades;

public abstract class Funcionario extends Pessoa{

	private String dataAdmissao;
	private float salario;
	
	public Funcionario(String nome, String dataAdmissao, float salario) {
		super(nome);
		this.dataAdmissao = dataAdmissao;
		this.salario = salario;
	}
	
	public String getDataAdmissao(){
		return this.dataAdmissao;
	}
	
	public float getSalario(){
		return this.salario;
	}
	
	public abstract float getBonificacao();

}
