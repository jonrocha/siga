package br.com.siga.mbean;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import br.com.siga.entidade.Usuario;

@ManagedBean(name="usuarioMBean")
@RequestScoped
public class UsuarioMBean {
	
	private Usuario usuario;
	
	public void iniciarCadastro() {}
	
	public void cadastrar() {}

	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	
}
