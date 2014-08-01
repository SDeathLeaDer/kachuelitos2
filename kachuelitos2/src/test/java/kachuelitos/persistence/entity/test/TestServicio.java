package kachuelitos.persistence.entity.test;

import static org.junit.Assert.*;
import kachuelitos.persistence.entity.Comentario;
import kachuelitos.persistence.entity.Servicio;

import org.junit.Before;
import org.junit.Test;

public class TestServicio {
	private Servicio servicio;

	  @Before
	    public void setUp() throws Exception {
	        servicio= new Servicio();
	    }
		
	@Test
	public void testgetysetServicio() {
		int idServicio = 111111;
		String descripcionServicio= "jardineria";
		String detalleServicio= "jardineria";
		//servicio.setIdServicio(idServicio);
		servicio.setDetalleServicio(detalleServicio);
		servicio.setDescripcionServicio(descripcionServicio);
		
		
		//assertEquals(servicio.getIdServicio(),idServicio);
		assertEquals(servicio.getDetalleServicio(),detalleServicio);
		assertEquals(servicio.getDescripcionServicio(),descripcionServicio);
	}

}
