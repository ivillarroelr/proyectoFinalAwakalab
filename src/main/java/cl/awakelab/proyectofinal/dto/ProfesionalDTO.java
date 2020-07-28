package cl.awakelab.proyectofinal.dto;

import java.io.Serializable;
import java.util.Objects;

public class ProfesionalDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer rut;
    private String nombre;
    private String apellido;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getRut() {
        return rut;
    }

    public void setRut(Integer rut) {
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ProfesionalDTO)) return false;
        ProfesionalDTO that = (ProfesionalDTO) o;
        return Objects.equals(getRut(), that.getRut()) &&
                Objects.equals(getNombre(), that.getNombre()) &&
                Objects.equals(getApellido(), that.getApellido());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getRut(), getNombre(), getApellido());
    }
}

