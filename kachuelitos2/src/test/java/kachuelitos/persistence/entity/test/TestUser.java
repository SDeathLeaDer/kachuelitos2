package kachuelitos.persistence.entity.test;

import static org.junit.Assert.*;
import kachuelitos.persistence.entity.User;

import org.junit.Test;
import org.junit.Before;


public class TestUser {
	private User user;

    @Before
    public void setUp() throws Exception {
        user = new User();
    }

    @Test
    public void testSetAndGetDescription() {
    	Integer dniuser = 44444444;
    	String contrasenhaUser = "contrasenhaUser";
    	String nombreUser ="nombreUser";
    	String apellidoUser="apellidoUser";
    	String correoUser= "correoUser";
    	int ubigeoIdUbigeo1 = 040101;
    	String telefonoUser = "442525";
    	String direccionUser= "en algunlugar de un gran pais";
    	Boolean trabajador = false;
    	user.setDniuser(dniuser);
    	user.setContrasenhaUser(contrasenhaUser);
    	user.setNombreUser(nombreUser);
    	user.setApellidoUser(apellidoUser);
    	user.setCorreoUser(correoUser);
    	user.setUbigeoIdUbigeo1(ubigeoIdUbigeo1);
    	user.setTelefonoUser(telefonoUser);
    	user.setDireccionUser(direccionUser);
    	user.setTrabajador(trabajador);
        
        assertEquals(user.getContrasenhaUser(),contrasenhaUser);
        assertEquals(user.getNombreUser(),nombreUser);
        assertEquals(user.getApellidoUser(),apellidoUser);
        assertEquals(user.getCorreoUser(),correoUser);
        assertEquals(user.getUbigeoIdUbigeo1(),ubigeoIdUbigeo1);
        assertEquals(user.getTelefonoUser(),telefonoUser);
        assertEquals(user.getDireccionUser(),direccionUser);
        assertEquals(user.getTrabajador(),trabajador);
    }

    
}
