package cl.awakelab.proyectofinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.proyectofinal.model.Actividad;

public interface IActividadRepo extends JpaRepository<Actividad, Integer>{
    
}