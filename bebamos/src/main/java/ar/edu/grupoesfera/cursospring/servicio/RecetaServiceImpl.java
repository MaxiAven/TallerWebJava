package ar.edu.grupoesfera.cursospring.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ar.edu.grupoesfera.cursospring.DAO.RecetaDAO;
import ar.edu.grupoesfera.cursospring.modelo.Receta;

@Service(value = "RecetaService")
public class RecetaServiceImpl implements RecetaService{
	
private static final long serialVersionUID = 1L;
	
	@Autowired
	private RecetaDAO recetaDao;
	
	@Transactional
	public void agregarReceta(Receta receta){
		recetaDao.agregarReceta(receta);
	}
	
	@Transactional
	public void editarReceta(Integer id, String titulo, String descripcion){
		recetaDao.editarReceta( id, titulo, descripcion);
	}
	
	@Transactional
	public void deleteReceta(Integer id){
		recetaDao.deleteReceta(id);
	}
	
	@Transactional
	public List<Receta> listarRecetas(){
		return recetaDao.listarRecetas();
	}
	
	@Transactional
	public Receta obtenerReceta(Integer id){
		return recetaDao.obtenerReceta(id);
	}
	
	@Transactional
	public List<Receta> recetasConBebidas(String nombre){
		return recetaDao.recetasConBebidas(nombre);
	}
	
	@Transactional
	public List<Receta> recetasConIngredientes(String ingrediente1, String ingrediente2){
		return recetaDao.recetasConIngredientes(ingrediente1, ingrediente2);
	}
}
