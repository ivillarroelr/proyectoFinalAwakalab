package cl.awakelab.proyectofinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.proyectofinal.model.Accidente;

public interface IAccidenteRepo extends JpaRepository<Accidente, Integer>{
    
}