package ar.edu.grupoesfera.cursospring.servicio;

import java.io.Serializable;
import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Receta;

public interface RecetaService extends Serializable{

	public void agregarReceta(Receta receta);
	public void editarReceta(Integer id, String titulo, String descripcion);
	public List<Receta> recetasConBebidas(String nombre);
	public void deleteReceta(Integer id);
	public List<Receta> listarRecetas();
	public Receta obtenerReceta(Integer id);
	public List<Receta> recetasConIngredientes(String ingrediente1, String ingrediente2);
}
