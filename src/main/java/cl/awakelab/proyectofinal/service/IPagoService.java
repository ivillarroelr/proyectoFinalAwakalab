package cl.awakelab.proyectofinal.service;

import java.util.List;

import cl.awakelab.proyectofinal.model.Pago;

public interface IPagoService extends ICRUD<Pago>{
    Pago registrar(Pago obj);
	Pago modificar(Pago obj);
	List<Pago> listar();
	Pago leerPorId(Integer id);
	boolean eliminar(Integer id);
}