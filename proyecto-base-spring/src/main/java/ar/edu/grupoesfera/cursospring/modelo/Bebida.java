package ar.edu.grupoesfera.cursospring.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="bebida")
public class Bebida {
	
	@Id
	@GeneratedValue
	@Column(name="id_bebida")
	private Integer idBebida;
	
	@Column(name="descripcion")
	private String nombre;
	
	public Integer getIdBebida() {
		return idBebida;
	}
	public void setIdBebida(Integer idBebida) {
		this.idBebida = idBebida;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
