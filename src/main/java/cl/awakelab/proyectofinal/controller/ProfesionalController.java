package cl.awakelab.proyectofinal.controller;

import cl.awakelab.proyectofinal.model.Visita;
import cl.awakelab.proyectofinal.service.IVisitaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProfesionalController {

    @Autowired
    IVisitaService serviceVisita;

    @GetMapping({"/indexprofesional"})
    public String profesional() {
        return "indexprofesional";
    }

    @GetMapping({"/crearcapacitacion"})
    public String capacitar() {
        return "crearcapacitacion";
    }

    @GetMapping({"/visita"})
    public ModelAndView visitar() {
        ModelAndView model = new ModelAndView();
        List<Visita> visitas = new ArrayList<Visita>();
        visitas = serviceVisita.listar();
        model.addObject("visitas", visitas);
        model.setViewName("visita");
        return model;
    }

    @GetMapping({"/revisarcliente"})
    public String revisarCliente() {
        return "revisarcliente";
    }
}
