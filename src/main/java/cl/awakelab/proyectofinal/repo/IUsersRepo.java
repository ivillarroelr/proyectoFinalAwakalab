package cl.awakelab.proyectofinal.repo;

import cl.awakelab.proyectofinal.model.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface IUsersRepo extends JpaRepository<Users, Long> {
    public Optional<Users> findByUsername(String username);
}