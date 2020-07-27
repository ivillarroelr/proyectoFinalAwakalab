package cl.awakelab.proyectofinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.proyectofinal.model.Profesional;

public interface IProfesionalRepo extends JpaRepository<Profesional, Integer> {
    
}