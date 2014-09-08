package kachuelitos.service;

import java.io.Serializable;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kachuelitos.persistence.entity.Trabajador;
import kachuelitos.persistence.entity.User;

import org.springframework.web.servlet.ModelAndView;

public interface WorkerManager extends Serializable {

    public Trabajador getWorker(int dni);    

	
}