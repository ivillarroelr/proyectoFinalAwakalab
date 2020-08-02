package cl.awakelab.proyectofinal.controller;

import cl.awakelab.proyectofinal.dto.AccidenteDTO;
import cl.awakelab.proyectofinal.dto.ActividadDTO;
import cl.awakelab.proyectofinal.dto.PagoDTO;
import cl.awakelab.proyectofinal.dto.UsersDTO;
import cl.awakelab.proyectofinal.model.*;
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
public class ClienteController {

    @Autowired
    private IAccidenteService serviceAccidente;

    @Autowired
    private IClienteService serviceCliente;

    @Autowired
    private IUsersService serviceUsuario;

    @Autowired
    private IProfesionalService serviceProfesional;

    @Autowired
    private IActividadService serviceActividad;


    @GetMapping({"/indexcliente"})
    public String cliente() {
        return "indexcliente";
    }


    //caso reportar accidente

    @GetMapping("/reportaraccidente")
    public ModelAndView reportarAccidente(){
        ModelAndView model = new ModelAndView();
        List<Accidente> accidentes = new ArrayList<Accidente>();
        accidentes = serviceAccidente.listar();
        model.addObject("accidentes", accidentes);
        model.addObject("clientes", serviceCliente.listar());
        model.setViewName("reportaraccidente");
        return model;
    }

    @PostMapping("/crearaccidente")
    public String crearAccidente(@ModelAttribute("accidente")AccidenteDTO accidente){

        Accidente pr = new Accidente();
        Users usuario = serviceUsuario.leerPorUsername(accidente.getCliente());

        pr.setIdAccidente(accidente.getIdAccidente());
        pr.setFechaVisita(accidente.getFechaAccidente());
        pr.setDescripcion(accidente.getDescripcion());
        pr.setCliente(usuario.getCliente());
        serviceAccidente.registrar(pr);

        return "redirect:/indexcliente";
    }

    //Caso solicitar asesoria


    @GetMapping({"/solicitarasesoria"})
    public ModelAndView solicitarAsesoria() {
        ModelAndView model = new ModelAndView();
        List<Actividad> actividades = new ArrayList<Actividad>();
        actividades = serviceActividad.listar();
        model.addObject("actividades", actividades);
        model.addObject("clientes", serviceCliente.listar());
        model.addObject("profesionales", serviceProfesional.listar());
        model.setViewName("solicitarasesoria");
        return model;
    }

    @PostMapping("/crearasesoria")
    public String crearAsesoria(@ModelAttribute("actividad") ActividadDTO actividad){
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

        return "redirect:/indexcliente";
    }


}
