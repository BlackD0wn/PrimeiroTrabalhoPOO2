package entidades;

public class Operario extends Funcionario {

	private String tipo;
	
	public Operario(String nome, String dataAdmissao, float salario, String tipo) {
		super(nome, dataAdmissao, salario);
		this.tipo = tipo;
	}

	@Override
	public float getBonificacao() {
		return (float) (this.getSalario() * 0.01);
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
}
