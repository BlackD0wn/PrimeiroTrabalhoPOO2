package entidades;

public class Secretario extends Funcionario {

	private String numeroTelefone;
	
	public Secretario(String nome, String dataAdmissao, float salario, String numeroTelefone) {
		super(nome, dataAdmissao, salario);
		this.numeroTelefone = numeroTelefone;
	}

	@Override
	public float getBonificacao() {
		// TODO Auto-generated method stub
		return (float) (this.getSalario() * 0.10);
	}

	public String getNumeroTelefone(){
		return this.numeroTelefone;
	}
	
	public void setNumeroTelefone(String numeroTelefone){
		this.numeroTelefone = numeroTelefone;
	}
	
}
