package kachuelitos.persistence.dao;

import java.util.List;

import kachuelitos.persistence.entity.User;

public interface UserDao {

	public User add(User usuario);
	public void edit(User usuario);
	public void delete(int usuarioId);
	public User getUsuario(int usuarioId);
	public User getUsuarioDniPassword(String sDni, String sPassword);
	public List<User> getAllUsuario();
	
}
