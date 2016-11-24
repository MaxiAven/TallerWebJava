package ar.edu.grupoesfera.cursospring.DAO;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

public interface UsuarioDAO {
	public void agregarUsuario(Usuario usuario);
	public void deleteUsuario(int id);
	public Usuario obtenerUsuario(Integer id);
	public List<Usuario> listarUsuario();

}

