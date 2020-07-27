package cl.awakelab.proyectofinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping({"/indexadministrador"})
    public String admin() {
        return "indexadministrador";
    }

    @GetMapping({"/verprofesional"})
    public String verprofesional() {
        return "verprofesional";
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
