package cl.awakelab.proyectofinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.proyectofinal.model.Visita;

public interface IVisitaRepo extends JpaRepository<Visita, Integer> {
    
}