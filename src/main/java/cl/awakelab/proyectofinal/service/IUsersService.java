package cl.awakelab.proyectofinal.service;

import cl.awakelab.proyectofinal.model.Users;


import java.util.List;

public interface IUsersService{
    Users registrar(Users obj);
    Users modificar(Users obj);
    List<Users> listar();
    Users leerPorUsername(String username);
    boolean eliminar(String username);
}
