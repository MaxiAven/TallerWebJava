package ar.edu.grupoesfera.cursospring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.DAO.UsuarioDAO;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Service(value = "UsuarioService")
public class UsuarioServiceImpl implements UsuarioService {
	
	private static final long serialVersionUID = 1L;
	
	@Autowired
	private UsuarioDAO usuarioDAO;

	@Transactional
	public void agregarUsuario(Usuario usuario) {
		usuarioDAO.agregarUsuario(usuario);
	}

	@Transactional
	public void deleteUsuario(int id) {
		usuarioDAO.deleteUsuario(id);
	}
	
	
	
	
	@Transactional
	public Usuario obtenerUsuario(Integer id){
		return usuarioDAO.obtenerUsuario(id);
	}
	
	@Transactional
	public List<Usuario> listarUsuario(){
		return usuarioDAO.listarUsuario();
	}

}
