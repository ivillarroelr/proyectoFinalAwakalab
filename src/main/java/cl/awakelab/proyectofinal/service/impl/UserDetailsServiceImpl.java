package cl.awakelab.proyectofinal.service.impl;

import java.util.ArrayList;
import java.util.List;

import cl.awakelab.proyectofinal.model.Authority;
import cl.awakelab.proyectofinal.model.Users;
import cl.awakelab.proyectofinal.repo.IUsersRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsServiceImpl implements UserDetailsService {

    @Autowired
    IUsersRepo repo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        //Buscar el usuario con el repositorio y si no existe lanzar una exepcion
        Users appUser = repo.findByUsername(username).orElseThrow(() -> new UsernameNotFoundException("No existe usuario"));

        //Mapear nuestra lista de Authority con la de spring security
        List<GrantedAuthority> grantList = new ArrayList<GrantedAuthority>();

        for (Authority authority: appUser.getAuthority()) {
            // ROLE_USER, ROLE_ADMIN,..
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authority.getAuthority());
            grantList.add(grantedAuthority);
        }

        //Crear El objeto UserDetails que va a ir en sesion y retornarlo.
        UserDetails user = (UserDetails) new User(appUser.getUsername(), appUser.getPassword(), grantList);
        return user;
    }
}