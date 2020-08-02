package cl.awakelab.proyectofinal.dto;

import cl.awakelab.proyectofinal.model.Cliente;
import cl.awakelab.proyectofinal.model.Profesional;

import javax.persistence.Column;
import javax.persistence.ForeignKey;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import java.sql.Timestamp;
import java.util.Objects;

public class VisitaDTO {

    private int idVisita;

    private Timestamp fecha;

    private String descripcion;

    private String cliente;

    private String profesional;

    public int getIdVisita() {
        return idVisita;
    }

    public void setIdVisita(int idVisita) {
        this.idVisita = idVisita;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
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
        if (!(o instanceof VisitaDTO)) return false;
        VisitaDTO visitaDTO = (VisitaDTO) o;
        return getIdVisita() == visitaDTO.getIdVisita() &&
                getFecha().equals(visitaDTO.getFecha()) &&
                getDescripcion().equals(visitaDTO.getDescripcion()) &&
                getCliente().equals(visitaDTO.getCliente()) &&
                getProfesional().equals(visitaDTO.getProfesional());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdVisita(), getFecha(), getDescripcion(), getCliente(), getProfesional());
    }
}
