package kachuelitos.service;

import kachuelitos.persistence.dao.TrabajadorDao;
import kachuelitos.persistence.entity.Trabajador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;


@Component
public class SimpleWorkerManager implements WorkerManager {

    private static final long serialVersionUID = 1L;

    @Autowired
    private TrabajadorDao  trabajadorDao;
    
    private Trabajador trabajador;

    public void setUserDao(TrabajadorDao trabajadorDao) {
        this.trabajadorDao = trabajadorDao;
        
    }

	public Trabajador getWorker(int dni) {
		trabajador = trabajadorDao.getTrabajador(dni);
		return trabajador;
	}
}