package cl.awakelab.proyectofinal.dto;

import cl.awakelab.proyectofinal.model.Cliente;
import cl.awakelab.proyectofinal.model.Profesional;

import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Objects;

public class ActividadDTO {

    private int idActividad;

    private Timestamp fechaActividad;

    private String descripcion;

    private String cliente;

    private String profesional;

    public int getIdActividad() {
        return idActividad;
    }

    public void setIdActividad(int idActividad) {
        this.idActividad = idActividad;
    }

    public Timestamp getFechaActividad() {
        return fechaActividad;
    }

    public void setFechaActividad(Timestamp fechaActividad) {
        this.fechaActividad = fechaActividad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProfesional() {
        return profesional;
    }

    public void setProfesional(String profesional) {
        this.profesional = profesional;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ActividadDTO)) return false;
        ActividadDTO that = (ActividadDTO) o;
        return getIdActividad() == that.getIdActividad() &&
                getFechaActividad().equals(that.getFechaActividad()) &&
                getDescripcion().equals(that.getDescripcion()) &&
                getCliente().equals(that.getCliente()) &&
                getProfesional().equals(that.getProfesional());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdActividad(), getFechaActividad(), getDescripcion(), getCliente(), getProfesional());
    }
}
