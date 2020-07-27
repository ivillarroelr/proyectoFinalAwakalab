package cl.awakelab.proyectofinal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.proyectofinal.model.Profesional;
import cl.awakelab.proyectofinal.repo.IProfesionalRepo;
import cl.awakelab.proyectofinal.service.IProfesionalService;

@Service
public class ProfesionalServiceImpl implements IProfesionalService {

    @Autowired
    private IProfesionalRepo repo;

    @Override
    public Profesional registrar(Profesional obj) {
        return repo.save(obj);
    }

    @Override
    public Profesional modificar(Profesional obj) {
        return repo.save(obj);
    }

    @Override
    public List<Profesional> listar() {
        return repo.findAll();
    }

    @Override
    public Profesional leerPorId(Integer id) {
        Optional<Profesional> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Profesional();
    }

    @Override
    public boolean eliminar(Integer id) {
        repo.deleteById(id);
		return true;
    }
    
}