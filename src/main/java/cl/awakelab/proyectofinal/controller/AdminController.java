package cl.awakelab.proyectofinal.controller;

import cl.awakelab.proyectofinal.dto.ProfesionalDTO;
import cl.awakelab.proyectofinal.dto.UsersDTO;
import cl.awakelab.proyectofinal.model.Profesional;
import cl.awakelab.proyectofinal.model.Users;
import cl.awakelab.proyectofinal.service.IProfesionalService;
import cl.awakelab.proyectofinal.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class AdminController {

    @Autowired
    private IProfesionalService serviceProfesional;

    @Autowired
    private IUsersService serviceUsuario;

    @GetMapping({"/indexadministrador"})
    public String admin() {
        return "indexadministrador";
    }

    @GetMapping({"/verprofesional"})
    public ModelAndView verprofesional() {
        ModelAndView model = new ModelAndView();
        List<Profesional> profesionales = new ArrayList<Profesional>();
        profesionales = serviceProfesional.listar();
        model.addObject("profesionales", profesionales);
        model.setViewName("verprofesional");
        return model;

    }

    @GetMapping("/nuevoprofesional")
    public ModelAndView nuevoprofesional(){
        ModelAndView model = new ModelAndView();
        List<Profesional> profesionales = new ArrayList<Profesional>();
        profesionales = serviceProfesional.listar();
        model.addObject("profesionales", profesionales);
        model.setViewName("nuevoprofesional");
        return model;
    }

    @PostMapping("/crearprofesional")
    public ModelAndView crearProfesional(@ModelAttribute("profesional") UsersDTO profesional){
        ModelAndView model = new ModelAndView();
        Users pr = new Users();
        Profesional pro = new Profesional();
        pr.setUsername(profesional.getUsername());
        pr.setPassword(profesional.getPassword());
        pr.setEnabled(profesional.getEnabled());
        pr.setRut(profesional.getRut());
        pr.setNombre(profesional.getNombre());
        pr.setApellido(profesional.getApellido());
        pr.setTipoUsuario(profesional.getTipoUsuario());
        serviceUsuario.registrar(pr);
        pro.setUsername(profesional.getUsername());
        serviceProfesional.registrar(pro);
        List<Profesional> profesionales = new ArrayList<Profesional>();
        profesionales = serviceProfesional.listar();
        model.addObject("profesionales", profesionales);
        model.setViewName("verprofesional");
        return model;
    }

    @GetMapping({"/vercliente"})
    public String vercliente() {
        return "vercliente";
    }

    @GetMapping({"/pagos"})
    public String verpagos() {
        return "pagos";
    }

    @GetMapping({"/accidentabilidad"})
    public String veraccidentabilidad() {
        return "accidentabilidad";
    }

    @GetMapping({"/actividad"})
    public String veractividad() {
        return "actividad";
    }

}
