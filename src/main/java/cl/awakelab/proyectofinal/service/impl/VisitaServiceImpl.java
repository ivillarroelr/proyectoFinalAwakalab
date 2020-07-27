package cl.awakelab.proyectofinal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.proyectofinal.model.Visita;
import cl.awakelab.proyectofinal.repo.IVisitaRepo;
import cl.awakelab.proyectofinal.service.IVisitaService;

@Service
public class VisitaServiceImpl implements IVisitaService {

    @Autowired
    private IVisitaRepo repo;

    @Override
    public Visita registrar(Visita obj) {
        return repo.save(obj);
    }

    @Override
    public Visita modificar(Visita obj) {
        return repo.save(obj);
    }

    @Override
    public List<Visita> listar() {
        return repo.findAll();
    }

    @Override
    public Visita leerPorId(Integer id) {
        Optional<Visita> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Visita();
    }

    @Override
    public boolean eliminar(Integer id) {
        repo.deleteById(id);
		return true;
    }
    
}