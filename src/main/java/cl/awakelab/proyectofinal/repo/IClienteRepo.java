package cl.awakelab.proyectofinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.proyectofinal.model.Cliente;

public interface IClienteRepo extends JpaRepository<Cliente, Integer>{
    
}