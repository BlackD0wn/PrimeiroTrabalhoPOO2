package controladores;

import entidades.Operario;
import interfaces.InterfaceDados;

public class ControladorOperario implements InterfaceDados {

	private Operario operario;
	
	public ControladorOperario(Operario operario) {
		this.operario = operario;
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
