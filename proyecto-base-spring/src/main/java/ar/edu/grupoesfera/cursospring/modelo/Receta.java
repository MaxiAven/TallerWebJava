package ar.edu.grupoesfera.cursospring.modelo;

public class Receta {

	private Integer IdReceta;
	private Bebida bebida;
	private String descripcion;
	
	public Integer getIdReceta() {
		return IdReceta;
	}
	public void setIdReceta(Integer idReceta) {
		IdReceta = idReceta;
	}
	public Bebida getBebida() {
		return bebida;
	}
	public void setBebida(Bebida bebida) {
		this.bebida = bebida;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
