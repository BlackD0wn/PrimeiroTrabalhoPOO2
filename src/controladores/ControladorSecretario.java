package controladores;

import entidades.Secretario;
import interfaces.InterfaceDados;

public class ControladorSecretario implements InterfaceDados {
	
	private Secretario secretario;
	
	public ControladorSecretario(Secretario secretario) {
		this.secretario = secretario;
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
