package kachuelitos.persistence.dao;

import java.util.List;
import kachuelitos.persistence.entity.Comentario;

public interface ComentarioDao {

	public void add(Comentario comentario);
	public void edit(Comentario comentario);
	public void delete(int comentarioId);
	public Comentario getComentario(int comentarioId);
	public List<Comentario> getAllComentarios();
	
}
