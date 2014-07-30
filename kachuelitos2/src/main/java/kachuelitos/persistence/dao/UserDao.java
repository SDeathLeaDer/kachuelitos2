package kachuelitos.persistence.dao;

import java.util.List;
import kachuelitos.persistence.entity.User;

public interface UserDao {

	public void add(User usuario);
	public void edit(User usuario);
	public void delete(int usuarioId);
	public User getUsuario(int usuarioId);
	public List<User> getAllUsuario();
	
}
