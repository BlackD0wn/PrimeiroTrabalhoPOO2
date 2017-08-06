package controladores;

import entidades.AdministradorDoSistema;
import interfaces.InterfaceDados;

public class ControladorAdministradorDoSistema implements InterfaceDados {

	private AdministradorDoSistema administrador;
	
	public ControladorAdministradorDoSistema(AdministradorDoSistema administrador) {
		this.administrador = administrador;
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
