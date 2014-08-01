package kachuelitos.persistence.entity.test;

import static org.junit.Assert.*;
import kachuelitos.persistence.entity.Comentario;
import kachuelitos.persistence.entity.ComentarioId;
import kachuelitos.persistence.entity.User;

import org.junit.Before;
import org.junit.Test;

public class TestComentario {
	private Comentario comentario;
	
    @Before
    public void setUp() throws Exception {
        comentario= new Comentario();
    }
	

	@Test
	public void testSetAndGetComentario() {
		ComentarioId id = new ComentarioId(11111111,22222222,3333333);
		String descripcionComentario="descripcionComentario";
		String detalleComentario="detalleComentario";
		comentario.setId(id);
		comentario.setDescripcionComentario(descripcionComentario);
		comentario.setDetalleComentario(detalleComentario);
		assertEquals(comentario.getId(),id);
		assertEquals(comentario.getDescripcionComentario(),descripcionComentario);
		assertEquals(comentario.getDetalleComentario(),detalleComentario);
		
	}

}
