package ar.edu.grupoesfera.cursospring.DAO;

import java.util.List;

import ar.edu.grupoesfera.cursospring.modelo.Receta;

public interface RecetaDAO {
	
	public void agregarReceta(Receta receta);
	public void editarTituloReceta(String titulo, int id);
	public void editarDetalleReceta(String detalle, int id);
	public List<Receta> recetasConBebidas(String nombre);
	public void deleteReceta(int id);
	public List<Receta> listarRecetas();

}
