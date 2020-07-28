package cl.awakelab.proyectofinal.dto;

import javax.persistence.Column;
import java.io.Serializable;
import java.util.Objects;

public class UsersDTO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private String username;
    private String password;
    private Boolean enabled;
    private String rut;
    private String nombre;
    private String apellido;
    private String tipoUsuario;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoUsuario() {
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario) {
        this.tipoUsuario = tipoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof UsersDTO)) return false;
        UsersDTO usersDTO = (UsersDTO) o;
        return Objects.equals(getUsername(), usersDTO.getUsername()) &&
                Objects.equals(getPassword(), usersDTO.getPassword()) &&
                Objects.equals(getEnabled(), usersDTO.getEnabled()) &&
                Objects.equals(getRut(), usersDTO.getRut()) &&
                Objects.equals(getNombre(), usersDTO.getNombre()) &&
                Objects.equals(getApellido(), usersDTO.getApellido()) &&
                Objects.equals(getTipoUsuario(), usersDTO.getTipoUsuario());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), getPassword(), getEnabled(), getRut(), getNombre(), getApellido(), getTipoUsuario());
    }
}
