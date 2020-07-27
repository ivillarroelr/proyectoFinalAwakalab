package cl.awakelab.proyectofinal.service;

import java.util.List;

import cl.awakelab.proyectofinal.model.Actividad;

public interface IActividadService extends ICRUD<Actividad>{
    Actividad registrar(Actividad obj);
	Actividad modificar(Actividad obj);
	List<Actividad> listar();
	Actividad leerPorId(Integer id);
	boolean eliminar(Integer id);
}