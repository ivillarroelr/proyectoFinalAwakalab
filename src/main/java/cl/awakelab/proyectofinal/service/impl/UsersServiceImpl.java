package cl.awakelab.proyectofinal.service.impl;

import cl.awakelab.proyectofinal.model.Users;
import cl.awakelab.proyectofinal.repo.IUsersRepo;
import cl.awakelab.proyectofinal.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UsersServiceImpl implements IUsersService {

    @Autowired
    private IUsersRepo repo;

    @Override
    public Users registrar(Users obj) {
        return repo.save(obj);
    }

    @Override
    public Users modificar(Users obj) {
        return repo.save(obj);
    }

    @Override
    public List<Users> listar() {
        return repo.findAll();
    }

    @Override
    public Users leerPorUsername(String username) {
        Optional<Users> op = repo.findByUsername(username);
        return op.isPresent() ? op.get() : new Users();
    }

    @Override
    public boolean eliminar(String username) {
        repo.deleteById(username);
        return true;
    }
}
