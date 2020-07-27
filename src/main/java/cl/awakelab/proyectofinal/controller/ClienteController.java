package cl.awakelab.proyectofinal.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ClienteController {

    @GetMapping({"/indexcliente"})
    public String cliente() {
        return "indexcliente";
    }

    @GetMapping({"/reportaraccidente"})
    public String reportarAccidente() {
        return "reportaraccidente";
    }

    @GetMapping({"/solicitarasesoria"})
    public String solicitarAsesoria() {
        return "solicitarasesoria";
    }


}
