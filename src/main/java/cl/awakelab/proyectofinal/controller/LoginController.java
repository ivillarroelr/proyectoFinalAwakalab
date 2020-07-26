package cl.awakelab.proyectofinal.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class LoginController {

    @GetMapping({ "/", "/login"})
    public String login() {
        return "login";
    }

    @GetMapping({ "/loginerror"})
    public ModelAndView loginerror() {
        ModelAndView model = new ModelAndView();
        model.addObject("booleanerror", true);
        model.addObject("mensaje", "Credenciales invalidas");
        model.setViewName("login");
        return model;
    }

    @GetMapping({ "/index"})
    public String index() {
        return "index";
    }

    @GetMapping(value="/logout")
    public ModelAndView logoutPage (HttpServletRequest request, HttpServletResponse response) {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();
        if (auth != null){
            new SecurityContextLogoutHandler().logout(request, response, auth);
        }
        ModelAndView model = new ModelAndView();
        model.addObject("logout", true);
        model.addObject("mensaje", "Usted ha salido exitosamente");
        model.setViewName("redirect:/login");
        return model;
    }

}
