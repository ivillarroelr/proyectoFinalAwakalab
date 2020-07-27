package cl.awakelab.proyectofinal.service;

import java.util.List;

import cl.awakelab.proyectofinal.model.Cliente;

public interface IClienteService extends ICRUD<Cliente>{
    Cliente registrar(Cliente obj);
	Cliente modificar(Cliente obj);
	List<Cliente> listar();
	Cliente leerPorId(Integer id);
	boolean eliminar(Integer id);
}