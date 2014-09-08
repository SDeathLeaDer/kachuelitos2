package kachuelitos.persistence.entity;

// Generated 07-sep-2014 22:39:05 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Trabajo generated by hbm2java
 */
@Entity
@Table(name = "trabajo", catalog = "mydb")
public class Trabajo implements java.io.Serializable {

	private TrabajoId id;
	private Integer calificacionTrabajo;
	private Integer duracionTrabajo;

	public Trabajo() {
	}

	public Trabajo(TrabajoId id) {
		this.id = id;
	}

	public Trabajo(TrabajoId id, Integer calificacionTrabajo,
			Integer duracionTrabajo) {
		this.id = id;
		this.calificacionTrabajo = calificacionTrabajo;
		this.duracionTrabajo = duracionTrabajo;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "idTrabajo", column = @Column(name = "idTrabajo", nullable = false)),
			@AttributeOverride(name = "userDniuser", column = @Column(name = "User_DNIUser", nullable = false)),
			@AttributeOverride(name = "idServicio", column = @Column(name = "idServicio", nullable = false)),
			@AttributeOverride(name = "idTrabajador", column = @Column(name = "idTrabajador", nullable = false)) })
	public TrabajoId getId() {
		return this.id;
	}

	public void setId(TrabajoId id) {
		this.id = id;
	}

	@Column(name = "CalificacionTrabajo")
	public Integer getCalificacionTrabajo() {
		return this.calificacionTrabajo;
	}

	public void setCalificacionTrabajo(Integer calificacionTrabajo) {
		this.calificacionTrabajo = calificacionTrabajo;
	}

	@Column(name = "DuracionTrabajo")
	public Integer getDuracionTrabajo() {
		return this.duracionTrabajo;
	}

	public void setDuracionTrabajo(Integer duracionTrabajo) {
		this.duracionTrabajo = duracionTrabajo;
	}

}
