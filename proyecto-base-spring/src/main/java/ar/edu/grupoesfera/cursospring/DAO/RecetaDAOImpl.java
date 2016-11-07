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
	
	public void editarDetalleReceta(String detalle, int id){
		String consulta = "update receta set detalle = :detalle" +"where id_receta = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("detalle",detalle);
		query.setParameter("id", id);
		query.executeUpdate();
		
	}

	public void editarTituloReceta(String titulo, int id){
		String consulta = "update receta set titulo = :titulo" + "where id_receta = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("titulo", titulo);
		
	}
	
	public void deleteReceta(int id){
		String consulta = "delete from receta where id_receta = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("id", id);
		query.executeUpdate();
	}
	
	@SuppressWarnings("unchecked")
	public List<Receta> listarRecetas(){
		return em.createQuery("select a from receta a order by a.id_receta").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Receta> recetasConBebidas(String nombre){
		String consulta = "select a from receta r join bebida b on r.id_receta=b.id_receta where r.descripcion like %:nombre%";
		Query query = em.createQuery(consulta);
		query.setParameter("nombre", nombre);
		return query.getResultList();
	}
}
