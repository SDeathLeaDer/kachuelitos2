package kachuelitos.persistence.entity;

// Generated 07-sep-2014 22:39:05 by Hibernate Tools 4.0.0

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * User generated by hbm2java
 */
@Entity
@Table(name = "user", catalog = "mydb")
public class User implements java.io.Serializable {

	private Integer dniuser;
	private String contrasenhaUser;
	private String nombreUser;
	private String apellidoUser;
	private String correoUser;
	private int ubigeoIdUbigeo1;
	private String telefonoUser;
	private String direccionUser;
	private Boolean trabajador;

	public User() {
	}

	public User(int ubigeoIdUbigeo1) {
		this.ubigeoIdUbigeo1 = ubigeoIdUbigeo1;
	}

	public User(int dniuser, String contrasenhaUser, String nombreUser, String apellidoUser,
			String correoUser, int ubigeoIdUbigeo1, String telefonoUser,
			String direccionUser, Boolean trabajador) {
		this.dniuser = dniuser;
		this.contrasenhaUser = contrasenhaUser;
		this.nombreUser = nombreUser;
		this.apellidoUser = apellidoUser;
		this.correoUser = correoUser;
		this.ubigeoIdUbigeo1 = ubigeoIdUbigeo1;
		this.telefonoUser = telefonoUser;
		this.direccionUser = direccionUser;
		this.trabajador = trabajador;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "DNIUser", unique = true, nullable = false)
	public Integer getDniuser() {
		return this.dniuser;
	}

	public void setDniuser(Integer dniuser) {
		this.dniuser = dniuser;
	}

	@Column(name = "ContrasenhaUser", length = 45)
	public String getContrasenhaUser() {
		return this.contrasenhaUser;
	}

	public void setContrasenhaUser(String contrasenhaUser) {
		this.contrasenhaUser = contrasenhaUser;
	}

	@Column(name = "NombreUser", length = 100)
	public String getNombreUser() {
		return this.nombreUser;
	}

	public void setNombreUser(String nombreUser) {
		this.nombreUser = nombreUser;
	}

	@Column(name = "ApellidoUser", length = 100)
	public String getApellidoUser() {
		return this.apellidoUser;
	}

	public void setApellidoUser(String apellidoUser) {
		this.apellidoUser = apellidoUser;
	}

	@Column(name = "CorreoUser", length = 45)
	public String getCorreoUser() {
		return this.correoUser;
	}

	public void setCorreoUser(String correoUser) {
		this.correoUser = correoUser;
	}

	@Column(name = "Ubigeo_idUbigeo1", nullable = false)
	public int getUbigeoIdUbigeo1() {
		return this.ubigeoIdUbigeo1;
	}

	public void setUbigeoIdUbigeo1(int ubigeoIdUbigeo1) {
		this.ubigeoIdUbigeo1 = ubigeoIdUbigeo1;
	}

	@Column(name = "TelefonoUser", length = 9)
	public String getTelefonoUser() {
		return this.telefonoUser;
	}

	public void setTelefonoUser(String telefonoUser) {
		this.telefonoUser = telefonoUser;
	}

	@Column(name = "DireccionUser", length = 45)
	public String getDireccionUser() {
		return this.direccionUser;
	}

	public void setDireccionUser(String direccionUser) {
		this.direccionUser = direccionUser;
	}

	@Column(name = "Trabajador")
	public Boolean getTrabajador() {
		return this.trabajador;
	}

	public void setTrabajador(Boolean trabajador) {
		this.trabajador = trabajador;
	}

}
