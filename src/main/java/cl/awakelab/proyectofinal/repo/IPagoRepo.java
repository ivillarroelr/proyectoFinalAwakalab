package cl.awakelab.proyectofinal.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import cl.awakelab.proyectofinal.model.Pago;

public interface IPagoRepo extends JpaRepository<Pago, Integer>{
    
}