package ar.edu.grupoesfera.cursospring.DAO;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ar.edu.grupoesfera.cursospring.modelo.Receta;

@Repository(value = "receta")
public class RecetaDAOImpl implements RecetaDAO {
	
	private EntityManager em = null;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em){
		this.em= em;
	}
	
	
	public void agregarReceta(Receta receta){
		em.merge(receta);
	}
	
	@SuppressWarnings("unchecked")
	public List<Receta> listarRecetas(){
		return em.createQuery("select a from Receta a order by a.IdReceta").getResultList();
	}
	


	public void editarReceta(Integer id, String titulo, String descripcion){
		String consulta = "update Receta set titulo = :titulo, descripcion = :descripcion" + " where IdReceta = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("titulo",titulo);
		query.setParameter("descripcion",descripcion);
		query.setParameter("id",id);
		query.executeUpdate();
		
	}
	
	public Receta obtenerReceta(Integer id){
		String consulta = "select a from Receta a where a.IdReceta = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("id", id);
		return (Receta)query.getSingleResult();
	}
	
	public void deleteReceta(Integer id){
		String consulta = "delete from Receta where IdReceta = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("id", id);
		query.executeUpdate();
	}

	@SuppressWarnings("unchecked")
	public List<Receta> recetasConBebidas(String nombre){
		String consulta = "select r from Receta r where r.titulo like :nombre";
		Query query = em.createQuery(consulta);
		query.setParameter("nombre", nombre);
		return query.getResultList();
	}
	
	@SuppressWarnings("unchecked")
	public List<Receta> recetasConIngredientes(String ingrediente1, String ingrediente2){
		String consulta = "select r from Receta r where r.descripcion like :ingrediente1 and  r.descripcion like :ingrediente2";
		Query query = em.createQuery(consulta);
		query.setParameter("ingrediente1","%" + ingrediente1 + "%" );
		query.setParameter("ingrediente2","%" + ingrediente2 + "%" );
		return query.getResultList();
	}
}
