package cl.awakelab.proyectofinal.service;

import java.util.List;

import cl.awakelab.proyectofinal.model.Accidente;

public interface IAccidenteService extends ICRUD<Accidente> {
    Accidente registrar(Accidente obj);
	Accidente modificar(Accidente obj);
	List<Accidente> listar();
	Accidente leerPorId(Integer id);
	boolean eliminar(Integer id);

}