package cl.awakelab.proyectofinal.service;

import java.util.List;

import cl.awakelab.proyectofinal.model.Profesional;

public interface IProfesionalService extends ICRUD<Profesional>{
    Profesional registrar(Profesional obj);
	Profesional modificar(Profesional obj);
	List<Profesional> listar();
	Profesional leerPorId(Integer id);
	boolean eliminar(Integer id);
}