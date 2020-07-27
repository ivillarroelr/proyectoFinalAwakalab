package cl.awakelab.proyectofinal.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.awakelab.proyectofinal.model.Actividad;
import cl.awakelab.proyectofinal.repo.IActividadRepo;
import cl.awakelab.proyectofinal.service.IActividadService;

@Service
public class ActividadServiceImpl implements IActividadService {

    @Autowired
    private IActividadRepo repo;

    @Override
    public Actividad registrar(Actividad obj) {
        return repo.save(obj);
    }

    @Override
    public Actividad modificar(Actividad obj) {
        return repo.save(obj);
    }

    @Override
    public List<Actividad> listar() {
        return repo.findAll();
    }

    @Override
    public Actividad leerPorId(Integer id) {
        Optional<Actividad> op = repo.findById(id);
		return op.isPresent() ? op.get() : new Actividad();
    }

    @Override
    public boolean eliminar(Integer id) {
        repo.deleteById(id);
		return true;
    }
    
}