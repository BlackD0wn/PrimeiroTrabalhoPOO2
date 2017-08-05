package entidades;

public class Zelador extends Funcionario {

	private String areaZelada;
	
	public Zelador(String nome, String dataAdmissao, float salario, String areaZelada) {
		super(nome, dataAdmissao, salario);
		this.areaZelada = areaZelada;
		}

	@Override
	public float getBonificacao() {
		return (float) (this.getSalario() * 0.04);
	}

	public String getAreaZelada() {
		return areaZelada;
	}

	public void setAreaZelada(String areaZelada) {
		this.areaZelada = areaZelada;
	}

	
	
}
