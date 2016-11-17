package ar.edu.grupoesfera.cursospring.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ar.edu.grupoesfera.cursospring.modelo.Usuario;

@Repository(value = "usuario")
public class UsuarioDAOImpl implements UsuarioDAO {

	private EntityManager em = null;

	@PersistenceContext
	public void setEntityManager(EntityManager em) {
		this.em = em;
	}

	public void agregarUsuario(Usuario usuario) {
		em.merge(usuario);
	}

	public void deleteUsuario(int id) {
		String consulta = "delete from usuario where id = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	public void editarUsuarioNomUs(String usuario, int id) {
		String consulta = "update usuario set usuario = :usuario" + "where id = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("usuario", usuario);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	public void editarUsuarioPass(String password, int id) {
		String consulta = "update usuario set cont = :password" + "where id = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("cont", password);
		query.setParameter("id", id);
		query.executeUpdate();		
	}
	
}