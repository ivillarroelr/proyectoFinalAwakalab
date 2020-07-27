package cl.awakelab.proyectofinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ProfesionalController {

    @GetMapping({"/indexprofesional"})
    public String profesional() {
        return "indexprofesional";
    }

    @GetMapping({"/crearcapacitacion"})
    public String capacitar() {
        return "crearcapacitacion";
    }

    @GetMapping({"/visita"})
    public String visitar() {
        return "visita";
    }

    @GetMapping({"/revisarcliente"})
    public String revisarCliente() {
        return "revisarcliente";
    }
}
