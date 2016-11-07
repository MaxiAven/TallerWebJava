package ar.edu.grupoesfera.cursospring.DAO;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface UsuarioDAO {
	public void agregarUsuario(Usuario usuario);
	public void deleteUsuario(int id);
	public void editarUsuarioNomUs(String usuario, int id);
	public void editarUsuarioPass(String password, int id);
}

