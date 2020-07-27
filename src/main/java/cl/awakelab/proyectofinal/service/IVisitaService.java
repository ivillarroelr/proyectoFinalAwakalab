package cl.awakelab.proyectofinal.service;

import java.util.List;

import cl.awakelab.proyectofinal.model.Visita;

public interface IVisitaService extends ICRUD<Visita> {
    Visita registrar(Visita obj);
	Visita modificar(Visita obj);
	List<Visita> listar();
	Visita leerPorId(Integer id);
	boolean eliminar(Integer id);
}