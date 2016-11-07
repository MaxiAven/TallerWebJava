package ar.edu.grupoesfera.cursospring.DAO;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import ar.edu.grupoesfera.cursospring.modelo.Bebida;

@Repository(value = "bebida")
public class BebidaDAOImpl implements BebidaDAO{
	
private EntityManager em = null;
	
	@PersistenceContext
	public void setEntityManager(EntityManager em){
		this.em= em;
	}
	
	public void agregarBebida(Bebida bebida){
		em.merge(bebida);
	}
	
	public void deleteBebida(int id){
		String consulta = "delete from bebida where id_bebida = :id";
		Query query = em.createQuery(consulta);
		query.setParameter("id", id);
		query.executeUpdate();
	}


}
