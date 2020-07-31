package cl.awakelab.proyectofinal.controller;

import cl.awakelab.proyectofinal.dto.ProfesionalDTO;
import cl.awakelab.proyectofinal.dto.UsersDTO;
import cl.awakelab.proyectofinal.model.Cliente;
import cl.awakelab.proyectofinal.model.Profesional;
import cl.awakelab.proyectofinal.model.Users;
import cl.awakelab.proyectofinal.service.IClienteService;
import cl.awakelab.proyectofinal.service.IProfesionalService;
import cl.awakelab.proyectofinal.service.IUsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;
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


    //CRUD DE PROFESIONALES

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
        List<Users> profesionales = new ArrayList<Users>();
        profesionales = serviceUsuario.listar();
        model.addObject("profesionales", profesionales);
        model.setViewName("nuevoprofesional");
        return model;
    }

    @PostMapping("/crearprofesional")
    public ModelAndView crearProfesional(@ModelAttribute("profesional") UsersDTO profesional){
        ModelAndView model = new ModelAndView();
        Users pr = new Users();
        Profesional pro = new Profesional();
        ProfesionalDTO prodto = new ProfesionalDTO();
        pr.setUsername(profesional.getUsername());
        pr.setApellido(profesional.getApellido());
        pr.setEnabled(profesional.getEnabled());
        pr.setNombre(profesional.getNombre());
        pr.setPassword(profesional.getPassword());
        pr.setRut(profesional.getRut());
        pr.setTipoUsuario(profesional.getTipoUsuario());
        serviceUsuario.registrar(pr);
        prodto.setUsername(profesional.getUsername());
        pro.setUsername(prodto.getUsername());
        pro.setUsuario(pr);
        serviceProfesional.registrar(pro);
        List<Profesional> profesionales = new ArrayList<Profesional>();
        profesionales = serviceProfesional.listar();
        model.addObject("profesionales", profesionales);
        model.setViewName("verprofesional");
        return model;
    }

    @GetMapping("/editar/{username}")
    public String editarProfesional(@PathVariable("username") String username, Model model){
        Users usuario = serviceUsuario.leerPorUsername(username);
        model.addAttribute("usuario", usuario);
        return "editarprofesional";
    }

    @PostMapping("/editarprofesional/{username}")
    public String updateProfesional(@PathVariable("username") String username, @Valid Users usuario,
                                    BindingResult result, Model model) {
        if (result.hasErrors()) {
            usuario.setUsername(username);
            return "redirect:/verprofesional";
        }
        serviceUsuario.modificar(usuario);
        model.addAttribute("profesionales", serviceProfesional.listar());
        return "redirect:/verprofesional";
    }

    @DeleteMapping("/borrarprofesional/{username}")
    public String eliminarProfesional(@PathVariable("username") String username){
        serviceUsuario.eliminar(username);
        return "redirect:/verprofesional";
    }

    //CRUD DE CLIENTES

    @Autowired
    private IClienteService serviceCliente;

    @GetMapping({"/vercliente"})
    public ModelAndView vercliente() {
        ModelAndView model = new ModelAndView();
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes = serviceCliente.listar();
        model.addObject("clientes", clientes);
        model.setViewName("vercliente");
        return model;
    }

    @GetMapping("/nuevocliente")
    public ModelAndView nuevocliente(){
        ModelAndView model = new ModelAndView();
        List<Users> clientes = new ArrayList<Users>();
        clientes = serviceUsuario.listar();
        model.addObject("clientes", clientes);
        model.setViewName("nuevocliente");
        return model;
    }

    @PostMapping("/crearcliente")
    public ModelAndView crearCliente(@ModelAttribute("cliente") UsersDTO cliente){
        ModelAndView model = new ModelAndView();
        Users pr = new Users();
        Cliente cl = new Cliente();
        pr.setUsername(cliente.getUsername());
        pr.setApellido(cliente.getApellido());
        pr.setEnabled(cliente.getEnabled());
        pr.setNombre(cliente.getNombre());
        pr.setPassword(cliente.getPassword());
        pr.setRut(cliente.getRut());
        pr.setTipoUsuario(cliente.getTipoUsuario());
        serviceUsuario.registrar(pr);
        cl.setUsername(cliente.getUsername());
        cl.setUsuario(pr);
        serviceCliente.registrar(cl);
        List<Cliente> clientes = new ArrayList<Cliente>();
        clientes = serviceCliente.listar();
        model.addObject("clientes", clientes);
        model.setViewName("vercliente");
        return model;
    }


    @GetMapping("/editarcl/{username}")
    public String editarCliente(@PathVariable("username") String username, Model model){
        Users usuario = serviceUsuario.leerPorUsername(username);
        model.addAttribute("usuario", usuario);
        return "editarcliente";
    }

    @PostMapping("/editarcliente/{username}")
    public String updateCliente(@PathVariable("username") String username, @Valid Users usuario,
                                    BindingResult result, Model model) {
        if (result.hasErrors()) {
            usuario.setUsername(username);
            return "redirect:/vercliente";
        }
        serviceUsuario.modificar(usuario);
        model.addAttribute("clientes", serviceCliente.listar());
        return "redirect:/vercliente";
    }

    @DeleteMapping("/borrarcliente/{username}")
    public String eliminarcliente(@PathVariable("username") String username){
        serviceUsuario.eliminar(username);
        return "redirect:/vercliente";
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
