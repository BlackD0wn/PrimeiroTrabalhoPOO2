package controladores;

import entidades.Funcionario;
import interfaces.InterfaceDados;

public class ControleFuncionario implements InterfaceDados {

	private Funcionario funcionario;
	
	public ControleFuncionario(Funcionario funcionario) {
		this.funcionario = funcionario;
	}

	@Override
	public void salvar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void recuperar() {
		// TODO Auto-generated method stub

	}

	@Override
	public void excluir() {
		// TODO Auto-generated method stub

	}

}
