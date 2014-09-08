package kachuelitos.persistence.dao;

import java.util.List;

import kachuelitos.persistence.entity.Trabajador;
import kachuelitos.persistence.entity.User;

public interface TrabajadorDao {

	public User add(Trabajador trabajador);
	public void edit(Trabajador trabajador);
	public void delete(int trabajadorId);
	public Trabajador getTrabajador(int trabajadorId);
	public List<Trabajador> getAllTrabajador();
	
}
