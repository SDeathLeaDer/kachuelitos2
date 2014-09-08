package kachuelitos.persistence.entity;

// Generated 07-sep-2014 22:39:05 by Hibernate Tools 4.0.0

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * ServicioHasTrabajador generated by hbm2java
 */
@Entity
@Table(name = "servicio_has_trabajador", catalog = "mydb")
public class ServicioHasTrabajador implements java.io.Serializable {

	private ServicioHasTrabajadorId id;

	public ServicioHasTrabajador() {
	}

	public ServicioHasTrabajador(ServicioHasTrabajadorId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "servicioIdServicio", column = @Column(name = "Servicio_idServicio", nullable = false)),
			@AttributeOverride(name = "trabajadorUserDniuser", column = @Column(name = "Trabajador_User_DNIUser", nullable = false)) })
	public ServicioHasTrabajadorId getId() {
		return this.id;
	}

	public void setId(ServicioHasTrabajadorId id) {
		this.id = id;
	}

}
