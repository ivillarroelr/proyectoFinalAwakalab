package cl.awakelab.proyectofinal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.proyectofinal.model.Accidente;
import cl.awakelab.proyectofinal.repo.IAccidenteRepo;
import cl.awakelab.proyectofinal.service.IAccidenteService;

@Service
public class AccidenteServiceImpl implements IAccidenteService {

    @Autowired
    private IAccidenteRepo repo;

    @Override
    public Accidente registrar(Accidente obj) {
        return repo.save(obj);
    }

    @Override
    public Accidente modificar(Accidente obj) {
        return repo.save(obj);
    }

    @Override
    public List<Accidente> listar() {
        return repo.findAll();
    }

    @Override
    public Accidente leerPorId(Integer id) {
        Optional<Accidente> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Accidente();
    }

    @Override
    public boolean eliminar(Integer id) {
        repo.deleteById(id);
		return true;
    }

}
    
