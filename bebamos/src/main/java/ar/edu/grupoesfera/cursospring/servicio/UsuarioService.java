package ar.edu.grupoesfera.cursospring.servicio;

import java.io.Serializable;
import java.util.List;


import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface UsuarioService extends Serializable{

	public void agregarUsuario(Usuario usuario);
	public void deleteUsuario(int id);
	/*public void editarUsuarioNomUs(String usuario, int id);
	public void editarUsuarioPass(String password, int id);*/
	public List<Usuario> listarUsuario();
	public Usuario obtenerUsuario(Integer id);
}
