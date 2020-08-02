package cl.awakelab.proyectofinal.controller;

import cl.awakelab.proyectofinal.dto.ActividadDTO;
import cl.awakelab.proyectofinal.dto.VisitaDTO;
import cl.awakelab.proyectofinal.model.Actividad;
import cl.awakelab.proyectofinal.model.Users;
import cl.awakelab.proyectofinal.model.Visita;
import cl.awakelab.proyectofinal.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ProfesionalController {

    @Autowired
    private IVisitaService serviceVisita;

    @Autowired
    private IActividadService serviceActividad;

    @Autowired
    private IClienteService serviceCliente;

    @Autowired
    private IProfesionalService serviceProfesional;

    @Autowired
    private IUsersService serviceUsuario;

    @GetMapping({"/indexprofesional"})
    public String profesional() {
        return "indexprofesional";
    }

    //Crear capacitacion

    @GetMapping({"/crearcapacitacion"})
    public ModelAndView capacitar() {
        ModelAndView model = new ModelAndView();
        List<Actividad> actividades = new ArrayList<Actividad>();
        actividades = serviceActividad.listar();
        model.addObject("actividades", actividades);
        model.addObject("clientes", serviceCliente.listar());
        model.addObject("profesionales", serviceProfesional.listar());
        model.setViewName("crearcapacitacion");
        return model;
    }

    @PostMapping("/crearactividad")
    public String crearActividad(@ModelAttribute("actividad") ActividadDTO actividad){
        ModelAndView model = new ModelAndView();
        Actividad pr = new Actividad();
        Users cliente = serviceUsuario.leerPorUsername(actividad.getCliente());
        Users profesional = serviceUsuario.leerPorUsername(actividad.getProfesional());

        pr.setIdActividad(actividad.getIdActividad());
        pr.setFechaActividad(actividad.getFechaActividad());
        pr.setDescripcion(actividad.getDescripcion());
        pr.setCliente(cliente.getCliente());
        pr.setProfesional(profesional.getProfesional());

        serviceActividad.registrar(pr);

        return "redirect:/indexprofesional";
    }

    //crear visita


    @GetMapping({"/visita"})
    public ModelAndView visitar() {
        ModelAndView model = new ModelAndView();
        List<Visita> visitas = new ArrayList<Visita>();
        visitas = serviceVisita.listar();
        model.addObject("visitas", visitas);
        model.addObject("clientes", serviceCliente.listar());
        model.addObject("profesionales", serviceProfesional.listar());
        model.setViewName("visita");
        return model;
    }

    @PostMapping("/crearvisita")
    public String crearVisita(@ModelAttribute("visita") VisitaDTO visita){
        ModelAndView model = new ModelAndView();
        Visita pr = new Visita();
        Users cliente = serviceUsuario.leerPorUsername(visita.getCliente());
        Users profesional = serviceUsuario.leerPorUsername(visita.getProfesional());

        pr.setIdVisita(visita.getIdVisita());
        pr.setFecha(visita.getFecha());
        pr.setDescripcion(visita.getDescripcion());
        pr.setCliente(cliente.getCliente());
        pr.setProfesional(profesional.getProfesional());

        serviceVisita.registrar(pr);

        return "redirect:/indexprofesional";
    }


}
